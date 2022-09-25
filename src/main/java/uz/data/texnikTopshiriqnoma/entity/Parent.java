package uz.data.texnikTopshiriqnoma.entity;

import lombok.Data;


import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private Boolean status;

}
