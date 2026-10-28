/**
 * Write a description of class CadastroAlunos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadastroAlunos {
    static int semestre, idade;
    static String curso = "", ra = "", nome = "";
    int cont;
    
    IMenu ca;
    IArmazenador arm; 
    CadastroAlunos (int qtde){
        arm = new ArmazenadorArray(qtde);
        System.out.println(qtde);
    }
    //String RA, String Nome, int Semestre, int idade, String curso
    // inserir
    public void inserirAluno(int menu){
        if (menu==0)
        {ca = new MenuTexto();}
        else
        {ca = new MenuGrafico();}
        do{
        semestre = ca.inserirSemestre(semestre);
        }while(semestre<1);
        
        do{
        idade = ca.inserirIdade(idade);
        
        if(idade<18)
            {
            System.out.println("Idade muito baixa!");
            }
        else if(idade>100)
            {
            System.out.println("Idade muito alta!");
            }   
        
        }while(idade<18||idade>100);
        do{
        curso = ca.inserirCurso(curso);
        }while(curso == "");
        do{
        ra = ca.inserirRA(ra);
        }while(ra == "");
        do{
        nome = ca.inserirNome(nome);    
        }while(nome== "");
        Aluno alunoInserido = new Aluno(nome, idade, ra, curso, semestre);
        
        boolean inserido = arm.inserir(alunoInserido); 
        
        if (inserido) {
            System.out.println("Aluno inserido com sucesso!");
        }         
        }
    // remover
    public void removerAluno(int menu)
        {
        if (menu==1)
        {IMenu ca = new MenuGrafico();}
        else
        {IMenu ca = new MenuTexto();}
            
        ra = ca.removerRA(ra);
        
        boolean removido = arm.remover(ra);
        if (removido) {
            System.out.println("Aluno com RA " + ra + " removido com sucesso!");
        } else {
            System.out.println("Erro: Aluno não encontrado!");
        }
        }
    //listar
    public void listarAlunos()
        {
        
         arm.listar();
        }
        
        public void alterarAluno(int menu) {
        if (menu==1)
        {IMenu ca = new MenuGrafico();}
        else
        {IMenu ca = new MenuTexto();}
        String raBusca = ca.inserirRA(""); 
    
        nome = ca.inserirNome(nome);
        idade = ca.inserirIdade(idade);
        curso = ca.inserirCurso(curso);
        ra = ca.inserirRA(ra); 
        semestre = ca.inserirSemestre(semestre);

        Aluno alunoAtualizado = new Aluno(nome, idade, ra, curso, semestre);

        boolean sucesso = arm.atualizar(raBusca, alunoAtualizado);
    
        if (sucesso) {
            System.out.println("Dados do aluno atualizados com sucesso!");
        } else {
            System.out.println("Erro: Aluno com RA:'" + raBusca + "' não encontrado.");
        }
    }
    
}