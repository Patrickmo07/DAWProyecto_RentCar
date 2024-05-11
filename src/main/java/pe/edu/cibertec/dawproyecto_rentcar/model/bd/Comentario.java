package pe.edu.cibertec.dawproyecto_rentcar.model.bd;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Table (name="comentarios")
public class Comentario {
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
    private Cliente cliente;
}
