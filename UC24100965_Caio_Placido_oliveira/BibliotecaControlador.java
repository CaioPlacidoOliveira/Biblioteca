package controle;

import modelo.Biblioteca;
import modelo.Livro;
import visao.BibliotecaView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaControlador {
    private Biblioteca modelo;
    private BibliotecaVisão view;

    public BibliotecaControlador(Biblioteca modelo, BibliotecaVisão view) {
        this.modelo = modelo;
        this.view = view;
        this.view.setAdicionarListener(new AdicionarLivro());
        this.view.setRemoverListener(new RemoverLivro());
    }

    class AdicionarLivro implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String titulo = view.getTitulo();
            String autor = view.getAutor();
            if (!titulo.isEmpty() && !autor.isEmpty()) {
                Livro livro = new Livro(titulo, autor);
                modelo.adicionarLivro(livro);
                view.adicionarLivroNaLista(livro.toString());
                view.limparCampos();
            }
        }
    }

    class RemoverLivro implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int index = view.getLivroSelecionadoIndex();
            modelo.removerLivro(index);
            view.removerLivroDaLista(index);
        }
    }
}