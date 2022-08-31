
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
    @Column(name = "item", nullable = true, insertable=true, updatable=true)
        private java.lang.String item = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "checado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean checado;


    /**
    * Construtor
    * @generated
    */
    public CHECKLIST(){
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
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CHECKLIST object = (CHECKLIST)obj;
        if (item != null ? !item.equals(object.item) : object.item != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((item == null) ? 0 : item.hashCode());
        return result;
    }

}