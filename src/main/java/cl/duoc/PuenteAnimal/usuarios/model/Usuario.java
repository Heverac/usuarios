package cl.duoc.PuenteAnimal.usuarios.model;



import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column
    private String nombreUsuario;

    @Column
    private String nombre;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String direccion;


}
