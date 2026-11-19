package com.example.employee_be.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Table 
@Data 
public class User {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Integer userid;
   private String username;
   private String password;
}
