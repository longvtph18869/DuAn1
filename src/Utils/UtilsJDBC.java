/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilsJDBC {

    private static String url = "jdbc:mysql://localhost:3306/coffee";
    private static String user = "root";
    private static String pass = "";
    private static PreparedStatement pt;
    private static Connection conn;


    public static Connection OpenConnection() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            return null;
        }
    }

    public static PreparedStatement CreatSQL(String SQL, Object... args) {
        try {
            conn = OpenConnection();
            pt = conn.prepareCall(SQL);
            for (int i = 0; i < args.length; i++) {
                pt.setObject(i + 1, args[i]);
            }
            return pt;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static ResultSet SelectSQL(String SQL, Object... args) {
        try {
            pt = CreatSQL(SQL, args);
            return pt.executeQuery();
        } catch (SQLException ex) {
            return null;
        }
    }

    public static int CRUD_SQL(String SQL, Object... args) {
        try {
            pt = CreatSQL(SQL, args);
            return pt.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        } finally {
            return 0;
        }
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = UtilsJDBC.SelectSQL(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
