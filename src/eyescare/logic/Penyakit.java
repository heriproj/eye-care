/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyescare.logic;

/**
 *
 * @author Rizal Asrul Pambudi
 */
public class Penyakit {
    private String nama, deskripsi, gejala, solusi;
    
    public Penyakit(String nama, String deskripsi, String gejala, String solusi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gejala = gejala;
        this.solusi = solusi;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public void setGejala(String gejala) {
        this.gejala = gejala;
    }
    
    public void setSolusi(String solusi) {
        this.solusi = solusi;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getDeskripsi() {
        return this.deskripsi;
    }
    
    public String getGejala() {
        return this.gejala;
    }
    
    public String getSolusi() {
        return this.solusi;
    }
}
