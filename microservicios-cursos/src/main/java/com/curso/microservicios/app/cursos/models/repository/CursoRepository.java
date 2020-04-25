package com.curso.microservicios.app.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.app.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{

}
