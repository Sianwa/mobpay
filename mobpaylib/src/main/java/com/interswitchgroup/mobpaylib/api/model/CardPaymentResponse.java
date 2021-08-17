package com.interswitchgroup.mobpaylib.api.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CardPaymentResponse implements TransactionResponse{
    private String fee;
    private String transactionAmount;
    private String transactionRef;
    private String terminalId;
    private String approvalCode;
    private String token;
    private String expiry;
    private String panLast4Digits;
    private String orderId;
    private String panFirst6Digits;
    private String responseCode;

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getPanLast4Digits() {
        return panLast4Digits;
    }

    public void setPanLast4Digits(String panLast4Digits) {
        this.panLast4Digits = panLast4Digits;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getTransactionOrderId() {
        return this.getOrderId();
    }

    public String getPanFirst6Digits() {
        return panFirst6Digits;
    }

    public void setPanFirst6Digits(String panFirst6Digits) {
        this.panFirst6Digits = panFirst6Digits;
    }

    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String toString(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
