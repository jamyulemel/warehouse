package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Supplier extends Parent {


    @Column(nullable = false,updatable = false)
    private String phoneNumber;

}
