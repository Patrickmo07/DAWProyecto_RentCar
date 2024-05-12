package com.example.DAWProyecto_RentCar.repository;

import com.example.DAWProyecto_RentCar.Model.BD.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
}
