package id.go.customs.simaudiapi.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-01T14:54:10")
@StaticMetamodel(TdSt.class)
public class TdSt_ { 

    public static volatile SingularAttribute<TdSt, BigInteger> idNpa;
    public static volatile SingularAttribute<TdSt, Date> tanggalSt;
    public static volatile SingularAttribute<TdSt, Date> periodeAwal;
    public static volatile SingularAttribute<TdSt, Date> periodeAkhir;
    public static volatile SingularAttribute<TdSt, String> nomorSt;
    public static volatile SingularAttribute<TdSt, BigDecimal> idSt;
    public static volatile SingularAttribute<TdSt, BigInteger> kodeJenisSt;

}