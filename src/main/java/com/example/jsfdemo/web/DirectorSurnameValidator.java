package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("directorSurnameValidator")
public class DirectorSurnameValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String name = (String) value;
		
		if (name.length() < 2) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Surname of director must contains more than 1 char");
			message.setSummary("Surname of director must contains more than 1 char");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}

