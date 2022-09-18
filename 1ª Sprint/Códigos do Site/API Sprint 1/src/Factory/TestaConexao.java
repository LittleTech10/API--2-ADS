/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory;

import java.sql.Connection;
import java.sql.SQLException;

// testa a conexao com o banco MySQL
public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexao Aberta!");
        connection.close();
    }
    
}
