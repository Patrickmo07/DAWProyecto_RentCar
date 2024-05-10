package com.example.DAWProyecto_RentCar.Model.BD;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "cliente")
public class ClienteModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idcliente;
    @Column (name="nomcliente")
    private String nomcliente;
    @Column (name="apellcliente")
    private String apellcliente;
    @Column (name="email")
    private String email;
    @Column (name="telefono")
    private String telefono;
    @Column (name="direccion")
    private String direccion;
    @Column (name="DNI")
    private String DNI;
    @Column (name="Brevete")
    private String Brevete;
}
