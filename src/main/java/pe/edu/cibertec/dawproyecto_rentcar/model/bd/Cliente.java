package pe.edu.cibertec.dawproyecto_rentcar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "cliente")
public class Cliente {
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
