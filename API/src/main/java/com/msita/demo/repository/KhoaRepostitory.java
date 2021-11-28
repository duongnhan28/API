package com.msita.demo.repository;

import com.msita.demo.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepostitory extends JpaRepository<Khoa,Integer> {
}
