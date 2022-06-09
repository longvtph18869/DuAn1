/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.NhomHangDao;
import Entities.NhomHangEntities;
import Model.NhomHang;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhomHangService {

    private NhomHangDao nhDao;
    private List<NhomHang> _lstNhomHangs;

    public NhomHangService() {
        nhDao = new NhomHangDao();
        _lstNhomHangs = new ArrayList<>();
    }

    public List<NhomHang> SelectAll() {
        _lstNhomHangs.clear();
        List<NhomHangEntities> list = this.nhDao.SelectAll();
        for (NhomHangEntities x : list) {
            _lstNhomHangs.add(new NhomHang(x.getTenNH(), x.getImageNH(), new ImageIcon(x.getImageNH())));
        }
        return _lstNhomHangs;
    }
    public String getIdNH(int index){
       return this.nhDao.SelectAll().get(index).getIdNH();
    }

    public void listNhomHangInJList(JList list, JFrame frame) {
        DefaultListModel listModel = new DefaultListModel();
        listModel.clear();
        byte[] a = changeByte("planet-earth.png");
        a = scaleBytes(a, 20, 20, frame);
        listModel.addElement(new NhomHang("Tất cả", "planet-earth.png", new ImageIcon(a)));
        _lstNhomHangs = this.SelectAll();
        for (NhomHang x : _lstNhomHangs) {
            byte[] data1 = changeByte(x.getNhomHangImage());
            data1 = scaleBytes(data1, 20, 20, frame);
            listModel.addElement(new NhomHang(x.getNhomHangName(), x.getNhomHangImage(), new ImageIcon(data1)));
        }

        list.setCellRenderer(new CustomRenderer());
        list.setModel(listModel);
    }

    public static byte[] changeByte(String txt) {

        try {
            BufferedImage bImage = ImageIO.read(new File("src\\image\\" + txt));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "png", bos);
            byte[] data = bos.toByteArray();
            return data;

        } catch (IOException ex) {
            Logger.getLogger(NhomHangService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static byte[] scaleBytes(byte[] fileData, int width, int height, JFrame frame) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(fileData);
        try {
            BufferedImage img = ImageIO.read(byteArrayInputStream);
            if (height == 0) {
                height = (width * img.getHeight()) / img.getWidth();
            }
            if (width == 0) {
                width = (height * img.getWidth()) / img.getHeight();
            }
            Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage imageBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            imageBuffer.getGraphics().drawImage(scaledImage, 0, 0, new Color(0, 0, 0), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(imageBuffer, "png", byteArrayOutputStream);

            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Lỗi");
        }
        return null;
    }
}
