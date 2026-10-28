
/**
 * Write a description of class CadastroAluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArmazenadorArray implements IArmazenador {
    int i = 0;
    // Armazenador de alunos
    Aluno[] arm;
    
    ArmazenadorArray(int qtde){
        arm = new Aluno[qtde];
    }

    /**
     * inserir - insere um aluno na estrutura de dados
     *
     * @param  a - objeto aluno a ser inserido no armazenador
     * @return boolean  true - com sucesso, false - falha na inserção
     */
    public boolean inserir(Aluno alunoInserido)
        {
    for(int j = 0; j<i; j++)
        {
            if (alunoInserido.ra == arm[j].ra)
            {
                System.out.println("Erro: O aluno ja foi cadastrado!");
                return false;
            }
        }
        if (i < arm.length) { // Verifica se ainda tem espaço no array
        arm[i] = alunoInserido;       // Coloca o aluno na posição atual
        i++;              // Pula para a próxima posição livre
        return true;
    }
    
    System.out.println("Erro: O armazenador esta cheio!");
    return false; // Array cheio
        }
    

    /**
     * remover - remove um aluno na estrutura de dados
     *
     * @param  ra - String representando o ra do aluno
     * @return boolean  true - com sucesso, false - falha na remoção
     */
    public boolean remover(String ra) {
    for (int j = 0; j < i; j++) { // Percorre apenas até onde existem alunos (índice i)
        if (arm[j] != null && arm[j].ra.equals(ra)) {
            // Remove o aluno (define como nulo)
            arm[j] = null;
            
            // Opcional: Puxar os próximos alunos para preencher o espaço (Shift)
            for (int k = j; k < i - 1; k++) {
                arm[k] = arm[k + 1];
            }
            arm[i - 1] = null; // Limpa a última posição que ficou duplicada
            i--; // Diminui o contador de alunos total
            
            return true; // Sucesso na remoção
        }
    }
    return false; // Aluno não encontrado
       }
       
    public void listar(){
        for(int j = 0; j<i; j++)
        {
            System.out.println(arm[j]);
            System.out.println("Nome bibliografico: " + arm[j].getNomeBiblio());
            System.out.println("\n\n");
        }
    }
    
    public boolean atualizar(String ra, Aluno novoAluno) {
    for (int j = 0; j < i; j++) {
        // Verifica se a posição não é nula e se o RA coincide
        if (arm[j] != null && arm[j].ra.equals(ra)) {
            arm[j] = novoAluno; // Substitui os dados
            return true;
        }
    }
    return false; // Aluno não encontrado
    }
    
    }