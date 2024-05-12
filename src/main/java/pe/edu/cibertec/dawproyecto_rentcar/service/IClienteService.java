package pe.edu.cibertec.dawproyecto_rentcar.service;

import java.util.List;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Cliente;
public interface IClienteService {
    Cliente findClienteByName(String nomcliente);
    Cliente guardarCliente(Cliente cliente);
    List<Cliente> listarCliente();
    Cliente obtenerClientexId (int idcliente);
    void actualizarCliente (Cliente cliente);
}
