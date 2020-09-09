package br.gov.sc.pc.pco.dominio.repositorios;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.gov.sc.pc.pco.dominio.entidades.Servidor;

@Repository
public class ServidorRepositorioImpl implements ServidorRepositorio {
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public Servidor le(String cpf) {
		// JSON from file to Object
		try {
			return mapper.readValue(new File("c:\\user.json"), Servidor.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Servidor cria(Servidor s) {
		// Object to JSON in file
		try {
			mapper.writeValue(new File("c:\\user.json"), s);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}