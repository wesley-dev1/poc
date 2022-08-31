
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
* Classe que representa a tabela COMENTARIO_POC
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"COMENTARIO_POC\"")
@XmlRootElement
@CronappSecurity(post = "Tecnico;Authenticated;Comercial", get = "Tecnico;Authenticated;Comercial", delete = "Administrators", put = "Tecnico;Authenticated;Comercial")
@JsonFilter("app.entity.COMENTARIO_POC")
public class COMENTARIO_POC implements Serializable {
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
    @Column(name = "comentario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String comentario;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User autorComentario;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataInsercaoComentario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInsercaoComentario;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataUltimaAtualizacaoComentario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataUltimaAtualizacaoComentario;


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
    public COMENTARIO_POC(){
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
    public COMENTARIO_POC setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém comentario
    * return comentario
    * @generated
    */
    public java.lang.String getComentario() {
        return this.comentario;
    }

    /**
    * Define comentario
    * @param comentario comentario
    * @generated
    */
    public COMENTARIO_POC setComentario(java.lang.String comentario) {
        this.comentario = comentario;
        return this;
    }
    /**
    * Obtém autorComentario
    * return autorComentario
    * @generated
    */
    public User getAutorComentario() {
        return this.autorComentario;
    }

    /**
    * Define autorComentario
    * @param autorComentario autorComentario
    * @generated
    */
    public COMENTARIO_POC setAutorComentario(User autorComentario) {
        this.autorComentario = autorComentario;
        return this;
    }
    /**
    * Obtém dataInsercaoComentario
    * return dataInsercaoComentario
    * @generated
    */
    public java.util.Date getDataInsercaoComentario() {
        return this.dataInsercaoComentario;
    }

    /**
    * Define dataInsercaoComentario
    * @param dataInsercaoComentario dataInsercaoComentario
    * @generated
    */
    public COMENTARIO_POC setDataInsercaoComentario(java.util.Date dataInsercaoComentario) {
        this.dataInsercaoComentario = dataInsercaoComentario;
        return this;
    }
    /**
    * Obtém dataUltimaAtualizacaoComentario
    * return dataUltimaAtualizacaoComentario
    * @generated
    */
    public java.util.Date getDataUltimaAtualizacaoComentario() {
        return this.dataUltimaAtualizacaoComentario;
    }

    /**
    * Define dataUltimaAtualizacaoComentario
    * @param dataUltimaAtualizacaoComentario dataUltimaAtualizacaoComentario
    * @generated
    */
    public COMENTARIO_POC setDataUltimaAtualizacaoComentario(java.util.Date dataUltimaAtualizacaoComentario) {
        this.dataUltimaAtualizacaoComentario = dataUltimaAtualizacaoComentario;
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
    public COMENTARIO_POC setPoC(POC poC) {
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
COMENTARIO_POC object = (COMENTARIO_POC)obj;
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