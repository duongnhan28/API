package com.msita.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Data
@NoArgsConstructor
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tenLop")
    private String tenLop;
    @Column(name = "siSo")
    private int siSo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "khoaId")
    private Khoa khoa;

}
