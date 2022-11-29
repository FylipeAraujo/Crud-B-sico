package com.teste.Teste.controllers;

import com.teste.Teste.services.ProdutoServico;
import com.teste.Teste.entity.Pedido;
import com.teste.Teste.entity.Produtos;
import com.teste.Teste.repository.ProdutosRepositorio;
import com.teste.Teste.services.PedidoServico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Acoes {

    @Autowired
    PedidoServico pedidoServico;

    @Autowired
    ProdutoServico produtoServico;
    
    @Autowired
    private ProdutosRepositorio produtosDAO;
    
    private long pedido;

    @PostMapping("/salvar-pedido")
    public String salvarPedido(Pedido pedido) {
    	

        PedidoServico.salvar(pedido);

        return "redirect:/Pedidos";
    }

    @PostMapping("/salvar-produto")
    public String salvarProduto(Produtos produtos) {
    	
    	produtosDAO.save(produtos);
    	
//        ProdutoServico.salvar(produtos);

        return "redirect:/Produtos";
    }

    @PostMapping("/excluir")
    public String excluirPedido(Produtos produto){
    	
	      Optional<Produtos> produto1 = produtosDAO.findById(produto.getId());
	      produtosDAO.delete(produto1.get());

        return "redirect:/Pedidos";


    }

}
