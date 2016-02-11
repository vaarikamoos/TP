package mudelid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by yogi on 11.02.2016.
 */
//tabeli nimi
@Table(name = "TeeProov")
public class TeeProov extends Model{

    // see on teise andmebaasitabeli ID
    @Column(name = "prooviSeosObjektiga")
    public TeeObjekt prooviSeosObjektiga;

    @Column(name = "protNrKp")
    public int protNrKp;

    @Column(name = "protJrkNr")
    public int protJrkNr;

    @Column(name = "prooviVotuKoht")
    public String prooviVotuKoht;

    @Column(name = "materjaliNimetus")
    public String materjaliNimetus;

    public TeeProov() {
        // siin on oluline see super välja kutsuda
        super();
    }

    public TeeProov(TeeObjekt prooviSeosObjektiga, int protNrKp, int protJrkNr, String prooviVotuKoht, String materjaliNimetus) {
        // siin on oluline see super välja kutsuda
        super();

        this.prooviSeosObjektiga = prooviSeosObjektiga;
        this.protNrKp = protNrKp;
        this.protJrkNr = protJrkNr;
        this.prooviVotuKoht = prooviVotuKoht;
        this.materjaliNimetus = materjaliNimetus;
    }
}
