//package com.msita.demo.Services;
//
//import com.msita.demo.Repository.SinhVienRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SinhVienServices {
//    @Autowired
//    private SinhVienRepository sinhVienRepository;
//    public Sinhvien addOrUpdate (Sinhvien sinhvien){
//        return sinhVienRepository.save(sinhvien);
//    }
//    public void deleteById(Integer masv){
//        sinhVienRepository.deleteById(masv);
//    }
//    public List<Sinhvien> GetAll(){
//        return sinhVienRepository.findAll();
//    }
//    public Sinhvien getById(Integer masv){
//        return sinhVienRepository.findById(masv).get();
//    }
//}
