
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
* Classe que representa a tabela STATUS_POC
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"STATUS_POC\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.STATUS_POC")
public class STATUS_POC implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "nome_status", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_status;


    /**
    * Construtor
    * @generated
    */
    public STATUS_POC(){
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
    public STATUS_POC setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_status
    * return nome_status
    * @generated
    */
    public java.lang.String getNome_status() {
        return this.nome_status;
    }

    /**
    * Define nome_status
    * @param nome_status nome_status
    * @generated
    */
    public STATUS_POC setNome_status(java.lang.String nome_status) {
        this.nome_status = nome_status;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STATUS_POC object = (STATUS_POC)obj;
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