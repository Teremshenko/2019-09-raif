package com.company;

public class Main {

    public static void main(String[] args) {
	CashAccount my=new CashAccount();
	my.sum=70000;

	//my.withdraw(100000);
	//my.fundAccount(11000);

	Current myCurr = new Current();
	Debit myDeb = new Debit();
	Credit myCred = new Credit();
	myCurr.sum=1000;
	myDeb.sum=2000;
	myCred.sum=3000;

	myCred.transferToAccount(myCurr,1000,myDeb);
	myCurr.showMoneyPrint();
	myDeb.showMoneyPrint();
    }
}
