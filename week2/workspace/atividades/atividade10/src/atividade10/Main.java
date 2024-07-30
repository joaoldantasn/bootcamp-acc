package atividade10;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345", 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", 500.0); // Taxa de juros de 0.3% ao mês

        System.out.println(contaCorrente.exibirDetalhes());
        System.out.println();
        System.out.println(contaPoupanca.exibirDetalhes());
        System.out.println("---------------------------");
        try {
			contaCorrente.depositar(200.0);
		} catch (DepositoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			contaPoupanca.depositar(200.0);
		} catch (DepositoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(contaCorrente.exibirDetalhes());
        System.out.println();
        System.out.println(contaPoupanca.exibirDetalhes());
        System.out.println("---------------------------");
        try {
			contaCorrente.sacar(100.0);
		} catch (EstouroSaqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			contaPoupanca.sacar(100.0);
		} catch (EstouroSaqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(contaCorrente.exibirDetalhes());
        System.out.println();
        System.out.println(contaPoupanca.exibirDetalhes());
        System.out.println("---------------------------");
        try {
			contaPoupanca.aplicarJuros();
		} catch (DepositoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(contaCorrente.exibirDetalhes());
        System.out.println();
        System.out.println("Juros de 3% aplicados ao saldo.");
        System.out.println(contaPoupanca.exibirDetalhes());
        System.out.println("---------------------------");
        try {
			contaCorrente.transferir(300.0, contaPoupanca);
		} catch (DepositoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EstouroSaqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(contaCorrente.exibirDetalhes());
        System.out.println();
        System.out.println(contaPoupanca.exibirDetalhes());
        System.out.println("---------------------------");
    }
}
