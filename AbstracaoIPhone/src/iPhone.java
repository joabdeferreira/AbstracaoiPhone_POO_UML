
public class iPhone implements Browser, MusicPlayer, Telefone{
	
	//Metodos da interface Browser
	public void exibirPagina(String url) {
		System.out.println("... página " + url + " foi carregada ...");
	}
	
	public void novaAba() {
		System.out.println("Nova aba em branco! (Digite uma nova URL)");
	}
	
	public void atualizarPagina() {
		System.out.println("... página recarregada ...");
	}
	
	
	//Metodos da interface MusicPlayer
	public void tocarMusica() {
		System.out.println("Tocando a musica selecionada");
	}
	
	public void pausarMusica() {
		System.out.println("Pausando a musica selecionada");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("A música " + musica + "foi selecionada");
	}

	
	//Metodos da interface Telefone
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}
	
	public void atender() {
		System.out.println("EI, TE LIGAM! EEEEI! ATENNDEEE!");
	}
	
	public void correioDeVoz(String numero) {
		System.out.println("Enviando seu audio para " + numero);
	}

}
