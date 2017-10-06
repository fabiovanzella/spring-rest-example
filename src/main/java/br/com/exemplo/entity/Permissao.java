package br.com.exemplo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Permissao extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;
		
	private String nome;
	
	@ManyToMany(mappedBy = "permissoes")
	private List<Usuario> usuarios;
	
	@ManyToMany(mappedBy = "permissoes")
	private List<Grupo> grupos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
}