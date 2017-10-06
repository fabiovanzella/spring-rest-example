package br.com.exemplo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Grupo extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;
	
	private String nome;

	private String descricao;

	@ManyToMany(mappedBy = "grupos")
	private List<Usuario> usuarios;

	@ManyToMany
	private List<Permissao> permissoes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
}