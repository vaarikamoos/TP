package mudelid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by yogi on 10.02.2016.
 */

//tabeli nimi
@Table(name = "TeeObjekt")
public class TeeObjekt extends Model {

    // ActiveAndroid teeb id välja ise

    @Column(name = "objNimetus")
    public String objNimetus;

    @Column(name = "teeNimetus")
    public String teeNimetus;

    @Column(name = "teeNr")
    public int teeNr;

    @Column(name = "algusKm")
    public int algusKm;

    @Column(name = "loppKm")
    public int loppKm;

    public TeeObjekt() {
        // siin on oluline see super välja kutsuda
        super();
    }

    public TeeObjekt(String objNimetus, String teeNimetus, int teeNr, int algusKm, int loppKm) {
        super();
        this.objNimetus = objNimetus;
        this.teeNimetus = teeNimetus;
        this.teeNr = teeNr;
        this.algusKm = algusKm;
        this.loppKm = loppKm;

    }
}
