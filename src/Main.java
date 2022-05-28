public class Main {

    public static void main(String[] args) {
        Cliente ismael = new Cliente();
        ismael.setNome("Ismael");
        Conta cc = new ContaCorrente(ismael);
        Conta poupanca = new ContaPoupanca(ismael);


        cc.depositar(500.00);
        cc.imprimirInfosComuns();

        poupanca.imprimirInfosComuns();
        cc.transferir(200,poupanca);
        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
