public class DrinkName {
    public static void main(String[] args) {

        Drink bloodyMarry = new Drink();
        bloodyMarry.name = "Bloody Marry";
        bloodyMarry.price = 19;
        bloodyMarry.isAlcoholic = true;
        Ingredients marryIngredients = new Ingredients();
        marryIngredients.name1 = "Sok pomidorowy";
        marryIngredients.name2 = "Wódka";
        marryIngredients.name3 = "Oliwka";

        String bloodymarryInfo = "Nazwa: " + bloodyMarry.name + " " + "Cena: " + bloodyMarry.price + "zł " + " Alkohol: " + bloodyMarry.isAlcoholic
                + " " + "Składniki: " + marryIngredients.name1 + ", " + marryIngredients.name2 + ", "  + marryIngredients.name3;

        Drink soberAlcoholic = new Drink();
        soberAlcoholic.name = "Sober Alcoholic";
        soberAlcoholic.price = 12;
        soberAlcoholic.isAlcoholic = false;
        Ingredients soberAlcoholicIngredients = new Ingredients();
        soberAlcoholicIngredients.name1 = "Woda";
        soberAlcoholicIngredients.name3 = "Cytryna";
        soberAlcoholicIngredients.name3 = "Tonik";

        Drink mojito = new Drink();
        mojito.name = "Mojito";
        mojito.price = 19;
        mojito.isAlcoholic = true;
        Ingredients mojitoIngredients = new Ingredients();
        mojitoIngredients.name1 = "Rum";
        mojitoIngredients.name2 = "Limonka";
        mojitoIngredients.name3 = "Mięta";

        System.out.println(bloodymarryInfo);









    }
}
