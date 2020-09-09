package br.gov.sc.pc.pco.dominio.repositorios;

import org.springframework.stereotype.Repository;

import br.gov.sc.pc.pco.dominio.entidades.Servidor;

@Repository
public interface ServidorRepositorio {
	public Servidor le(String cpf);
	public Servidor cria(Servidor s);
}