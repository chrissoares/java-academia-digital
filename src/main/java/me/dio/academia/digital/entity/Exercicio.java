package me.dio.academia.digital.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_exercicios")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @ManyToMany(mappedBy = "exercicios")
    @OneToMany(mappedBy = "exercicio", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<FichaTreinoExercicio> fichaTreinoExercicios;

    private String nome;
    
    // INSIGHT: Adicionar os Musculos trabalhados para poder criar a ficha
    
}
