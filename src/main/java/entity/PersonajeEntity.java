package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Personaje")

@Getter
@Setter

public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String imagen;
    private String nombre;
    private long edad;
    private long peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();

}
