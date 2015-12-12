package com.cxf.exception;

public class ComplexException extends Exception{

	private static final long serialVersionUID = 468795316887831085L;

	public ComplexException(){}
	
	public ComplexException(String errMess){
		super(errMess);
	}
	
}
