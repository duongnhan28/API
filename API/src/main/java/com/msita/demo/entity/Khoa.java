package com.msita.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Data
@NoArgsConstructor
public class Khoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenKhoa;
    @OneToMany(mappedBy = "khoa",fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Lop> lops;


}
