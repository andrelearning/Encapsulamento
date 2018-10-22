
public class ControleRemoto implements Controlador {
	private int volume;
	private int guardaVolume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.setVolume(5);
		this.setGuardaVolume(this.getVolume());
		this.setLigado(true);
		this.setTocando(false);
	}

	public int getGuardaVolume() {
		return guardaVolume;
	}

	public void setGuardaVolume(int guardaVolume) {
		this.guardaVolume = guardaVolume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
     
	
	public void ligar() {
		this.setLigado(true);

	}

	
	public void desligar() {
		this.setLigado(false);

	}

	
	public void abrirMenu() {
		System.out.println("-------MENU-------");
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.println("O volume é: " + this.getVolume());

	}

	
	public void fecharMenu() {
		System.out.println("O menu foi fechado!");
	}

	
	public void maisVolume() {
		if(this.isLigado()){
			if (this.getVolume()<10) {
				this.setVolume(this.getVolume() + 1);
				this.setGuardaVolume(this.getVolume());
			}
		}else {
			System.out.println("Controle está desligado");
		}
		

	}


	public void menosVolume() {
		if (this.getVolume()>0) {
			this.setVolume(this.getVolume() - 1);
			this.setGuardaVolume(this.getVolume());
		} 

	}

	
	public void ligarMudo() {
		if (this.getVolume()>=1) {
			this.setVolume(0);
		}else {
			System.out.println("O controle ja está no volume: " + getVolume());
		}
	}

	
	public void desligarMudo() {
		if (this.getVolume() == 0) {
			this.setVolume(this.getGuardaVolume());
		}else {
			System.out.println("O volume não está no mudo. Volume:"+this.getVolume());
		}
	}

	
	public void play() {
        if(this.isLigado() && !this.isTocando()) {
        	this.setTocando(true);
        }
	}

	
	public void pause() {
       if(!isTocando()) {
    	   setTocando(false);
       }
	}

}
