package com.todo.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.TarefasDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.entities.Usuario;
import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;
import com.todo.list.repositories.TarefasRepository;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class TarefaService {

	@Autowired
	TarefasRepository tarefaRepository ;
	
	@Autowired
	UsuarioRepository usuarioRepository ;
	
	public TarefasDTO salvarTarefa(TarefasDTO dto) {
		
		Tarefas task = new Tarefas();
		
		task.setDescricao(dto.getDescricao());
		task.setSetor(dto.getSetor());
		//Seta a prioridade como BAIXA/possivel modificar no postman
		task.setPrioridade(Prioridade.BAIXA);
		//Seta como data local
		task.setData_cadastro(LocalDate.now());
		//Seta como A_FAZER/possivel modificar no postman
		task.setStatus(Status.A_FAZER);
		
		Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
		
		task.setUsuario(user);
		
		task = tarefaRepository.save(task);
		
		return new TarefasDTO(task);
	}
	
	public List<Tarefas> listarTarefas(){
		List<Tarefas> tarefas = tarefaRepository.findAll();
		
		return tarefas;
	}
}
