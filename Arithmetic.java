//Ethan Depoti, etd428@lehigh.edu
//CSE7 Lab01

//This java class
class Arithmetic

{
    //Main methodl
    public static void main(String[] args){
        
        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;

        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;

        //Number of belts
        int numBelts = 1;
        //cost per box of belts
        double beltCost = 33.99;

        //the tax rate converted to decimal form
        double paSalesTax = 0.06;

        //open variables to hold total cost for  each item
        double totalCostOfPants, totalCostOfSweatshirts, totalCostOfBelts;

        //Open variables that will hold the amount of sales tax on each purchase
        double totalSalesTaxPants, totalSalesTaxSweatshirts, totalSalesTaxBelts;

        //Total cost for pants without sales taxes
        totalCostOfPants = (double) numPants * pantsPrice;
        //formula that finds total cost with sales tax for pants
        totalSalesTaxPants = (totalCostOfPants * (paSalesTax)) * 100;
        //Rounding the total to the hundredth place
        int convertedSalesTaxPants =  (int) totalSalesTaxPants;
        //New variable that stores takes the integer version, divides it by 100 to set the proper amount, and rounds to the second decimal 
        double roundedSalesTaxPants = convertedSalesTaxPants / 100.0;
        //Total cost on Pants along with the sales tax charged when buying pants
        System.out.println("The total cost of pants is " + totalCostOfPants + " and has a sales tax of " + roundedSalesTaxPants);

        //Total cost for sweatshirts without sales taxes
        totalCostOfSweatshirts = (double) numShirts * shirtPrice;
        //formula that finds total cost with sales tax sweatshirts
        totalSalesTaxSweatshirts = (totalCostOfSweatshirts * (paSalesTax)) * 100;
        //Rounding the total to the hundredth place
        int convertedSalesTaxSweatshirts =  (int) totalSalesTaxSweatshirts;
        //New variable that stores takes the integer version, divides it by 100 to set the proper amount, and rounds to the second decimal 
        double roundedSalesTaxSweatshirts = convertedSalesTaxSweatshirts / 100.0;
        //Total cost on sweatshirts along with the sales tax charged when buying sweatshirts
        System.out.println("The total cost of sweatshirts is " + totalCostOfSweatshirts + " and has a sales tax of " + roundedSalesTaxSweatshirts);

        //Total cost for belt(s) without sales taxes
        totalCostOfBelts = (double) numBelts * beltCost;
        //formula that finds sales tax belt(s)
        totalSalesTaxBelts = (totalCostOfBelts * (paSalesTax)) * 100;
        //Rounding the total to the hundredth place
        int convertedSalesTaxBelts =  (int) totalSalesTaxBelts;
        //New variable that stores takes the integer version, divides it by 100 to set the proper amount, and rounds to the second decimal 
        double roundedSalesTaxBelts = convertedSalesTaxBelts / 100.0;
        //Total cost on belts along with the sales tax charged when buying belt(s)
        System.out.println("The total cost of a belt is " + totalCostOfBelts + " and has a sales tax of " + roundedSalesTaxBelts);
        
        //Total cost of purchases before tax
        double totalCostNoTax = totalCostOfBelts + totalCostOfPants + totalCostOfSweatshirts;
        System.out.println("The total cost of the purchases without sales tax is " + totalCostNoTax);

        //Total cost of sales tax from all purchases
        double totalCostSalesTax = roundedSalesTaxBelts + roundedSalesTaxPants + roundedSalesTaxSweatshirts;
        System.out.println("The total cost of sales tax for all purchases is " + totalCostSalesTax);

        //Total cost of purchases including sales tax
        double totalCost = totalCostNoTax + totalCostSalesTax;
        System.out.println("The total paid for the transaction, including sales tax, is " + totalCost);
    }
}