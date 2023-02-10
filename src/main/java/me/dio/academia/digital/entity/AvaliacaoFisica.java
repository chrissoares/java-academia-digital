package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  //O relaciomaneto que esta sendo feito entre Aluno (la na classe) e avalizacaofisica (nesta classe) é bi-direcional, não é recomendado. O Ideal seria usar um unidirecional.
  @ManyToOne(cascade = CascadeType.ALL) //Relacionamento muito para um. O atributo cascade faz com que o que ocorrer em AvaliacaoFisica vai repercurtir em Aluno (acho que é o contrario)
  @JoinColumn(name = "aluno_id") //Qual coluna sera a foreign key, nome dela.
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name = "peso_atual")
  private double peso;

  @Column(name = "altura_atual")
  private double altura;

}
