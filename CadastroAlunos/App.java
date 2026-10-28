import javax.swing.JOptionPane;
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App {
    public static void main(String args[]) {
        
        IMenu mn;
        
        int menu;

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja manter o menu gráfico?", "Menu gráfico", dialogButton);

        if (resposta == JOptionPane.YES_OPTION) {
            mn = new MenuGrafico();
            menu = 1;
        } else {
            mn = new MenuTexto(); 
            menu = 0;
        }

     
        int qtde = mn.pergQuantidade();

        
        String [] itensMenu = {"1 - inserir", "2 - remover", "3 - listar", "4 - atualizar", "5 - sair"};
        
        CadastroAlunos ca = new CadastroAlunos(qtde);
        int opcao;
        
        do {
            opcao = mn.criarMenu(itensMenu);
            if(opcao == 1){
                ca.inserirAluno(menu);
            }
            if(opcao == 2){
                ca.removerAluno(menu);
            }
            if(opcao == 3){
                ca.listarAlunos();
            }
            if(opcao == 4){
                ca.alterarAluno(menu);
            }
            }while(opcao != 5);
        } 
    }
