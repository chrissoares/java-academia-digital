package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.FichaTreino;
import me.dio.academia.digital.entity.form.FichaTreinoForm;

public interface IFichaTreinoService {

    /**
     * Cria uma Ficha de Treinamento
     * @param form - formulário contendo os campos necessários para criação de uma Ficha de Treinamento.
     * @return - O objeto FichaTreino criado.
     */
    FichaTreino create(FichaTreinoForm form);

    /**
     * Retorna uma Ficha de Treinamento armazenada no banco de dados que possua o Id informado.
     * @param id - id da Ficha de Treinamento a ser retornada.
     * @return - O objeto FichaTreino encontrado, ou nulo se não encontrar.
     */
    FichaTreino get(Long id);

    /**
     * Retorna todas as Ficha de Treinamento armazenadas no banco de daodos.
     * @return - Uma lista contendo todas as Ficha de Treinamento armazenadas atualmente.
     */
    List<FichaTreino> getAll();

    /**
     * Atualiza a Ficha de Treinamento pelo id informado.
     * @param id - id da Ficha de Treinamento a ser atualizada.
     * @param fromUpdate - formulário contendo os campos preenchidos com os dados a serem atualizados.
     * @return - A Ficha de Treinamento atualizada.
     */
    FichaTreino update (long id, FichaTreinoForm fromUpdate);

    /**
     * Exclui permanentemente a Ficha de Treinamento pelo id informado.
     * @param id - id da Ficha de Treinamento a ser excluído
     */
    void delete(Long id);
    
}
