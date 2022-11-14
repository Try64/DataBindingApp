package com.shurjomukhi.databindingapp;

import com.google.gson.annotations.SerializedName;

public class LoanGuarantor {

    @SerializedName("guarantorId")
    private String guarantorId;
    @SerializedName("person")
    private ResponseGetLoanDetails.Person person;
    @SerializedName("relationWithBorrower")
    private String relationWithBorrower;
    @SerializedName("createdAt")
    private String createdAt;
    @SerializedName("loanId")
    private String loanId;

    public String getGuarantorId() {
        return guarantorId;
    }

    public void setGuarantorId(String guarantorId) {
        this.guarantorId = guarantorId;
    }

    public ResponseGetLoanDetails.Person getPerson() {
        return person;
    }

    public void setPerson(ResponseGetLoanDetails.Person person) {
        this.person = person;
    }

    public String getRelationWithBorrower() {
        return relationWithBorrower;
    }

    public void setRelationWithBorrower(String relationWithBorrower) {
        this.relationWithBorrower = relationWithBorrower;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }
}
