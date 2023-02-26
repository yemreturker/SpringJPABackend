package com.yemreturker.rentACar.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Table(name = "cars")
@Data
@Entity
@SQLDelete(sql = "UPDATE cars SET deleted = true WHERE Id = ?")
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @NotNull
    @NotEmpty
    @Column(name = "ModelId")
    private int ModelId;
    @NotNull
    @NotEmpty
    @Column(name = "ColorId")
    private int ColorId;
    @NotNull
    @NotEmpty
    @Column(name = "Kilometer")
    private short Kilometer;
    @NotNull
    @NotEmpty
    @Column(name = "ModelYear")
    private short ModelYear;
    @NotNull
    @NotEmpty
    @Column(name = "DailyPrice")
    private double DailyPrice;
    @NotNull
    @NotEmpty
    @Column(name = "Plate")
    private String Plate;
    @Column(name = "Deleted")
    private  boolean Deleted = Boolean.FALSE;
}