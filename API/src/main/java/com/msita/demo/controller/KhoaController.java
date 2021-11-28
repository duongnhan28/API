package com.msita.demo.controller;

import com.msita.demo.entity.Khoa;
import com.msita.demo.services.KhoaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    private KhoaServices khoaServices;
    @GetMapping
    public List<Khoa> getAllKhoa (){
        return khoaServices.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Khoa> getById(@PathVariable Integer id){
        return khoaServices.getById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Khoa khoa){
        khoaServices.addOrUpdate(khoa);
    }
    @PutMapping("update/{id}")
    public void edit(@RequestBody Khoa khoa){
        khoaServices.addOrUpdate(khoa);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        khoaServices.deleteById(id);
    }
}

