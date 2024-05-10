package com.example.DAWProyecto_RentCar.Model.BD;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="usuario")

public class UsuarioModel {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idadmin;
    @Column (name="nomadmin")
    private String nomadmin;
    @Column (name="email")
    private String email;
    @Column (name="contraseña")
    private String contraseña;
    @Column (name="nombres")
    private String nombres;
    @Column (name="apellidos")
    private String apellidos;
}
