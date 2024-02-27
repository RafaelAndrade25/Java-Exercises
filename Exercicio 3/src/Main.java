//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produtos Tenis = new Produtos(1, "Tenis", 5,250.00);
        Produtos Roupa = new Produtos(2,"Roupa", 6, 50.00);

        Tenis.comprar(5);
        Tenis.vender(2);
        Tenis.subir(300.00);
        Tenis.descer(100);
        Tenis.mostra();

        Roupa.comprar(2);
        Roupa.vender(1);
        Roupa.subir(30.00);
        Roupa.descer(20.00);
        Roupa.mostra();
    }
}