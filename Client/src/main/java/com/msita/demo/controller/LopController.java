package com.msita.demo.controller;

import com.msita.demo.Services.LopServices;
import com.msita.demo.client.KhoaClient;
import com.msita.demo.client.LopClient;
import com.msita.demo.dto.Khoa;
import com.msita.demo.dto.Lop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LopController {
    @Autowired
    private LopClient lopClient;
    @Autowired
    KhoaClient khoaClient;
    @Autowired
    LopServices lopServices;
    @GetMapping("/lop")
    public String ShowAll(Model model){
        List<Lop> lops = lopClient.getAll();
        model.addAttribute("lop",lops);
        return "/Lop/list";
    }
    @GetMapping("/lop/add")
    public String getAdd(Model model){
        model.addAttribute("addLopForm",new Lop());
        List<Khoa> khoas =khoaClient.getAll();
        model.addAttribute("khoa", khoas);
        return "/Lop/add";
    }
    @PostMapping("/lop/add")
    public String postAdd(@ModelAttribute("addLopForm") Lop lop){
        lopClient.save(lop);
        return "redirect:/lop";
    }
    @GetMapping("/lop/delete/{id}")
    public String delete(@PathVariable Integer id){
        lopClient.deleteById(id);
        return "redirect:/lop";
    }

    @GetMapping("/lop/edit/{id}")
    public String getEditLop(@PathVariable Integer id, Model model){
        List<Khoa>khoas = khoaClient.getAll();
        model.addAttribute("khoa",khoas);
        Lop lop = lopServices.get(id);
        model.addAttribute("editLopForm",new Lop());
        model.addAttribute("editLopForm",lop);

            return "Lop/edit";
    }
    @PostMapping("/lop/edit")
    public String pEditLop(@Valid @ModelAttribute("editLopForm") Lop lop){
        lopClient.save(lop);
        return "redirect:/lop";
    }


}
