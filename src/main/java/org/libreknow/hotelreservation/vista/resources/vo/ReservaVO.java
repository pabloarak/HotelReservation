/**
 * 
 */
package org.libreknow.hotelreservation.vista.resources.vo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.libreknow.hotelreservation.modelo.Cliente;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * 
 * @author arak
 *
 */
@Data
public class ReservaVO {

	private String idRes;
	private String codigoRes;
	private Date fechaIngresoRes;
	private Date fechaSalidaRes;
	private int cantidadPersonasRes;
	private String descripcionRes;
	private Cliente cliente;

}
