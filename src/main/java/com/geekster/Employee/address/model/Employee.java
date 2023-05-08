package com.geekster.Employee.address.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private   long id;
  private   String firstName;
  private   String lastName;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="id")
  private   Address address;

}
