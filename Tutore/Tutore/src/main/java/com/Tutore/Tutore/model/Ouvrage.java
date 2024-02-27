package com.Tutore.Tutore;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ouvrage")
public class  Ouvrage extends AbstractEntity{


    @Column(name = "idDoc")
    private String idDoc;
    @Column(name = "nomDoc")
    private String nomDoc;
    @Column(name = "ISBN")
    private String ISBN;
    @Column(name = "edition")
    private String  edition;
    @Column(name = "nbrExemplaire")
    private int nbrExemplaire;
    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;
    @OneToMany(mappedBy = "ouvrage")


    @JoinColumn(name = "id_fichier")
    @OneToOne(mappedBy = "document")
    private Fichier fichier;

}

