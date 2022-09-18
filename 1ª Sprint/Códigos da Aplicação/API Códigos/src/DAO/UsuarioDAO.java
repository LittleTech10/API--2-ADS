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

public class UsuarioDAO {
    Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar_usuario(Usuario usuario){
        String sql = "INSERT INTO login_usuario(nome_usuario, email_usuario, username_usuario, senha_usuario) VALUES (?,?,?,?)";
        
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
    
    public boolean verificaUsuarioBanco(UsuarioLogin usuario) throws SQLException{
        String sql = "SELECT * FROM login_usuario WHERE username_usuario = '"+usuario.getUsername()+"' and senha_usuario = '"+usuario.getSenha()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet resultSet = stmt.getResultSet();
        return resultSet.next();
    }
}
