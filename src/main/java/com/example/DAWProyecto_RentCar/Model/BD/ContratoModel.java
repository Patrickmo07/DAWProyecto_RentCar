package com.example.DAWProyecto_RentCar.Model.BD;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@Table(name="contrato")
public class ContratoModel {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idcontrato;
    @Column (name="fecha_inicio")
    private String fecha_inicio;
    @Column (name="fecha_fin")
    private String fecha_fin;
    @Column (name="nomcliente")
    private String nomcliente;
    @ManyToOne
    @JoinColumn (name="idcliente")
    private ClienteModel cliente;
    @ManyToOne
    @JoinColumn (name="idcarro")
    private  CarroModel carro;
}
