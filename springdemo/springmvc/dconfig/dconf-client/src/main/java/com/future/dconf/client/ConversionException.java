/**        
 * Copyright (c) 2013 by chenyiming.    
 */
package com.future.dconf.client;


/**
 * Create on @2013-9-1 @下午9:22:13
 * 
 * @author 
 */
public class ConversionException extends ConfigurationRuntimeException {

	private static final long serialVersionUID = -5764816812711964004L;

	public ConversionException() {
		super();
	}

	public ConversionException(String message) {
		super(message);
	}

	public ConversionException(Throwable cause) {
		super(cause);
	}

	public ConversionException(String message, Throwable cause) {
		super(message, cause);
	}
}