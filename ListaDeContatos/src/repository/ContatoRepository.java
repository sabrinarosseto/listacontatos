package repository;

import java.util.ArrayList;

import entity.Contato;

public class ContatoRepository {

    ArrayList<Contato> contatos;//declaracao de variavel
    
	public ContatoRepository() {
		contatos = new ArrayList<Contato>();
	}
	
	public void create(Contato contato)//método público sem retorno com o nome 'create' que recebe um objeto 'contato' do tipo 'Contato'
	{
		contatos.add(contato);//a lista 'contatos' que é do tipo ArrayList, com objetos do tipo Contato tem o método 'add' que receb um parametro 'contato' que é o nosso objeto contato, para ser adicionado à lista contatos.
	}
	
	public ArrayList<Contato> getAll()
	{		
		return contatos;
	}
}

