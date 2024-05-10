package com.example.DAWProyecto_RentCar.Model.dto.Request;

import lombok.Data;

@Data
public class CarroRequest {
    private String idcarro;
    private String Modelo;
    private String Marca;
    private String Color;
    private String motor;
    private int asientos;
    private String fecha_fabricacion;
    private int kilometraje;
    private String tipo_combustible;
    private int precioxdia;
    private String disponibilidad;
}
