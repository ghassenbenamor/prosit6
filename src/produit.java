public class produit {
    protected int id;
    protected double prix;
    protected String label;
    protected String marque;
    protected String type;
    protected double quantite ;
    protected String saison;



    public produit(){
    }
    public produit(int id, String label, String marque) {
        this.id=id;
        this.label=label;
        this.marque=marque;
    }
    public produit(int id, String label, String marque, double prix) {
        this.id=id;
        this.label=label;
        this.marque=marque;
        this.prix=prix;
    }

    // getters

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // methods

    public void afficherProduit() {
        System.out.println(this.toString());
    }

    public  boolean compareOne(produit p1) {
        boolean compare = false;
        if (p1.getId() == this.getId() && p1.getLabel() == this.getLabel() && p1.getPrix() == this.getPrix())
            compare = true;
        System.out.println(compare);
        return compare;
    }

    public static boolean compareTwo(produit p1, produit p2) {
        boolean compare = false;
        if (p1.getId() == p2.getId() && p1.getLabel() == p2.getLabel() && p1.getPrix() == p2.getPrix())
            compare = true;
        System.out.println(compare);
        return compare;
    }

    public String determinerTypeProduit() {
        System.out.println("autre");
        return "autre";
    }



    @Override
    public String  toString() {
        return ("produit =  { " + "" + id + "," + label +"," + marque + ","+ prix + " }" );
    }
}
