//package com.msita.demo.Controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@Controller
//public class SinhVienController {
//    @Autowired
//    private SinhVienServies sinhVienServies;
//    @Autowired
//    private LopServices lopServices;
//    @Autowired
//    private KhoaServices khoaServices;
//    @GetMapping("/sinhvien")
//    public String getAll(Model model){
//        model.addAttribute("sinhvien",sinhVienServies.getAll());
//        return "/Sinhvien//list";
//    }
//    @GetMapping("/sinhvien/add")
//    public String getAdd(Model model){
//        model.addAttribute("addSinhVien",new Sinhvien());
//        List<Lop> lops = lopServices.showAll();
//        model.addAttribute("lop",lops);
//        return "/Sinhvien/add";
//    }
//    @PostMapping("/sinhvien/add")
//    public String postAdd(@Valid @ModelAttribute("addSinhVien") Sinhvien sinhvien, BindingResult bindingResult){
//        if (bindingResult.hasErrors()){
//            return "/Sinhvien/add";
//        }
//        sinhVienServies.add(sinhvien.getHoten(),sinhvien.getNgaysinh(),sinhvien.getGioitinh(),
//                lopServices.findById(sinhvien.getLop().getMalop()));
//        return "redirect:/sinhvien";
//    }
//    @GetMapping("/deleleSinhVien")
//    public String DelSV(Integer masv){
//        sinhVienServies.delete(masv);
//        return "redirect:/sinhvien";
//    }
//    @GetMapping("/sinhvien/edit")
//    public String getEditSinhVien(@RequestParam("masv") Integer masv,Model model){
//        List<Lop> lops = lopServices.showAll();
//        model.addAttribute("lop",lops);
//        Sinhvien sinhvien = sinhVienServies.getSinhVienById(masv).get();
//        model.addAttribute("editSinhVien",new Sinhvien(
//                sinhvien.getMasv(),
//                sinhvien.getHoten(),
//                sinhvien.getNgaysinh(),
//                sinhvien.getGioitinh(),
//               sinhvien.getLop()));
//        return "/Sinhvien/edit";
//    }
//    @PostMapping("/sinhvien/edit")
//    public String PostEditSinhVien(@Valid @ModelAttribute("editSinhVien") Sinhvien sinhvien,BindingResult bindingResult){
//        if (bindingResult.hasErrors()){
//            return "/Sinhvien/edit";
//        }
//        sinhVienServies.EditSinhvien(sinhvien.getMasv(),sinhvien.getHoten(),sinhvien.getNgaysinh(),sinhvien.getGioitinh(),
//                lopServices.findById(sinhvien.getLop().getMalop()));
//        return "redirect:/sinhvien";
//    }
//}
