package com.todo.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.list.entities.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long>{

}
