package control;

import javax.swing.JOptionPane;

import model.BDSimulado;
import view.ViewExibirListaClientes;
import view.ViewPrincipal;

public class ControlePrincipal {
	//Atributos
	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControleCliente cc;

	
	
	//Metodo construtor
	public ControlePrincipal(){
		//Instanciar o objeto BDSimulado
		this.bds = new BDSimulado();
		//Instanciar a ViewPrincipal
		this.vp = new ViewPrincipal();
		//Criar controles
		this.cc = new ControleCliente(bds);
		
		
		//Exibir a janela de opcoes pela primeira vez
		tratarOpcao(this.vp.getOpcao());
	}
	
	//Metodo para tratar a opçao do usuario
	public void tratarOpcao(String opcao){
		while (true) {
			switch (opcao) {
			case "1": this.cc.exibirCliente();				
					  break;
			
			case "2": JOptionPane.showMessageDialog(null, "Até breve!");
				      return;

			default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido!");
				     break;
			}
			
			//Exibir a janela de opcoes
			opcao = this.vp.getOpcao();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
