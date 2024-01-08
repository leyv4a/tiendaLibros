package mx.itson.tienda_libros.service;

import mx.itson.tienda_libros.model.Libro;
import mx.itson.tienda_libros.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibroService{

    @Autowired
    private LibroRepository libroRepositorio;

    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
    Libro libro = libroRepositorio.findById(idLibro).orElse(null);
    return libro;
    }

    @Override
    public void guardarLibro(Libro libro) {
    libroRepositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
    libroRepositorio.delete(libro);
    }
}
