/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// comando de conexao com o banco MySQL
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/api_littletech?user=root", "root", "Thyaguinho2409"
                    + "");
        }
        catch (SQLException exceto){
            throw new RuntimeException(exceto);
        }
    }
}
