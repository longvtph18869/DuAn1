/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.BanEntities;
import Utils.UtilsJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class BanDao {
    
    public List<BanEntities> SelectAll() {
        List<BanEntities> list = new ArrayList<>();
        String SQL = "SELECT * FROM ban";
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(SQL);
            while (rs.next()) {
                list.add(new BanEntities(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<BanEntities> findBanByMaKhuVuc(int maKhuVuc){
        List<BanEntities> list = new ArrayList<>();
        String SQL = "SELECT * FROM ban WHERE MaKhuVuc = ?";
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(SQL,maKhuVuc);
            while (rs.next()) {
                list.add(new BanEntities(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
