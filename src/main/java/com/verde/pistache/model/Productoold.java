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
import java.math.BigDecimal;

/**
 * Productoold generated by hbm2java
 */


public class Productoold implements java.io.Serializable {

    private Integer idproducto; //ya
    private String imagen;  //ya
     private String nombre;//ya
    private String codigo;//ya
    private BigDecimal precio; //ya
   
    private Integer cantidad;//ya
     private String descripcion;//ya
    private Integer stock;//ya
    private List<Fotosold> fotos = new LinkedList<Fotosold>();

    public Productoold(String imagen, String nombre, String codigo, BigDecimal precio, Integer cantidad, Integer stock, List<Fotosold> fotoses) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
        this.fotos = fotoses;
    }

    public Productoold() {
    }
    @Column(name = "imagen", length = 45)
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Column(name = "precio", nullable=false, precision=18)
    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    @Column(name = "cantidad", nullable=false)
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
     @Column(name = "stock", nullable=false)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
   
    public List<Fotosold> getFotos() {
        return fotos;
    }

    public void setFotos(List<Fotosold> fotos) {
        this.fotos = fotos;
    }

//    public Productoold(String codigo, String descripcion, String talla, String nombre, List<Fotos> fotoses) {
//        this.codigo = codigo;
//        this.descripcion = descripcion;
//        this.talla = talla;
//        this.nombre = nombre;
//        this.fotos = fotoses;
//    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idproducto", unique = true, nullable = false)
    public Integer getIdproducto() {
        return this.idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    @Column(name = "codigo", length = 45)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name = "descripcion", length = 100)
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

//    @Column(name = "talla", length = 45)
//    public String getTalla() {
//        return this.talla;
//    }
//
//    public void setTalla(String talla) {
//        this.talla = talla;
//    }

    @Column(name = "nombre", length = 45)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
    public List<Fotosold> getFotoses() {
        return this.fotos;
    }

    public void setFotoses(List<Fotosold> fotoses) {
        this.fotos = fotoses;
    }

}
