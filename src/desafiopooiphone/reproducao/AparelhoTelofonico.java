package desafiopooiphone.reproducao;

public class AparelhoTelofonico {
	
	private void ligar() {
		System.out.println("Ligando...");
	}

	public void atender(ReprodutorMusical reprodutorMusical) {
		reprodutorMusical.tocar();
		System.out.println("Ligação Atendida \n");
	}

	public void iniciarCorreioDeVoz() {
		ligar();
		System.out.println("Correio de Voz iniciado \n");
	}
}
