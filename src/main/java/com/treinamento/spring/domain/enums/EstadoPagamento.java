package com.treinamento.spring.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	PARCELADO(3, "Parcelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento( int value, String descricao ) {
		this.cod = value;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		EstadoPagamento estado = null;
		
		for( EstadoPagamento x : EstadoPagamento.values() ) {
			
			if( cod.equals(x.getCod()) ) {
				estado = x;
				break;
			}
		}
		
		return estado;
		
	}

}
