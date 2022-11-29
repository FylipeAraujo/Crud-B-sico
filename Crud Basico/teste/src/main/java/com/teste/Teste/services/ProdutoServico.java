package com.teste.Teste.services;

import com.teste.Teste.entity.Produtos;
import com.teste.Teste.repository.ProdutosRepositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServico {


    @Autowired
    private static ProdutosRepositorio produtoDAO;
    
    public static void salvar(Produtos produtos) {

        produtoDAO.save(produtos);
    }
    
    public List<Produtos> findAll() {
    	List<Produtos> lista = produtoDAO.findAll();
    	
    	return lista;
    }
    
    public Produtos findById(Integer id) {
    	
    	Optional<Produtos> produtos = produtoDAO.findById(id);
    	return produtos.get();
    }
}

