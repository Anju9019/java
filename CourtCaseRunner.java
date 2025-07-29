class CourtCaseRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        CourtCase case1 = new CourtCase(1, "Criminal", "State of California", "John Doe",
                "Superior Court", "Judge Smith", "2024-01-10", "2024-06-15", "Pending", 0.0);
        /*
        case1.caseId = 1;
        case1.caseType = "Criminal";
        case1.plaintiff = "State of California";
        case1.defendant = "John Doe";
        case1.courtName = "Superior Court";
        case1.judgeName = "Judge Smith";
        case1.filingDate = "2024-01-10";
        case1.hearingDate = "2024-06-15";
        case1.caseStatus = "Pending";
        case1.caseValue = 0.0;
        */

        CourtCase case2 = new CourtCase(2, "Civil", "Jane Smith", "ABC Corporation",
                "District Court", "Judge Adams", "2023-12-05", "2024-04-20", "Ongoing", 150000.00);
        /*
        case2.caseId = 2;
        case2.caseType = "Civil";
        case2.plaintiff = "Jane Smith";
        case2.defendant = "ABC Corporation";
        case2.courtName = "District Court";
        case2.judgeName = "Judge Adams";
        case2.filingDate = "2023-12-05";
        case2.hearingDate = "2024-04-20";
        case2.caseStatus = "Ongoing";
        case2.caseValue = 150000.00;
        */

        CourtCase case3 = new CourtCase(3, "Family", "Alice Johnson", "Bob Johnson",
                "Family Court", "Judge Williams", "2024-02-01", "2024-05-10", "Pending", 0.0);
        /*
        case3.caseId = 3;
        case3.caseType = "Family";
        case3.plaintiff = "Alice Johnson";
        case3.defendant = "Bob Johnson";
        case3.courtName = "Family Court";
        case3.judgeName = "Judge Williams";
        case3.filingDate = "2024-02-01";
        case3.hearingDate = "2024-05-10";
        case3.caseStatus = "Pending";
        case3.caseValue = 0.0;
        */

        CourtCase case4 = new CourtCase(4, "Criminal", "State of Texas", "Michael Brown",
                "Texas Criminal Court", "Judge Garcia", "2023-11-15", "2024-03-30", "Ongoing", 0.0);
        /*
        case4.caseId = 4;
        case4.caseType = "Criminal";
        case4.plaintiff = "State of Texas";
        case4.defendant = "Michael Brown";
        case4.courtName = "Texas Criminal Court";
        case4.judgeName = "Judge Garcia";
        case4.filingDate = "2023-11-15";
        case4.hearingDate = "2024-03-30";
        case4.caseStatus = "Ongoing";
        case4.caseValue = 0.0;
        */

        CourtCase case5 = new CourtCase(5, "Civil", "Green Energy Ltd.", "Sunshine Corp.",
                "District Court", "Judge Lee", "2024-03-10", "2024-08-20", "Pending", 500000.00);
        /*
        case5.caseId = 5;
        case5.caseType = "Civil";
        case5.plaintiff = "Green Energy Ltd.";
        case5.defendant = "Sunshine Corp.";
        case5.courtName = "District Court";
        case5.judgeName = "Judge Lee";
        case5.filingDate = "2024-03-10";
        case5.hearingDate = "2024-08-20";
        case5.caseStatus = "Pending";
        case5.caseValue = 500000.00;
        */

        CourtCase case6 = new CourtCase(6, "Family", "Jessica White", "David White",
                "Family Court", "Judge Collins", "2023-10-10", "2024-02-25", "Closed", 0.0);
        /*
        case6.caseId = 6;
        case6.caseType = "Family";
        case6.plaintiff = "Jessica White";
        case6.defendant = "David White";
        case6.courtName = "Family Court";
        case6.judgeName = "Judge Collins";
        case6.filingDate = "2023-10-10";
        case6.hearingDate = "2024-02-25";
        case6.caseStatus = "Closed";
        case6.caseValue = 0.0;
        */

        CourtCase case7 = new CourtCase(7, "Criminal", "State of Florida", "Carlos Rivera",
                "Florida Criminal Court", "Judge Martinez", "2024-04-12", "2024-09-01", "Pending", 0.0);
        /*
        case7.caseId = 7;
        case7.caseType = "Criminal";
        case7.plaintiff = "State of Florida";
        case7.defendant = "Carlos Rivera";
        case7.courtName = "Florida Criminal Court";
        case7.judgeName = "Judge Martinez";
        case7.filingDate = "2024-04-12";
        case7.hearingDate = "2024-09-01";
        case7.caseStatus = "Pending";
        case7.caseValue = 0.0;
        */

        CourtCase case8 = new CourtCase(8, "Civil", "Tech Innovations", "XYZ Inc.",
                "District Court", "Judge Patel", "2024-05-05", "2024-10-10", "Ongoing", 1000000.00);
        /*
        case8.caseId = 8;
        case8.caseType = "Civil";
        case8.plaintiff = "Tech Innovations";
        case8.defendant = "XYZ Inc.";
        case8.courtName = "District Court";
        case8.judgeName = "Judge Patel";
        case8.filingDate = "2024-05-05";
        case8.hearingDate = "2024-10-10";
        case8.caseStatus = "Ongoing";
        case8.caseValue = 1000000.00;
        */

        CourtCase case9 = new CourtCase(9, "Family", "Rachel Green", "Ross Geller",
                "Family Court", "Judge Thompson", "2023-09-20", "2024-01-15", "Closed", 0.0);
        /*
        case9.caseId = 9;
        case9.caseType = "Family";
        case9.plaintiff = "Rachel Green";
        case9.defendant = "Ross Geller";
        case9.courtName = "Family Court";
        case9.judgeName = "Judge Thompson";
        case9.filingDate = "2023-09-20";
        case9.hearingDate = "2024-01-15";
        case9.caseStatus = "Closed";
        case9.caseValue = 0.0;
        */

        CourtCase case10 = new CourtCase(10, "Criminal", "State of New York", "Anna Taylor",
                "New York Criminal Court", "Judge Johnson", "2024-02-28", "2024-07-12", "Pending", 0.0);
        /*
        case10.caseId = 10;
        case10.caseType = "Criminal";
        case10.plaintiff = "State of New York";
        case10.defendant = "Anna Taylor";
        case10.courtName = "New York Criminal Court";
        case10.judgeName = "Judge Johnson";
        case10.filingDate = "2024-02-28";
        case10.hearingDate = "2024-07-12";
        case10.caseStatus = "Pending";
        case10.caseValue = 0.0;
        */

        CourtCase case11 = new CourtCase(11, "Civil", "John Carter", "Omega Ltd.",
                "District Court", "Judge Davis", "2024-03-15", "2024-08-05", "Ongoing", 750000.00);
        /*
        case11.caseId = 11;
        case11.caseType = "Civil";
        case11.plaintiff = "John Carter";
        case11.defendant = "Omega Ltd.";
        case11.courtName = "District Court";
        case11.judgeName = "Judge Davis";
        case11.filingDate = "2024-03-15";
        case11.hearingDate = "2024-08-05";
        case11.caseStatus = "Ongoing";
        case11.caseValue = 750000.00;
        */

        CourtCase case12 = new CourtCase(12, "Family", "Emma Wilson", "Liam Wilson",
                "Family Court", "Judge Murphy", "2024-01-25", "2024-05-15", "Pending", 0.0);
        /*
        case12.caseId = 12;
        case12.caseType = "Family";
        case12.plaintiff = "Emma Wilson";
        case12.defendant = "Liam Wilson";
        case12.courtName = "Family Court";
        case12.judgeName = "Judge Murphy";
        case12.filingDate = "2024-01-25";
        case12.hearingDate = "2024-05-15";
        case12.caseStatus = "Pending";
        case12.caseValue = 0.0;
        */

        CourtCase case13 = new CourtCase(13, "Criminal", "State of Illinois", "Henry Clark",
                "Illinois Criminal Court", "Judge Hernandez", "2023-12-30", "2024-06-01", "Ongoing", 0.0);
        /*
        case13.caseId = 13;
        case13.caseType = "Criminal";
        case13.plaintiff = "State of Illinois";
        case13.defendant = "Henry Clark";
        case13.courtName = "Illinois Criminal Court";
        case13.judgeName = "Judge Hernandez";
        case13.filingDate = "2023-12-30";
        case13.hearingDate = "2024-06-01";
        case13.caseStatus = "Ongoing";
        case13.caseValue = 0.0;
        */

        CourtCase case14 = new CourtCase(14, "Civil", "Alpha Enterprises", "Beta Solutions",
                "District Court", "Judge Robinson", "2024-04-01", "2024-09-10", "Pending", 300000.00);
        /*
        case14.caseId = 14;
        case14.caseType = "Civil";
        case14.plaintiff = "Alpha Enterprises";
        case14.defendant = "Beta Solutions";
        case14.courtName = "District Court";
        case14.judgeName = "Judge Robinson";
        case14.filingDate = "2024-04-01";
        case14.hearingDate = "2024-09-10";
        case14.caseStatus = "Pending";
        case14.caseValue = 300000.00;
        */

        CourtCase case15 = new CourtCase(15, "Family", "Olivia Martinez", "Ethan Martinez",
                "Family Court", "Judge Clark", "2024-02-20", "2024-07-05", "Ongoing", 0.0);
        /*
        case15.caseId = 15;
        case15.caseType = "Family";
        case15.plaintiff = "Olivia Martinez";
        case15.defendant = "Ethan Martinez";
        case15.courtName = "Family Court";
        case15.judgeName = "Judge Clark";
        case15.filingDate = "2024-02-20";
        case15.hearingDate = "2024-07-05";
        case15.caseStatus = "Ongoing";
        case15.caseValue = 0.0;
        */

        CourtCase case16 = new CourtCase(16, "Criminal", "State of Ohio", "Sophia Lee",
                "Ohio Criminal Court", "Judge Evans", "2023-11-10", "2024-04-20", "Closed", 0.0);
        /*
        case16.caseId = 16;
        case16.caseType = "Criminal";
        case16.plaintiff = "State of Ohio";
        case16.defendant = "Sophia Lee";
        case16.courtName = "Ohio Criminal Court";
        case16.judgeName = "Judge Evans";
        case16.filingDate = "2023-11-10";
        case16.hearingDate = "2024-04-20";
        case16.caseStatus = "Closed";
        case16.caseValue = 0.0;
        */

        CourtCase case17 = new CourtCase(17, "Civil", "Blue Sky Corp.", "Red Stone Ltd.",
                "District Court", "Judge King", "2024-03-25", "2024-08-15", "Ongoing", 450000.00);
        /*
        case17.caseId = 17;
        case17.caseType = "Civil";
        case17.plaintiff = "Blue Sky Corp.";
        case17.defendant = "Red Stone Ltd.";
        case17.courtName = "District Court";
        case17.judgeName = "Judge King";
        case17.filingDate = "2024-03-25";
        case17.hearingDate = "2024-08-15";
        case17.caseStatus = "Ongoing";
        case17.caseValue = 450000.00;
        */

        CourtCase case18 = new CourtCase(18, "Family", "Mia Davis", "Noah Davis",
                "Family Court", "Judge Scott", "2024-01-05", "2024-06-10", "Pending", 0.0);
        /*
        case18.caseId = 18;
        case18.caseType = "Family";
        case18.plaintiff = "Mia Davis";
        case18.defendant = "Noah Davis";
        case18.courtName = "Family Court";
        case18.judgeName = "Judge Scott";
        case18.filingDate = "2024-01-05";
        case18.hearingDate = "2024-06-10";
        case18.caseStatus = "Pending";
        case18.caseValue = 0.0;
        */

        CourtCase case19 = new CourtCase(19, "Criminal", "State of Georgia", "Evelyn Turner",
                "Georgia Criminal Court", "Judge Baker", "2024-02-15", "2024-07-20", "Ongoing", 0.0);
        /*
        case19.caseId = 19;
        case19.caseType = "Criminal";
        case19.plaintiff = "State of Georgia";
        case19.defendant = "Evelyn Turner";
        case19.courtName = "Georgia Criminal Court";
        case19.judgeName = "Judge Baker";
        case19.filingDate = "2024-02-15";
        case19.hearingDate = "2024-07-20";
        case19.caseStatus = "Ongoing";
        case19.caseValue = 0.0;
        */

        CourtCase case20 = new CourtCase(20, "Civil", "Sunrise Ltd.", "Moonlight Inc.",
                "District Court", "Judge Wright", "2024-05-15", "2024-11-05", "Pending", 600000.00);
        /*
        case20.caseId = 20;
        case20.caseType = "Civil";
        case20.plaintiff = "Sunrise Ltd.";
        case20.defendant = "Moonlight Inc.";
        case20.courtName = "District Court";
        case20.judgeName = "Judge Wright";
        case20.filingDate = "2024-05-15";
        case20.hearingDate = "2024-11-05";
        case20.caseStatus = "Pending";
        case20.caseValue = 600000.00;
        */

      
        case1.printCaseInfo();
        case2.printCaseInfo();
        case3.printCaseInfo();
        case4.printCaseInfo();
        case5.printCaseInfo();
        case6.printCaseInfo();
        case7.printCaseInfo();
        case8.printCaseInfo();
        case9.printCaseInfo();
        case10.printCaseInfo();
        case11.printCaseInfo();
        case12.printCaseInfo();
        case13.printCaseInfo();
        case14.printCaseInfo();
        case15.printCaseInfo();
        case16.printCaseInfo();
        case17.printCaseInfo();
        case18.printCaseInfo();
        case19.printCaseInfo();
        case20.printCaseInfo();

        System.out.println("Main ended");
    }
}
