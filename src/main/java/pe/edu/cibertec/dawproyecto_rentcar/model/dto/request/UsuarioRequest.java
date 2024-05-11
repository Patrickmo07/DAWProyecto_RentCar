package pe.edu.cibertec.dawproyecto_rentcar.model.dto.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UsuarioRequest {
    private int idadmin;
    private String nomadmin;
    private String email;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private Boolean activo;

}
