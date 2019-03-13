/**
 * 
 */
package org.libreknow.hotelreservation.negocio.repository;

import java.util.List;

import org.libreknow.hotelreservation.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface para definir las operaciones de bdd relacionadas con cliente
 * 
 * @author arak
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {

	/**
	 * Definición de método para buscar los clientes por su apellido
	 * 
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);

	public Cliente findByIdentificacion(String identificacionCli);
}
