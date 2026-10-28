import javax.swing.JOptionPane;

/**
 * Write a description of class MenuTexto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuGrafico implements IMenu {

    public int criarMenu(String opcoes[]) {
        try {
            String itens = "";
            for (int i = 0; i < opcoes.length; i++) {
                itens += "\n" + opcoes[i];
            }
            itens += "\n\nSelecione a opcao: ";
            String input = JOptionPane.showInputDialog(itens);
            return (input == null) ? -1 : Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido para a opção.");
            return -1;
        }
    }

    public int pergQuantidade() {
        try {
            String input = JOptionPane.showInputDialog("Forneça a quantidade de alunos: ");
            return (input == null) ? 0 : Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Quantidade inválida. Usando 0.");
            return 0;
        }
    }

    public String inserirRA(String ra) {
        try {
            String input = JOptionPane.showInputDialog(null, "\nInforme o RA:");
            return (input == null) ? "" : input;
        } catch (Exception e) {
            return "";
        }
    }

    public String inserirNome(String nome) {
        try {
            String input = JOptionPane.showInputDialog(null, "\nInforme o nome:");
            return (input == null) ? "" : input;
        } catch (Exception e) {
            return "";
        }
    }

    public int inserirSemestre(int semestre) {
        try {
            String input = JOptionPane.showInputDialog("\nInforme o semestre: ");
            return (input == null) ? 0 : Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número para o semestre.");
            return 0;
        }
    }

    public int inserirIdade(int idade) {
        try {
            String input = JOptionPane.showInputDialog("\nInforme a idade: ");
            return (input == null) ? 0 : Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Idade inválida.");
            return 0;
        }
    }

    public String inserirCurso(String curso) {
        try {
            String input = JOptionPane.showInputDialog(null, "\nInforme o curso:");
            return (input == null) ? "" : input;
        } catch (Exception e) {
            return "";
        }
    }

    public String removerRA(String ra) {
        try {
            String input = JOptionPane.showInputDialog(null, "\nInforme o RA do aluno(a) que deseja remover: ");
            return (input == null) ? "" : input;
        } catch (Exception e) {
            return "";
        }
    }
}
