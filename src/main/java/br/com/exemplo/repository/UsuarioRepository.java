package br.com.exemplo.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.exemplo.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}