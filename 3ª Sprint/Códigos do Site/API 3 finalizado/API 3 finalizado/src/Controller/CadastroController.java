 package Controller;

import View.Cadastro;
import View.ConfirmacaoCadastro;
import View.Login;
import Model.Usuario;
import DAO.UsuarioDAO;
import Factory.ConnectionFactory;
import Model.VerificarEmail;
import Model.VerificarUsername;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroController {
    
    private Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }

    public void acessarConfirmacaoCadastro() throws SQLException{
        String nome = view.getCampoNome().getText();
        String username = view.getCampoUsuario().getText();
        String senha = view.getCampoSenha().getText();
        String confirmeSenha = view.getCampoConfirmeSenha().getText();
        String eMail = view.getCampoEmail().getText();
        
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSenha(senha);
        usuario.setEmail(eMail);
        usuario.setUsername(username);
        
        VerificarUsername verificarUsername = new VerificarUsername(username);
        VerificarEmail verificarEmail = new VerificarEmail(eMail);
        
        Connection conexao = new ConnectionFactory().getConnection();
        UsuarioDAO userDao = new UsuarioDAO();
        boolean existeUsername = userDao.verificaUsername(verificarUsername);
        boolean existeEmail = userDao.verificaEmail(verificarEmail);
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && nome.isEmpty() == false && username.isEmpty() == false && senha.isEmpty() == false && confirmeSenha.isEmpty() == false && eMail.isEmpty() == false && senha.equals(confirmeSenha)) {
            ConfirmacaoCadastro confirmacaoCadastro = new ConfirmacaoCadastro();
            confirmacaoCadastro.setExtendedState(Frame.MAXIMIZED_BOTH);
            confirmacaoCadastro.setVisible(true);
            this.view.dispose();
        }
        
        else if (senha.equals(confirmeSenha) == false) {
            this.view.exibeMensagem("Senhas não conferem");
        }
        
        else if (nome.isEmpty() | username.isEmpty() | senha.isEmpty() | confirmeSenha.isEmpty() | eMail.isEmpty()) {
            this.view.exibeMensagem("Preencha todos os campos para continuar com o cadastro");
        }
        
        else if (existeUsername | existeEmail){
            JOptionPane.showMessageDialog(null, "Este nome de usuário ou email já existe");
        }
        else {
            UsuarioDAO dao = new UsuarioDAO();
            dao.adicionar_usuario(usuario);
            
            ConfirmacaoCadastro confirmacaoCadastro = new ConfirmacaoCadastro();
            confirmacaoCadastro.setVisible(true);
            this.view.dispose();
        }
    }        
    
    public void voltarLogin() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            Login login = new Login();
            login.setExtendedState(Frame.MAXIMIZED_BOTH);
            login.setVisible(true);
            this.view.dispose();
        }
        
        else {
            Login login = new Login();
            login.setVisible(true);
            this.view.dispose();
        }
    }    
}
