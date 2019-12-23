/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.Object;

/**
 *
 * @author yogi-06926
 */
public class User extends Human {
    private String nama,gender,password,userName;
    private int umur;

    public User(String nama,String gender,int umur,String password,String userName) {
        setNama(nama);
        setGender(gender);
        setUmur(umur);
        setPassword(password);
        setUserName(userName);
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    @Override
    void setNama(String nama) {
        this.nama=nama;
    }

    @Override
    void setGender(String gender) {
    this.gender=gender;    
    }

    @Override
    void setUmur(int umur) {
    this.umur=umur;    
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getGender() {
        return gender;
    }
    
    
    
}
