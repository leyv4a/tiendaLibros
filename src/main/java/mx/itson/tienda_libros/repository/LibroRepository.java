package mx.itson.tienda_libros.repository;

import mx.itson.tienda_libros.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
