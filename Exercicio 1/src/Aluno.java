public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public double p1;
    public double p2;
    public double nFinal;


    //Contrutor
    public Aluno(int numeroAluno, String nome, int idade, double p1, double p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        this.nFinal = nFinal;
    }
    public double notaFinal(){
        this.nFinal = (this.p1 + this.p2) / 2;
        System.out.println("\n Numero do aluno: " + this.numeroAluno + " Nome: " + this.nome + "Idade: " + this.idade + "Nota final: " + this.nFinal);
        return this.nFinal;
    }
    public void passou(){
        if(this.nFinal > 0 && this.nFinal < 6){
            System.out.println("O aluno ficou com a nota final: " + this.nFinal + " Está reprovado");
        } else if (this.nFinal >= 6 || this.nFinal <=10) {
            System.out.println("O aluno ficou com a nota final: " + this.nFinal + " Está aprovado");
        }
    }
}


