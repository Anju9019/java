class CasinoRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Casino casino1 = new Casino(1, "Lucky Star", "Las Vegas", 50, 1200.5, true, "John Smith", 25000.0, 300, "Poker");
        /*
        casino1.casinoId = 1;
        casino1.name = "Lucky Star";
        casino1.location = "Las Vegas";
        casino1.numberOfGames = 50;
        casino1.revenue = 1200.5;
        casino1.isOpen24Hours = true;
        casino1.managerName = "John Smith";
        casino1.areaInSqFt = 25000.0;
        casino1.employeeCount = 300;
        casino1.specialtyGame = "Poker";
        */

        Casino casino2 = new Casino(2, "Golden Palace", "Atlantic City", 40, 980.0, false, "Alice Johnson", 20000.0, 280, "Blackjack");
        /*
        casino2.casinoId = 2;
        casino2.name = "Golden Palace";
        casino2.location = "Atlantic City";
        casino2.numberOfGames = 40;
        casino2.revenue = 980.0;
        casino2.isOpen24Hours = false;
        casino2.managerName = "Alice Johnson";
        casino2.areaInSqFt = 20000.0;
        casino2.employeeCount = 280;
        casino2.specialtyGame = "Blackjack";
        */

        Casino casino3 = new Casino(3, "Emerald Bay", "Macau", 60, 1500.0, true, "Robert Lee", 35000.0, 400, "Baccarat");
        /*
        casino3.casinoId = 3;
        casino3.name = "Emerald Bay";
        casino3.location = "Macau";
        casino3.numberOfGames = 60;
        casino3.revenue = 1500.0;
        casino3.isOpen24Hours = true;
        casino3.managerName = "Robert Lee";
        casino3.areaInSqFt = 35000.0;
        casino3.employeeCount = 400;
        casino3.specialtyGame = "Baccarat";
        */

        Casino casino4 = new Casino(4, "Silver Sands", "Monte Carlo", 45, 1100.0, false, "Emily Davis", 22000.0, 310, "Roulette");
        /*
        casino4.casinoId = 4;
        casino4.name = "Silver Sands";
        casino4.location = "Monte Carlo";
        casino4.numberOfGames = 45;
        casino4.revenue = 1100.0;
        casino4.isOpen24Hours = false;
        casino4.managerName = "Emily Davis";
        casino4.areaInSqFt = 22000.0;
        casino4.employeeCount = 310;
        casino4.specialtyGame = "Roulette";
        */

        Casino casino5 = new Casino(5, "Royal Flush", "Las Vegas", 55, 1300.75, true, "Michael Brown", 28000.0, 350, "Slots");
        /*
        casino5.casinoId = 5;
        casino5.name = "Royal Flush";
        casino5.location = "Las Vegas";
        casino5.numberOfGames = 55;
        casino5.revenue = 1300.75;
        casino5.isOpen24Hours = true;
        casino5.managerName = "Michael Brown";
        casino5.areaInSqFt = 28000.0;
        casino5.employeeCount = 350;
        casino5.specialtyGame = "Slots";
        */

        Casino casino6 = new Casino(6, "Diamond Crown", "Singapore", 52, 1400.0, true, "Sarah Wilson", 30000.0, 360, "Poker");
        /*
        casino6.casinoId = 6;
        casino6.name = "Diamond Crown";
        casino6.location = "Singapore";
        casino6.numberOfGames = 52;
        casino6.revenue = 1400.0;
        casino6.isOpen24Hours = true;
        casino6.managerName = "Sarah Wilson";
        casino6.areaInSqFt = 30000.0;
        casino6.employeeCount = 360;
        casino6.specialtyGame = "Poker";
        */

        Casino casino7 = new Casino(7, "Ocean Breeze", "Macau", 47, 1250.0, false, "David Martinez", 24000.0, 320, "Blackjack");
        /*
        casino7.casinoId = 7;
        casino7.name = "Ocean Breeze";
        casino7.location = "Macau";
        casino7.numberOfGames = 47;
        casino7.revenue = 1250.0;
        casino7.isOpen24Hours = false;
        casino7.managerName = "David Martinez";
        casino7.areaInSqFt = 24000.0;
        casino7.employeeCount = 320;
        casino7.specialtyGame = "Blackjack";
        */

        Casino casino8 = new Casino(8, "Sunset Royale", "Las Vegas", 53, 1350.0, true, "Laura Garcia", 27000.0, 340, "Roulette");
        /*
        casino8.casinoId = 8;
        casino8.name = "Sunset Royale";
        casino8.location = "Las Vegas";
        casino8.numberOfGames = 53;
        casino8.revenue = 1350.0;
        casino8.isOpen24Hours = true;
        casino8.managerName = "Laura Garcia";
        casino8.areaInSqFt = 27000.0;
        casino8.employeeCount = 340;
        casino8.specialtyGame = "Roulette";
        */

        Casino casino9 = new Casino(9, "Casino Royale", "Monte Carlo", 48, 1150.0, false, "James Anderson", 23000.0, 315, "Baccarat");
        /*
        casino9.casinoId = 9;
        casino9.name = "Casino Royale";
        casino9.location = "Monte Carlo";
        casino9.numberOfGames = 48;
        casino9.revenue = 1150.0;
        casino9.isOpen24Hours = false;
        casino9.managerName = "James Anderson";
        casino9.areaInSqFt = 23000.0;
        casino9.employeeCount = 315;
        casino9.specialtyGame = "Baccarat";
        */

        Casino casino10 = new Casino(10, "Lucky Lady", "Atlantic City", 44, 1025.0, false, "Patricia Thomas", 21000.0, 300, "Slots");
        /*
        casino10.casinoId = 10;
        casino10.name = "Lucky Lady";
        casino10.location = "Atlantic City";
        casino10.numberOfGames = 44;
        casino10.revenue = 1025.0;
        casino10.isOpen24Hours = false;
        casino10.managerName = "Patricia Thomas";
        casino10.areaInSqFt = 21000.0;
        casino10.employeeCount = 300;
        casino10.specialtyGame = "Slots";
        */

        Casino casino11 = new Casino(11, "Grand Emerald", "Singapore", 50, 1450.0, true, "Christopher Young", 31000.0, 380, "Poker");
        /*
        casino11.casinoId = 11;
        casino11.name = "Grand Emerald";
        casino11.location = "Singapore";
        casino11.numberOfGames = 50;
        casino11.revenue = 1450.0;
        casino11.isOpen24Hours = true;
        casino11.managerName = "Christopher Young";
        casino11.areaInSqFt = 31000.0;
        casino11.employeeCount = 380;
        casino11.specialtyGame = "Poker";
        */

        Casino casino12 = new Casino(12, "Royal Mirage", "Las Vegas", 49, 1380.0, true, "Jessica King", 26000.0, 350, "Blackjack");
        /*
        casino12.casinoId = 12;
        casino12.name = "Royal Mirage";
        casino12.location = "Las Vegas";
        casino12.numberOfGames = 49;
        casino12.revenue = 1380.0;
        casino12.isOpen24Hours = true;
        casino12.managerName = "Jessica King";
        casino12.areaInSqFt = 26000.0;
        casino12.employeeCount = 350;
        casino12.specialtyGame = "Blackjack";
        */

        Casino casino13 = new Casino(13, "Golden Sands", "Macau", 51, 1425.0, true, "Andrew Scott", 29000.0, 370, "Roulette");
        /*
        casino13.casinoId = 13;
        casino13.name = "Golden Sands";
        casino13.location = "Macau";
        casino13.numberOfGames = 51;
        casino13.revenue = 1425.0;
        casino13.isOpen24Hours = true;
        casino13.managerName = "Andrew Scott";
        casino13.areaInSqFt = 29000.0;
        casino13.employeeCount = 370;
        casino13.specialtyGame = "Roulette";
        */

        Casino casino14 = new Casino(14, "Silver Palace", "Monte Carlo", 46, 1200.0, false, "Megan Turner", 24000.0, 320, "Baccarat");
        /*
        casino14.casinoId = 14;
        casino14.name = "Silver Palace";
        casino14.location = "Monte Carlo";
        casino14.numberOfGames = 46;
        casino14.revenue = 1200.0;
        casino14.isOpen24Hours = false;
        casino14.managerName = "Megan Turner";
        casino14.areaInSqFt = 24000.0;
        casino14.employeeCount = 320;
        casino14.specialtyGame = "Baccarat";
        */

        Casino casino15 = new Casino(15, "Sunrise Casino", "Atlantic City", 42, 1000.0, false, "Brian Harris", 20000.0, 290, "Slots");
        /*
        casino15.casinoId = 15;
        casino15.name = "Sunrise Casino";
        casino15.location = "Atlantic City";
        casino15.numberOfGames = 42;
        casino15.revenue = 1000.0;
        casino15.isOpen24Hours = false;
        casino15.managerName = "Brian Harris";
        casino15.areaInSqFt = 20000.0;
        casino15.employeeCount = 290;
        casino15.specialtyGame = "Slots";
        */

        Casino casino16 = new Casino(16, "Oceanic Resort", "Singapore", 54, 1480.0, true, "Amy Nelson", 32000.0, 390, "Poker");
        /*
        casino16.casinoId = 16;
        casino16.name = "Oceanic Resort";
        casino16.location = "Singapore";
        casino16.numberOfGames = 54;
        casino16.revenue = 1480.0;
        casino16.isOpen24Hours = true;
        casino16.managerName = "Amy Nelson";
        casino16.areaInSqFt = 32000.0;
        casino16.employeeCount = 390;
        casino16.specialtyGame = "Poker";
        */

        Casino casino17 = new Casino(17, "Crystal Bay", "Macau", 43, 1100.0, false, "Kevin Moore", 21000.0, 310, "Blackjack");
        /*
        casino17.casinoId = 17;
        casino17.name = "Crystal Bay";
        casino17.location = "Macau";
        casino17.numberOfGames = 43;
        casino17.revenue = 1100.0;
        casino17.isOpen24Hours = false;
        casino17.managerName = "Kevin Moore";
        casino17.areaInSqFt = 21000.0;
        casino17.employeeCount = 310;
        casino17.specialtyGame = "Blackjack";
        */

        Casino casino18 = new Casino(18, "Majestic Palace", "Las Vegas", 56, 1550.0, true, "Nancy Baker", 34000.0, 400, "Roulette");
        /*
        casino18.casinoId = 18;
        casino18.name = "Majestic Palace";
        casino18.location = "Las Vegas";
        casino18.numberOfGames = 56;
        casino18.revenue = 1550.0;
        casino18.isOpen24Hours = true;
        casino18.managerName = "Nancy Baker";
        casino18.areaInSqFt = 34000.0;
        casino18.employeeCount = 400;
        casino18.specialtyGame = "Roulette";
        */

        Casino casino19 = new Casino(19, "Royal Ace", "Monte Carlo", 41, 980.0, false, "Patrick Clark", 19000.0, 280, "Baccarat");
        /*
        casino19.casinoId = 19;
        casino19.name = "Royal Ace";
        casino19.location = "Monte Carlo";
        casino19.numberOfGames = 41;
        casino19.revenue = 980.0;
        casino19.isOpen24Hours = false;
        casino19.managerName = "Patrick Clark";
        casino19.areaInSqFt = 19000.0;
        casino19.employeeCount = 280;
        casino19.specialtyGame = "Baccarat";
        */

        Casino casino20 = new Casino(20, "Diamond Star", "Atlantic City", 38, 950.0, false, "Sandra Lewis", 18000.0, 270, "Slots");
        /*
        casino20.casinoId = 20;
        casino20.name = "Diamond Star";
        casino20.location = "Atlantic City";
        casino20.numberOfGames = 38;
        casino20.revenue = 950.0;
        casino20.isOpen24Hours = false;
        casino20.managerName = "Sandra Lewis";
        casino20.areaInSqFt = 18000.0;
        casino20.employeeCount = 270;
        casino20.specialtyGame = "Slots";
        */

        // Print all casinos info
        casino1.printCasinoInfo();
        casino2.printCasinoInfo();
        casino3.printCasinoInfo();
        casino4.printCasinoInfo();
        casino5.printCasinoInfo();
        casino6.printCasinoInfo();
        casino7.printCasinoInfo();
        casino8.printCasinoInfo();
        casino9.printCasinoInfo();
        casino10.printCasinoInfo();
        casino11.printCasinoInfo();
        casino12.printCasinoInfo();
        casino13.printCasinoInfo();
        casino14.printCasinoInfo();
        casino15.printCasinoInfo();
        casino16.printCasinoInfo();
        casino17.printCasinoInfo();
        casino18.printCasinoInfo();
        casino19.printCasinoInfo();
        casino20.printCasinoInfo();

        System.out.println("Main ended");
    }
}
