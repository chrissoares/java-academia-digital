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

import me.dio.academia.digital.entity.FichaTreinoExercicio;
import me.dio.academia.digital.entity.form.FichaTreinoExercicioForm;
import me.dio.academia.digital.entity.form.FichaTreinoExercicioUpdateForm;
import me.dio.academia.digital.service.impl.FichaTreinoExercicioServiceImpl;

@RestController
@RequestMapping("/fichaTreinoExercicio")
public class FichaTreinoExercicioController {

    @Autowired
    private FichaTreinoExercicioServiceImpl service;

    @PostMapping
    public FichaTreinoExercicio create(@RequestBody FichaTreinoExercicioForm form){
        return service.create(form);
    }

    @GetMapping("/{id}")
    public FichaTreinoExercicio get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<FichaTreinoExercicio> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public FichaTreinoExercicio update(@PathVariable Long id, @RequestBody FichaTreinoExercicioUpdateForm form){
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    
}
