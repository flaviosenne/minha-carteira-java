package com.carteira.minha.service.implement;

import com.carteira.minha.model.Usuario;
import com.carteira.minha.repository.UsuarioRepository;
import com.carteira.minha.service.UsuarioService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UsuarioImplementsService implements UsuarioService{
    
    private UsuarioRepository usuarioRepository;

    public UsuarioImplementsService(UsuarioRepository usuarioRepository){
        super();
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario autenticar(String email, String senha){
        return null;
    };

    @Override
    public Usuario cadastrar(Usuario usuario){
        return null;
    };

    @Override
    public void validarEmail(String email){

    };
}
