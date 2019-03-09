package com.ranyelson.endereco;

public class Principal {

	public static void main(String[] args) {
		Casa minhaCasa = new Casa();
		minhaCasa.rua = "Rua: Maria Mota";
		minhaCasa.numero = "30";
		minhaCasa.bairro = "Prata";
		minhaCasa.cidade = "Campina Grande - PB";
		
		System.out.println(minhaCasa.rua);
		System.out.println(minhaCasa.numero);
		System.out.println(minhaCasa.bairro);
		System.out.println(minhaCasa.cidade);
		
		//Chamando o metodo da classe Casa.java
		minhaCasa.abrirGaragem();

	}

}
