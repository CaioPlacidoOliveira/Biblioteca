package modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(int index) {
        if (index >= 0 && index < livros.size()) {
            livros.remove(index);
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
