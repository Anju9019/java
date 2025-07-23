class BillRunner {
	public static void main(String chandu[]){
		System.out.println("The Main is Started");
		Bill FirstBill = new Bill();
		FirstBill.planType = "Periodic Billing";
		FirstBill.BillisPaid = true;
		FirstBill.BillAmountWithTax = 350.90;
		FirstBill.BillDueDate = "21-06-2025";
        FirstBill.BillId = 4;
		System.out.println("The FirstBill is "+FirstBill.planType);
		System.out.println("The FirstBill is "+FirstBill.BillisPaid);
		System.out.println("The FirstBill is "+FirstBill.BillAmountWithTax);
		System.out.println("The FirstBill is "+FirstBill.BillDueDate);
		System.out.println("The FirstBill is "+FirstBill.BillId);
		Bill SecondBill = new Bill();
		SecondBill.planType = "Milestone Billing";
		SecondBill.BillisPaid = true;
		SecondBill.BillAmountWithTax = 400.98;
		SecondBill.BillDueDate = "17-08-2025";
		SecondBill.BillId = 2;
		Bill ThirdBill = new Bill();
		ThirdBill.planType = "Quantum Billing";
		ThirdBill.BillisPaid = false;
		ThirdBill.BillAmountWithTax = 450.00;
		ThirdBill.BillDueDate = "19-05-2025";
        ThirdBill.BillId = 7;
		
		Bill FourthBill = new Bill();
		FourthBill.planType = "pentox Billing";
		FourthBill.BillisPaid = true;
		FourthBill.BillAmountWithTax = 450.00;
		FourthBill.BillDueDate = "4-06-2025";
        FourthBill.BillId = 6;
		
		Bill FifthBill = new Bill();
		FifthBill.planType = "Manual Billing";
		FifthBill.BillisPaid = false;
		FifthBill.BillAmountWithTax = 500.50;
		FifthBill.BillDueDate = "24-04-2025";
        FifthBill.BillId = 3;
		
		Bill SixthBill = new Bill();
		SixthBill.planType = "prepaid Billing";
		SixthBill.BillisPaid = true;
		SixthBill.BillAmountWithTax = 350.40;
		SixthBill.BillDueDate = "11-06-2025";
        SixthBill.BillId = 5;
		
		Bill SeventhBill = new Bill();
		SeventhBill.planType = "postpaid Billing";
		SeventhBill.BillisPaid = true;
		SeventhBill.BillAmountWithTax = 540.00;
		SeventhBill.BillDueDate = "29-06-2025";
        SeventhBill.BillId = 9;
		
		Bill EighthBill = new Bill();
		EighthBill.planType = "proxy Billing";
		EighthBill.BillisPaid = false;
		EighthBill.BillAmountWithTax = 245.00;
		EighthBill.BillDueDate = "09-04-2025";
        EighthBill.BillId = 7;
		
		Bill ninthBill = new Bill();
		ninthBill.planType = "macro Billing";
		ninthBill.BillisPaid = true;
		ninthBill.BillAmountWithTax = 650.10;
		ninthBill.BillDueDate = "15-04-2025";
        ninthBill.BillId = 1;
		
		Bill TenthBill = new Bill();
		TenthBill.planType = "Mini Billing";
		TenthBill.BillisPaid = false;
		TenthBill.BillAmountWithTax = 350.40;
		TenthBill.BillDueDate = "14-02-2025";
        TenthBill.BillId = 10;
		
		Bill ElventhBill = new Bill();
		ElventhBill.planType = "prepaid Billing";
		ElventhBill.BillisPaid = true;
		ElventhBill.BillAmountWithTax = 350.40;
		ElventhBill.BillDueDate = "11-06-2025";
        ElventhBill.BillId = 5;
		
		Bill TvelthBill = new Bill();
		TvelthBill.planType = "Nacro Billing";
		TvelthBill.BillisPaid = true;
		TvelthBill.BillAmountWithTax = 574.10;
		TvelthBill.BillDueDate = "06-07-2025";
        TvelthBill.BillId = 11;
		
		Bill ThirteenthBill = new Bill();
		ThirteenthBill.planType = "Sales Billing";
		ThirteenthBill.BillisPaid = true;
		ThirteenthBill.BillAmountWithTax = 250.40;
		ThirteenthBill.BillDueDate = "04-05-2025";
        ThirteenthBill.BillId = 12;
		
		Bill FourteenthBill = new Bill();
		FourteenthBill.planType = "Reatil Billing";
		FourteenthBill.BillisPaid = true;
		FourteenthBill.BillAmountWithTax = 840.00;
		FourteenthBill.BillDueDate = "02-03-2025";
        FourteenthBill.BillId = 14;
		
		Bill FifteenthBill = new Bill();
		FifteenthBill.planType = "Design Billing";
		FifteenthBill.BillisPaid = false;
		FifteenthBill.BillAmountWithTax = 655.25;
		FifteenthBill.BillDueDate = "11-06-2025";
        FifteenthBill.BillId = 13;
		
		Bill SixteenthBill = new Bill();
		SixteenthBill.planType = "Design Billing";
		SixteenthBill.BillisPaid = true;
		SixteenthBill.BillAmountWithTax = 450.15;
		SixteenthBill.BillDueDate = "16-07-2025";
        SixteenthBill.BillId = 16;
		
		Bill SeventeenthBill = new Bill();
		SeventeenthBill.planType = "Design Billing";
		SeventeenthBill.BillisPaid = true;
		SeventeenthBill.BillAmountWithTax = 450.15;
		SeventeenthBill.BillDueDate = "16-07-2025";
        SeventeenthBill.BillId = 17;
		
		Bill EighteenthBill = new Bill();
		EighteenthBill.planType = "mart Billing";
		EighteenthBill.BillisPaid = true;
		EighteenthBill.BillAmountWithTax = 360.15;
		EighteenthBill.BillDueDate = "08-02-2025";
        EighteenthBill.BillId = 18;
		
		Bill NineteenthBill = new Bill();
		NineteenthBill.planType = "macro Billing";
		NineteenthBill.BillisPaid = true;
		NineteenthBill.BillAmountWithTax = 640.15;
		NineteenthBill.BillDueDate = "20-06-2025";
        NineteenthBill.BillId = 19;
		
		Bill TwentyteethBill = new Bill();
		TwentyteethBill.planType = "sacro Billing";
		TwentyteethBill.BillisPaid = false;
		TwentyteethBill.BillAmountWithTax = 440.25;
		TwentyteethBill.BillDueDate = "28-05-2025";
        TwentyteethBill.BillId = 20;
		
		System.out.println("The FirstBill planType is "+FirstBill.planType);
		
		System.out.println("The Main is Ended");
	}
}


