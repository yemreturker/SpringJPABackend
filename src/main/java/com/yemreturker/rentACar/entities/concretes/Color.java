package com.yemreturker.rentACar.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Table(name = "colors")
@Data
@Entity
@SQLDelete(sql = "UPDATE colors SET deleted = true WHERE Id = ?")
@AllArgsConstructor
@NoArgsConstructor
public class Color {
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