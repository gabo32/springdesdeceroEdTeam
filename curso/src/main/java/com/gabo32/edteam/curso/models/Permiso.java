package com.gabo32.edteam.curso.models;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permisos")
@NoArgsConstructor
@AllArgsConstructor
public class Permiso extends BaseEntity {

    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("role_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    @Getter @Setter
    private Role role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permiso permiso = (Permiso) o;
        return Objects.equals(nombre, permiso.nombre) && Objects.equals(role, permiso.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, role);
    }

    @Override
    public String toString() {
        return "Permiso{" +
                "nombre='" + nombre + '\'' +
                ", role=" + role +
                '}';
    }
}
