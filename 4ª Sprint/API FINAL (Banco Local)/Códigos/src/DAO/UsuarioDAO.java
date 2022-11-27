/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import Model.Usuario;
import Model.UsuarioLogin;
import Model.VerificarEmail;
import Model.VerificarUsername;

public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    //Função para cadastrar um usuario no banco
    public void adicionar_usuario(Usuario usuario){
        String sql = "INSERT INTO usuario(nome_usuario, email_usuario, username_usuario, senha_usuario) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getUsername());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    //Função para verificar se existe um usuario cadastrado
    public boolean verificaUsuarioBanco(UsuarioLogin usuario) throws SQLException{
        String sql = "SELECT * FROM usuario WHERE username_usuario = '"+usuario.getUsername()+"' and senha_usuario = '"+usuario.getSenha()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet rs = stmt.getResultSet();
        return rs.next();
    }
    
    public boolean verificaUsername(VerificarUsername username) throws SQLException{
        String sql = "SELECT * FROM usuario WHERE username_usuario = '"+username.getUsername()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet rs = stmt.getResultSet();
        return rs.next();
    }
    
    public boolean verificaEmail(VerificarEmail email) throws SQLException{
        String sql = "SELECT * FROM usuario WHERE email_usuario = '"+email.getEmail()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet rs = stmt.getResultSet();
        return rs.next();
    }
}
