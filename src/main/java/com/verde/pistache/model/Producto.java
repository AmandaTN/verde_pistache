package com.verde.pistache.model;
// Generated 20/06/2018 09:11:09 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity

public class Producto  implements java.io.Serializable {


     private Integer idproducto;
     private String codigo;
     private String descripcion;
     private String talla;
     private String nombre;
     private List<Fotos> fotos = new LinkedList<Fotos>();

    public Producto() {
    }

    public Producto(String codigo, String descripcion, String talla, String nombre, List<Fotos> fotoses) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.talla = talla;
       this.nombre = nombre;
       this.fotos = fotoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idproducto", unique=true, nullable=false)
    public Integer getIdproducto() {
        return this.idproducto;
    }
    
    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    
    @Column(name="codigo", length=45)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="descripcion", length=100)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="talla", length=45)
    public String getTalla() {
        return this.talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="producto")
    public List<Fotos> getFotoses() {
        return this.fotos;
    }
    
    public void setFotoses(List<Fotos> fotoses) {
        this.fotos = fotoses;
    }




}


