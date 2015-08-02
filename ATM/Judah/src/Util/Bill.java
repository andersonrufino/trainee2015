package Util;

/**
 *
 * @author Judah
 */
public class Bill {
    private int number;//-1 = infinito
    private int value;
    private String symbol;

    public Bill(int number, int value, String symbol) {
        this.number = number;
        this.value = value;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public void withdraw(){
        if(booleanCanWithdraw(1)){
            this.number--;
        }
    }
    
    public void withdraw(int number){
        if(booleanCanWithdraw(number)){
            this.number=this.number-number;
        }
    }
    
    public boolean booleanCanWithdraw(int number){
        return (this.number-number>=0||this.number==-1);
    }
}
