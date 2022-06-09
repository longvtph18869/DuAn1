/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Model.*;

/**
 *
 * @author Admin
 */
public class MatHangEntites {
    private String maMH;
    private String tenMH;
    private String DVT;
    private String gia;

    public MatHangEntites() {
    }

    public MatHangEntites(String maMH, String tenMH, String DVT, String gia) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.DVT = DVT;
        this.gia = gia;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
    
}
