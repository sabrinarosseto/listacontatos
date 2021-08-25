package repository;

import java.util.ArrayList;

import entity.Contato;

public class ContatoRepository {

    ArrayList<Contato> contatos;//declaracao de variavel
    
	public ContatoRepository() {
		contatos = new ArrayList<Contato>();
	}
	
	public void create(Contato contato)//m�todo p�blico sem retorno com o nome 'create' que recebe um objeto 'contato' do tipo 'Contato'
	{
		contatos.add(contato);//a lista 'contatos' que � do tipo ArrayList, com objetos do tipo Contato tem o m�todo 'add' que receb um parametro 'contato' que � o nosso objeto contato, para ser adicionado � lista contatos.
	}
	
	public ArrayList<Contato> getAll()
	{		
		return contatos;
	}
}

