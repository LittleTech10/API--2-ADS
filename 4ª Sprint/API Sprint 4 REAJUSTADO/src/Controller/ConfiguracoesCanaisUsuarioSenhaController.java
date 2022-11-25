package Controller;

import DAO.ConfiguracaoCanalDAO;
import Factory.ConnectionFactory;
import Helper.ConfiguracoesCanaisTokenHelper;
import Helper.LoginHelper;
import Model.ConfiguracaoCanais;
import Model.VerificarConfigCanais;
import View.ConfiguracoesAtivasUsuarioSenha;
import View.ConfiguracoesCanaisUsuarioSenha;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConfiguracoesCanaisUsuarioSenhaController {
    private ConfiguracoesCanaisUsuarioSenha view;

    public ConfiguracoesCanaisUsuarioSenhaController(ConfiguracoesCanaisUsuarioSenha view) {
        this.view = view;
    }
    
    
    public void voltarSelecionarCanais() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            LoginHelper loginHelper = new LoginHelper();
            loginHelper.setUser(view.getMinhaConta().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar(loginHelper);
            selecionarCanal.setExtendedState(Frame.MAXIMIZED_BOTH);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            LoginHelper loginHelper = new LoginHelper();
            loginHelper.setUser(view.getMinhaConta().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar(loginHelper);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        }
    }
    
    public void acessarConfiguracoesAtivas() throws SQLException{
        String canal = view.getEditCanalUsuarioSenha().getText();
        String idConta = view.getEditID_UsuarioSenha().getText();
        String usuario = view.getEditUsuario().getText();
        String senha = view.getEditSenha().getText();
        String user = view.getMinhaConta().getText();
        
        ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
        configuracoesCanaisTokenHelper.setUser(user);
        
        ConfiguracaoCanais configCanal = new ConfiguracaoCanais();
        configCanal.setNomeCanal(canal);
        configCanal.setIdConta(idConta);
        configCanal.setUsuarioCanal(usuario);
        configCanal.setSenhaCanal(senha);
        
        VerificarConfigCanais verificarConfigUsuario = new VerificarConfigCanais(idConta);
        
        Connection conexao = new ConnectionFactory().getConnection();
        ConfiguracaoCanalDAO configDao = new ConfiguracaoCanalDAO();
        boolean existeConfigurado = configDao.verificaConfigUsuarioSenha(verificarConfigUsuario);
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && idConta.isEmpty() == false && usuario.isEmpty() == false && senha.isEmpty() == false) {
            ConfiguracaoCanalDAO dao = new ConfiguracaoCanalDAO();
            dao.adicionarConfiguracaoCanalUsuario(configCanal);
            
            ConfiguracoesAtivasUsuarioSenha configuracoesAtivasUsuarioSenha = new ConfiguracoesAtivasUsuarioSenha();
            configuracoesAtivasUsuarioSenha.listarValoresUsuario();
            configuracoesAtivasUsuarioSenha.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivasUsuarioSenha.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesAtivasUsuarioSenha.setVisible(true);
            this.view.dispose();
        }
        
        else if (idConta.isEmpty() || usuario.isEmpty() || senha.isEmpty()){
            this.view.exibeMensagem("Preencha todos os campos para continuar com o registro do canal");
        }
        
        else if (existeConfigurado) {
            JOptionPane.showMessageDialog(null, "Este canal já está cadastrado");
        }
        
        else{
            ConfiguracaoCanalDAO dao = new ConfiguracaoCanalDAO();
            dao.adicionarConfiguracaoCanalUsuario(configCanal);
            
            ConfiguracoesAtivasUsuarioSenha configuracoesAtivasUsuarioSenha = new ConfiguracoesAtivasUsuarioSenha();
            configuracoesAtivasUsuarioSenha.listarValoresUsuario();
            configuracoesAtivasUsuarioSenha.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivasUsuarioSenha.setVisible(true);
            this.view.dispose();
        }
    }
    
}
