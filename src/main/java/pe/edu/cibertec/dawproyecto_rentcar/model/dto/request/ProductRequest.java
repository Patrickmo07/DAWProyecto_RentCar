package pe.edu.cibertec.dawproyecto_rentcar.model.dto.request;

import lombok.Data;

@Data
public class ProductRequest {
    private int idcarro;
    private String Matricula;
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
