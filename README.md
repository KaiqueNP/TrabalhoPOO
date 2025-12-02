# 📘 Trabalho de Programação Orientada a Objetos (POO)

Este projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos, aplicando conceitos fundamentais como **herança**, **classes abstratas**, **polimorfismo**, **composição**, **sobrescrita de métodos**, e **listas dinâmicas (ArrayList)**.

O sistema simula um ambiente acadêmico contendo **pessoas**, **alunos**, **professores**, **visitantes**, **disciplinas** e **turmas**.

---

## 🔍 Funcionalidades Implementadas

### 👤 Classe Pessoa (abstract)
- Armazena atributos comuns: **cpf**, **nome**, **idade**
- Método:
  - `fazerAniversario()` → incrementa idade e mostra mensagem

### 🎓 Hierarquia de Pessoas
- **Visitante**
  - Método: `visitar()`
- **Aluno**
  - Atributos: matrícula  
  - Método: `pagarMensalidade()`
- **Bolsista** (herda de Aluno)
  - Mensalidade gratuita
- **Regular** (herda de Aluno)
  - Pagamento normal
- **Professor**
  - Atributo: centro  
  - Método: `darAula(Disciplina)`

### 📚 Disciplina
- Armazena: código, nome e semestre

### 🏫 Turma
- Contém: código, disciplina, professor e alunos
- Métodos:
  - `adicionarAluno()`
  - `removerAluno()`
  - `listarAlunos()`

---


