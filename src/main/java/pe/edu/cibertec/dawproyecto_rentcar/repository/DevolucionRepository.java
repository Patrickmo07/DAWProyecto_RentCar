package pe.edu.cibertec.dawproyecto_rentcar.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Devolucion;

@Repository
public interface DevolucionRepository extends JpaRepository<Devolucion,Integer> {
}
