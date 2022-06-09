/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

public class NhomHangEntities {
        
    private String idNH;
    private String tenNH;
    private String imageNH;

    public NhomHangEntities() {
    }

    public NhomHangEntities(String idNH, String tenNH, String imageNH) {
        this.idNH = idNH;
        this.tenNH = tenNH;
        this.imageNH = imageNH;
    }

    public String getIdNH() {
        return idNH;
    }

    public void setIdNH(String idNH) {
        this.idNH = idNH;
    }

    public String getTenNH() {
        return tenNH;
    }

    public void setTenNH(String tenNH) {
        this.tenNH = tenNH;
    }

    public String getImageNH() {
        return imageNH;
    }

    public void setImageNH(String imageNH) {
        this.imageNH = imageNH;
    }

    


}
