package com.ifpb.teste;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		//Aqui cria a listadePessoas 
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		
		//Aqui cria a pessoa
		Pessoa ranyelson = new Pessoa();
		ranyelson.setNome("Ranyelson");
		ranyelson.setIdade(34);
		ranyelson.setEmail("@gmail.com");
		ranyelson.setTelefone("99999-9999");
		ranyelson.setTelefone2("3434-3434");
		ranyelson.setRua("Maria Maria");
		ranyelson.setNum(199);
		
		Pessoa ana = new Pessoa();
		ana.setNome("Ana");
		ana.setIdade(35);
		ana.setEmail("@gmail.com");
		ana.setTelefone("999998888");
		ana.setRua("Maria Maria");
		ana.setNum(199);
		
		Pessoa mel = new Pessoa();
		mel.setNome("Melissa");
		mel.setIdade(2);
		mel.setEmail("@hotmail.com");
		mel.setTelefone("2222-2222");
		mel.setRua("Maria Maria");
		mel.setNum(199);
		
		//Aqui adiciona a pessoa a listaDePessoas
		listaDePessoas.add(ranyelson);
		listaDePessoas.add(ana);
		listaDePessoas.add(mel);
		
		for (int i = 0; i < listaDePessoas.size(); i++){
			System.out.println("Nome: " + listaDePessoas.get(i).getNome());
			System.out.println("Idade: " + listaDePessoas.get(i).getIdade() + "anos");
			System.out.println("Email: " + listaDePessoas.get(i).getEmail());
			System.out.println("Telefone: " + listaDePessoas.get(i).getTelefone());
			System.out.println("Telefone2: " + listaDePessoas.get(i).getTelefone2());
			System.out.println("Rua: " + listaDePessoas.get(i).getRua());
			System.out.println("Número: " + listaDePessoas.get(i).getNum());
			System.out.print("\n");//Pular uma linha
		}
	

	}

}
