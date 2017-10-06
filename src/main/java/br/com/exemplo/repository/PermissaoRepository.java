package br.com.exemplo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.exemplo.entity.Permissao;

@RepositoryRestResource(collectionResourceRel = "permissao", path = "permissoes")
public interface PermissaoRepository extends CrudRepository<Permissao, Long> {

}
