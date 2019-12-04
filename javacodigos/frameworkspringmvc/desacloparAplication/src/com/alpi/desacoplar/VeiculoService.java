package com.alpi.desacoplar;

public class VeiculoService {
	
	private Veiculo veiculo;
	public void setVeiculo(Veiculo veiculo){
		this.veiculo=veiculo;
	}
	
	public void dirigir(){
		System.out.println(veiculo.dirige());
	}

}
