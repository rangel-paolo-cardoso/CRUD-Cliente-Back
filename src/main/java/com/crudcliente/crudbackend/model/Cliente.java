package com.crudcliente.crudbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@NoArgsCOnstructor
@AllArgsConstructor
@Entity
@Table
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String nome;

  private String cpf;

  private String telefone;

  private String observacao;

  private String endereco;
  
}
