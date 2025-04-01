package com.todo.list.dto;

import com.todo.list.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String email;
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}
	public UsuarioDTO(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	//serve para receber o valor da minha entidade
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
	}
	
	public Long getId() {
		return id;
	}
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
	
	
}
