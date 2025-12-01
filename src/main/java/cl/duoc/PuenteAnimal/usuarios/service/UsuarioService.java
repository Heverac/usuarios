package cl.duoc.PuenteAnimal.usuarios.service;


import cl.duoc.PuenteAnimal.usuarios.model.Usuario;
import cl.duoc.PuenteAnimal.usuarios.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    // Ahora usamos Optional, nada de .get() directo
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    // corrige el nombre del método: save con minúscula
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean delete(Integer id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Usuario> update(Integer idUsuario, Usuario usuario2) {
        return usuarioRepository.findById(idUsuario)
                .map(usuario1 -> {
                    usuario1.setNombre(usuario2.getNombre());
                    usuario1.setEmail(usuario2.getEmail());
                    usuario1.setPassword(usuario2.getPassword());
                    usuario1.setDireccion(usuario2.getDireccion());
                    usuario1.setNombreUsuario(usuario2.getNombreUsuario());
                    return usuarioRepository.save(usuario1);
                });
    }
    public Optional<Usuario> login(String nombreUsuario, String password) {
        return usuarioRepository.findByNombreUsuarioAndPassword(nombreUsuario, password);
    }

}

