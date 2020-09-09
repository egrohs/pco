package br.gov.sc.pc.pco.dominio.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sc.pc.pco.dominio.entidades.Servidor;
import br.gov.sc.pc.pco.dominio.repositorios.ServidorRepositorio;

@Service
public class ServidorServico {
	@Autowired
	private ServidorRepositorio servRepositorio;

	public Servidor le(String cpf) {
		return servRepositorio.le(cpf);
	}

	public Servidor cria(Servidor s) {
		return servRepositorio.cria(s);
	}
}