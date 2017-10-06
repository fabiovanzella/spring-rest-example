package br.com.exemplo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.exemplo.entity.Grupo;

@RepositoryRestResource(collectionResourceRel = "grupo", path = "grupos")
public interface GrupoRepository extends CrudRepository<Grupo, Long> {

}
