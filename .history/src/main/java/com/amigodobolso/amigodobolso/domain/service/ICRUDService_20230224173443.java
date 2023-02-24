package com.amigodobolso.amigodobolso.domain.service;

import java.util.List;

public interface ICRUDService<Req, Res> {

    List<Res> obterTodos();
    Res obterPotId(Long id);
    Res cadastrar(Req dto);
    Res atualizar(Long id, Req dto);
    void deletar(Long id);
    
}
