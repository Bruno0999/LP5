package bean;
// Generated 18/09/2023 08:19:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BcmFornecedores generated by hbm2java
 */
@Entity
@Table(name="bcm_fornecedores"
    ,catalog="db_bruno_monteiro"
)
public class BcmFornecedores  implements java.io.Serializable {


     private int idbcmFornecedores;
     private String bcmNome;
     private String bcmCnpj;
     private String bcmEmail;
     private String bcmTelefone;
     private String bcmEndereco;
     private String bcmRepresentante;
     private Set bcmComprases = new HashSet(0);

    public BcmFornecedores() {
    }

	
    public BcmFornecedores(int idbcmFornecedores, String bcmNome, String bcmCnpj, String bcmEmail, String bcmTelefone, String bcmEndereco, String bcmRepresentante) {
        this.idbcmFornecedores = idbcmFornecedores;
        this.bcmNome = bcmNome;
        this.bcmCnpj = bcmCnpj;
        this.bcmEmail = bcmEmail;
        this.bcmTelefone = bcmTelefone;
        this.bcmEndereco = bcmEndereco;
        this.bcmRepresentante = bcmRepresentante;
    }
    public BcmFornecedores(int idbcmFornecedores, String bcmNome, String bcmCnpj, String bcmEmail, String bcmTelefone, String bcmEndereco, String bcmRepresentante, Set bcmComprases) {
       this.idbcmFornecedores = idbcmFornecedores;
       this.bcmNome = bcmNome;
       this.bcmCnpj = bcmCnpj;
       this.bcmEmail = bcmEmail;
       this.bcmTelefone = bcmTelefone;
       this.bcmEndereco = bcmEndereco;
       this.bcmRepresentante = bcmRepresentante;
       this.bcmComprases = bcmComprases;
    }
   
     @Id 

    
    @Column(name="idbcm_fornecedores", unique=true, nullable=false)
    public int getIdbcmFornecedores() {
        return this.idbcmFornecedores;
    }
    
    public void setIdbcmFornecedores(int idbcmFornecedores) {
        this.idbcmFornecedores = idbcmFornecedores;
    }

    
    @Column(name="bcm_Nome", nullable=false, length=50)
    public String getBcmNome() {
        return this.bcmNome;
    }
    
    public void setBcmNome(String bcmNome) {
        this.bcmNome = bcmNome;
    }

    
    @Column(name="bcm_CNPJ", nullable=false, length=18)
    public String getBcmCnpj() {
        return this.bcmCnpj;
    }
    
    public void setBcmCnpj(String bcmCnpj) {
        this.bcmCnpj = bcmCnpj;
    }

    
    @Column(name="bcm_Email", nullable=false, length=100)
    public String getBcmEmail() {
        return this.bcmEmail;
    }
    
    public void setBcmEmail(String bcmEmail) {
        this.bcmEmail = bcmEmail;
    }

    
    @Column(name="bcm_Telefone", nullable=false, length=20)
    public String getBcmTelefone() {
        return this.bcmTelefone;
    }
    
    public void setBcmTelefone(String bcmTelefone) {
        this.bcmTelefone = bcmTelefone;
    }

    
    @Column(name="bcm_Endereco", nullable=false, length=100)
    public String getBcmEndereco() {
        return this.bcmEndereco;
    }
    
    public void setBcmEndereco(String bcmEndereco) {
        this.bcmEndereco = bcmEndereco;
    }

    
    @Column(name="bcm_Representante", nullable=false, length=50)
    public String getBcmRepresentante() {
        return this.bcmRepresentante;
    }
    
    public void setBcmRepresentante(String bcmRepresentante) {
        this.bcmRepresentante = bcmRepresentante;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bcmFornecedores")
    public Set getBcmComprases() {
        return this.bcmComprases;
    }
    
    public void setBcmComprases(Set bcmComprases) {
        this.bcmComprases = bcmComprases;
    }




}

