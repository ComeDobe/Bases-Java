package Heritage.Articles;

public class Livre extends Articles {
    private String ISBN;
    private int pages;
    private String auteur;

    public Livre(String reference, String designation, int prix, String iSBN, int pages, String auteur) {
        super(reference, designation, prix);
        this.ISBN = iSBN;
        this.pages = pages;
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre (ISBN=" + ISBN + ", pages=" + pages + ", auteur=" + auteur + ")";
    }
}
