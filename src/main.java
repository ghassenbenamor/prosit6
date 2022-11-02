
public class main {
    public static void main(String[] args) throws MagasinPleinExeception, PrixNegatifException {
        produit p1 = new produit(1021,"lait","delice",1.3);
        produit p2 = new produit(456,"harissa","sicam",2.8);
        produit p3 = new produit(100,"cake","moulin d'or",0.5);
        magasin m1 = new magasin(1, "Carrefour", "rades");
        m1.addProduct(p1);
        m1.addProductUsingPException(p3);
        m1.showMagasin();

    }
}
