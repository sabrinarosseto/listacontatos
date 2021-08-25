package business;

import entity.Contato;
import repository.ContatoRepository;

import java.util.ArrayList;

public class ContatoBusiness {
	ContatoRepository repositorio;//declaracao de variavel
	
	public ContatoBusiness() {
		repositorio = new ContatoRepository();
	}
	
	public void create(Contato contato) throws Exception
	{
		if(contato.getIdade()==0) {
			throw new Exception("A idade deve ser válida");
		}
		
		
		repositorio.create(contato);
	}
	
	public ArrayList<Contato> getAll()
	{		
		return repositorio.getAll();
	} 
}