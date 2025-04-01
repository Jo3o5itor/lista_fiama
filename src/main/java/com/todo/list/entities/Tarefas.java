package com.todo.list.entities;

import java.time.LocalDate;

import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Table(name = "tb_tarefa") serve para definir o nome da tabela
@Table(name = "tb_tarefa")
public class Tarefas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column serve para definir a descricao como tipo "TEXT"
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private String setor;
	private LocalDate data_cadastro;
	private Prioridade prioridade;
	private Status status;
	
	//@ManyToOne serve para fazer a relação de Muitos para 1
	@ManyToOne()
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public Tarefas() {
		// TODO Auto-generated constructor stub
	}

	public Tarefas(Long id, String descricao, String setor, LocalDate data_cadastro,
			Prioridade prioridade, Status status, Usuario usuario) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.data_cadastro = data_cadastro;
		prioridade = prioridade;
		this.status = status;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
