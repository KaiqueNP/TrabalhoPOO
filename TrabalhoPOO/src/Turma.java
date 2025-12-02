import java.util.ArrayList;

public class Turma {
    String codigo;
    String disciplina;
    String professor;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno nomeAluno) {
        alunos.add(nomeAluno);
    }

    public void removerAluno(int indice) {
        alunos.remove(indice);
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            System.out.println(a.getNome() + " - Matrícula: " + a.matricula);
        }
    }
}