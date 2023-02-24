package com.yemreturker.rentACar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Table(name = "brands")
@Data
@Entity
@SQLDelete(sql = "UPDATE brands SET deleted = true WHERE id = ?")
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "deleted")
    private  boolean deleted = Boolean.FALSE;
}