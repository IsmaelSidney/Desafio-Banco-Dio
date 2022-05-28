public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(double valor) {
        System.out.println("EXtrato conta corrente");
        super.imprimirInfosComuns();
    }


}
