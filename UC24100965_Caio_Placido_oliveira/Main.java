import modelo.Biblioteca;
import visao.BibliotecaView;
import controle.BibliotecaController;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        BibliotecaView view = new BibliotecaView();
        new BibliotecaControlador(biblioteca, view);
    }
}