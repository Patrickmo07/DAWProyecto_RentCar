package pe.edu.cibertec.dawproyecto_rentcar.service;

import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario findUserByNomAdmin(String nomadmin);
    Usuario guardarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario obtenerUsuarioxId(int id);
    void actualizarUsuario(Usuario usuario);
}
