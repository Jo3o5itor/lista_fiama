package com.todo.list.dto;

import java.time.LocalDate;

import com.todo.list.entities.Tarefas;
import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;

public class TarefasDTO {

	private Long id;
	private String descricao;
	private String setor;
	private LocalDate data_cadastro;
	// Enum da prioridade
	private Prioridade prioridade;
	// Enum do status
	private Status status;
	private Long idUsuario;
	
	//construtor vazio
	public TarefasDTO() {
		
	}
	//construtor cheio
	public TarefasDTO(Long id, String descricao, String setor, LocalDate data_cadastro,
			Prioridade prioridade, Status status, Long idUsuario) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.data_cadastro = data_cadastro;
		prioridade = prioridade;
		this.status = status;
		this.idUsuario = idUsuario;
	}
	//getter and setter
	public TarefasDTO(Tarefas entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
		setor = entity.getSetor();
		data_cadastro = entity.getData_cadastro();
		prioridade = entity.getPrioridade();
		status = entity.getStatus();
		idUsuario = entity.getUsuario().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public LocalDate getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(LocalDate data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	
}
