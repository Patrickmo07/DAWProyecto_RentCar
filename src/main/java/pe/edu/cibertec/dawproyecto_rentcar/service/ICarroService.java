package pe.edu.cibertec.dawproyecto_rentcar.service;

import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Carro;
import java.util.List;
public interface ICarroService {
    void guardarCarro(Carro carro);
    List<Carro> listarCarro();
}
