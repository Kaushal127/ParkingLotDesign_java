package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime ;
    private Ticket ticket ;
    private Float billAmount ;    // int , 1.22 -> 1.2*100 -> 120 , 120/100
    private BillingStatus billingStatus ;
    private List<Payment> payments ;
    private Gate exitGate ;
    private Operator operator ;

    public Bill(Date exitTime, Ticket ticket, Float billAmount, BillingStatus billingStatus, List<Payment> payments, Gate exitGate, Operator operator) {
        this.exitTime = exitTime;
        this.ticket = ticket;
        this.billAmount = billAmount;
        this.billingStatus = billingStatus;
        this.payments = payments;
        this.exitGate = exitGate;
        this.operator = operator;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Float billAmount) {
        this.billAmount = billAmount;
    }

    public BillingStatus getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(BillingStatus billingStatus) {
        this.billingStatus = billingStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
