package com.example.carver.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "cotizacion")
public class cotizacion {
    @Id
    @SequenceGenerator(
            name = "cotizacion_sequence",
            sequenceName = "cotizacion_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cotizacion_sequence"
    )
    @Column(name = "cotizacion_id")
    private long Id;
    private String Precio;
    private LocalDate Fecha;
    private String Seguimiento;




}
