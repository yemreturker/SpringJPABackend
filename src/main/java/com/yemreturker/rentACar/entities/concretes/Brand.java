package com.yemreturker.rentACar.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Table(name = "brands")
@Data
@Entity
@SQLDelete(sql = "UPDATE brands SET deleted = true WHERE Id = ?")
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @NotNull
    @NotEmpty
    @Column(name = "Name")
    private String Name;
    @NotNull
    @NotEmpty
    @Column(name = "Deleted")
    private  boolean Deleted = Boolean.FALSE;
}