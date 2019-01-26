package com.treinamento.spring.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msgErro) {
		super(msgErro);
	}
	
	public ObjectNotFoundException(String msgErro, Throwable cause) {
		super(msgErro, cause);
	}

}
