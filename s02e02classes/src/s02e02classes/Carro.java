package s02e02classes;

public class Carro {
	String modelo;
	String cor;
	int portas;
	int pneu;
	boolean ligado;
	
	void ligar() {
		this.ligado = true;
	}
	void desligar() {
		this.ligado = false;
	}
	void status() {
		System.out.println("Cor do Carro: " + this.cor);
		System.out.println("Está ligado? " + this.ligado);
	}
	void dirigir() {
		if (this.ligado == true) {
		System.out.println("Pode dirigir");
	} else {
		System.out.println("Não pode dirigir");

    }
	}
}