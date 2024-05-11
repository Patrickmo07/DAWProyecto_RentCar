package pe.edu.cibertec.dawproyecto_rentcar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table (name="usuario")
public class Usuario{
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idadmin;
    @Column (name="nomadmin")
    private String nomadmin;
    @Column (name="email")
    private String email;
    @Column (name="contrasena")
    private String contrasena;
    @Column (name="nombres")
    private String nombres;
    @Column (name="apellidos")
    private String apellidos;
    @Column (name="activo")
    private Boolean activo;
    @ManyToMany(cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol",
            joinColumns = @JoinColumn(name = "idadmin"),
            inverseJoinColumns = @JoinColumn(name = "idrol"))
    private Set<Rol> roles;
}
