package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.FichaTreino;
import me.dio.academia.digital.entity.form.ExercicioForm;
import me.dio.academia.digital.repository.ExercicioRepository;
import me.dio.academia.digital.service.IExercicioService;

@Service
public class ExercicioServiceImpl  implements IExercicioService{

    @Autowired
    private ExercicioRepository repository;

    @Override
    public Exercicio create(ExercicioForm form) {
        Exercicio exercicio = new Exercicio();
        exercicio.setNome(form.getNome());
        
        return repository.save(exercicio);
    }

    @Override
    public Exercicio get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Exercicio> getAll() {
        
        return repository.findAll();
    }

    @Override
    public Exercicio update(long id, ExercicioForm fromUpdate) {
        Exercicio exercicio = repository.findById(id).get();
        exercicio.setNome(fromUpdate.getNome());
        return repository.save(exercicio);
    }

    @Override
    public void delete(Long id) {
        Exercicio exercicio = repository.findById(id).get();
        repository.delete(exercicio);
    }

    @Override
    public List<FichaTreino> getAllFichaTreinos(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
