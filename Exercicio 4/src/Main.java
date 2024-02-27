//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rio Ganges = new Rio("Ganges", 10, true);
        Rio Niteroi = new Rio("Niteroi", 8, false);

        Ganges.chover(3);
        Ganges.ensolarar(2);
        Ganges.limpar();
        Ganges.mostra();

        Niteroi.chover(4);
        Niteroi.ensolarar(2);
        Niteroi.sujar();
        Niteroi.mostra();
    }
}