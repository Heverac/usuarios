package cl.duoc.PuenteAnimal.usuarios.repository;



import cl.duoc.PuenteAnimal.usuarios.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        if (usuarioRepository.count() > 0) {
            return;
        }


        Usuario admin = new Usuario();
        admin.setNombreUsuario("admin");
        admin.setNombre("Administrador");
        admin.setEmail("admin@ecomarket.cl");
        admin.setPassword("admin123");
        admin.setDireccion("Casa matriz");
        admin.setAdmin(true);


        Usuario user = new Usuario();
        user.setNombreUsuario("user");
        user.setNombre("Lucas Barrios");
        user.setEmail("LB8@gmail.cl");
        user.setPassword("user123");
        user.setDireccion("Antonio Varas 666");
        user.setAdmin(false);

        usuarioRepository.save(admin);
        usuarioRepository.save(user);
    }
}

