package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.FichaTreino;
import me.dio.academia.digital.entity.form.FichaTreinoForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.FichaTreinoRepository;
import me.dio.academia.digital.service.IFichaTreinoService;

@Service
public class FichaTreinoServiceImpl implements IFichaTreinoService{
    @Autowired
    private FichaTreinoRepository fichaTreinoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public FichaTreino create(FichaTreinoForm form) {
        FichaTreino fichaTreino = new FichaTreino();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        fichaTreino.setAluno(aluno);
        
        return fichaTreinoRepository.save(fichaTreino);
    }

    @Override
    public FichaTreino get(Long id) {
        return fichaTreinoRepository.findById(id).get();
    }

    @Override
    public List<FichaTreino> getAll() {
        return fichaTreinoRepository.findAll();
    }

    @Override
    public FichaTreino update(long id, FichaTreinoForm fromUpdate) {
        // TODO: Nada a ser atualizado por enquanto
        return null;
    }

    @Override
    public void delete(Long id) {
        FichaTreino fichaTreino = fichaTreinoRepository.findById(id).get();
        fichaTreinoRepository.delete(fichaTreino);
    }

    
}
