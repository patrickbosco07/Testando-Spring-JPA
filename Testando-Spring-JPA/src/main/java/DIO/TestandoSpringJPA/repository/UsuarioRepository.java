package DIO.TestandoSpringJPA.repository;

import DIO.TestandoSpringJPA.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
