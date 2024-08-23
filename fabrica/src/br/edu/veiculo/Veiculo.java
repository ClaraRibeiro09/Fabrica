package br.edu.veiculo;

public class Veiculo {

	protected String marca;
	protected double capacidadetanc;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCapacidadetanc() {
		return capacidadetanc;
	}
	public void setCapacidadetanc(double capacidadetanc) {
		this.capacidadetanc = capacidadetanc;
	}
	public boolean acelerar(){
		return true;
		}
	
	public boolean freiar(){
		return true;
	}
	
	public void buzinar() {
		System.out.println("Pi Bi");
	}
}
