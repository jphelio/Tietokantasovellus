package data;

/**
 *
 * @author 
 */
public class Tuote {
    private int tuoteNro;
    private String nimi;
    private int hinta;
    private String kuvaus;
    

    public Tuote(int tuoteNro, String nimi, int hinta, String kuvaus) {
        this.tuoteNro = tuoteNro;
        this.nimi = nimi;
        this.hinta = hinta;
        this.kuvaus = kuvaus;
    }

    public int getHinta() {
        return hinta;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public String getNimi() {
        return nimi;
    }

    public int getTuoteNro() {
        return tuoteNro;
    }

    @Override
    public String toString() {
        return "Tuote{" + "tuoteNro=" + tuoteNro + ", nimi=" + nimi + ", hinta=" + hinta + ", kuvaus=" + kuvaus + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tuote other = (Tuote) obj;
        if (this.tuoteNro != other.tuoteNro) {
            return false;
        }
        if ((this.nimi == null) ? (other.nimi != null) : !this.nimi.equals(other.nimi)) {
            return false;
        }
        if (this.hinta != other.hinta) {
            return false;
        }
        if ((this.kuvaus == null) ? (other.kuvaus != null) : !this.kuvaus.equals(other.kuvaus)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.tuoteNro;
        hash = 53 * hash + (this.nimi != null ? this.nimi.hashCode() : 0);
        hash = 53 * hash + this.hinta;
        hash = 53 * hash + (this.kuvaus != null ? this.kuvaus.hashCode() : 0);
        return hash;
    }
    
}
