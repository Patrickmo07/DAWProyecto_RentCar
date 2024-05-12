package pe.edu.cibertec.dawproyecto_rentcar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="carro")
public class Carro {
    @Id
    @Column (name="idcarro")
    private int idcarro;
    @Column (name="Matricula")
    private String Matricula;
    @Column (name="Modelo")
    private String Modelo;
    @Column (name="Marca")
    private String Marca;
    @Column (name="Color")
    private String Color;
    @Column (name="motor")
    private String motor;
    @Column (name="asientos")
    private int asientos;
    @Column (name="fecha_fabricacion")
    private String fecha_fabricacion;
    @Column (name="kilometraje")
    private int kilometraje;
    @Column (name="tipo_combustible")
    private String tipo_combustible;
    @Column (name="precioxdia")
    private int precioxdia;
    @Column (name="disponibilidad")
    private String disponibilidad;
}
