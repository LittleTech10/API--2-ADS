/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import Model.Canais;
import Model.VerificarCanal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CanalDAO {
    private Connection connection;
    private PreparedStatement pstm;
    private Statement rs;
    private ArrayList<CanalDAO> listacanal = new ArrayList<>();

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    public Statement getRs() {
        return rs;
    }

    public void setRs(Statement rs) {
        this.rs = rs;
    }

    public ArrayList<CanalDAO> getListacanal() {
        return listacanal;
    }

    public void setListacanal(ArrayList<CanalDAO> listacanal) {
        this.listacanal = listacanal;
    }
    
    
    public CanalDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    //Função para ordenar os canais pelo nome por ordem alfabética no select.
    public ResultSet adiciona_canal(){
        this.setConnection(new ConnectionFactory().getConnection());
        String sql = "SELECT id_canal, nome_canal, padrao_autenticacao FROM canais ORDER BY nome_canal;";
        try{
            pstm = connection.prepareStatement(sql);
            return pstm.executeQuery();
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "erro adicionar canal" + erro.getMessage());
            return null;
        } 
    }
    
    //Função para adicionar os canais no banco de dados
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
    
    //Cria a tabela de configurações ativas com os dados do banco
    public ArrayList<Canais> listarCanais() {
        ArrayList<Canais> lista = new ArrayList<> ();
        String sql = "SELECT id_canal, nome_canal, tipo_canal, padrao_autenticacao FROM canais;";
        ;
        try {
            this.connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Canais canais = new Canais();
                canais.setIdCanal(rs.getInt("id_canal"));
                canais.setCanal(rs.getString("nome_canal"));
                canais.setTipoCanal(rs.getString("tipo_canal"));
                canais.setPadraoAutenticacao(rs.getString("padrao_autenticacao"));
                
                lista.add(canais);
            }
        }
        
        catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        
        return lista;
    }
    
    public void deletar_canal(Canais canal){
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM canais WHERE id_canal = ?";
        
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, canal.getIdCanal());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: ");
        }
    }
    
    public static ResultSet carregaTabelaADM(String tipo, String arg) throws SQLException {
        String argumento = tipo + " " + "like '" + arg + "%'";
        
        Connection connection = new ConnectionFactory().getConnection();
        String sql = "SELECT id_canal, nome_canal, tipo_canal, padrao_autenticacao FROM canais WHERE " + argumento +"";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
            return rs;
    }
    
    public boolean verificaCanalCadastrado(VerificarCanal canal) throws SQLException{
        String sql = "SELECT * FROM canais WHERE nome_canal = '"+canal.getCanal()+"'";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        ResultSet rs = stmt.getResultSet();
        return rs.next();
    }
}
