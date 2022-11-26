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
            return DriverManager.getConnection("jdbc:mysql://apidatabase.coj7rphfmwtb.us-east-1.rds.amazonaws.com:3306/apiLittleTech?user=admin", "admin", "O7CEJ6AQcqFz2jAHoFJs");
        }
        catch (SQLException exceto){
            throw new RuntimeException(exceto);
        }
    }
}
