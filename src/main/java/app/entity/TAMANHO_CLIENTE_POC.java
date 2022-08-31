
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
* Classe que representa a tabela TAMANHO_CLIENTE_POC
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TAMANHO_CLIENTE_POC\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TAMANHO_CLIENTE_POC")
public class TAMANHO_CLIENTE_POC implements Serializable {
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
    @Column(name = "nome_tamanho_cliente", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_tamanho_cliente;


    /**
    * Construtor
    * @generated
    */
    public TAMANHO_CLIENTE_POC(){
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
    public TAMANHO_CLIENTE_POC setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_tamanho_cliente
    * return nome_tamanho_cliente
    * @generated
    */
    public java.lang.String getNome_tamanho_cliente() {
        return this.nome_tamanho_cliente;
    }

    /**
    * Define nome_tamanho_cliente
    * @param nome_tamanho_cliente nome_tamanho_cliente
    * @generated
    */
    public TAMANHO_CLIENTE_POC setNome_tamanho_cliente(java.lang.String nome_tamanho_cliente) {
        this.nome_tamanho_cliente = nome_tamanho_cliente;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TAMANHO_CLIENTE_POC object = (TAMANHO_CLIENTE_POC)obj;
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