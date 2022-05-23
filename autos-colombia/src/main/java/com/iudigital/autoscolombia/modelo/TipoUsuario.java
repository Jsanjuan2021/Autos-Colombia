package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuario {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descripcion;

	@OneToMany(mappedBy = "tipoUsuario", cascade = CascadeType.ALL)
	private List<Usuario> usuarios = new ArrayList<>();

}