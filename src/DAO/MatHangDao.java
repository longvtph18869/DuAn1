/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.MatHangEntites;
import Utils.UtilsJDBC;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MatHangDao {

    public List<MatHangEntites> SelectByMaNH(String txt) {
        List<MatHangEntites> list = new ArrayList<>();
        String SQL = "SELECT * FROM mathang WHERE MaNhomHang = ?";
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(SQL, txt);
            while (rs.next()) {
                list.add(new MatHangEntites(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<MatHangEntites> SelectAll() {
        List<MatHangEntites> list = new ArrayList<>();
        String SQL = "SELECT * FROM mathang";
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(SQL);
            while (rs.next()) {
                list.add(new MatHangEntites(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
