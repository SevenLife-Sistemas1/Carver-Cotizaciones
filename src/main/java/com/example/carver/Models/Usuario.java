package com.example.carver.Models;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @SequenceGenerator(
            name = "usuario_sequence",
            sequenceName = "usuario_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "usuario_sequence"
    )
    private Long userId;
    private String name;
    private String lastName;
    private String secondLastName;
    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario(Long userId, String name, String lastName, String secondLastName, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.email = email;
        this.password = password;
    }

    public Usuario(String name, String lastName, String secondLastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.email = email;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
