package com.example.DAWProyecto_RentCar.Model.dto.Response;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CarroResponse {
    private Boolean respuesta;
    private String mensaje;
}
