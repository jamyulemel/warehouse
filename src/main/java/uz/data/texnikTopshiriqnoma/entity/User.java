package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false,updatable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,updatable = false)
    private Integer code;

    private boolean status;

    @ManyToMany
    private List<Warehouse> warehouses;
}
