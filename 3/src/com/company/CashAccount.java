package com.company;

public class CashAccount {
    int sum;
    public void withdraw(int amount){ //Снять
        if (sum>amount){
            sum=sum-amount;
            //System.out.println("Заберите деньги");
            amountOfMoney();
        }
        else{
            System.out.println("Недостаточно средств");
        }
    }
    public void fundAccount(int amount){ //Пополнить
        sum=sum+amount;
        //System.out.println("Счёт пополнен на: "+amount);
        amountOfMoney();
    }
    public void showMoneyPrint(){
        System.out.println("На счёте: "+sum);
    }
    public int amountOfMoney(){
        return sum;
    }

    public void transferToAccount(CashAccount to,int sum, CashAccount from){
        if(from.amountOfMoney()>sum){
            from.withdraw(sum);
            to.fundAccount(sum);}
    }
    /*
    public void toDebit(Debit deb,int sum, CashAccount ca){
        if(ca.amountOfMoney()>sum){
            ca.withdraw(sum);
            deb.fundAccount(sum);}
    }
    public void toCredit(Credit cred,int sum, CashAccount ca){ //куда переводим, сколько, с какого счета
        if(ca.amountOfMoney()>sum){
            ca.withdraw(sum);
            cred.fundAccount(sum);
        }
    }*/
}
