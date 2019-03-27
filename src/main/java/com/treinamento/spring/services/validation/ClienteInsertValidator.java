package com.treinamento.spring.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.treinamento.spring.domain.enums.TipoCliente;
import com.treinamento.spring.dto.ClienteNewDTO;
import com.treinamento.spring.resources.exceptions.FieldMessage;

public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
	
	@Override
	public void initialize(ClienteInsert constraintAnnotation) {
	}

	@Override
	public boolean isValid(ClienteNewDTO objDTO, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		if( objDTO.getTipo().equals( TipoCliente.PESSOAFISICA.getCod() ) && objDTO.getCpfCnpj().length() != 11 ) {
			list.add(new FieldMessage("cpfCnpj", "CPF inválido"));
		}
		
		if( objDTO.getTipo().equals( TipoCliente.PESSOAJURIDICA.getCod() ) && objDTO.getCpfCnpj().length() != 14 ) {
			list.add(new FieldMessage("cpfCnpj", "CNPJ inválido"));
		}
		
		for(FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName()).addConstraintViolation();
		}
		return list.isEmpty();
		
		
	}

}
