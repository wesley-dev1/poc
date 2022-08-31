
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
* Classe que representa a tabela NIVEL_PRIORIDADE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"NIVEL_PRIORIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.NIVEL_PRIORIDADE")
public class NIVEL_PRIORIDADE implements Serializable {
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
    @Column(name = "nome_prioridade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_prioridade;


    /**
    * Construtor
    * @generated
    */
    public NIVEL_PRIORIDADE(){
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
    public NIVEL_PRIORIDADE setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_prioridade
    * return nome_prioridade
    * @generated
    */
    public java.lang.String getNome_prioridade() {
        return this.nome_prioridade;
    }

    /**
    * Define nome_prioridade
    * @param nome_prioridade nome_prioridade
    * @generated
    */
    public NIVEL_PRIORIDADE setNome_prioridade(java.lang.String nome_prioridade) {
        this.nome_prioridade = nome_prioridade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
NIVEL_PRIORIDADE object = (NIVEL_PRIORIDADE)obj;
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