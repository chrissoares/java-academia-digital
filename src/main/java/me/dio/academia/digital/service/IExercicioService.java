package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.FichaTreino;
import me.dio.academia.digital.entity.form.ExercicioForm;

public interface IExercicioService {
    
    /**
     * Cria um exercício
     * @param form - formulário contendo os campos necessários para criação de um exercício.
     * @return - O objeto Exercicio criado.
     */
    Exercicio create(ExercicioForm form);

    /**
     * Retorna um exercício armazenado no banco de dados que possua o Id informado.
     * @param id - id do Exercício a ser retornado
     * @return - O objeto Exercício encontrado, ou nulo se não encontrar.
     */
    Exercicio get(Long id);

    /**
     * Retorna todos os Exercícios armazenados no banco de daodos.
     * @return - Uma lista contendo todos os exercícios armazenados atualmente.
     */
    List<Exercicio> getAll();
    //INSIGHT: Adicionar para conseguir buscar por muscolos relacionados ao exercício

    /**
     * Atualiza o Exercício pelo id informado.
     * @param id - id do Exercício a ser atualizado.
     * @param fromUpdate - formulário contendo os campos preenchidos com os dados a serem atualizados.
     * @return - O Exercício atualizado.
     */
    Exercicio update (long id, ExercicioForm fromUpdate);

    /**
     * Exclui permanentemente o Exercício pelo id informado.
     * @param id - id do Exercício a ser excluído
     */
    void delete(Long id);
    
    /**
     * Retorna uma lista com todos as Fichas de Treinos que possuem o Exercício informado pelo seu id.
     * @param id - id do Exercício
     * @return - Lista com as Fichas de Treino que possuem o exercício.
     */
    List<FichaTreino> getAllFichaTreinos(Long id);

}
