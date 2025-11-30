package cl.duoc.PuenteAnimal.usuarios.service;


import cl.duoc.PuenteAnimal.usuarios.model.Usuario;
import cl.duoc.PuenteAnimal.usuarios.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {this.usuarioRepository = usuarioRepository;}
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).get();
    }
    public Usuario Save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void delete(Integer id){
    usuarioRepository.deleteById(id);}
    public Usuario update(Integer idUsuario, Usuario usuario2){
        Usuario usuario1= findById(idUsuario);
        usuario1.setNombre(usuario2.getNombre());
        usuario1.setEmail(usuario2.getEmail());
        usuario1.setPassword(usuario2.getPassword());
        usuario1.setDireccion(usuario2.getDireccion());
        usuario1.setNombreUsuario(usuario2.getNombreUsuario());
        return usuarioRepository.save(usuario1);
    }
}
