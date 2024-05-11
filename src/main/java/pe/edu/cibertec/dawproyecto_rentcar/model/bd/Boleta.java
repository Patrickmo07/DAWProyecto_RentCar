package pe.edu.cibertec.dawproyecto_rentcar.model.bd;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Table (name="boleta")
public class Boleta {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idboleta;
    @Column (name="FECBOLETA")
    private String FECBOLETA;
    @Column (name="MontoTotal")
    private int MontoTotal;
    @ManyToOne
    @JoinColumn (name="idcarro")
    private Carro carro;
    @ManyToOne
    @JoinColumn (name="idcliente")
    private Cliente cliente;
}
