/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.NhomHangEntities;
import Utils.UtilsJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhomHangDao {
    public List<NhomHangEntities> SelectAll() {
        List<NhomHangEntities> list = new ArrayList<>();
        String SQL = "SELECT * FROM nhomhang";
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(SQL);
            while (rs.next()) {
                list.add(new NhomHangEntities(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
