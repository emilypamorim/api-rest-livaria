package emily.amorim.livraria.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_autor")
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "autor") // um autor para muitos livros
    @JsonManagedReference
    private List<Livro> Livros = new ArrayList<>();

    public Autor(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
