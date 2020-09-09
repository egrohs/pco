package br.gov.sc.pc.pco.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sc.pc.pco.dominio.entidades.Servidor;
import br.gov.sc.pc.pco.dominio.servicos.ServidorServico;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/api/v1" + "/servidor")
//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class ServidorRest {
	@Autowired
	private ServidorServico servServico;

	@PostMapping("/cria")
	@ApiOperation(value = "Busca um crude por seu id.")
	@ResponseBody
	public ResponseEntity<Servidor> cria(@RequestBody Servidor s) {
		Servidor c = servServico.cria(s);
		return c == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(c);
	}

	@GetMapping("/le")
	@ApiOperation(value = "Busca um servidor por seu id.")
	@ResponseBody
	public ResponseEntity<Servidor> le(@RequestParam String cpf) {
		Servidor c = servServico.le(cpf);
		return c == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(c);
	}

	@PatchMapping("/altera")
	@ApiOperation(value = "Busca dados de um servidor por seu id.")
	@ResponseBody
	public ResponseEntity<Servidor> altera(@RequestBody Servidor s) {
		// Servidor c = servServico.altera(cpf);
		// return c == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(c);
		return null;
	}

	@DeleteMapping("/deleta")
	@ApiOperation(value = "Deleta um servidor por seu id.")
	@ResponseBody
	public ResponseEntity<Boolean> deleta(@RequestParam String cpf) {
		// Servidor c = servServico.deleta(cpf);
		return ResponseEntity.ok(true);
	}
}