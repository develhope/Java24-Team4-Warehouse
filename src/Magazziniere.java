public class Magazziniere extends Utente {
    private String badge;
    public Magazziniere(int id, String nome, String cognome, String badge) {
        super(id, nome, cognome);
        this.badge = badge;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }
}
