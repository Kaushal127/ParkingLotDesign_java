package Models;

import java.util.Date;

public class Payment extends BaseModel{
    private PaymentMode paymentMode ;
    private Float amount ;
    private int refNumber ;
    private Date time ;
    private PaymentStatus paymentStatus ;

    public Payment(PaymentMode paymentMode, Float amount, int refNumber, Date time, PaymentStatus paymentStatus) {
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.refNumber = refNumber;
        this.time = time;
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
