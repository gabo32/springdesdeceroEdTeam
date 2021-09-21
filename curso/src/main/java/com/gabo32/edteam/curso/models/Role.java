package com.gabo32.edteam.curso.models;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "role")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Role extends BaseEntity{

    @Column(name = "nombre")
    @Getter
    @Setter
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "role")
    @Getter
    @Setter
    private Set<Permiso> permisos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(nombre, role.nombre) && Objects.equals(permisos, role.permisos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, permisos);
    }
}
