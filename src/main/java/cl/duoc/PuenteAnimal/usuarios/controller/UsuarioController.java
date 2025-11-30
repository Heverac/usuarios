package cl.duoc.PuenteAnimal.usuarios.controller;


import cl.duoc.PuenteAnimal.usuarios.model.Usuario;
import cl.duoc.PuenteAnimal.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }
    @PostMapping
    public Usuario save(Usuario usuario){
        return usuarioService.Save(usuario);
    }
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Integer id,@RequestBody Usuario usuario){
        return usuarioService.update(id, usuario);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        usuarioService.delete(id);
    }

}
