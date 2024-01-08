package mx.itson.tienda_libros.view;

import mx.itson.tienda_libros.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class LibroForm extends JFrame {
    LibroService libroService;
    private JPanel panel;

    @Autowired
    public LibroForm(LibroService libroService){
        this.libroService = libroService;
        iniciarForm();
    }

    private void iniciarForm(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000, 800);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamPantalla = toolkit.getScreenSize();
        int x = (tamPantalla.width - getWidth()) / 2;
        int y = (tamPantalla.height - getHeight()) / 2;

        setLocation(x, y);
    }
}
