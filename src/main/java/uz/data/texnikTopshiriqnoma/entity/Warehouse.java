package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.data.texnikTopshiriqnoma.entity.Parent;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Entity(name = "warehouse")
@EqualsAndHashCode(callSuper = true)
public class Warehouse extends Parent {


}
