/**        
 * Copyright (c) 2013 by chenyiming.    
 */
package com.future.dconf.client;

import org.apache.commons.lang.exception.NestableRuntimeException;

/**
 * Create on @2013-9-1 @下午9:21:17
 * 
 * @author 
 */
public class ConfigurationRuntimeException extends NestableRuntimeException {
	private static final long serialVersionUID = -7838702245512140996L;

	public ConfigurationRuntimeException() {
		super();
	}

	public ConfigurationRuntimeException(String message) {
		super(message);
	}

	public ConfigurationRuntimeException(Throwable cause) {
		super(cause);
	}

	public ConfigurationRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}