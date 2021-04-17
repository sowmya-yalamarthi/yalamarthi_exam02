/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_qn3;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Loan {

    private int loadId;
    private String loanStatus;
    private double loanAmount;
    
    public Loan()
    {
        
    }

    public Loan(int loadId, String loanStatus,double loanAmount) {
        this.loadId = loadId;
        this.loanStatus = loanStatus;
        this.loanAmount=loanAmount;
    }

    
    public int getLoadId() {
        return loadId;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    @Override
    public String toString() {
        return "*************************\nLoan " + "\nloadId: " + loadId + "\nloanStatus: " + loanStatus +"\nLoan Amount: "+loanAmount+"\n*************************";
    }
}
