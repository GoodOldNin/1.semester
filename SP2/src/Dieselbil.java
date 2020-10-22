class Dieselbil extends Bil
{
    public boolean harPartikelFilter;
    public int kmPrL;

    public Dieselbil(int regNr, int mærke, int model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public boolean getHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter)
    {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "regNr=" + regNr +
                ", mærke=" + mærke +
                ", model=" + model +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", harPartikelFilter=" + harPartikelFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        return 0;
    }
}