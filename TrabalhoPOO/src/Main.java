public class Main {
    static void main() {
        Disciplina disciplinaUm = new Disciplina();
        disciplinaUm.codigo = "123321";
        disciplinaUm.nome = "Português";
        disciplinaUm.semestre = 1;

        Disciplina disciplinaDois = new Disciplina();
        disciplinaDois.codigo = "321123";
        disciplinaDois.nome = "Matemática";
        disciplinaDois.semestre = 1;

        Disciplina disciplinaTres = new Disciplina();
        disciplinaTres.codigo = "321321";
        disciplinaTres.nome = "Geografia";
        disciplinaTres.semestre = 1;


        Aluno alunoRegularUm = new Regular();
        alunoRegularUm.setNome("Gabriel");
        alunoRegularUm.setCpf("36546516465"); // fictício
        alunoRegularUm.setIdade(26);
        alunoRegularUm.matricula = "4564655";


        Aluno alunoRegularDois = new Regular();
        alunoRegularDois.setNome("Maria");
        alunoRegularDois.setCpf("36546516465");
        alunoRegularDois.setIdade(16);
        alunoRegularDois.matricula = "8786521";

        Aluno alunoBolsista = new Bolsista();
        alunoBolsista.setNome("João");
        alunoBolsista.setCpf("36546516465");
        alunoBolsista.setIdade(25);
        alunoBolsista.matricula = "3223645";


        Professor professor = new Professor();
        professor.setNome("Carlos");
        professor.setCpf("9566121211");
        professor.setIdade(56);
        professor.centro = "Campus do Pici";
        professor.darAula();


        // visitantes
        Visitante visitante1 = new Visitante();
        visitante1.setNome("Paulo");
        visitante1.setCpf("55555555555");
        visitante1.setIdade(40);

        Visitante visitante2 = new Visitante();
        visitante2.setNome("Ana");
        visitante2.setCpf("66666666666");
        visitante2.setIdade(35);


        // turmas
        Turma turmaUm = new Turma();
        turmaUm.codigo = "T001";
        turmaUm.disciplina = disciplinaUm.nome;
        turmaUm.professor = professor.getNome();
        turmaUm.adicionarAluno(alunoRegularUm);
        turmaUm.adicionarAluno(alunoBolsista);

        Turma turmaDois = new Turma();
        turmaDois.codigo = "T002";
        turmaDois.disciplina = disciplinaDois.nome;
        turmaDois.professor = professor.getNome();
        turmaDois.adicionarAluno(alunoRegularDois);

        Turma turmaTres = new Turma();
        turmaTres.codigo = "T003";
        turmaTres.disciplina = disciplinaTres.nome;
        turmaTres.professor = professor.getNome();
        turmaTres.adicionarAluno(alunoRegularUm);
        turmaTres.adicionarAluno(alunoRegularDois);
        turmaTres.adicionarAluno(alunoBolsista);


        // impressão turmas
        System.out.println("=== TURMA 1 ===");
        System.out.println("Código: " + turmaUm.codigo);
        System.out.println("Professor: " + turmaUm.professor);
        System.out.println("Disciplina: " + turmaUm.disciplina);
        turmaUm.listarAlunos();

        System.out.println("=== TURMA 2 ===");
        System.out.println("Código: " + turmaDois.codigo);
        System.out.println("Professor: " + turmaDois.professor);
        System.out.println("Disciplina: " + turmaDois.disciplina);
        turmaDois.listarAlunos();

        System.out.println("=== TURMA 3 ===");
        System.out.println("Código: " + turmaTres.codigo);
        System.out.println("Professor: " + turmaTres.professor);
        System.out.println("Disciplina: " + turmaTres.disciplina);
        turmaTres.listarAlunos();


        // imprimindo visitantes só para constar
        System.out.println("Visitantes cadastrados:");
        System.out.println(visitante1.getNome() + " - CPF: " + visitante1.getCpf() + " - Idade: " + visitante1.getIdade());
        System.out.println(visitante2.getNome() + " - CPF: " + visitante2.getCpf() + " - Idade: " + visitante2.getIdade());
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
}