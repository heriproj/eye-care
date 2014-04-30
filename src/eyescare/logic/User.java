/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyescare.logic;

/**
 *
 * @author Rizal Asrul Pambudi
 */
class Orang {
    private String nama, alamat;
    
    public Orang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
}

public class User extends Orang {
    private String username, password;
    
    public User(String nama, String alamat, String username, String password) {
        super(nama, alamat);
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
}
