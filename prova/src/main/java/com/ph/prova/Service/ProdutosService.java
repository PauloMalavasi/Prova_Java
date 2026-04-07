package com.ph.prova.Service;

import com.ph.prova.Models.ProdutosModel;
import com.ph.prova.ProvaApplication;
import com.ph.prova.Repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {

    @Autowired
    public ProdutosRepository produtosRepository;

    public ProdutosModel criar(ProdutosModel produtosModel){
        return produtosRepository.save(produtosModel);
    }

    public List<ProdutosModel> listar(){
        return produtosRepository.findAll();
    }

    public void deletar(Long id){
        produtosRepository.deleteById(id);
    }

    public Optional<ProdutosModel> listarId(Long id){
        return produtosRepository.findById(id);
    }

    public ProdutosModel atualizar(ProdutosModel produtosModel, Long id){
        ProdutosModel response = produtosRepository.findById(id).get();
        response.setDescricao(produtosModel.getDescricao());
        response.setNome(produtosModel.getNome());
        response.setPreco(produtosModel.getPreco());
        return produtosRepository.save(response);
    }



}
