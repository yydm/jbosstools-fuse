/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

/**
 * NOTE - this file is auto-generated using Scalate. 
 * 
 * DO NOT EDIT!
 */
package org.fusesource.ide.camel.model.generated;

import java.util.Map;
import org.apache.camel.model.PolicyDefinition;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.model.language.ExpressionDefinition;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.fusesource.ide.camel.model.AbstractNode;
import org.fusesource.ide.camel.model.ExpressionPropertyDescriptor;
import org.fusesource.ide.camel.model.RouteContainer;
import org.fusesource.ide.camel.model.util.Objects;
import org.fusesource.ide.commons.properties.BooleanPropertyDescriptor;
import org.fusesource.ide.commons.properties.ComplexPropertyDescriptor;
import org.fusesource.ide.commons.properties.ComplexUnionPropertyDescriptor;
import org.fusesource.ide.commons.properties.EnumPropertyDescriptor;
import org.fusesource.ide.commons.properties.ListPropertyDescriptor;
import org.fusesource.ide.commons.properties.UnionTypeValue;

/**
 * The Node class for Camel's PolicyDefinition
 */
public class Policy extends AbstractNode {

	public static final String PROPERTY_INHERITERRORHANDLER = "Policy.InheritErrorHandler";
	public static final String PROPERTY_REF = "Policy.Ref";
	
	private Boolean inheritErrorHandler;
	private String ref;
	
    public Policy() {
    }		
	
    public Policy(PolicyDefinition definition, RouteContainer parent) {

      super(parent);
    	loadPropertiesFromCamelDefinition(definition);
    	loadChildrenFromCamelDefinition(definition);
    }


    /* (non-Javadoc)
     * @see org.fusesource.ide.camel.model.AbstractNode#getIconName()
     */
    @Override
    public String getIconName() {
    	return "generic.png";
    }
    
  	@Override
  	public String getDocumentationFileName() {
  		return "policyNode";
  	}
  	
  	@Override
  	public String getCategoryName() {
  		return "Miscellaneous";
  	}


	

	/**
	 * @return the inheritErrorHandler
	 */
	public Boolean getInheritErrorHandler() {
		return this.inheritErrorHandler;
	}
	
	/**
	 * @param inheritErrorHandler the inheritErrorHandler to set
	 */
	public void setInheritErrorHandler(Boolean inheritErrorHandler) {
		Boolean oldValue = this.inheritErrorHandler;
		this.inheritErrorHandler = inheritErrorHandler;
		if (!isSame(oldValue, inheritErrorHandler)) {
		    firePropertyChange(PROPERTY_INHERITERRORHANDLER, oldValue, inheritErrorHandler);
		}
	}

	/**
	 * @return the ref
	 */
	public String getRef() {
		return this.ref;
	}
	
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		String oldValue = this.ref;
		this.ref = ref;
		if (!isSame(oldValue, ref)) {
		    firePropertyChange(PROPERTY_REF, oldValue, ref);
		}
	}


	
	/*
	 * (non-Javadoc)
	 * @see org.fusesource.ide.camel.model.AbstractNode#addCustomProperties(java.util.Map)
	 */
	@Override
	protected void addCustomProperties(Map<String, PropertyDescriptor> descriptors) {
		super.addCustomProperties(descriptors);
		
    	PropertyDescriptor descInheritErrorHandler = new BooleanPropertyDescriptor(PROPERTY_INHERITERRORHANDLER, Messages.propertyLabelPolicyInheritErrorHandler);
    		PropertyDescriptor descRef = new TextPropertyDescriptor(PROPERTY_REF, Messages.propertyLabelPolicyRef);
  		descriptors.put(PROPERTY_INHERITERRORHANDLER, descInheritErrorHandler);
		descriptors.put(PROPERTY_REF, descRef);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		if (PROPERTY_INHERITERRORHANDLER.equals(id)) {
			setInheritErrorHandler(Objects.convertTo(value, Boolean.class));
		}		else if (PROPERTY_REF.equals(id)) {
			setRef(Objects.convertTo(value, String.class));
		}    else {
			super.setPropertyValue(id, value);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.fusesource.ide.camel.model.AbstractNode#getPropertyValue(java.lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (PROPERTY_INHERITERRORHANDLER.equals(id)) {
			return Objects.<Boolean>getField(this, "inheritErrorHandler");
		}		else if (PROPERTY_REF.equals(id)) {
			return this.getRef();
		}    else {
			return super.getPropertyValue(id);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ProcessorDefinition createCamelDefinition() {
		PolicyDefinition answer = new PolicyDefinition();
    answer.setInheritErrorHandler(toXmlPropertyValue(PROPERTY_INHERITERRORHANDLER, Objects.<Boolean>getField(this, "inheritErrorHandler")));
    answer.setRef(toXmlPropertyValue(PROPERTY_REF, this.getRef()));
        super.savePropertiesToCamelDefinition(answer);
		return answer;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class<?> getCamelDefinitionClass() {
	  return PolicyDefinition.class;
  }

	@SuppressWarnings("rawtypes")
	@Override
	protected void loadPropertiesFromCamelDefinition(ProcessorDefinition processor) {
    super.loadPropertiesFromCamelDefinition(processor);
    
    if (processor instanceof PolicyDefinition) {
      PolicyDefinition node = (PolicyDefinition) processor;
      this.setInheritErrorHandler(Objects.<Boolean>getField(node, "inheritErrorHandler"));
      this.setRef(node.getRef());
    } else {
      throw new IllegalArgumentException("ProcessorDefinition not an instanceof PolicyDefinition. Was " + processor.getClass().getName());
    }
	}
}
 
      
