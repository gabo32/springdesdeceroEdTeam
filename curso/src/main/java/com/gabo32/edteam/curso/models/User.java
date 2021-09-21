package com.gabo32.edteam.curso.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "user")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @JsonIgnore//indicamos que se oculte la contrase;a
    @Column(name="password")
    @Getter
    @Setter
    private String password;

    @Column(name = "nombre")
    @Getter
    @Setter
    private String nombre;

    @Column(name = "apellido")
    @Getter
    @Setter
    private String apellido;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Column(name = "telefono")
    @Getter
    @Setter
    private String telefono;

    @Column(name = "fecha_nacimiento")
    @Getter
    @Setter
    private Date fechaNac;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)//tipo de acceso
    @ManyToOne(fetch = FetchType.EAGER)//siempre traer el contenido
    @JoinColumn(name = "role_id")
    @Getter
    @Setter
    private Role role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(password, user.password) && Objects.equals(nombre, user.nombre) && Objects.equals(apellido, user.apellido) && Objects.equals(email, user.email) && Objects.equals(telefono, user.telefono) && Objects.equals(fechaNac, user.fechaNac) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, nombre, apellido, email, telefono, fechaNac, role);
    }
}
