//package com.msita.demo.Controller;
//
//import com.msita.demo.Services.SinhVienServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/sinhvien")
//public class SinhVienController {
//    @Autowired
//    private SinhVienServices sinhVienServices;
//    @GetMapping
//    public List<Sinhvien> getAll (){
//        return sinhVienServices.GetAll();
//    }
//    @GetMapping("/{masv}")
//    public Sinhvien getById(@PathVariable Integer masv){
//        return sinhVienServices.getById(masv);
//    }
//    @PostMapping
//    public Sinhvien add(@RequestBody Sinhvien sinhvien){
//        return sinhVienServices.addOrUpdate(sinhvien);
//    }
//    @PutMapping("/{masv}")
//    public Sinhvien update(@PathVariable Integer masv,@RequestBody Sinhvien sinhvien){
//        sinhvien.setMasv(masv);
//        return sinhVienServices.addOrUpdate(sinhvien);
//    }
//    @DeleteMapping("/{masv}")
//    public void delete(@PathVariable Integer masv){
//        sinhVienServices.deleteById(masv);
//    }
//}
