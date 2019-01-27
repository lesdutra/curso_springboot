package com.treinamento.spring.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente( int value, String descricao ) {
		this.cod = value;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		TipoCliente tpoCliente = null;
		
		for( TipoCliente x : TipoCliente.values() ) {
			
			if( cod.equals(x.getCod()) ) {
				tpoCliente = x;
				break;
			}
		}
		
		return tpoCliente;
		
	}

}
