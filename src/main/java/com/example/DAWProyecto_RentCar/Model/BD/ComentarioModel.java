package com.example.DAWProyecto_RentCar.Model.BD;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Table (name="comentarios")
public class ComentarioModel {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idcoment;
    @Column (name="calificacion")
    private String calificacion;
    @Column (name="comentario")
    private String comentario;
    @Column (name="fecha_hora")
    private String fecha_hora;
    @ManyToOne
    @JoinColumn (name="idcliente")
    private ClienteModel cliente;
}
