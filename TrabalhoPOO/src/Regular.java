public class Regular extends Aluno{

    @Override //isso significa que eu estou sobrescrevendo uma função
    public void pagarMensalidade() {
        super.pagarMensalidade(); //significa que está pegando o método da superclasse (classe pai, que é "Aluno")

    }
}