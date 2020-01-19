public class DrinkName {
    public static void main(String[] args) {

        Drink bloodyMarry = new Drink();
        bloodyMarry.name = "Bloody Marry";
        bloodyMarry.price = 19;
        bloodyMarry.isAlcoholic = true;
        bloodyMarry.ingredient1 = "Sok pomidorowy";
        bloodyMarry.ingredient2 = "Wódka";
        bloodyMarry.ingredient3 = "Woda";
        Ingredients bloodyMarryQuantity = new Ingredients();
        bloodyMarryQuantity.quantity1 = 125;
        bloodyMarryQuantity.quantity2 = 75;
        bloodyMarryQuantity.quantity3 = 20;

        String bloodymarryInfo = "Nazwa: " + bloodyMarry.name + ", " + "Cena: " + bloodyMarry.price + "zł " + ", " + " Alkohol: " + bloodyMarry.isAlcoholic +
                ", " + "Składniki: " + bloodyMarry.ingredient1 + ", " + bloodyMarry.ingredient2 + ", " + bloodyMarry.ingredient3;

        System.out.println(bloodymarryInfo);
        String quantityBloodyMarry = "Pojemność to: " + (bloodyMarryQuantity.quantity1 + bloodyMarryQuantity.quantity2 + bloodyMarryQuantity.quantity3) + " ml ";
        System.out.println(quantityBloodyMarry);


    }
}
