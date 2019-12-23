package cinematickets.Object;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author yogi-06926
 */
public class Cinema {
 private String judul, kategori,urlGambar;
 JLabel logo = new JLabel();

    public Cinema(String judul,String kategori,String urlGambar) {
        setJudul(judul);
        setKategori(kategori);
    }
    
    private void setUrlGambar(String urlGambar){
        this.urlGambar=urlGambar;
    }

    private void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    private void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
    public static BufferedImage ambilGambar(String ref){
        BufferedImage bimg=null;
        try {
            bimg = ImageIO.read(new File(ref));
        }catch (Exception e){
            e.printStackTrace();
        }
        return bimg;
    }
    //untuk rezize gambar
    public static BufferedImage resize(BufferedImage img,int newW, int newH){
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg= dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0,newW, newH,0,0,w,h,null);
        g.dispose();
        return dimg;
    } 
    //combinasi with jlbel
    public void tampil(){
        String url = urlGambar;
        BufferedImage ambilgmbr = ambilGambar(url);
        ImageIcon imageIcon = new ImageIcon(resize(ambilgmbr,logo.getWidth(),logo.getHeight()));
        logo.setIcon(imageIcon);
    }
 
}
