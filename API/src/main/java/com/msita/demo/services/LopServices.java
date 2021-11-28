package com.msita.demo.services;

import com.msita.demo.entity.Lop;
import com.msita.demo.repository.LopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LopServices {
    @Autowired
    private LopRepository lopRepository;
    public void add (Lop lop){
        lopRepository.save(lop);

    }
    public void update (Lop lop){
         lopRepository.save(lop);

    }
    public void deleteById(Integer id){
        lopRepository.deleteById(id);
    }
    public List<Lop> GetAll(){
        return lopRepository.findAll();
    }
    public Optional<Lop> getById(Integer id){
        return lopRepository.findById(id);
    }

    public List<Lop> getLopByKhoa(Integer id) {
        return lopRepository.findByKhoa(id);
    }
}
