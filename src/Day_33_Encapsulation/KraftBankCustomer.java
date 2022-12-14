package Day_33_Encapsulation;

//KraftBank adında bir class oluşturun, customerId, customerFullName, isSms, customerAccount,
// customerToken adında fields tanımlayın,
//1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
//2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
//3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in ilk iki
// harfi+1000-9999 rasında
//random bir sayı ile otomatik oluşturulacak.
//4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması
// için class içerisinde addMoney
//adında bir metot yazılacak.
//5-Dışardan isSms dışındaki verilere sadece okuma yetkisi verilecek, isSms
// okuma ve yazma yetkisi
//verilebilecek.
//6- customerFullName’in değiştirilmesi için token zorunlu kılınacak,hatalı
// token girilirse uyarı verilecek.

import java.util.Random;

public class KraftBankCustomer {

    private int customerId;
    private String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KraftBankCustomer(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        Random random=new Random();
        this.customerToken=this.customerId+customerFullName.substring(0,2)+12;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerToken,String customerFullName) {
        if (customerToken.equals(this.customerToken)){
            this.customerFullName=customerFullName;
        }else {
            System.err.println("Not Authorize");
        }
    }

    public boolean getIsSms() {
        return isSms;
    }

    public void setIsSms(boolean sms) {
        isSms = sms;
    }

    public double getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public void addMoney(double money){
        this.customerAccount+=money;
    }






}
