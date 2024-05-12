package pe.edu.cibertec.dawproyecto_rentcar.service;

import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Carro;
import java.util.List;
public interface ICarroService {
    Carro findCarroByName(String Modelo);
    Carro guardarCarro(Carro carro);
    List<Carro> listarCarro();
    Carro obtenerCarroxId(int idcarro);
    void actualizarCarro(Carro carro);
}
