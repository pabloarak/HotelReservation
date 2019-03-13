/**
 * 
 */
package org.libreknow.hotelreservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.libreknow.hotelreservation.modelo.Cliente;
import org.libreknow.hotelreservation.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Interface para definir las operaciones de bdd relacionadas con reserva
 * 
 * @author arak
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String> {

	@Query("SELECT r FROM Reserva r WHERE r.fechaIngresoRes =:fechaInicio and r.fechaSalidaRes =:fechaSalida")
	public List<Reserva> find(@Param("fechaInicio") Date fechaInicio, @Param("fechaSalida") Date fechaSalida);

	public Reserva findByCodigoRes(String codigoRes);
}
