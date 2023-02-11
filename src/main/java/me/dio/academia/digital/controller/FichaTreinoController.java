package me.dio.academia.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.FichaTreino;
import me.dio.academia.digital.entity.form.FichaTreinoForm;
import me.dio.academia.digital.service.impl.FichaTreinoServiceImpl;

@RestController
@RequestMapping("/fichaTreinos")
public class FichaTreinoController {

    @Autowired
    private FichaTreinoServiceImpl service;

    @PostMapping
    public FichaTreino create(@RequestBody FichaTreinoForm from){
        return service.create(from);
    }

    @GetMapping("/{id}")
    public FichaTreino get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping()
    public List<FichaTreino> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public FichaTreino update(@PathVariable Long id, @RequestBody FichaTreinoForm form){
        //TODO: Não implementado por não ter o que ser atualizado
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    
}
