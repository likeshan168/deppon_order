package com.skyfaith.deppon_order.entity;

public class DepponOrderResponse {
    private String logisticID;

    private String reason;

    private String result;
    private int resultCode;
    private String uniquerRequestNumber;

    public String getLogisticID() {
        return logisticID;
    }

    public void setLogisticID(String logisticID) {
        this.logisticID = logisticID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getUniquerRequestNumber() {
        return uniquerRequestNumber;
    }

    public void setUniquerRequestNumber(String uniquerRequestNumber) {
        this.uniquerRequestNumber = uniquerRequestNumber;
    }
}
