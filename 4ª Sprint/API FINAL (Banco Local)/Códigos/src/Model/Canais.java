/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

// campos de variáveis e métodos dos canais
public class Canais {
    private int idCanal;
    private String canal;
    private String tipoCanal;
    private String padraoAutenticacao;

    public int getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(int idCanal) {
        this.idCanal = idCanal;
    }
    
    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getTipoCanal() {
        return tipoCanal;
    }

    public void setTipoCanal(String tipoCanal) {
        this.tipoCanal = tipoCanal;
    }

    public String getPadraoAutenticacao() {
        return padraoAutenticacao;
    }

    public void setPadraoAutenticacao(String padraoAutenticacao) {
        this.padraoAutenticacao = padraoAutenticacao;
    }
}
