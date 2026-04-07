package com.ph.prova.Controllers;

import com.ph.prova.Models.ProdutosModel;
import com.ph.prova.Service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    public ProdutosService produtosService;

    @GetMapping
    public List<ProdutosModel> listar(){
        return produtosService.listar();
    }

    @PostMapping
    public ProdutosModel criar(@RequestBody ProdutosModel produtosModel){
        return produtosService.criar(produtosModel);
    }

    @GetMapping("/{id}")
    public Optional<ProdutosModel> listarId(@PathVariable Long id){
        return produtosService.listarId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtosService.deletar(id);
    }

    @PutMapping("/{id}")
    public ProdutosModel atualizar(@RequestBody ProdutosModel produtosModel, @PathVariable Long id){
        return produtosService.atualizar(produtosModel, id);
    }









}
