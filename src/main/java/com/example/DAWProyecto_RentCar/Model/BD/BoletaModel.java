package com.example.DAWProyecto_RentCar.Model.BD;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Table (name="boleta")
public class BoletaModel {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idboleta;
    @Column (name="FECBOLETA")
    private String FECBOLETA;
    @Column (name="MontoTotal")
    private int MontoTotal;
    @ManyToOne
    @JoinColumn (name="idcarro")
    private CarroModel carro;
    @ManyToOne
    @JoinColumn (name="idcliente")
    private ClienteModel cliente;
}
