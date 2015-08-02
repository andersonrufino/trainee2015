package Util;

import java.util.Vector;

/**
 *
 * @author Judah
 */
public class ATM {

    private Bill[] billArray;

    public ATM(){
        Bill bill10Reais = new Bill(-1, 10, "R$");//-1 = infinito
        Bill bill20Reais = new Bill(-1, 20, "R$");
        Bill bill50Reais = new Bill(-1, 50, "R$");
        Bill bill100Reais = new Bill(-1, 100, "R$");
        
        Bill[] billArray0 = {bill10Reais,bill20Reais,bill50Reais,bill100Reais};
        this.billArray=billArray0;
    }

    public ATM(Bill[] billArray) {
        this.billArray = billArray;
    }
    
    private Bill getBiggestBill(int value) throws Exception{
        Bill biggestBill=null;
        for (Bill bill : this.billArray) {
            if(bill.booleanCanWithdraw(1)){
                if(biggestBill==null || biggestBill.getValue()<bill.getValue()){
                    if (bill.getValue() <= value) {
                        biggestBill = bill;
                    }
                }
            }
        }
        if(biggestBill==null){
            throw new Exception();
        }
        return biggestBill;
    }
    
    private int getSmallestBillValue() throws Exception{
        Bill smallestBill=null;
        for (Bill bill : this.billArray) {
            if(bill.booleanCanWithdraw(1)){
                if(smallestBill==null || smallestBill.getValue()>bill.getValue()){
                    smallestBill=bill;
                }
            }
        }
        if(smallestBill==null){
            throw new Exception();
        }
        return smallestBill.getValue();
    }
    
    public Bill[] withdraw(int value) throws Exception{
        Vector<Bill> billVector = new Vector<>();
        int smallestBillValue = getSmallestBillValue();
        while (value!=0 && value>=smallestBillValue) {            
            Bill biggestBill = getBiggestBill(value);
            int number = value/biggestBill.getValue();
            if(biggestBill.booleanCanWithdraw(number)){
                biggestBill.withdraw(number);
            }else{
                number=biggestBill.getNumber();
                biggestBill.withdraw(number);
            }
            value=value-(number*biggestBill.getValue());
            billVector.add(new Bill(number, biggestBill.getValue(), biggestBill.getSymbol()));
        }
        if(value!=0){
            throw new Exception();
        }
        Bill[] billArrayTemp=new Bill[billVector.size()];
        billArrayTemp=(Bill[]) billVector.toArray(billArrayTemp);
        return billArrayTemp;
    }
}
