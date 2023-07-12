package com.fortam23.fortamjava.modelo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
//Nombre de la tabla y el atributo unico 
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    @Id
    //Id auto incrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private Long id_Usuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "identificacion")
    private String identificacion;

    private String email;
    private String password;
    
    //Cardinalidad de muchos a muchos entre tablas y roles
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //tabla intermedia
    @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id_Usuario"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id_Rol"))
    //Conexion con la entidad rol
    private Collection<Rol> roles;
    
    //Gettes and Setters
    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }
    //Constructor con todos los atributos
    public Usuario(Long id_Usuario, String nombre, String identificacion, String email, String password,
            Collection<Rol> roles) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
    
    //Constructor con todos los atributos menos la Id
    public Usuario(String nombre, String identificacion, String email, String password, Collection<Rol> roles) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

	// Constructor vacio
    public Usuario() {
    }

}
