package com.example.carver.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @SequenceGenerator(
            name = "cliente_sequence",
            sequenceName = "cliente_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cliente_sequence"
    )
    private Long clientId;
    private String razonSocial;
    private String rfc;
    private String email;
    private String phone;
    public Cliente() {
    }
    public Cliente(String razonSocial, String rfc, String email, String phone) {
        this.razonSocial = razonSocial;
        this.rfc = rfc;
        this.email = email;
        this.phone = phone;
    }
    public Long getClientId() {
        return clientId;
    }
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
