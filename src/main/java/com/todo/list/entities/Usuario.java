package com.todo.list.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
//@Table(name = "tb_usuario") serve para definir o nome da tabela
@Table(name = "tb_usuario")
public class Usuario {
		
	//ctrl + espaço alto completa
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	//Serve para definir o email como unico
	@Column(unique = true)
	private String email;
	
	//Serve para fazer a relação de 1 para muitos 
	@OneToMany(mappedBy = "usuario")
	private List<Tarefas> tarefas;
	
	public Usuario() {	
	}

	public Usuario(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	//Get serve para criar
	public Long getId() {
		return id;
	}
	
	// Set serve para modificar
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Tarefas> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}
	
	
	
}
