package com.gocity.ecommerce.response;

import java.io.Serializable;

/**
 * Generic Response object for all APIs
 * 
 * @author Tanveer Bulsari
 *
 * @param <T>
 */

public class ApiResponse<T> implements Serializable {

	/**
	     * 
	     */
	private static final long serialVersionUID = 1L;
	private T body;
	private String message;
	private int status;
	private Error error;

	public ApiResponse(T body, int status, String message) {
		super();
		this.body = body;
		this.status = status;
		this.message = message;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
