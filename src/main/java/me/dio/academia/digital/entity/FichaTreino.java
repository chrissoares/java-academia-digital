package me.dio.academia.digital.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_ficha_treino")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FichaTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.REFRESH) 
    @JoinColumn(name = "aluno_id") 
    private Aluno aluno;
  
    //ManyToMany: https://www.baeldung.com/jpa-many-to-many
    // @ManyToMany
    // @JoinTable(
    //     name = "tb_ficha_treino_exercicios",
    //     joinColumns = @JoinColumn(name = "ficha_treino_id"),
    //     inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    // )
    @OneToMany(mappedBy = "fichaTreino", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<FichaTreinoExercicio> fichaTreinoExercicios;

    private LocalDateTime dataInicio = LocalDateTime.now();
    
    
    
}
