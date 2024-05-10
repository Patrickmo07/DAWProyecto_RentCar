package com.example.DAWProyecto_RentCar.Model.BD;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Table (name="devolucion")
public class DevolucionModel {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int iddevolucion;
    @Column (name="fecdevolucion ")
    private String fecdevolucion;
    @Column (name="estadodevolucion")
    private String estadodevolucion;
    @ManyToOne
    @JoinColumn (name="idcliente")
    private ClienteModel cliente;
}
