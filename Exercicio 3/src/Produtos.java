public class Produtos {
    public int id;
    public String desc;
    public int qtde;
    public double preco;

    //Construtor


    public Produtos(int id, String desc, int qtde, double preco) {
        this.id = id;
        this.desc = desc;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x) {
        if (x <= 0) {
            System.out.println("Produto inválido, qtde de produto menor igual a 0");
        } else if (x > 0) {
            this.qtde += x;
            System.out.println("O estoque foi atualizado, agora tem: " + this.qtde + " itens");
        }
    }

    public void vender(int x) {
        if (x <= 0) {
            System.out.println("Produto invalido, numero menor ou igual a zero");
        } else if (x > 0) {
            this.qtde -= x;
            System.out.println("VOce vendeu um produto, o estoque foi atualizado. Agora tem: " + this.qtde + " Itens");
        }
    }

    public void subir(double x) {
        if (x <= 0) {
            System.out.println("Valor invalido, não pode ser menor ou igual a 0");
        } else if (x > 0) {
            this.preco += x;
            System.out.println("O valor do produto foi aumentado, agora esta: R$ " + this.preco);
        }
    }

    public void descer(double x) {
        if (x <= 0) {
            System.out.println("Valor invalido, não pode ser menor ou igual a 0");
        } else if (x > 0) {
            this.preco -= x;
            System.out.println("O valor do produto foi reduzido, agora esta: R$" + this.preco);
        }
    }

    public void mostra() {
        System.out.println( "Produtos{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", qtde=" + qtde +
                ", preco=" + preco +
                '}');
    }
}
