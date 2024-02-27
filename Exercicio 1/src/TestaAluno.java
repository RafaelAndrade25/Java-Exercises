public class TestaAluno {
    public static void main(String[] args) {
        Aluno A1 = new Aluno(1, "Jose da Silva", 15, 4.0, 6.0);
        Aluno A2 = new Aluno(2,"Alfredo Jorge", 15, 9.0, 10.0);

        A1.notaFinal();
        A1.passou();
        A2.notaFinal();
        A2.passou();
    }
}
