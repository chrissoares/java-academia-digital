package me.dio.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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

@Data //Nos dar os Gets e Settes para não precisar criarmos e deixarmos o arquivo maior.
@NoArgsConstructor //Da um construtor sem Atributos, vazio
@AllArgsConstructor //Da um construtor com TODOS atributos.
@Entity //Cria a tabela no banco de dados, ela pede um Id por padrão
@Table(name = "tb_alunos") // Para mudar o nome da tabela
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) //Cria um relacionamento, nesse caso um para muitos. mappedBy usamos pq em avaliacoes fisicas temos um atributo que representa o relacionamento. fechType.LAZY evita que ela seja carregada, ela só sera carregada quando for chamada.
  @JsonIgnore //Ignora algumas exceções que por acaso ocorrerem. Foi definido junto da classe no @JsonIgnoreProperties, usamos isto por causa do fetch ser Lazy, pois ele pode gerar algumas exceções.
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
