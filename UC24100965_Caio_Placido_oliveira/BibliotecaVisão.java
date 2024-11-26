package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BibliotecaVisão {
    private JFrame frame = new JFrame("Biblioteca");
    private JTextField tituloField = new JTextField(20);
    private JTextField autorField = new JTextField(20);
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> livroList = new JList<>(listModel);
    private JButton adicionarButton = new JButton("Adicionar");
    private JButton removerButton = new JButton("Remover");

    public BibliotecaVisão() {
        frame.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Título:"));
        inputPanel.add(tituloField);
        inputPanel.add(new JLabel("Autor:"));
        inputPanel.add(autorField);
        inputPanel.add(adicionarButton);
        inputPanel.add(removerButton);
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(livroList), BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String getTitulo() {
        return tituloField.getText();
    }

    public String getAutor() {
        return autorField.getText();
    }

    public void limparCampos() {
        tituloField.setText("");
        autorField.setText("");
    }

    public void adicionarLivroNaLista(String livro) {
        listModel.addElement(livro);
    }

    public void removerLivroDaLista(int index) {
        listModel.remove(index);
    }

    public void setAdicionarListener(ActionListener listener) {
        adicionarButton.addActionListener(listener);
    }

    public void setRemoverListener(ActionListener listener) {
        removerButton.addActionListener(listener);
    }

    public int getLivroSelecionadoIndex() {
        return livroList.getSelectedIndex();
    }
}
