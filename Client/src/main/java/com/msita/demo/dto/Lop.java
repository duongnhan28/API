package com.msita.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lop {
    private int id;
    private String tenLop;
    private int siSo;
    private Khoa khoa;

}
