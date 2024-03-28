import java.util.HashMap;
import java.util.Map;

public abstract class Utente {
    private int id;
    private String nome;
    private String cognome;
    private Map<Integer, Boolean> carrello; // Mappa che tiene traccia degli elementi nel carrello

    public Utente(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.carrello = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    // Metodo per aggiungere un elemento al carrello tramite IDProdotto
    public void aggiungiAlCarrello(int id) {
        carrello.put(id, true);
    }

    // Metodo per rimuovere un elemento dal carrello tramite IDProdotto
    public void rimuoviDalCarrello(int id) {
        carrello.remove(id);
    }

    // Metodo per finalizzare l'operazione di vendita
    public void finalizzaVendita(Magazzino magazzino) {
        for (int id : carrello.keySet()) {
            magazzino.rimuoviProdotto(id); // Rimuove dal magazzino
        }
        carrello.clear(); // Svuota il carrello
    }
}
