package me.dio.academia.digital.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.form.ExercicioForm;
import me.dio.academia.digital.service.impl.ExercicioServiceImpl;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    @Autowired
    private ExercicioServiceImpl service;

    @PostMapping
    public Exercicio create(@RequestBody ExercicioForm form){
        return service.create(form);
    }
    
    @GetMapping("/{id}")
    public Exercicio getById(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<Exercicio> getAll(){
        return service.getAll();
    }


    @PutMapping("/{id}")
    public Exercicio update(@PathVariable Long id, @RequestBody ExercicioForm from){
        return service.update(id, from);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }



    
}
