package me.dio.academia.digital.entity;

// import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
// import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_ficha_treino_exercicios")
public class FichaTreinoExercicio {
    
    // @EmbeddedId
    // private FichaTreinoExercicioKey id;

    @Id
    private Long id;

    @ManyToOne
    // @MapsId("exercicioId")
    @JoinColumn(name = "exercicio_id")
    private Exercicio exercicio;
    
    @ManyToOne
    // @MapsId("fichaTreinoId")
    @JoinColumn(name = "ficha_treino_id")
    private FichaTreino fichaTreino;

    private int series;

    private int repeticoes;

    private int intervalo;

    private int frequenciaSemanal;

}
