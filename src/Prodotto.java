public class Prodotto {

    private TipoDiProdotto tipologiaProdotto;
    private String produttore;
    private String modello;
    private String descrizione;
    private double dimensioneDisplay;
    private double dimensioneSpazio;
    private double prezzoDacquisto;
    private double prezzoVendita;
    private int id;

    public Prodotto(
            TipoDiProdotto tipologiaProdotto,
            String produttore,
            String modello,
            String descrizione,
            double dimensioneDisplay,
            double dimensioneSpazio,
            double prezzoDacquisto,
            double prezzoVendita,
            int id
           )
    {
        this.tipologiaProdotto = tipologiaProdotto;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizione = descrizione;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazio = dimensioneSpazio;
        this.prezzoDacquisto = prezzoDacquisto;
        this.prezzoVendita = prezzoVendita;
        this.id = id;
    }

    public TipoDiProdotto getTipologiaProdotto() {
        return tipologiaProdotto;
    }

    public void setTipologiaProdotto(TipoDiProdotto tipologiaProdotto) {
        this.tipologiaProdotto = tipologiaProdotto;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(double dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public double getDimensioneSpazio() {
        return dimensioneSpazio;
    }

    public void setDimensioneSpazio(double dimensioneSpazio) {
        this.dimensioneSpazio = dimensioneSpazio;
    }

    public double getPrezzoDacquisto() {
        return prezzoDacquisto;
    }

    public void setPrezzoDacquisto(double prezzoDacquisto) {
        this.prezzoDacquisto = prezzoDacquisto;
    }

    public double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "tipologiaProdotto=" + tipologiaProdotto +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dimensioneDisplay=" + dimensioneDisplay +
                ", dimensioneSpazio=" + dimensioneSpazio +
                ", prezzoDacquisto=" + prezzoDacquisto +
                ", prezzoVendita=" + prezzoVendita +
                ", id=" + id +
                '}';
    }
}
