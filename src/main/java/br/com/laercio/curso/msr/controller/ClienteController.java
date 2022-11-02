package br.com.laercio.curso.msr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.laercio.curso.msr.model.ClienteModel;

@RestController
public class ClienteController {

	@RequestMapping(method = RequestMethod.GET, value = "/clientes")
	public List<ClienteModel> listar() {
		ClienteModel c1 = new ClienteModel();
		ClienteModel c2 = new ClienteModel();
		c1.setId(1L);
		c1.setNome("Jeff");
		c1.setEmail("jeff@gmail.com");
		c1.setTelefone("63992449944");
		
		c2.setId(2L);
		c2.setNome("Isabella");
		c2.setEmail("isabella@gmail.com");
		c2.setTelefone("63992554411");
	
		return Arrays.asList(c1,c2);
	}
}
