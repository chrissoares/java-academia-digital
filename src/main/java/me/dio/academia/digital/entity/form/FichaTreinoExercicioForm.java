package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichaTreinoExercicioForm {
    
    private Long exercicioId;

    private Long fichaTreinoId;

    private int series;

    private int repeticoes;

    private int intervalo;

    private int frequenciaSemanal;
    
}
