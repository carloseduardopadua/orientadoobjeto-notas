package principal;

import javax.swing.JOptionPane;
import model.notas;

public class principal {

    public static void main(String[] args) {

        try {
            notas n = new notas();

            n.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));

            n.setNota1(Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 1:")
            ));

            n.setNota2(Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 2:")
            ));

            n.setNota3(Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 3:")
            ));

            double media = n.calcularMedia();

            JOptionPane.showMessageDialog(
                null,
                "Aluno: " + n.getNome() +
                "\nMédia: " + media
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Erro: digite apenas números válidos."
            );
        }
    }
}