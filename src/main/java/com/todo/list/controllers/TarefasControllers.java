package com.todo.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.TarefasDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.services.TarefaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefa")
public class TarefasControllers {
	
	@Autowired
	TarefaService tarefaService;
	
	// define como /criar no postman
 	@PostMapping(value = "/criar")
	public ResponseEntity<TarefasDTO> criarTarefa(@Valid @RequestBody TarefasDTO dto){
		dto = tarefaService.salvarTarefa(dto);
		return ResponseEntity.ok(dto);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Tarefas>> listarTarefas(){
	
		return ResponseEntity.ok(tarefaService.listarTarefas());
	}
	
	
}
