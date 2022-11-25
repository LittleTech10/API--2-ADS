package Controller;

import View.CadastroCanais;
import View.LoginADM;
import Model.Canais;
import DAO.CanalDAO;
import View.CanaisCadastrados;
import java.awt.Dimension;
import java.awt.Frame;

public class CadastroCanaisController {
    private CadastroCanais view;

    public CadastroCanaisController(CadastroCanais view) {
        this.view = view;
    }
    
    public void acessarConfirmacaoCadastro(){
        String canais = view.getCampoCanal().getText();
        String tipoCanal = (String) view.getTipoDeCanalSelect().getSelectedItem();
        String padraoAutenticacao = (String) view.getAutenticacaoSelect().getSelectedItem();
        
        Canais canal = new Canais();
        canal.setCanal(canais);
        canal.setTipoCanal(tipoCanal);
        canal.setPadraoAutenticacao(padraoAutenticacao);
        
        if (canais.isEmpty()){
            this.view.exibeMensagem("Preencha todos os campos para continuar o cadastro");
        }
        
        else {
            CanalDAO dao = new CanalDAO();
            dao.adicionar_canal(canal);
            
            this.view.exibeMensagem("Canal cadastrado com sucesso");
        }
    }
    
    public void voltarCadastroCanal(){
        CadastroCanais cadastroCanal = new CadastroCanais();
        cadastroCanal.setVisible(true);
        this.view.dispose();
    }
    
    public void sair() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            LoginADM loginADM = new LoginADM();
            loginADM.setExtendedState(Frame.MAXIMIZED_BOTH);
            loginADM.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            LoginADM loginADM = new LoginADM();
            loginADM.setVisible(true);
            this.view.dispose();
        }
    }
    
        public void acessarCanaisCadastrados() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            CanaisCadastrados canaisCadastrados = new CanaisCadastrados();
            canaisCadastrados.setExtendedState(Frame.MAXIMIZED_BOTH);
            canaisCadastrados.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            CanaisCadastrados canaisCadastrados = new CanaisCadastrados();
            canaisCadastrados.setVisible(true);
            this.view.dispose();
        }
    } 
}
