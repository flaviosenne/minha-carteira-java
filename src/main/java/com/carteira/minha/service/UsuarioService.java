package com.carteira.minha.service;

import com.carteira.minha.model.Usuario;

public interface UsuarioService {
    
    Usuario autenticar(String email, String senha);

    Usuario cadastrar(Usuario usuario);

    void validarEmail(String email);
}
