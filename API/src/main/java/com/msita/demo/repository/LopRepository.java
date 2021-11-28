package com.msita.demo.repository;


import com.msita.demo.entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopRepository extends JpaRepository<Lop,Integer> {
    List<Lop> findByKhoa(Integer id);
}
