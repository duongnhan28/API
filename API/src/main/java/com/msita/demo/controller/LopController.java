package com.msita.demo.controller;

import com.msita.demo.entity.Lop;
import com.msita.demo.services.LopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/lop")
public class LopController {
    @Autowired
    private LopServices lopServices;
    @GetMapping
    public List<Lop> getAll (){
        return lopServices.GetAll();
    }
    @GetMapping("/{id}")
    public Optional<Lop> getById(@PathVariable Integer id){
        return lopServices.getById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Lop lop){
         lopServices.add(lop);
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable Integer id,@RequestBody Lop lop){
//        lop.setMalop(malop);
        lopServices.update(lop);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        lopServices.deleteById(id);
    }
//    @GetMapping("khoa/{id}")
//    public List<Lop> getByKhoa(@PathVariable Integer id){
//        return lopServices.getLopByKhoa(id);
//    }
}
