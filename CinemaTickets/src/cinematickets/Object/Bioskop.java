package cinematickets.Object;

/**
 *
 * @author yogi-06926
 */
public class Bioskop {
    private int roomTeather,seat,harga;
    private String waktuTayang;
    Cinema film;

    public Bioskop(int roomTeather, int seat, int harga, String waktuTayang,String judul,String kategori,String urlGambar) {
        setHarga(harga);
        setRoomTeather(roomTeather);
        setSeat(seat);
        setWaktuTayang(waktuTayang);
        film = new Cinema(judul, kategori, urlGambar);
    }

    private void setHarga(int harga) {
        this.harga = harga;
    }

    private void setRoomTeather(int roomTeather) {
        this.roomTeather = roomTeather;
    }

    private void setSeat(int seat) {
        this.seat = seat;
    }

    private void setWaktuTayang(String waktuTayang) {
        this.waktuTayang = waktuTayang;
    }

    public String getWaktuTayang() {
        return waktuTayang;
    }

    public int getHarga() {
        return harga;
    }

    public int getSeat() {
        return seat;
    }

    
    
    
    
}
