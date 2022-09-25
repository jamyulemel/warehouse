package uz.data.texnikTopshiriqnoma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@Data
@AllArgsConstructor
@Entity(name = "currencys")
@EqualsAndHashCode(callSuper = true)
public class Currency extends Parent{

}
