package com.crudcliente.crudbackend.Controller;

import java.util.List;

import com.crudcliente.crudbackend.model.Cliente;
import com.crudcliente.crudbackend.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @GetMapping("/ConsultaClientes")
  public List<Cliente> getClientes() {
    return (List<Cliente>) clienteRepository.findAll();
  }

  @PostMapping("/CadastroCliente")
  public void addCliente(@RequestBody Cliente cliente) {
    clienteRepository.save(cliente);
  }
}
