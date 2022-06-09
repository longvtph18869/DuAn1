/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.KhuVucEntities;
import Utils.UtilsJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhuVucDao {

    public List<KhuVucEntities> SelectAll() {
        List<KhuVucEntities> list = new ArrayList<>();
        String SQL = "SELECT * FROM khuvuc";
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(SQL);
            while (rs.next()) {
                list.add(new KhuVucEntities(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
