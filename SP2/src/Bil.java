public abstract class Bil
{
    public int regNr;
    public int mærke;
    public int model;
    public int årgang;
    public int antalDøre;


    public Bil(int regNr, int mærke, int model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public int getMærke() {
        return mærke;
    }

    public void setMærke(int mærke) {
        this.mærke = mærke;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public abstract double beregnGrønEjerafgift();


}




