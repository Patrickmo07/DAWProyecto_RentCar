package pe.edu.cibertec.dawproyecto_rentcar.model.dto.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
public class UsuarioSecurity extends User {
    private static final boolean accountNonLocked = true;
    private String email;
    private String nombre;
    public UsuarioSecurity(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean b, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
