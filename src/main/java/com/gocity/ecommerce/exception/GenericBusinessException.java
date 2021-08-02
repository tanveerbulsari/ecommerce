package com.gocity.ecommerce.exception;

/**
 * Generic class for identifying exception occured in business layer
 * 
 * @author Tanveer Bulsari
 *
 */
public class GenericBusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String message;

	public GenericBusinessException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
