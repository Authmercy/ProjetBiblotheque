package com.Tutore.Tutore;

import javax.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")

public class User   extends AbstractEntity {
    @Column(name = "iduser")
    private String iduser;
    @Column(name = "password")
    private String password;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;


    @ManyToOne
    @JoinColumn(name = "idGroupe")
    private Groupe groupe;
    @ManyToOne
    @JoinColumn(name = "idHistorique")
    private Historique historique;

    @OneToMany(mappedBy = "user")
    private List<Roles> roles;



}