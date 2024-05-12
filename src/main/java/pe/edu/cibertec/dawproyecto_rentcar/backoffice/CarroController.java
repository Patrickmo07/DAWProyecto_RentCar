package pe.edu.cibertec.dawproyecto_rentcar.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Carro;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Boleta;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Contrato;
import pe.edu.cibertec.dawproyecto_rentcar.model.dto.request.ProductRequest;
import pe.edu.cibertec.dawproyecto_rentcar.model.dto.response.ProductResponse;
import pe.edu.cibertec.dawproyecto_rentcar.service.ICarroService;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/carro")
public class CarroController {
    private ICarroService iCarroService;

    @GetMapping("")
    public String formCarro(Model model){
        model.addAttribute("listcarro",iCarroService.listarCarro());
        return "backoffice/carro/formcarro";
    }

    @GetMapping("/list")
    @ResponseBody
    public ProductResponse registerCarro(@RequestBody ProductRequest productRequest){
        String mensaje = "Carro registrado correctamente";
        boolean respuesta = true;
        try{
            Carro carro = new Carro();
            if(productRequest.getIdcarro() > 0 ){
                carro.setIdcarro(productRequest.getIdcarro());
            }
            carro.setModelo(productRequest.getModelo());
            carro.setMarca(productRequest.getMarca());
            carro.setColor(productRequest.getColor());
            carro.setFecha_fabricacion(productRequest.getFecha_fabricacion());
            carro.setMotor(productRequest.getMotor());
            carro.setAsientos(productRequest.getAsientos());
            carro.setKilometraje(productRequest.getKilometraje());
            carro.setTipo_combustible(productRequest.getTipo_combustible());
            carro.setPrecioxdia(productRequest.getPrecioxdia());
            carro.setDisponibilidad(productRequest.getDisponibilidad());
            iCarroService.guardarCarro(carro);
        }catch (Exception ex ){
            mensaje = "Carro no registrado, error en la BD.";
            respuesta = false;
        }
        return ProductResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }

}
