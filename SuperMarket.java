public class SuperMarket {
       static String[] iceCreams = { "Vanilla", "Chocolate", "Strawberry", "Butterscotch", "Mango","Black Currant", "Choco Chip", "Pista", "Kulfi", "Caramel" };






       static  String[] perfumes = { "Dior", "Chanel", "Gucci", "Armani", "Calvin Klein","Hugo Boss", "Versace", "Burberry", "Tom Ford", "Dolce & Gabbana"};

       static  String[] groceries = { "Rice", "Wheat", "Sugar", "Salt", "Lentils","Oil", "Spices", "Tea", "Coffee", "Flour"};

       static   String[] cosmetics = { "Lipstick", "Foundation", "Eyeliner", "Mascara", "Blush","Compact Powder", "Concealer", "Nail Polish", "Moisturizer", "Cleanser" };
        
		public static void main(String[] SuperMarket) {																																								
        System.out.println("The number of ice cream  are: " + iceCreams.length);
        // System.out.println("The ice cream  are: " + iceCreams[0] + ", " + iceCreams[1] + ", " +iceCreams[2] + ", " + iceCreams[3] + ", " + iceCreams[4] + ", " + iceCreams[5] + ", " + iceCreams[6] + ", " + iceCreams[7] + ", " +iceCreams[8] + ", " + iceCreams[9]);
        System.out.println("The number of perfumes are: " + perfumes.length);
        //System.out.println("The perfumes are: " + perfumes[0] + ", " + perfumes[1] + ", " + perfumes[2] + ", " + perfumes[3] + ", " + perfumes[4] + ", " + perfumes[5] + ", " + perfumes[6] + ", " + perfumes[7] + ", " + perfumes[8] + ", " + perfumes[9]);
        System.out.println("The number of grocery items are: " + groceries.length);
        //System.out.println("The grocery items are: " + groceries[0] + ", " + groceries[1] + ", " +  groceries[2] + ", " + groceries[3] + ", " + groceries[4] + ", " +groceries[5] + ", " + groceries[6] + ", " + groceries[7] + ", " + groceries[8] + ", " + groceries[9]);
        System.out.println("The number of cosmetic items are: " + cosmetics.length);
        //System.out.println("The cosmetic items are: " + cosmetics[0] + ", " + cosmetics[1] + ", " +cosmetics[2] + ", " + cosmetics[3] + ", " + cosmetics[4] + ", " + cosmetics[5] + ", " + cosmetics[6] + ", " + cosmetics[7] + ", " +cosmetics[8] + ", " + cosmetics[9]);
        for (String iceCreams : iceCreams) {
		System.out.println(iceCreams);
		}
			for (String perfume : perfumes) {
            System.out.println(perfume);
			}
			for (String item : groceries) {
            System.out.println(item);
			}
			for (String item : cosmetics) {
            System.out.println(item);
			
        }
																		
		
    }
	
		}
      