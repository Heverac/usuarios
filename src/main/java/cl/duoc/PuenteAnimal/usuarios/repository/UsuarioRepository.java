package cl.duoc.PuenteAnimal.usuarios.repository;

import cl.duoc.PuenteAnimal.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByNombreUsuarioAndPassword(String nombreUsuario, String password);

}
