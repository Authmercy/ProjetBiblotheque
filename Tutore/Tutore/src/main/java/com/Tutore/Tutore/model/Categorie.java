package com.Tutore.Tutore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
public class Categorie extends AbstractEntity{
    @Column(name = "idCat")
    private String idCat;
    @Column(name = "nomCat")
    private String nomCat;

    @Column(name = "description")
    private String description ;
    @OneToMany(mappedBy = "category")
    private List<Ouvrage> ouvrageList;

}
