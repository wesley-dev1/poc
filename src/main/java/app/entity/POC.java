
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
* Classe que representa a tabela POC
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"POC\"")
@XmlRootElement
@CronappSecurity(post = "Administrators;Comercial", get = "Tecnico;Authenticated;Comercial", delete = "Administrators", put = "Tecnico;Authenticated;Comercial")
@JsonFilter("app.entity.POC")
public class POC implements Serializable {
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
    @Column(name = "nome_cliente", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_cliente;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_STATUS_POC", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private STATUS_POC stATUS_POC;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_TIPO_CLIENTE_POC", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        
        private TIPO_CLIENTE_POC tiPO_CLIENTE_POC;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_TAMANHO_CLIENTE_POC", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        
        private TAMANHO_CLIENTE_POC taMANHO_CLIENTE_POC;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_NIVEL_PRIORIDADE", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        
        private NIVEL_PRIORIDADE niVEL_PRIORIDADE;


    /**
    * @generated
    */
    @Column(name = "estrategico", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean estrategico;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @Column(name = "horas_gastas_totais", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date horas_gastas_totais;


    /**
    * @generated
    */
    @Column(name = "descricao_escopo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao_escopo;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="responsavel_comercial", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User responsavel_comercial;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="responsavel_tecnico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User responsavel_tecnico;


    /**
    * Construtor
    * @generated
    */
    public POC(){
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
    public POC setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_cliente
    * return nome_cliente
    * @generated
    */
    public java.lang.String getNome_cliente() {
        return this.nome_cliente;
    }

    /**
    * Define nome_cliente
    * @param nome_cliente nome_cliente
    * @generated
    */
    public POC setNome_cliente(java.lang.String nome_cliente) {
        this.nome_cliente = nome_cliente;
        return this;
    }
    /**
    * Obtém stATUS_POC
    * return stATUS_POC
    * @generated
    */
    public STATUS_POC getStATUS_POC() {
        return this.stATUS_POC;
    }

    /**
    * Define stATUS_POC
    * @param stATUS_POC stATUS_POC
    * @generated
    */
    public POC setStATUS_POC(STATUS_POC stATUS_POC) {
        this.stATUS_POC = stATUS_POC;
        return this;
    }
    /**
    * Obtém tiPO_CLIENTE_POC
    * return tiPO_CLIENTE_POC
    * @generated
    */
    public TIPO_CLIENTE_POC getTiPO_CLIENTE_POC() {
        return this.tiPO_CLIENTE_POC;
    }

    /**
    * Define tiPO_CLIENTE_POC
    * @param tiPO_CLIENTE_POC tiPO_CLIENTE_POC
    * @generated
    */
    public POC setTiPO_CLIENTE_POC(TIPO_CLIENTE_POC tiPO_CLIENTE_POC) {
        this.tiPO_CLIENTE_POC = tiPO_CLIENTE_POC;
        return this;
    }
    /**
    * Obtém taMANHO_CLIENTE_POC
    * return taMANHO_CLIENTE_POC
    * @generated
    */
    public TAMANHO_CLIENTE_POC getTaMANHO_CLIENTE_POC() {
        return this.taMANHO_CLIENTE_POC;
    }

    /**
    * Define taMANHO_CLIENTE_POC
    * @param taMANHO_CLIENTE_POC taMANHO_CLIENTE_POC
    * @generated
    */
    public POC setTaMANHO_CLIENTE_POC(TAMANHO_CLIENTE_POC taMANHO_CLIENTE_POC) {
        this.taMANHO_CLIENTE_POC = taMANHO_CLIENTE_POC;
        return this;
    }
    /**
    * Obtém niVEL_PRIORIDADE
    * return niVEL_PRIORIDADE
    * @generated
    */
    public NIVEL_PRIORIDADE getNiVEL_PRIORIDADE() {
        return this.niVEL_PRIORIDADE;
    }

    /**
    * Define niVEL_PRIORIDADE
    * @param niVEL_PRIORIDADE niVEL_PRIORIDADE
    * @generated
    */
    public POC setNiVEL_PRIORIDADE(NIVEL_PRIORIDADE niVEL_PRIORIDADE) {
        this.niVEL_PRIORIDADE = niVEL_PRIORIDADE;
        return this;
    }
    /**
    * Obtém estrategico
    * return estrategico
    * @generated
    */
    public java.lang.Boolean getEstrategico() {
        return this.estrategico;
    }

    /**
    * Define estrategico
    * @param estrategico estrategico
    * @generated
    */
    public POC setEstrategico(java.lang.Boolean estrategico) {
        this.estrategico = estrategico;
        return this;
    }
    /**
    * Obtém horas_gastas_totais
    * return horas_gastas_totais
    * @generated
    */
    public java.util.Date getHoras_gastas_totais() {
        return this.horas_gastas_totais;
    }

    /**
    * Define horas_gastas_totais
    * @param horas_gastas_totais horas_gastas_totais
    * @generated
    */
    public POC setHoras_gastas_totais(java.util.Date horas_gastas_totais) {
        this.horas_gastas_totais = horas_gastas_totais;
        return this;
    }
    /**
    * Obtém descricao_escopo
    * return descricao_escopo
    * @generated
    */
    public java.lang.String getDescricao_escopo() {
        return this.descricao_escopo;
    }

    /**
    * Define descricao_escopo
    * @param descricao_escopo descricao_escopo
    * @generated
    */
    public POC setDescricao_escopo(java.lang.String descricao_escopo) {
        this.descricao_escopo = descricao_escopo;
        return this;
    }
    /**
    * Obtém responsavel_comercial
    * return responsavel_comercial
    * @generated
    */
    public User getResponsavel_comercial() {
        return this.responsavel_comercial;
    }

    /**
    * Define responsavel_comercial
    * @param responsavel_comercial responsavel_comercial
    * @generated
    */
    public POC setResponsavel_comercial(User responsavel_comercial) {
        this.responsavel_comercial = responsavel_comercial;
        return this;
    }
    /**
    * Obtém responsavel_tecnico
    * return responsavel_tecnico
    * @generated
    */
    public User getResponsavel_tecnico() {
        return this.responsavel_tecnico;
    }

    /**
    * Define responsavel_tecnico
    * @param responsavel_tecnico responsavel_tecnico
    * @generated
    */
    public POC setResponsavel_tecnico(User responsavel_tecnico) {
        this.responsavel_tecnico = responsavel_tecnico;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
POC object = (POC)obj;
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