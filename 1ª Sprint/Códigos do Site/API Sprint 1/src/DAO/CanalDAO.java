/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import Model.Canais;

public class CanalDAO {
    Connection connection;
    
    public CanalDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adicionar_canal(Canais canal){
        String sql = "INSERT INTO canais(nome_canal, tipo_canal, padrao_autenticacao) VALUES (?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, canal.getCanal());
            stmt.setString(2, canal.getTipoCanal());
            stmt.setString(3, canal.getPadraoAutenticacao());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
