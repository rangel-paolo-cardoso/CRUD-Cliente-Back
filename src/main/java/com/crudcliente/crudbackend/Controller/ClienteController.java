package com.crudcliente.crudbackend.Controller;

import com.crudcliente.crudbackend.model.Cliente;
import com.crudcliente.crudbackend.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @PostMapping("/CadastroCliente")
  public Cliente addCliente(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }
}
