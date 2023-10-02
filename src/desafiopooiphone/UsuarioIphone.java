package desafiopooiphone;

import desafiopooiphone.internet.NavegadorInternet;
import desafiopooiphone.reproducao.AparelhoTelofonico;
import desafiopooiphone.reproducao.ReprodutorMusical;

public class UsuarioIphone {

	public static void main(String[] args) {
		ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
		reprodutorMusical.selecionarMusica();
		reprodutorMusical.pausar();
		
		AparelhoTelofonico aparelhoTelofonico = new AparelhoTelofonico();
		aparelhoTelofonico.atender(reprodutorMusical);
		aparelhoTelofonico.iniciarCorreioDeVoz();
		
		NavegadorInternet navegadorInternet = new NavegadorInternet();
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
	}

}
