package com.appsdeveloperblog.estore.transfers.io;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "transfers")
public class TransferEntity implements Serializable {

    @Id
    @Column(nullable = false)
    private String transferId;

    @Column(nullable = false)
    private String senderId;

    @Column(nullable = false)
    private String recepientId;

    @Column(nullable = false)
    private BigDecimal amount;

    public TransferEntity() {}

    public TransferEntity(String transferId, String senderId, String recepientId, BigDecimal amount) {
        this.transferId = transferId;
        this.senderId = senderId;
        this.recepientId = recepientId;
        this.amount = amount;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecepientId() {
        return recepientId;
    }

    public void setRecepientId(String recipientId) {
        this.recepientId = recipientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
