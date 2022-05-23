package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movimiento {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_contrato")
	private Contrato contrato;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_registro")
	private Usuario usuario;

	private LocalDate fechaMovimiento;

}