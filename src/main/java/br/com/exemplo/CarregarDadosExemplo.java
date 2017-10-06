package br.com.exemplo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.exemplo.entity.Grupo;
import br.com.exemplo.entity.Permissao;
import br.com.exemplo.entity.Usuario;
import br.com.exemplo.repository.GrupoRepository;
import br.com.exemplo.repository.PermissaoRepository;
import br.com.exemplo.repository.UsuarioRepository;

@ConditionalOnProperty("carregarDadosExemplo")
@Component
public class CarregarDadosExemplo implements ApplicationListener<ContextRefreshedEvent> {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private GrupoRepository grupoRepository;
    
    @Autowired
    private PermissaoRepository permissaoRepository;
     
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    	
    	Usuario usuario = new Usuario();
    	usuario.setNome("Alexandre Afonso");
    	usuario.setLogin("alexandre");
    	usuario.setSenha("$2a$10$ARppQC0FRWaGP4pnZqYbpuVyYOWIp4q1r2ViT3PGYK6BafD5PXFiS");
    	usuario.setAtivo(true);
    	    	
    	List<Grupo> listaGrupos = new ArrayList<Grupo>();
    	Grupo grupo = new Grupo();
    	grupo.setNome("ANALISTA");
    	grupo.setDescricao("Grupo de analistas");
    	listaGrupos.add(grupo);
    	    	    	
    	List<Permissao> listaPermissoes = new ArrayList<Permissao>();
    	Permissao permissao = new Permissao();
    	permissao.setNome("USUARIO");
    	permissaoRepository.save(permissao);
    	listaPermissoes.add(permissao);
    	    	    	 
    	permissao = new Permissao();
    	permissao.setNome("VISUALIZAR_RELATORIO_CUSTOS");
    	permissaoRepository.save(permissao);
    	listaPermissoes.add(permissao);
    	    	
    	permissao = new Permissao();
    	permissao.setNome("VISUALIZAR_RELATORIO_EQUIPE");
    	permissaoRepository.save(permissao);
    	listaPermissoes.add(permissao);
    	
    	grupo.setPermissoes(listaPermissoes);
    	usuario.setGrupos(listaGrupos);
    	
    	grupoRepository.save(grupo);
    	usuarioRepository.save(usuario);    	
    }


}