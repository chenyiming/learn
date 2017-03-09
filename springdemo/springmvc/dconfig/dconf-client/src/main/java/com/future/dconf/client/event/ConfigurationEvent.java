/**        
 * Copyright (c) 2013 by chenyiming.    
 */    
package com.future.dconf.client.event;

import java.util.EventObject;

/**
 * Create on @2013-8-28 @下午9:12:44 
 * @author 
 */
public class ConfigurationEvent extends EventObject {
	private static final long serialVersionUID = 3277238219073504136L;

    private EventType type;

    private String propertyName;

    private Object propertyValue;
    
    public ConfigurationEvent(Object source, EventType type, String propertyName, Object propertyValue) {
		super(source);
		this.type = type;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Object getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(Object propertyValue) {
		this.propertyValue = propertyValue;
	}
}
