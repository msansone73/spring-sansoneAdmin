package br.com.msansone.sansoneadmin.sansoneadminapi.model.rest;

public class ApiError {
	private String errorMessage;
	private String errorStack;

	public ApiError(Exception e) {
		errorMessage=e.getCause().getMessage();
		errorStack= e.getCause().getStackTrace().toString();
	}
	
	public ApiError() {
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorStack() {
		return errorStack;
	}

	public void setErrorStack(String errorStack) {
		this.errorStack = errorStack;
	}
	
	
	

}
