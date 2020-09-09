package br.gov.sc.pc.pco.dominio.entidades;

import lombok.Data;

@Data
// @Entity
public class Servidor {
	// @Id
	private String cpf;
	private String nome;
	private String matricula;
	private String lotacao;
}