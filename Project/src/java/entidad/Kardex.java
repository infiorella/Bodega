/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import negocio.Articulo;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "KARDEX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kardex.findAll", query = "SELECT k FROM Kardex k")
    , @NamedQuery(name = "Kardex.findByNum", query = "SELECT k FROM Kardex k WHERE k.num = :num")
    , @NamedQuery(name = "Kardex.findByFec", query = "SELECT k FROM Kardex k WHERE k.fec = :fec")
    , @NamedQuery(name = "Kardex.findByDoc", query = "SELECT k FROM Kardex k WHERE k.doc = :doc")
    , @NamedQuery(name = "Kardex.findByOpe", query = "SELECT k FROM Kardex k WHERE k.ope = :ope")
    , @NamedQuery(name = "Kardex.findByIng", query = "SELECT k FROM Kardex k WHERE k.ing = :ing")
    , @NamedQuery(name = "Kardex.findBySal", query = "SELECT k FROM Kardex k WHERE k.sal = :sal")
    , @NamedQuery(name = "Kardex.findBySto", query = "SELECT k FROM Kardex k WHERE k.sto = :sto")})
public class Kardex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUM")
    private String num;
    @Basic(optional = false)
    @Column(name = "FEC")
    private String fec;
    @Basic(optional = false)
    @Column(name = "DOC")
    private String doc;
    @Basic(optional = false)
    @Column(name = "OPE")
    private String ope;
    @Basic(optional = false)
    @Column(name = "ING")
    private int ing;
    @Basic(optional = false)
    @Column(name = "SAL")
    private int sal;
    @Basic(optional = false)
    @Column(name = "STO")
    private int sto;
    @JoinColumn(name = "COD", referencedColumnName = "COD")
    @ManyToOne(optional = false)
    private Articulo cod;

    public Kardex() {
    }

    public Kardex(String num) {
        this.num = num;
    }

    public Kardex(String num, String fec, String doc, String ope, int ing, int sal, int sto) {
        this.num = num;
        this.fec = fec;
        this.doc = doc;
        this.ope = ope;
        this.ing = ing;
        this.sal = sal;
        this.sto = sto;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getOpe() {
        return ope;
    }

    public void setOpe(String ope) {
        this.ope = ope;
    }

    public int getIng() {
        return ing;
    }

    public void setIng(int ing) {
        this.ing = ing;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getSto() {
        return sto;
    }

    public void setSto(int sto) {
        this.sto = sto;
    }

    public Articulo getCod() {
        return cod;
    }

    public void setCod(Articulo cod) {
        this.cod = cod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (num != null ? num.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kardex)) {
            return false;
        }
        Kardex other = (Kardex) object;
        if ((this.num == null && other.num != null) || (this.num != null && !this.num.equals(other.num))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Kardex[ num=" + num + " ]";
    }
    
}
