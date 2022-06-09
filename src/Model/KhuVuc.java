/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class KhuVuc {
     private int maKhuVuc;
    private String tenKhuVuc;
    private String anh;
    private String anhHienThi;
    private int tab;

    public KhuVuc() {
    }

    public KhuVuc(int maKhuVuc, String tenKhuVuc, String anh, String anhHienThi, int tab) {
        this.maKhuVuc = maKhuVuc;
        this.tenKhuVuc = tenKhuVuc;
        this.anh = anh;
        this.anhHienThi = anhHienThi;
        this.tab = tab;
    }

    public int getMaKhuVuc() {
        return maKhuVuc;
    }

    public void setMaKhuVuc(int maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public String getTenKhuVuc() {
        return tenKhuVuc;
    }

    public void setTenKhuVuc(String tenKhuVuc) {
        this.tenKhuVuc = tenKhuVuc;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getAnhHienThi() {
        return anhHienThi;
    }

    public void setAnhHienThi(String anhHienThi) {
        this.anhHienThi = anhHienThi;
    }

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }
    
    
}
