/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.beacukai.SimaudiApi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "TD_USULAN_HEADER")
@XmlRootElement
public class TdUsulanHeader implements Serializable {
    @Id
    private BigDecimal idUsulanHdr;
    private String kodeKantorAsal;
    private String kodeKantorTujuan;
    private String nomorDokumen;
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalDokumen;
    private String perihal;
    
}
