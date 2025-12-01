package cl.duoc.PuenteAnimal.usuarios.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    private String nombreUsuario;
    private String password;

}
