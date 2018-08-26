package com.tiempo.mvc.model;

import java.time.LocalDate;

public class RegistroDatos {

	private LocalDate fecha;
	private String estacacionMeteorologica;
	private String provincia;
	private TemperaturaHora maxima;
	private TemperaturaHora minima;
	private float precipitacion;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getEstacacionMeteorologica() {
		return estacacionMeteorologica;
	}
	public void setEstacacionMeteorologica(String estacacionMeteorologica) {
		this.estacacionMeteorologica = estacacionMeteorologica;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public TemperaturaHora getMaxima() {
		return maxima;
	}
	public void setMaxima(TemperaturaHora maxima) {
		this.maxima = maxima;
	}
	public TemperaturaHora getMinima() {
		return minima;
	}
	public void setMinima(TemperaturaHora minima) {
		this.minima = minima;
	}
	public float getPrecipitacion() {
		return precipitacion;
	}
	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}
	@Override
	public String toString() {
		return "RegistroDatos [fecha=" + fecha + ", estacacionMeteorologica=" + estacacionMeteorologica + ", provincia="
				+ provincia + ", maxima=" + maxima + ", minima=" + minima + ", precipitacion=" + precipitacion + "]";
	}
	public RegistroDatos(LocalDate fecha, String estacacionMeteorologica, String provincia, TemperaturaHora maxima,
			TemperaturaHora minima, float precipitacion) {
		super();
		this.fecha = fecha;
		this.estacacionMeteorologica = estacacionMeteorologica;
		this.provincia = provincia;
		this.maxima = maxima;
		this.minima = minima;
		this.precipitacion = precipitacion;
	}
	
	
}
