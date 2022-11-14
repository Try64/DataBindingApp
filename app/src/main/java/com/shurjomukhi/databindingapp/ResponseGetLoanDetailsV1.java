package com.shurjomukhi.databindingapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseGetLoanDetailsV1 {

    @SerializedName("loanId")//
    private String loanId;
    @SerializedName("amount")
    private Double amount;
    @SerializedName("tenure")
    private Integer tenure;
    @SerializedName("borrower")
    private ResponseGetLoanDetails.Borrower borrower;
    @SerializedName("guarantors")
    private List<LoanGuarantor> guarantors = null;
    @SerializedName("status")
    private String status;
    @SerializedName("loanObjective")
    private String loanObjective;
    @SerializedName("lender")//loanObjective
    private String lender;
    @SerializedName("agreementConfirmed")
    private Boolean agreementConfirmed;
    @SerializedName("extProposalCode")
    private Object extProposalCode;
    @SerializedName("extLoanStatus")
    private Object extLoanStatus;
    @SerializedName("extStatusUpdatedAt")
    private Object extStatusUpdatedAt;
    @SerializedName("lastModifiedAt")
    private String lastModifiedAt;
    @SerializedName("createdAt")
    private String createdAt;
    @SerializedName("comment")
    private String comment;
    @SerializedName("borrowersBusiness")
    private ResponseGetLoanDetails.BorrowersBusiness borrowersBusiness;
    @SerializedName("guarantor")
    private ResponseGetLoanDetails.Guarantor guarantor;
    @SerializedName("document")
    private ResponseGetLoanDetails.Document document;


    public ResponseGetLoanDetails.BorrowersBusiness getBorrowersBusiness() {
        return borrowersBusiness;
    }

    public void setBorrowersBusiness(ResponseGetLoanDetails.BorrowersBusiness borrowersBusiness) {
        this.borrowersBusiness = borrowersBusiness;
    }

    public ResponseGetLoanDetails.Guarantor getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(ResponseGetLoanDetails.Guarantor guarantor) {
        this.guarantor = guarantor;
    }

    public ResponseGetLoanDetails.Document getDocument() {
        return document;
    }

    public void setDocument(ResponseGetLoanDetails.Document document) {
        this.document = document;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

    public ResponseGetLoanDetails.Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(ResponseGetLoanDetails.Borrower borrower) {
        this.borrower = borrower;
    }

    public List<LoanGuarantor> getGuarantors() {
        return guarantors;
    }

    public void setGuarantors(List<LoanGuarantor> guarantors) {
        this.guarantors = guarantors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public Boolean getAgreementConfirmed() {
        return agreementConfirmed;
    }

    public void setAgreementConfirmed(Boolean agreementConfirmed) {
        this.agreementConfirmed = agreementConfirmed;
    }

    public Object getExtProposalCode() {
        return extProposalCode;
    }

    public void setExtProposalCode(Object extProposalCode) {
        this.extProposalCode = extProposalCode;
    }

    public Object getExtLoanStatus() {
        return extLoanStatus;
    }

    public void setExtLoanStatus(Object extLoanStatus) {
        this.extLoanStatus = extLoanStatus;
    }

    public Object getExtStatusUpdatedAt() {
        return extStatusUpdatedAt;
    }

    public void setExtStatusUpdatedAt(Object extStatusUpdatedAt) {
        this.extStatusUpdatedAt = extStatusUpdatedAt;
    }

    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLoanObjective() {
        return loanObjective;
    }

    public void setLoanObjective(String loanObjective) {
        this.loanObjective = loanObjective;
    }

}
