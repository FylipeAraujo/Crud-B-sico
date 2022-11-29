package com.teste.Teste.repository;


import com.teste.Teste.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepositorio extends JpaRepository<Produtos, Integer> {
}
