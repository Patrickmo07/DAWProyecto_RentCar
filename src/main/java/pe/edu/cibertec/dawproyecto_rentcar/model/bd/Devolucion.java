package pe.edu.cibertec.dawproyecto_rentcar.model.bd;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Table (name="devolucion")
public class Devolucion {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int iddevolucion;
    @Column (name="fecdevolucion ")
    private String fecdevolucion;
    @Column (name="estadodevolucion")
    private String estadodevolucion;
    @ManyToOne
    @JoinColumn (name="idcliente")
    private Cliente cliente;
}
