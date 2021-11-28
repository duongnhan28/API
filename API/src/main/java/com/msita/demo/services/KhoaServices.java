package com.msita.demo.services;

import com.msita.demo.entity.Khoa;
import com.msita.demo.repository.KhoaRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class KhoaServices {
    @Autowired
    private KhoaRepostitory khoaRepostitory;
    public List<Khoa> getAll(){
        return khoaRepostitory.findAll();
    }
    @Transactional
    public void addOrUpdate(Khoa khoa){
         khoaRepostitory.save(khoa);
    }
    public void update(Khoa khoa){
        khoaRepostitory.save(khoa);
    }

    public void deleteById(Integer id) {
        khoaRepostitory.deleteById(id);
    }

    public Optional<Khoa> getById(Integer id) {
        return khoaRepostitory.findById(id);
    }
//    public Khoa getId(Integer makhoa){
//        return khoaClient.findByIdd(makhoa);
//
}
