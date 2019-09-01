/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.customs.simaudiapi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "TD_ST")
public class TdSt implements Serializable {

    @Id
    private BigDecimal idSt;
    private BigInteger idNpa;
    private BigInteger kodeJenisSt;
    private String nomorSt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalSt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodeAwal;
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodeAkhir;
    
}
