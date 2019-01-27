package com.treinamento.spring.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException(String msgErro) {
		super(msgErro);
	}
	
	public DataIntegrityException(String msgErro, Throwable cause) {
		super(msgErro, cause);
	}

}
