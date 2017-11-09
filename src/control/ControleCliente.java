package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Cliente;
import view.ViewExibirListaClientes;

public class ControleCliente {
	
	private BDSimulado bds;
	
	public ControleCliente(BDSimulado bds){
	
		this.bds = bds;
	}
	//Metodo para cadastrar usuario
	public void exibirCliente(){
		
		
		//Recuperar a lista de usuarios
		ArrayList<Cliente> clientes = this.bds.getCliente();
		
		//Criar uma string representando todos os usuarios da lista
		String s = "";
		for (int i = 0; i < clientes.size(); i++) {
			s = s + "----------------\n" + clientes.get(i);
		}
		
		//Exibir a lista de usuarios
		ViewExibirListaClientes velc = new ViewExibirListaClientes(s);
	}

}
