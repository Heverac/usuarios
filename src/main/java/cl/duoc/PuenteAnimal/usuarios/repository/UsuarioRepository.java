package cl.duoc.PuenteAnimal.usuarios.repository;

import cl.duoc.PuenteAnimal.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
