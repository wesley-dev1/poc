
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela CHECKLIST
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CHECKLIST\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CHECKLIST")
public class CHECKLIST implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = true, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "item", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String item;


    /**
    * @generated
    */
    @Column(name = "checado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean checado;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_POC", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private POC poC;


    /**
    * Construtor
    * @generated
    */
    public CHECKLIST(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public CHECKLIST setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém item
    * return item
    * @generated
    */
    public java.lang.String getItem() {
        return this.item;
    }

    /**
    * Define item
    * @param item item
    * @generated
    */
    public CHECKLIST setItem(java.lang.String item) {
        this.item = item;
        return this;
    }
    /**
    * Obtém checado
    * return checado
    * @generated
    */
    public java.lang.Boolean getChecado() {
        return this.checado;
    }

    /**
    * Define checado
    * @param checado checado
    * @generated
    */
    public CHECKLIST setChecado(java.lang.Boolean checado) {
        this.checado = checado;
        return this;
    }
    /**
    * Obtém poC
    * return poC
    * @generated
    */
    public POC getPoC() {
        return this.poC;
    }

    /**
    * Define poC
    * @param poC poC
    * @generated
    */
    public CHECKLIST setPoC(POC poC) {
        this.poC = poC;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CHECKLIST object = (CHECKLIST)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}