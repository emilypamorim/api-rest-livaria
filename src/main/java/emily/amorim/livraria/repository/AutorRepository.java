package emily.amorim.livraria.repository;

import emily.amorim.livraria.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
