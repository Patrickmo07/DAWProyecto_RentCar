package com.example.DAWProyecto_RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DAWProyecto_RentCar.;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Integer>{
}
