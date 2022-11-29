package com.teste.Teste.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.teste.Teste.entity.Produtos;
import com.teste.Teste.repository.ProdutosRepositorio;
import com.teste.Teste.services.ProdutoServico;

@Controller
public class HomeTeste {
	
	@Autowired
	private ProdutosRepositorio produtosDAO;

    @GetMapping("/Home")
    public String inicio(){
        return "home";
    }
    @GetMapping("/Lista-de-Pedidos")
    public String Lista(Model model){
    	
        return "listaPedidos";
    }
    @GetMapping("/Pedidos")
    public String pedido(Model model, Produtos produto){
    	
    	List<Produtos> produtos = produtosDAO.findAll();
    	
    	model.addAttribute("produtos", produtos);
    	model.addAttribute("produto", produto);
    	
        return "pedidos";
    }
    @GetMapping("/Produtos")
    public String produtos(){
        return "produto";
    }

}
