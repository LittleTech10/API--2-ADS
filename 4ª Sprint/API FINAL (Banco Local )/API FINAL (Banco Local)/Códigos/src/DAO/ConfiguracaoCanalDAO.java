/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import Model.ConfiguracaoCanais;
import Model.VerificarConfigCanais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ConfiguracaoCanalDAO {
    Connection connection;
    
    public ConfiguracaoCanalDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    //Função para adicionar as configurações de canal do usuario (token)
    public void adicionar_configuracaoCanal(ConfiguracaoCanais configCanal){
        String sql = "INSERT INTO configuracao_canais_token(nome_canal_token, id_conta_token, token_canal) VALUES (?,?,?);";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, configCanal.getNomeCanal());
            stmt.setString(2, configCanal.getIdConta());
            stmt.setString(3, configCanal.getToken());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    //Função para adicionar as configurações de canal do usuario (usuario e senha)
    public void adicionarConfiguracaoCanalUsuario(ConfiguracaoCanais configCanal) {
        String sql = "INSERT INTO configuracao_canais_usuario (nome_canal_usuario, id_conta_usuario, usuario_canal, senha_canal) VALUES (?, ?, ?, ?);";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, configCanal.getNomeCanal());
            stmt.setString(2, configCanal.getIdConta());
            stmt.setString(3, configCanal.getUsuarioCanal());
            stmt.setString(4, configCanal.getSenhaCanal());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //Função para verificar se a configuração do canal (token) já existe
    public boolean verificaConfigToken(VerificarConfigCanais configCanal) throws SQLException{
        String sql = "SELECT * FROM configuracao_canais_token WHERE id_conta_token = '"+configCanal.getIdConta()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet rs = stmt.getResultSet();
        return rs.next();
    }
    
    //Função para verificar se a configuração do canal (usuario e senha) já existe
    public boolean verificaConfigUsuarioSenha(VerificarConfigCanais configCanal) throws SQLException{
        String sql = "SELECT * FROM configuracao_canais_usuario WHERE id_conta_usuario = '"+configCanal.getIdConta()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet rs = stmt.getResultSet();
        return rs.next();
    }
    
    //Cria a tabela de configurações ativas com os dados do banco
    public ArrayList<ConfiguracaoCanais> pesquisarCanais() {
        ArrayList<ConfiguracaoCanais> lista = new ArrayList<> ();
        String sql = "SELECT id_canal_token, nome_canal_token, id_conta_token, token_canal FROM configuracao_canais_token;";
        ;
        try {
            this.connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                ConfiguracaoCanais configuracaoCanais = new ConfiguracaoCanais();
                configuracaoCanais.setIdToken(rs.getInt("id_canal_token"));
                configuracaoCanais.setNomeCanal(rs.getString("nome_canal_token"));
                configuracaoCanais.setIdConta(rs.getString("id_conta_token"));
                configuracaoCanais.setToken(rs.getString("token_canal"));
                
                lista.add(configuracaoCanais);
            }
        }
        
        catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        
        return lista;
    }
    
    public ArrayList<ConfiguracaoCanais> pesquisarCanaisUsuario() {
        ArrayList<ConfiguracaoCanais> lista2 = new ArrayList<> ();
        String sql = "SELECT id_canal_usuario, nome_canal_usuario, id_conta_usuario, usuario_canal, senha_canal FROM configuracao_canais_usuario;";
        
        try {
            this.connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                ConfiguracaoCanais configuracaoCanais = new ConfiguracaoCanais();
                configuracaoCanais.setIdToken(rs.getInt("id_canal_usuario"));
                configuracaoCanais.setNomeCanal(rs.getString("nome_canal_usuario"));
                configuracaoCanais.setIdConta(rs.getString("id_conta_usuario"));
                configuracaoCanais.setUsuarioCanal(rs.getString("usuario_canal"));
                configuracaoCanais.setSenhaCanal(rs.getString("senha_canal"));
                
                lista2.add(configuracaoCanais);
            }
        }
        
        catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        
        return lista2;
    }
    
    // Criando o método editar
    public void deletar_configToken(ConfiguracaoCanais configCanal){
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM configuracao_canais_token WHERE id_canal_token = ?";
        
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, configCanal.getIdCanal());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: ");
        }
    }
    
    // Criando o método deletar na tabela config usuario e senha
    public void deletar_configUsuarioSenha(ConfiguracaoCanais configCanal){
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM configuracao_canais_usuario WHERE id_canal_usuario = ?";
        
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, configCanal.getIdCanal());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: ");
        }
    }
    
    /**
     *
     * @param tipo
     * @param arg
     * @return
     * @throws SQLException
     */
    public static ResultSet carregaTabela(String tipo, String arg) throws SQLException {
        String argumento = tipo + " " + "like '" + arg + "%'";
        
        Connection connection = new ConnectionFactory().getConnection();
        String sql = "SELECT id_canal_usuario, nome_canal_usuario, id_conta_usuario, usuario_canal, senha_canal FROM configuracao_canais_usuario WHERE " + argumento +"";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
            return rs;
    }
    
    public static ResultSet carregaTabelaToken(String tipo, String arg) throws SQLException {
        String argumento = tipo + " " + "like '" + arg + "%'";
        
        Connection connection = new ConnectionFactory().getConnection();
        String sql = "SELECT id_canal_token, nome_canal_token, id_conta_token, token_canal FROM configuracao_canais_token WHERE " + argumento +"";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
            return rs;
    }
}
