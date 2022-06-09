/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.BanDao;
import Entities.BanEntities;
import Model.Ban;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BanService {

    private BanDao banDao;
    private List<Ban> _lstBan;

    public BanService() {
        banDao = new BanDao();
        _lstBan = new ArrayList<>();
    }
    public List<Ban> getlst(){
        return _lstBan;
    }

    public List<Ban> selectAll() {
        _lstBan.clear();
        List<BanEntities> list = this.banDao.SelectAll();
        for (BanEntities x : list) {
            _lstBan.add(new Ban(x.getMaBan(), x.getTenBan(), x.getMaKhuVuc(), x.getGhiChu()));
        }
        return _lstBan;
    }
    
    public List<Ban> findBanByMaKhuVuc(int maKhuVuc){
        _lstBan.clear();
        List<BanEntities> list = this.banDao.findBanByMaKhuVuc(maKhuVuc);
        for (BanEntities x : list) {
            _lstBan.add(new Ban(x.getMaBan(), x.getTenBan(), x.getMaKhuVuc(), x.getGhiChu()));
        }
        return _lstBan;
    }
}
