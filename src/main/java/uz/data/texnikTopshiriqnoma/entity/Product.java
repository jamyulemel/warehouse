package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.data.texnikTopshiriqnoma.entity.phone.Attachment;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Product extends Parent {

    @ManyToOne
    private Category  categorys;

    @OneToMany
    private List<Attachment> phone;
    @Column(nullable = false,unique = true)
    private Integer code;

    @ManyToOne
    private Measurement measurements;

}
