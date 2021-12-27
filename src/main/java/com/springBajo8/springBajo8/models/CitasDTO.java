package com.springBajo8.springBajo8.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "citas")
public class CitasDTO {
	
	@Id
	private String _id;

	private String idPaciente;
	
	private String nombrePaciente;

	private String apellidosPaciente;

	private String nombreMedico;

	private String apellidosMedico;

	private LocalDate fechaReservaCita;

	private String horaReservaCita;

	private String estadoReservaCita;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getApellidosPaciente() {
		return apellidosPaciente;
	}

	public void setApellidosPaciente(String apellidosPaciente) {
		this.apellidosPaciente = apellidosPaciente;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getApellidosMedico() {
		return apellidosMedico;
	}

	public void setApellidosMedico(String apellidosMedico) {
		this.apellidosMedico = apellidosMedico;
	}

	public LocalDate getFechaReservaCita() {
		return fechaReservaCita;
	}

	public void setFechaReservaCita(LocalDate fechaReservaCita) {
		this.fechaReservaCita = fechaReservaCita;
	}

	public String getHoraReservaCita() {
		return horaReservaCita;
	}

	public void setHoraReservaCita(String horaReservaCita) {
		this.horaReservaCita = horaReservaCita;
	}

	public String getEstadoReservaCita() {
		return estadoReservaCita;
	}

	public void setEstadoReservaCita(String estadoReservaCita) {
		this.estadoReservaCita = estadoReservaCita;
	}

	//private LocalDate expiry_date;

	/*
	public LocalDate getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}
	*/
	
}
