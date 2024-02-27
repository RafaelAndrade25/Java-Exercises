public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido;
//Construtor

    public Rio(String nome, double nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(double x) {
        if (x <= 0) {
            System.out.println("Valor invalido, digite o quanto choveu");
        } else if (x > 0) {
            this.nivel += x;
            System.out.println("Choveu, o nivel do rio esta em: " + this.nivel);
        }
    }

    public void ensolarar(double x) {
        if (x <= 0) {
            System.out.println("Valor invalido, digite o quanto secou");
        } else if (x > 0) {
            this.nivel -= x;
            System.out.println("Secou, o nivel do rio esta em: " + this.nivel);
        }
    }

    public void limpar() {
        if (this.poluido = true) {
            System.out.println("O rio esta poluido, vai ser limpo");
        }
    }

    public void sujar() {
        if (this.poluido = false) {
            System.out.println("O rio esta limpo, vamos manter assim");
        }
    }


    public void mostra() {
        System.out.println("Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + poluido +
                '}');
    }
}

