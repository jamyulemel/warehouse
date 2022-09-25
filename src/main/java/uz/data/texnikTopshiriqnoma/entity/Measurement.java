package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity(name = "measurement")
@EqualsAndHashCode(callSuper = true)
public class Measurement extends Parent {

}
