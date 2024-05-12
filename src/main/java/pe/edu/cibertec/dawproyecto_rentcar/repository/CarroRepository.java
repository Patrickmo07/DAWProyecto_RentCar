package com.example.DAWProyecto_RentCar.repository;

import com.example.DAWProyecto_RentCar.Model.BD.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, String> {
}
