package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {

	private String opcao;
	

	public String getOpcao(){
		this.opcao =  JOptionPane.showInputDialog(
				"Escolha uma opção\n" +
				"1 - Exibir Clientes\n" +
				"2 - Sair\n");
		
		return this.opcao;
	}

}
