public class DrinkName {
    public static void main(String[] args) {

        Drink bloodyMarry = new Drink();
        bloodyMarry.name = "Bloody Marry";
        bloodyMarry.price = 19;
        bloodyMarry.isAlcoholic = true;
        Ingredient bloodyMarryJuice = new Ingredient();
        bloodyMarryJuice.name = "Sok pomidorowy";
        Ingredient bloodyMarryWater = new Ingredient();
        bloodyMarryWater.name = "Woda";
        Ingredient bloodyMarryVodka = new Ingredient();
        bloodyMarryVodka.name = "Wódka";


        Ingredient bloodyMarryQuantity = new Ingredient();
        bloodyMarryJuice.quantity = 125;
        bloodyMarryWater.quantity = 20;
        bloodyMarryVodka.quantity = 75;

        String bloodymarryInfo = "Nazwa: " + bloodyMarry.name + ", " + "Cena: " + bloodyMarry.price + "zł " + ", " + " Alkohol: " + bloodyMarry.isAlcoholic +
                ", " + "Składniki: " + bloodyMarryJuice.name + ", " + bloodyMarryWater.name + ", " + bloodyMarryVodka.name;

        System.out.println(bloodymarryInfo);
        String quantityBloodyMarry = "Pojemność to: " + (bloodyMarryJuice.quantity + bloodyMarryWater.quantity + bloodyMarryVodka.quantity) + " ml ";
        System.out.println(quantityBloodyMarry);


    }
}
