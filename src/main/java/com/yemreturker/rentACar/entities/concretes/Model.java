package com.yemreturker.rentACar.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Table(name = "models")
@Data
@Entity
@SQLDelete(sql = "UPDATE models SET deleted = true WHERE Id = ?")
@AllArgsConstructor
@NoArgsConstructor
public class Model {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @NotNull
    @NotEmpty
    @Column(name = "BrandId")
    private int BrandId;
    @NotNull
    @NotEmpty
    @Column(name = "Name")
    private String Name;
    @Column(name = "Deleted")
    private  boolean Deleted = Boolean.FALSE;
}