package id.go.customs.simaudiapi.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-01T14:54:10")
@StaticMetamodel(TdUsulanHeader.class)
public class TdUsulanHeader_ { 

    public static volatile SingularAttribute<TdUsulanHeader, String> nomorDokumen;
    public static volatile SingularAttribute<TdUsulanHeader, BigDecimal> idUsulanHdr;
    public static volatile SingularAttribute<TdUsulanHeader, Date> tanggalDokumen;
    public static volatile SingularAttribute<TdUsulanHeader, String> kodeKantorTujuan;
    public static volatile SingularAttribute<TdUsulanHeader, String> kodeKantorAsal;
    public static volatile SingularAttribute<TdUsulanHeader, String> perihal;

}