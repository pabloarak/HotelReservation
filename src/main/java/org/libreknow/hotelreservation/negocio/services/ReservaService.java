/**
 * 
 */
package org.libreknow.hotelreservation.negocio.services;

import java.util.Date;
import java.util.List;

import org.libreknow.hotelreservation.modelo.Cliente;
import org.libreknow.hotelreservation.modelo.Reserva;
import org.libreknow.hotelreservation.negocio.repository.ReservaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Clase para definir los servicios de Reserva
 * 
 * @author arak
 *
 */
@Service
@Transactional(readOnly = true)
public class ReservaService {
	private final ReservaRepository reservaRepository;

	public ReservaService(ReservaRepository reservaRepository) {
		this.reservaRepository = reservaRepository;
	}

	/**
	 * Método para realizar la operación de guardar un reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public Reserva create(Reserva reserva) {
		return this.reservaRepository.save(reserva);
	}

	/**
	 * Método para realizar la operación de actualizar una reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public Reserva update(Reserva reserva) {
		return this.reservaRepository.save(reserva);
	}

	/**
	 * Método para realizar la operación de eliminar una reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public void delete(Reserva reserva) {
		this.reservaRepository.delete(reserva);
	}

	/**
	 * Método para consultar las reservas en un rango de fechas
	 * 
	 * @param reserva
	 * @return
	 */
	public List<Reserva> find(Date fechaInicio, Date fechaSalida) {
		return this.reservaRepository.find(fechaInicio, fechaSalida);
	}

	
	/**
	 * Método para consultar una reserva por su código
	 * 
	 * @param reserva
	 * @return
	 */
	public Reserva findByCodigoRes(String codigoReserva) {
		return this.reservaRepository.findByCodigoRes(codigoReserva);
	}

	/**
	 * Método para obtener todas las reservas
	 * 
	 * @param reserva
	 * @return
	 */
	public List<Reserva> findAll(){
		return this.reservaRepository.findAll();
	}
}
