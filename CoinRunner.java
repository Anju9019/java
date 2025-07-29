class CoinRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Coin coin = new Coin(1, "One Rupee Coin", "India", 1.00, "Steel", 2010, false);
        /*
        coin.coinId = 1;
        coin.name = "One Rupee Coin";
        coin.country = "India";
        coin.value = 1.00;
        coin.material = "Steel";
        coin.year = 2010;
        coin.isRare = false;
        */

        Coin coin1 = new Coin(2, "Two Rupee Coin", "India", 2.00, "Nickel Brass", 2005, false);
        /*
        coin1.coinId = 2;
        coin1.name = "Two Rupee Coin";
        coin1.country = "India";
        coin1.value = 2.00;
        coin1.material = "Nickel Brass";
        coin1.year = 2005;
        coin1.isRare = false;
        */

        Coin coin2 = new Coin(3, "Five Rupee Coin", "India", 5.00, "Copper Nickel", 1998, true);
        /*
        coin2.coinId = 3;
        coin2.name = "Five Rupee Coin";
        coin2.country = "India";
        coin2.value = 5.00;
        coin2.material = "Copper Nickel";
        coin2.year = 1998;
        coin2.isRare = true;
        */

        Coin coin3 = new Coin(4, "Ten Rupee Coin", "India", 10.00, "Bimetallic", 2020, false);
        /*
        coin3.coinId = 4;
        coin3.name = "Ten Rupee Coin";
        coin3.country = "India";
        coin3.value = 10.00;
        coin3.material = "Bimetallic";
        coin3.year = 2020;
        coin3.isRare = false;
        */

        Coin coin4 = new Coin(5, "Quarter Dollar", "USA", 0.25, "Copper Nickel", 1970, true);
        /*
        coin4.coinId = 5;
        coin4.name = "Quarter Dollar";
        coin4.country = "USA";
        coin4.value = 0.25;
        coin4.material = "Copper Nickel";
        coin4.year = 1970;
        coin4.isRare = true;
        */

        Coin coin5 = new Coin(6, "Half Dollar", "USA", 0.50, "Silver", 1965, true);
        /*
        coin5.coinId = 6;
        coin5.name = "Half Dollar";
        coin5.country = "USA";
        coin5.value = 0.50;
        coin5.material = "Silver";
        coin5.year = 1965;
        coin5.isRare = true;
        */

        Coin coin6 = new Coin(7, "One Cent", "USA", 0.01, "Copper", 1980, false);
        /*
        coin6.coinId = 7;
        coin6.name = "One Cent";
        coin6.country = "USA";
        coin6.value = 0.01;
        coin6.material = "Copper";
        coin6.year = 1980;
        coin6.isRare = false;
        */

        Coin coin7 = new Coin(8, "One Pound", "UK", 1.00, "Nickel Brass", 2015, false);
        /*
        coin7.coinId = 8;
        coin7.name = "One Pound";
        coin7.country = "UK";
        coin7.value = 1.00;
        coin7.material = "Nickel Brass";
        coin7.year = 2015;
        coin7.isRare = false;
        */

        Coin coin8 = new Coin(9, "Two Pound", "UK", 2.00, "Bimetallic", 2012, false);
        /*
        coin8.coinId = 9;
        coin8.name = "Two Pound";
        coin8.country = "UK";
        coin8.value = 2.00;
        coin8.material = "Bimetallic";
        coin8.year = 2012;
        coin8.isRare = false;
        */

        Coin coin9 = new Coin(10, "Euro Cent", "EU", 0.10, "Copper", 2002, false);
        /*
        coin9.coinId = 10;
        coin9.name = "Euro Cent";
        coin9.country = "EU";
        coin9.value = 0.10;
        coin9.material = "Copper";
        coin9.year = 2002;
        coin9.isRare = false;
        */

        Coin coin10 = new Coin(11, "One Euro", "EU", 1.00, "Bimetallic", 2005, false);
        /*
        coin10.coinId = 11;
        coin10.name = "One Euro";
        coin10.country = "EU";
        coin10.value = 1.00;
        coin10.material = "Bimetallic";
        coin10.year = 2005;
        coin10.isRare = false;
        */

        Coin coin11 = new Coin(12, "Two Euro", "EU", 2.00, "Bimetallic", 2010, false);
        /*
        coin11.coinId = 12;
        coin11.name = "Two Euro";
        coin11.country = "EU";
        coin11.value = 2.00;
        coin11.material = "Bimetallic";
        coin11.year = 2010;
        coin11.isRare = false;
        */

        Coin coin12 = new Coin(13, "Five Yen", "Japan", 5.00, "Brass", 1995, false);
        /*
        coin12.coinId = 13;
        coin12.name = "Five Yen";
        coin12.country = "Japan";
        coin12.value = 5.00;
        coin12.material = "Brass";
        coin12.year = 1995;
        coin12.isRare = false;
        */

        Coin coin13 = new Coin(14, "Fifty Yen", "Japan", 50.00, "Copper Nickel", 2000, false);
        /*
        coin13.coinId = 14;
        coin13.name = "Fifty Yen";
        coin13.country = "Japan";
        coin13.value = 50.00;
        coin13.material = "Copper Nickel";
        coin13.year = 2000;
        coin13.isRare = false;
        */

        Coin coin14 = new Coin(15, "Hundred Yen", "Japan", 100.00, "Copper Nickel", 1988, true);
        /*
        coin14.coinId = 15;
        coin14.name = "Hundred Yen";
        coin14.country = "Japan";
        coin14.value = 100.00;
        coin14.material = "Copper Nickel";
        coin14.year = 1988;
        coin14.isRare = true;
        */

        Coin coin15 = new Coin(16, "Five Francs", "France", 5.00, "Nickel", 1975, true);
        /*
        coin15.coinId = 16;
        coin15.name = "Five Francs";
        coin15.country = "France";
        coin15.value = 5.00;
        coin15.material = "Nickel";
        coin15.year = 1975;
        coin15.isRare = true;
        */

        Coin coin16 = new Coin(17, "Ten Francs", "France", 10.00, "Bimetallic", 1987, true);
        /*
        coin16.coinId = 17;
        coin16.name = "Ten Francs";
        coin16.country = "France";
        coin16.value = 10.00;
        coin16.material = "Bimetallic";
        coin16.year = 1987;
        coin16.isRare = true;
        */

        Coin coin17 = new Coin(18, "One Peso", "Mexico", 1.00, "Nickel", 2000, false);
        /*
        coin17.coinId = 18;
        coin17.name = "One Peso";
        coin17.country = "Mexico";
        coin17.value = 1.00;
        coin17.material = "Nickel";
        coin17.year = 2000;
        coin17.isRare = false;
        */

        Coin coin18 = new Coin(19, "Five Peso", "Mexico", 5.00, "Bimetallic", 2015, false);
        /*
        coin18.coinId = 19;
        coin18.name = "Five Peso";
        coin18.country = "Mexico";
        coin18.value = 5.00;
        coin18.material = "Bimetallic";
        coin18.year = 2015;
        coin18.isRare = false;
        */

        Coin coin19 = new Coin(20, "Ten Peso", "Mexico", 10.00, "Bimetallic", 2018, false);
        /*
        coin19.coinId = 20;
        coin19.name = "Ten Peso";
        coin19.country = "Mexico";
        coin19.value = 10.00;
        coin19.material = "Bimetallic";
        coin19.year = 2018;
        coin19.isRare = false;
        */

        Coin coin20 = new Coin(21, "Special Edition Rupee", "India", 1.00, "Silver", 1950, true);
        /*
        coin20.coinId = 21;
        coin20.name = "Special Edition Rupee";
        coin20.country = "India";
        coin20.value = 1.00;
        coin20.material = "Silver";
        coin20.year = 1950;
        coin20.isRare = true;
        */

        // Printing all coin info
        coin.getCoinInfo();
        coin1.getCoinInfo();
        coin2.getCoinInfo();
        coin3.getCoinInfo();
        coin4.getCoinInfo();
        coin5.getCoinInfo();
        coin6.getCoinInfo();
        coin7.getCoinInfo();
        coin8.getCoinInfo();
        coin9.getCoinInfo();
        coin10.getCoinInfo();
        coin11.getCoinInfo();
        coin12.getCoinInfo();
        coin13.getCoinInfo();
        coin14.getCoinInfo();
        coin15.getCoinInfo();
        coin16.getCoinInfo();
        coin17.getCoinInfo();
        coin18.getCoinInfo();
        coin19.getCoinInfo();
        coin20.getCoinInfo();

        System.out.println("Main ended");
    }
}
