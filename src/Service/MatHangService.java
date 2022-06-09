/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.MatHangDao;
import Entities.MatHangEntites;
import Model.MatHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MatHangService {

    private MatHangDao mhDao;
    private List<MatHang> _lMatHangs;

    public MatHangService() {
        _lMatHangs = new ArrayList<>();
        this.mhDao = new MatHangDao();
    }

    public List<MatHang> selectAll() {
        _lMatHangs.clear();
        List<MatHangEntites> list = this.mhDao.SelectAll();
        for (MatHangEntites x : list) {
            _lMatHangs.add(new MatHang(x.getMaMH(), x.getTenMH(), x.getDVT(), x.getGia()));
        }
        return _lMatHangs;
    }

    public List<MatHang> findById(String txt) {
        _lMatHangs.clear();
        List<MatHangEntites> list = this.mhDao.SelectByMaNH(txt);
        for (MatHangEntites x : list) {
            _lMatHangs.add(new MatHang(x.getMaMH(), x.getTenMH(), x.getDVT(), x.getGia()));
        }
        return _lMatHangs;
    }
}
