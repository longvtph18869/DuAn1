/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.Icon;

/**
 *
 * @author Admin
 */
public class NhomHang {
    private String nhomHangName;
    private String nhomHangImage;
    private Icon Image;

    public NhomHang(String nhomHangName, String nhomHangImage, Icon Image) {
        this.nhomHangName = nhomHangName;
        this.nhomHangImage = nhomHangImage;
        this.Image = Image;
    }

    public NhomHang() {
    }

    public String getNhomHangName() {
        return nhomHangName;
    }

    public void setNhomHangName(String nhomHangName) {
        this.nhomHangName = nhomHangName;
    }

    public String getNhomHangImage() {
        return nhomHangImage;
    }

    public void setNhomHangImage(String nhomHangImage) {
        this.nhomHangImage = nhomHangImage;
    }

    public Icon getImage() {
        return Image;
    }

    public void setImage(Icon Image) {
        this.Image = Image;
    }
    
    
}
