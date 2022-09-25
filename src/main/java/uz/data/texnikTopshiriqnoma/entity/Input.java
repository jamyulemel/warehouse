package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @OneToOne
    private Warehouse warehouse;

    @ManyToOne
    private Supplier supplier;

    @OneToOne
    private Category category;

    private Integer factureNumber;

    private Integer code;

}
