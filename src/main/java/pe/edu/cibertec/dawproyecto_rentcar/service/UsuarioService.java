package pe.edu.cibertec.dawproyecto_rentcar.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Rol;
import pe.edu.cibertec.dawproyecto_rentcar.model.bd.Usuario;
import pe.edu.cibertec.dawproyecto_rentcar.repository.RolRepository;
import pe.edu.cibertec.dawproyecto_rentcar.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {
    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public Usuario findUserByNomAdmin(String nomadmin){
        return usuarioRepository.findByNomadmin(nomadmin);
    }
    @Override
    public Usuario guardarUsuario(Usuario usuario){
        usuario.setContrasena(bCryptPasswordEncoder.encode(
                "123456"));
        usuario.setActivo(true);
        //Buscar el rol que le compete al usuario
        Rol usuarioRol = rolRepository.findByNomrol("admin");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {

        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerUsuarioxId(int id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        usuario.setContrasena("");
        return usuario;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioRepository.actualizarUsuario(
                usuario.getNombres(), usuario.getApellidos(),
                usuario.getActivo(), usuario.getIdadmin()
        );
    }


}
