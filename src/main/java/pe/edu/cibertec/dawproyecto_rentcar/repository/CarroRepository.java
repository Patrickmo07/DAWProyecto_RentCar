package pe.edu.cibertec.dawproyecto_rentcar.repository;

import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, String> {
}
