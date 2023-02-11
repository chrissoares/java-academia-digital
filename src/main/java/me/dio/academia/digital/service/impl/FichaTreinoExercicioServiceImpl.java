package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.FichaTreino;
import me.dio.academia.digital.entity.FichaTreinoExercicio;
import me.dio.academia.digital.entity.form.FichaTreinoExercicioForm;
import me.dio.academia.digital.entity.form.FichaTreinoExercicioUpdateForm;
import me.dio.academia.digital.repository.ExercicioRepository;
import me.dio.academia.digital.repository.FichaTreinoExercicioRepository;
import me.dio.academia.digital.repository.FichaTreinoRepository;
import me.dio.academia.digital.service.IFichaTreinoExercicioService;

@Service
public class FichaTreinoExercicioServiceImpl implements IFichaTreinoExercicioService{

    @Autowired
    private FichaTreinoExercicioRepository fichaTreinoExercicioRepository;

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private FichaTreinoRepository fichaTreinoRepository;

    @Override
    public FichaTreinoExercicio create(FichaTreinoExercicioForm form) {
        FichaTreinoExercicio fichaTreinoExercicio = new FichaTreinoExercicio();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(form.getExercicioId());
        System.out.println(form.getFichaTreinoId());
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        FichaTreino fichaTreino = fichaTreinoRepository.findById(form.getFichaTreinoId()).get();
        Exercicio exercicio = exercicioRepository.findById(form.getExercicioId()).get();

        fichaTreinoExercicio.setFichaTreino(fichaTreino);
        fichaTreinoExercicio.setExercicio(exercicio);

        fichaTreinoExercicio.setSeries(form.getSeries());
        fichaTreinoExercicio.setRepeticoes(form.getRepeticoes());
        fichaTreinoExercicio.setIntervalo(form.getIntervalo());
        fichaTreinoExercicio.setFrequenciaSemanal(form.getFrequenciaSemanal());

        return fichaTreinoExercicioRepository.save(fichaTreinoExercicio);
    }

    @Override
    public FichaTreinoExercicio get(Long id) {
        return fichaTreinoExercicioRepository.findById(id).get();
    }

    @Override
    public List<FichaTreinoExercicio> getAll() {
        return fichaTreinoExercicioRepository.findAll();
    }

    @Override
    public FichaTreinoExercicio update(Long id, FichaTreinoExercicioUpdateForm form) {
        FichaTreinoExercicio fichaTreinoExercicio = fichaTreinoExercicioRepository.findById(id).get();
        fichaTreinoExercicio.setSeries(form.getSeries());
        fichaTreinoExercicio.setRepeticoes(form.getRepeticoes());
        fichaTreinoExercicio.setIntervalo(form.getIntervalo());
        fichaTreinoExercicio.setFrequenciaSemanal(form.getFrequenciaSemanal());

        return fichaTreinoExercicioRepository.save(fichaTreinoExercicio);
    }

    @Override
    public void delete(Long id) {
        FichaTreinoExercicio fichaTreinoExercicio = fichaTreinoExercicioRepository.findById(id).get();
        fichaTreinoExercicioRepository.delete(fichaTreinoExercicio);
    }
    
}
