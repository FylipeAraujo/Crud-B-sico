package com.teste.Teste.services;

import com.teste.Teste.repository.PedidoRepositorio;
import com.teste.Teste.entity.Pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServico {

    @Autowired
    private static PedidoRepositorio pedidoDAO;
    public static void salvar(Pedido pedido) {

      pedidoDAO.save(pedido);
    }

    public Pedido findByPedido(Pedido pedido) {
        return pedido;
    }

    public void delete(Pedido pedido1) {
    	pedidoDAO.delete(pedido1);
    }
    
}
