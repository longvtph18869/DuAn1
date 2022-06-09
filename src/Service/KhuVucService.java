/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.KhuVucDao;
import Entities.KhuVucEntities;
import Model.KhuVuc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhuVucService {
    private KhuVucDao kvDao;
    private List<KhuVuc> _lstKhuVuc;

    public KhuVucService() {
         kvDao = new KhuVucDao();
        _lstKhuVuc = new ArrayList<>();
    }
    
    public List<KhuVuc> getlst(){
        return _lstKhuVuc;
    }
    
    public List<KhuVuc> selectAll() {
        _lstKhuVuc.clear();
        List<KhuVucEntities> list = this.kvDao.SelectAll();
        for (KhuVucEntities x : list) {
            _lstKhuVuc.add(new KhuVuc(x.getMaKhuVuc(), x.getTenKhuVuc(), x.getAnh(), x.getAnhHienThi(),x.getTab()));
        }
        return _lstKhuVuc;
    }
}
