package Controller;

import Helper.CadastroCanaisHelper;
import View.CadastroCanais;
import View.CanaisCadastrados;
import java.awt.Dimension;
import java.awt.Frame;

public class CanaisCadastradosController {
    private CanaisCadastrados view;

    public CanaisCadastradosController(CanaisCadastrados view) {
        this.view = view;
    }
    
    public void voltarCanais() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            CadastroCanaisHelper cadastroCanaisHelper = new CadastroCanaisHelper();
            cadastroCanaisHelper.setUser(view.getMinhaConta().getText());
            
            CadastroCanais cadastroCanais = new CadastroCanais();
            cadastroCanais.exportar2(cadastroCanaisHelper);
            cadastroCanais.setExtendedState(Frame.MAXIMIZED_BOTH);
            cadastroCanais.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            CadastroCanaisHelper cadastroCanaisHelper = new CadastroCanaisHelper();
            cadastroCanaisHelper.setUser(view.getMinhaConta().getText());
            
            CadastroCanais cadastroCanais = new CadastroCanais();
            cadastroCanais.exportar2(cadastroCanaisHelper);
            cadastroCanais.setVisible(true);
            this.view.dispose();
        }
    } 
    
    
}
