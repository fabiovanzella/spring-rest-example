package br.com.exemplo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Usuario extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1L;	
		
	private String nome;
	
	private String login;
	
	private String senha;
	
	private boolean ativo;
	
	@ManyToMany
	private List<Grupo> grupos;
	
	@ManyToMany
	private List<Permissao> permissoes;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
}