import bangundatar.BangunDatar;
import bangundatar.Persegi;
import emoney.Bank;
import emoney.Dana;
import emoney.DigitalMoney;

public class App {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(10);
        persegi.printLuas();
        persegi.printKeliling();

        System.out.println();

        DigitalMoney digitalMoneyDana = new Dana("239049234S");
        digitalMoneyDana.topup(10000);
        digitalMoneyDana.chechBalance();
        digitalMoneyDana.pay(1000);
        digitalMoneyDana.withdraw(2000);
        digitalMoneyDana.transfer(32000, "190823");

        System.out.println();

        Bank bankDana = new Dana("9203423");
        bankDana.transfer(1000, "239048");
        bankDana.getNomorAccount();
    }
}