package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Director;
import com.example.jsfdemo.domain.Film;
import com.example.jsfdemo.service.DBDirector;
import com.example.jsfdemo.service.DBFilm;
import com.example.jsfdemo.status.FilmStatus;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


@SessionScoped
@Named("filmBean")
public class FilmFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Film film = new Film();

	private ListDataModel<Film> films = new ListDataModel<Film>();

	@Inject
	private DBFilm dbFilm = new DBFilm();
	
	
	public String addFilm() {
		film.setStatus(FilmStatus.valueOf(film.getStatus().toString()));
		dbFilm.addFilm(film);
		return "showFilms";
	
	}

	public String deleteFilm() {
		Film filmToDelete = films.getRowData();
		dbFilm.deleteFilm(dbFilm.getIdFilmByTitle(filmToDelete.getTitle()));
		return null;
	}
	

	// Validators

	// Business logic validation
	
	
	/*
	public void uniquePin(FacesContext context, UIComponent component,
			Object value) {

		String pin = (String) value;

		for (Person person : pm.getAllPersons()) {
			if (person.getPin().equalsIgnoreCase(pin)) {
				FacesMessage message = new FacesMessage(
						"Person with this PIN already exists in database");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
		}
	}

	
	
	// Multi field validation with <f:event>
	// Rule: first two digits of PIN must match last two digits of the year of
	// birth
	public void validatePinDob(ComponentSystemEvent event) {

		UIForm form = (UIForm) event.getComponent();
		UIInput pin = (UIInput) form.findComponent("pin");
		UIInput dob = (UIInput) form.findComponent("dob");

		if (pin.getValue() != null && dob.getValue() != null
				&& pin.getValue().toString().length() >= 2) {
			String twoDigitsOfPin = pin.getValue().toString().substring(0, 2);
			Calendar cal = Calendar.getInstance();
			cal.setTime(((Date) dob.getValue()));

			String lastDigitsOfDob = ((Integer) cal.get(Calendar.YEAR))
					.toString().substring(2);

			if (!twoDigitsOfPin.equals(lastDigitsOfDob)) {
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(form.getClientId(), new FacesMessage(
						"PIN doesn't match date of birth"));
				context.renderResponse();
			}
		}
	}
	
	*/
	
}
