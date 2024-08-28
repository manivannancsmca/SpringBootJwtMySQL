package com.myapp.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblUser { 
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id; 
    private String name; 
    private String email; 
    private String password; 
  
} 