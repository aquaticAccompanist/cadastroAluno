import java.util.Scanner;

/**
 * Write a description of interface IMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IMenu
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    int criarMenu(String opcoes[]);
    int pergQuantidade();
    public String inserirRA(String ra);
    public String inserirNome(String nome);
    public int inserirIdade(int idade);
    public String inserirCurso(String curso);
    public int inserirSemestre(int semestre);
    public String removerRA(String ra);
}