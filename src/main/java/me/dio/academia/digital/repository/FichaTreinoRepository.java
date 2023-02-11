package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.FichaTreino;

@Repository
public interface FichaTreinoRepository extends JpaRepository<FichaTreino, Long>{
    
}
