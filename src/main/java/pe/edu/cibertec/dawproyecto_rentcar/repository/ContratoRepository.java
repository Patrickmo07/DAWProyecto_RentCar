package com.example.DAWProyecto_RentCar.repository;


import com.example.DAWProyecto_RentCar.Model.BD.ContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<ContratoModel,Integer> {
}

