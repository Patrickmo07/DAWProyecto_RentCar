package com.example.DAWProyecto_RentCar.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DAWProyecto_RentCar.Model.BD.DevolucionModel;

@Repository
public interface DevolucionRepository extends JpaRepository<DevolucionModel,Integer> {
}
