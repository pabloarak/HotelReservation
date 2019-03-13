/**
 * 
 */
package org.libreknow.hotelreservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * 
 * @author arak
 *
 */
@Data
@Entity
@Table(name = "cliente")
@NamedQuery(name = "Cliente.findByIdentificacion", query = "SELECT c FROM Cliente c WHERE c.identificacionCli = ?1")
public class Cliente {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;

	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;

	public Cliente() {

	}
}
