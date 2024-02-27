public class Main {
    public static void main(String[] args) {
        Cliente Fulano = new Cliente(0001, 0002, "Josivaldo Soares", 150);
        Cliente Beltrano = new Cliente(0002, 0003, "Beltrano dias", 600);

    Fulano.realizarSaque(50);
    Fulano.realizarDeposito(400);

    Beltrano.realizarSaque(600);
    Beltrano.realizarDeposito(5);
    }

}