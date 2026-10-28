import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Write a description of class MenuTexto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuTexto implements IMenu {
    Scanner sc = new Scanner(System.in);
    
    public int pergQuantidade() {
        try {
            System.out.print("\nForneça a quantidade de alunos: ");
            int quant = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            return quant;
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número inteiro.");
            sc.nextLine(); // Limpa o erro do buffer
            return 0;
        }
    }
    
    public int criarMenu(String opcoes[]) {
        try {
            String itens = "";
            for (int i = 0; i < opcoes.length; i++) {
                itens += "\n" + opcoes[i];
            }
            System.out.print(itens + "\n\nSelecione a opcao: ");
            String s = sc.nextLine();
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Opção inválida.");
            return -1;
        }
    }

    public String inserirRA(String ra) {
        try {
            System.out.print("\nInforme o RA: ");
            return sc.nextLine();
        } catch (Exception e) {
            return "";
        }
    }

    public String inserirNome(String nome) {
        try {
            System.out.print("\nInforme o nome: ");
            return sc.nextLine();
        } catch (Exception e) {
            return "";
        }
    }

    public int inserirSemestre(int semestre) {
        try {
            System.out.print("\nInforme o semestre: ");
            int sem = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            return sem;
        } catch (InputMismatchException e) {
            System.out.println("Erro: Semestre deve ser um número.");
            sc.nextLine(); 
            return 0;
        }
    }

    public int inserirIdade(int idade) {
        try {
            System.out.print("\nInforme a idade: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            return id;
        } catch (InputMismatchException e) {
            System.out.println("Erro: Idade deve ser um número.");
            sc.nextLine();
            return 0;
        }
    }

    public String inserirCurso(String curso) {
        try {
            System.out.print("\nInforme o curso: "); 
            return sc.nextLine();
        } catch (Exception e) {
            return "";
        }
    }

    public String removerRA(String ra) {
        try {
            System.out.print("\nInforme o RA do aluno(a) que deseja remover: "); 
            return sc.nextLine();
        } catch (Exception e) {
            return "";
        }
    }
}

