package com.ph.prova.Repository;

import com.ph.prova.Models.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository <ProdutosModel, Long> {
}
