package Controller;

import DAO.CanalDAO;
import Helper.ConfiguracoesCanaisTokenHelper;
import Helper.SelecionarCanalHelper;
import View.ConfiguracoesAtivasUsuarioSenha;
import View.ConfiguracoesCanaisToken;
import View.Login;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

public class SelecionarCanalController {

    private SelecionarCanal view;
    
    public SelecionarCanalController(SelecionarCanal view) {
        this.view = view;
    }

    public void sairUser() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();

        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();

        if (tamanhoTelaAtual < tamanhoTelaNova) {
            Login login = new Login();
            login.setExtendedState(Frame.MAXIMIZED_BOTH);
            login.setVisible(true);
            this.view.dispose();
        } else {
            Login loginADM = new Login();
            loginADM.setVisible(true);
            this.view.dispose();
        }
    }

    public void restaurarDadosCombobox() {
        Vector<String> padrao_autenticacao = new Vector<String>(); // vetor

        try {
            CanalDAO objcanaldao = new CanalDAO();
            ResultSet rs = objcanaldao.adiciona_canal();
            while (rs.next()) {
                padrao_autenticacao.addElement(rs.getString(2)); // joga os canais no vetor
                padrao_autenticacao.addElement(rs.getString(3)); // joga os padroes de autenticacao no vetor
                view.getSelecionarCanal().addItem(rs.getString(2));
                //System.out.println(padrao_autenticacao.contains("Usuário e Senha"));     // verificar se tem no vetor a frase "Usuario e senha" e retorna true or false 
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar canal VIEW:" + erro);
        }
    }
    
    public void acessarConfiguracoesCanaisToken() throws SQLException {
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        String select = (String) view.getSelecionarCanal().getSelectedItem();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && select != "Selecione o canal que deseja registrar") {
            SelecionarCanalHelper selecionarCanalHelper = new SelecionarCanalHelper();
            selecionarCanalHelper.setItemSelect(select);
            selecionarCanalHelper.setUser(view.getMinhaConta().getText());
            
            ConfiguracoesCanaisToken configuracoesCanaisToken = new ConfiguracoesCanaisToken();
            configuracoesCanaisToken.exportar(selecionarCanalHelper);
            configuracoesCanaisToken.exportar2(selecionarCanalHelper);
            configuracoesCanaisToken.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesCanaisToken.setVisible(true);
            this.view.dispose();
        }
        
         if (tamanhoTelaNova == tamanhoTelaAtual && select != "Selecione o canal que deseja registrar") {
            SelecionarCanalHelper selecionarCanalHelper = new SelecionarCanalHelper();
            selecionarCanalHelper.setItemSelect(select);
            selecionarCanalHelper.setUser(view.getMinhaConta().getText());
            
            ConfiguracoesCanaisToken configuracoesCanaisToken = new ConfiguracoesCanaisToken();
            configuracoesCanaisToken.exportar(selecionarCanalHelper);
            configuracoesCanaisToken.exportar2(selecionarCanalHelper);
            configuracoesCanaisToken.setVisible(true);
            this.view.dispose();
         }
         
         else if (select == "Selecione o canal que deseja registrar") {
            this.view.exibeMensagem("Selecione um canal para prosseguir");
         }
    }
    
    public void acessarConfigUsuario() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
        String user = view.getMinhaConta().getText();
        configuracoesCanaisTokenHelper.setUser(user);
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            
            ConfiguracoesAtivasUsuarioSenha configuracoesAtivasUsuarioSenha = new ConfiguracoesAtivasUsuarioSenha();
            configuracoesAtivasUsuarioSenha.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivasUsuarioSenha.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesAtivasUsuarioSenha.setVisible(true);
            this.view.dispose();
        }
        
        else{
            
            ConfiguracoesAtivasUsuarioSenha configuracoesAtivasUsuarioSenha = new ConfiguracoesAtivasUsuarioSenha();
            configuracoesAtivasUsuarioSenha.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivasUsuarioSenha.setVisible(true);
            this.view.dispose();
        }
    }
}
