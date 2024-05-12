package pe.edu.cibertec.dawproyecto_rentcar.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Carro;
import pe.edu.cibertec.dawproyecto_rentcar.service.ICarroService;
import pe.edu.cibertec.dawproyecto_rentcar.repository.CarroRepository;
@AllArgsConstructor
@Service
public class CarroService implements ICarroService {
    private CarroRepository carroRepository;
    @Override
    public List<Carro> listarCarro() {
        return carroRepository.findAll();
    }
    @Override
    public void guardarCarro(Carro carro){
        carroRepository.save(carro);
    }

}
