package com.tfabri.dev.forumapi.controller;

import com.tfabri.dev.forumapi.dto.CadastroRequest;
import com.tfabri.dev.forumapi.dto.UsuarioResponse;
import com.tfabri.dev.forumapi.entity.Usuario;
import com.tfabri.dev.forumapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity<UsuarioResponse> cadastrar(@RequestBody CadastroRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());

        Usuario usuarioSalvo = usuarioService.cadastrar(usuario);

        UsuarioResponse response = new UsuarioResponse(
                usuarioSalvo.getId(),
                usuarioSalvo.getNome(),
                usuarioSalvo.getEmail()
        );

        return ResponseEntity.ok(response);
    }
}