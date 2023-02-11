package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.FichaTreinoExercicio;
import me.dio.academia.digital.entity.form.FichaTreinoExercicioForm;
import me.dio.academia.digital.entity.form.FichaTreinoExercicioUpdateForm;

public interface IFichaTreinoExercicioService {
    
    
    public FichaTreinoExercicio create(FichaTreinoExercicioForm from);

    public FichaTreinoExercicio get(Long id);

    public List<FichaTreinoExercicio> getAll();
    
    public FichaTreinoExercicio update(Long id, FichaTreinoExercicioUpdateForm form) ;
    
    public void delete(Long id);

}
