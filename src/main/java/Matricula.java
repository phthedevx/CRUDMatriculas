import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private int id;
    private Aluno aluno;
    private String situacao = "Aberto";
    private double valorTotal = 0;
    private List<Curso> cursos = new ArrayList<>();

    public Matricula(String situacao) {
        this.situacao = situacao;
    }
    public List<Curso> getCursos(){
        return cursos;
    }
    public void adicionaCurso(Curso curso){
        cursos.add(curso);
    }
    public double calcularMensalidade(){
        double mensalidadeTotal = 0;
        for(Curso c : cursos){
            mensalidadeTotal += c.getPreco();
        }
        valorTotal = mensalidadeTotal;
        return valorTotal;
    }
}
