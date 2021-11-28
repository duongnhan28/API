package com.msita.demo.controller;


import com.msita.demo.client.KhoaClient;
import com.msita.demo.Services.KhoaServices;
import com.msita.demo.dto.Khoa;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class KhoaController {

    @Autowired
    private KhoaClient khoaClient;
    @Autowired
    private KhoaServices khoaServices;

    @GetMapping("/khoa/add")
    public String getAddKhoa(Model model){
        model.addAttribute("addKhoaForm",new Khoa());
        return "/Khoa/add";
    }
    @PostMapping("/khoa/add")
    public String postAddKhoa(@Valid @ModelAttribute("addKhoaForm") Khoa khoa){
        khoaClient.create(khoa);
        return "redirect:/khoa";
    }
    @GetMapping("/khoa/update/{id}")
    public String getEdit(@Valid @PathVariable Integer id, Model model) {
        Khoa khoa = khoaServices.get(id);
        model.addAttribute("editKhoaForm", khoa);
        return "Khoa/edit";
    }
    @PostMapping("/khoa/update")
    public String postEditKhoa(@ModelAttribute("editKhoaForm") Khoa khoa){
        khoaClient.create(khoa);
        return "redirect:/khoa";

    }
    @GetMapping("/khoa")
    public String GetAll(Model model) {
        model.addAttribute("khoa", khoaClient.getAll());
        return "Khoa/list";
    }

    @GetMapping("/khoa/delete/{id}")
    public String getDelete(@PathVariable Integer id, Model model) {
      khoaClient.deleteById(id);
        return "redirect:/khoa";

    }
}


