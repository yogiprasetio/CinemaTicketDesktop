package cinematickets.Controller;
import cinematickets.Object.Bioskop;
import cinematickets.Object.User;
import java.util.*;
/**
 *
 * @author yogi-06926
 */
public class Controll {
    public ArrayList<User> listUser= new ArrayList<User>();
    public ArrayList<Bioskop> listBioskop = new ArrayList<Bioskop>();
    User user;
    Bioskop bioskop;
    
    public void setUser(String nama,String gender,int umur,String password,String userName){
        user = new User(nama, gender, umur, password, userName);
        listUser.add(user);
    }
    
    public void setBioskop(int roomTeather, int seat, int harga, String waktuTayang,String judul,String kategori,String urlGambar){
       bioskop = new Bioskop(roomTeather, seat, harga, waktuTayang, judul, kategori, urlGambar);
       listBioskop.add(bioskop);
    }
    
    public void updateBioskop(int index,int BookingSeat){
        
    }
    
    public void updateUser(int index,String password){
        
    }
    
    public void deleteBioskop(int index){
        
    }
    
    public void deleteUser(int index){
        
    }
    
}
