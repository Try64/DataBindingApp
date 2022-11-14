package com.shurjomukhi.databindingapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseGetLoanDetails {

    public LoanDetails loanDetails;

    public static class Address {

        @SerializedName("addressId")
        @Expose
        private Integer addressId;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("addressLine1")
        @Expose
        private String addressLine1;
        @SerializedName("addressLine2")
        @Expose
        private String addressLine2;
        @SerializedName("postCode")
        @Expose
        private String postCode;
        @SerializedName("postOffice")
        @Expose
        private String postOffice;
        @SerializedName("thana")
        @Expose
        private String thana;
        @SerializedName("district")
        @Expose
        private String district;
        @SerializedName("division")
        @Expose
        private String division;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("fullAddr")
        @Expose
        private String fullAddr;

        /**
         * No args constructor for use in serialization
         */
        public Address() {
        }

        /**
         * @param division
         * @param country
         * @param thana
         * @param district
         * @param addressLine1
         * @param addressLine2
         * @param postCode
         * @param type
         * @param fullAddr
         * @param addressId
         * @param postOffice
         */
        public Address(Integer addressId, String type, String addressLine1, String addressLine2, String postCode, String postOffice, String thana, String district, String division, String country, String fullAddr) {
            super();
            this.addressId = addressId;
            this.type = type;
            this.addressLine1 = addressLine1;
            this.addressLine2 = addressLine2;
            this.postCode = postCode;
            this.postOffice = postOffice;
            this.thana = thana;
            this.district = district;
            this.division = division;
            this.country = country;
            this.fullAddr = fullAddr;
        }

        public Integer getAddressId() {
            return addressId;
        }

        public void setAddressId(Integer addressId) {
            this.addressId = addressId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getPostOffice() {
            return postOffice;
        }

        public void setPostOffice(String postOffice) {
            this.postOffice = postOffice;
        }

        public String getThana() {
            return thana;
        }

        public void setThana(String thana) {
            this.thana = thana;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getFullAddr() {
            return fullAddr;
        }

        public void setFullAddr(String fullAddr) {
            this.fullAddr = fullAddr;
        }

    }

    public static class BankAccount {

        @SerializedName("bankAccountId")
        @Expose
        private String bankAccountId;
        @SerializedName("routingNumber")
        @Expose
        private Integer routingNumber;
        @SerializedName("accountNumber")
        @Expose
        private String accountNumber;
        @SerializedName("accountName")
        @Expose
        private String accountName;
        @SerializedName("bankName")
        @Expose
        private String bankName;
        @SerializedName("branchName")
        @Expose
        private String branchName;
        @SerializedName("bankAccountType")
        @Expose
        private String bankAccountType;
        @SerializedName("currency")
        @Expose
        private String currency;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("nominees")
        @Expose
        private List<Object> nominees = null;
        @SerializedName("checkBookPhotoUrl")
        @Expose
        private Object checkBookPhotoUrl;

        /**
         * No args constructor for use in serialization
         */
        public BankAccount() {
        }

        /**
         * @param routingNumber
         * @param createdAt
         * @param nominees
         * @param bankAccountType
         * @param accountName
         * @param checkBookPhotoUrl
         * @param bankAccountId
         * @param branchName
         * @param bankName
         * @param currency
         * @param accountNumber
         */
        public BankAccount(String bankAccountId, Integer routingNumber, String accountNumber, String accountName, String bankName, String branchName, String bankAccountType, String currency, String createdAt, List<Object> nominees, Object checkBookPhotoUrl) {
            super();
            this.bankAccountId = bankAccountId;
            this.routingNumber = routingNumber;
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            this.bankName = bankName;
            this.branchName = branchName;
            this.bankAccountType = bankAccountType;
            this.currency = currency;
            this.createdAt = createdAt;
            this.nominees = nominees;
            this.checkBookPhotoUrl = checkBookPhotoUrl;
        }

        public String getBankAccountId() {
            return bankAccountId;
        }

        public void setBankAccountId(String bankAccountId) {
            this.bankAccountId = bankAccountId;
        }

        public Integer getRoutingNumber() {
            return routingNumber;
        }

        public void setRoutingNumber(Integer routingNumber) {
            this.routingNumber = routingNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBranchName() {
            return branchName;
        }

        public void setBranchName(String branchName) {
            this.branchName = branchName;
        }

        public String getBankAccountType() {
            return bankAccountType;
        }

        public void setBankAccountType(String bankAccountType) {
            this.bankAccountType = bankAccountType;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public List<Object> getNominees() {
            return nominees;
        }

        public void setNominees(List<Object> nominees) {
            this.nominees = nominees;
        }

        public Object getCheckBookPhotoUrl() {
            return checkBookPhotoUrl;
        }

        public void setCheckBookPhotoUrl(Object checkBookPhotoUrl) {
            this.checkBookPhotoUrl = checkBookPhotoUrl;
        }

    }

    public static class Borrower {

        @SerializedName("borrowerId")
        @Expose
        private String borrowerId;
        @SerializedName("person")
        @Expose
        private Person person;
        @SerializedName("businessId")
        @Expose
        private String businessId;
        @SerializedName("familySpendCost")
        @Expose
        private Double familySpendCost;
        @SerializedName("totalIncome")
        @Expose
        private Double totalIncome;
        @SerializedName("otherIncome")
        @Expose
        private Double otherIncome;
        @SerializedName("existingLoanAmount")
        @Expose
        private Object existingLoanAmount;
        @SerializedName("existingEmiAmount")
        @Expose
        private Object existingEmiAmount;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("borrowerType")
        @Expose
        private String borrowerType;

        @SerializedName("otherLiabilityAmount")
        private Double otherLiabilityAmount;



        /**
         * No args constructor for use in serialization
         */
        public Borrower() {
        }

        /**
         * @param otherIncome
         * @param borrowerId
         * @param totalIncome
         * @param createdAt
         * @param existingLoanAmount
         * @param borrowerType
         * @param person
         * @param businessId
         * @param familySpendCost
         * @param existingEmiAmount
         */
        public Borrower(String borrowerId, Person person, String businessId, Double familySpendCost, Double totalIncome, Double otherIncome, Object existingLoanAmount, Object existingEmiAmount, String createdAt, String borrowerType) {
            super();
            this.borrowerId = borrowerId;
            this.person = person;
            this.businessId = businessId;
            this.familySpendCost = familySpendCost;
            this.totalIncome = totalIncome;
            this.otherIncome = otherIncome;
            this.existingLoanAmount = existingLoanAmount;
            this.existingEmiAmount = existingEmiAmount;
            this.createdAt = createdAt;
            this.borrowerType = borrowerType;
        }

        public Double getOtherLiabilityAmount() {
            return otherLiabilityAmount;
        }

        public void setOtherLiabilityAmount(Double otherLiabilityAmount) {
            this.otherLiabilityAmount = otherLiabilityAmount;
        }

        public String getBorrowerId() {
            return borrowerId;
        }

        public void setBorrowerId(String borrowerId) {
            this.borrowerId = borrowerId;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public Double getFamilySpendCost() {
            return familySpendCost;
        }

        public void setFamilySpendCost(Double familySpendCost) {
            this.familySpendCost = familySpendCost;
        }

        public Double getTotalIncome() {
            return totalIncome;
        }

        public void setTotalIncome(Double totalIncome) {
            this.totalIncome = totalIncome;
        }

        public Double getOtherIncome() {
            return (Double) otherIncome;
        }

        public void setOtherIncome(Double otherIncome) {
            this.otherIncome = otherIncome;
        }

        public Object getExistingLoanAmount() {
            return existingLoanAmount;
        }

        public void setExistingLoanAmount(Object existingLoanAmount) {
            this.existingLoanAmount = existingLoanAmount;
        }

        public Object getExistingEmiAmount() {
            return existingEmiAmount;
        }

        public void setExistingEmiAmount(Object existingEmiAmount) {
            this.existingEmiAmount = existingEmiAmount;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getBorrowerType() {
            return borrowerType;
        }

        public void setBorrowerType(String borrowerType) {
            this.borrowerType = borrowerType;
        }

    }

    public static class BorrowersBusiness {

        @SerializedName("farmId")
        @Expose
        private String farmId;
        @SerializedName("name")
        @Expose
        private Object name;
        @SerializedName("ownershipType")
        @Expose
        private String ownershipType;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("sector")
        @Expose
        private String sector;
        @SerializedName("tradeLicenseNumber")
        @Expose
        private String tradeLicenseNumber;
        @SerializedName("tradeLicenseValidity")
        @Expose
        private String tradeLicenseValidity;
        @SerializedName("eshtablishYear")
        @Expose
        private Integer eshtablishYear;
        @SerializedName("shedCapacityInNumber")
        @Expose
        private Integer shedCapacityInNumber;
        @SerializedName("shedCapacityInUnits")
        @Expose
        private String shedCapacityInUnits;
        @SerializedName("employeeCount")
        @Expose
        private Integer employeeCount;
        @SerializedName("farmPremise")
        @Expose
        private String farmPremise;
        @SerializedName("fatteningCowCount")
        @Expose
        private Integer fatteningCowCount;
        @SerializedName("milkProdCowCount")
        @Expose
        private Integer milkProdCowCount;
        @SerializedName("calfCount")
        @Expose
        private Integer calfCount;
        @SerializedName("contactInfo")
        @Expose
        private ContactInfo contactInfo;
        @SerializedName("address")
        @Expose
        private Address address;
        @SerializedName("financialInfo")
        @Expose
        private FinancialInfo financialInfo;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;

        /**
         * No args constructor for use in serialization
         */
        public BorrowersBusiness() {
        }

        /**
         * @param ownershipType
         * @param fatteningCowCount
         * @param milkProdCowCount
         * @param address
         * @param contactInfo
         * @param tradeLicenseValidity
         * @param farmId
         * @param calfCount
         * @param employeeCount
         * @param shedCapacityInNumber
         * @param tradeLicenseNumber
         * @param farmPremise
         * @param createdAt
         * @param eshtablishYear
         * @param name
         * @param shedCapacityInUnits
         * @param financialInfo
         * @param category
         * @param sector
         */
        public BorrowersBusiness(String farmId, Object name, String ownershipType, String category, String sector, String tradeLicenseNumber, String tradeLicenseValidity, Integer eshtablishYear, Integer shedCapacityInNumber, String shedCapacityInUnits, Integer employeeCount, String farmPremise, Integer fatteningCowCount, Integer milkProdCowCount, Integer calfCount, ContactInfo contactInfo, Address address, FinancialInfo financialInfo, String createdAt) {
            super();
            this.farmId = farmId;
            this.name = name;
            this.ownershipType = ownershipType;
            this.category = category;
            this.sector = sector;
            this.tradeLicenseNumber = tradeLicenseNumber;
            this.tradeLicenseValidity = tradeLicenseValidity;
            this.eshtablishYear = eshtablishYear;
            this.shedCapacityInNumber = shedCapacityInNumber;
            this.shedCapacityInUnits = shedCapacityInUnits;
            this.employeeCount = employeeCount;
            this.farmPremise = farmPremise;
            this.fatteningCowCount = fatteningCowCount;
            this.milkProdCowCount = milkProdCowCount;
            this.calfCount = calfCount;
            this.contactInfo = contactInfo;
            this.address = address;
            this.financialInfo = financialInfo;
            this.createdAt = createdAt;
        }

        public String getFarmId() {
            return farmId;
        }

        public void setFarmId(String farmId) {
            this.farmId = farmId;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public String getOwnershipType() {
            return ownershipType;
        }

        public void setOwnershipType(String ownershipType) {
            this.ownershipType = ownershipType;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSector() {
            return sector;
        }

        public void setSector(String sector) {
            this.sector = sector;
        }

        public String getTradeLicenseNumber() {
            return tradeLicenseNumber;
        }

        public void setTradeLicenseNumber(String tradeLicenseNumber) {
            this.tradeLicenseNumber = tradeLicenseNumber;
        }

        public String getTradeLicenseValidity() {
            return tradeLicenseValidity;
        }

        public void setTradeLicenseValidity(String tradeLicenseValidity) {
            this.tradeLicenseValidity = tradeLicenseValidity;
        }

        public Integer getEshtablishYear() {
            return eshtablishYear;
        }

        public void setEshtablishYear(Integer eshtablishYear) {
            this.eshtablishYear = eshtablishYear;
        }

        public Integer getShedCapacityInNumber() {
            return shedCapacityInNumber;
        }

        public void setShedCapacityInNumber(Integer shedCapacityInNumber) {
            this.shedCapacityInNumber = shedCapacityInNumber;
        }

        public String getShedCapacityInUnits() {
            return shedCapacityInUnits;
        }

        public void setShedCapacityInUnits(String  shedCapacityInUnits) {
            this.shedCapacityInUnits = shedCapacityInUnits;
        }

        public Integer getEmployeeCount() {
            return employeeCount;
        }

        public void setEmployeeCount(Integer employeeCount) {
            this.employeeCount = employeeCount;
        }

        public String  getFarmPremise() {
            return farmPremise;
        }

        public void setFarmPremise(String farmPremise) {
            this.farmPremise = farmPremise;
        }

        public Integer getFatteningCowCount() {
            return fatteningCowCount;
        }

        public void setFatteningCowCount(Integer fatteningCowCount) {
            this.fatteningCowCount = fatteningCowCount;
        }

        public Integer getMilkProdCowCount() {
            return milkProdCowCount;
        }

        public void setMilkProdCowCount(Integer milkProdCowCount) {
            this.milkProdCowCount = milkProdCowCount;
        }

        public Integer getCalfCount() {
            return calfCount;
        }

        public void setCalfCount(Integer calfCount) {
            this.calfCount = calfCount;
        }

        public ContactInfo getContactInfo() {
            return contactInfo;
        }

        public void setContactInfo(ContactInfo contactInfo) {
            this.contactInfo = contactInfo;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public FinancialInfo getFinancialInfo() {
            return financialInfo;
        }

        public void setFinancialInfo(FinancialInfo financialInfo) {
            this.financialInfo = financialInfo;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }


    }

    public static class ContactInfo {

        @SerializedName("contactInfoId")
        @Expose
        private Integer contactInfoId;
        @SerializedName("primaryPhoneNumber")
        @Expose
        private String primaryPhoneNumber;
        @SerializedName("secondaryPhoneNumber")
        @Expose
        private String secondaryPhoneNumber;
        @SerializedName("primaryEmail")
        @Expose
        private String primaryEmail;
        @SerializedName("secondaryEmail")
        @Expose
        private Object secondaryEmail;
        @SerializedName("primaryFax")
        @Expose
        private Object primaryFax;
        @SerializedName("secondaryFax")
        @Expose
        private Object secondaryFax;

        /**
         * No args constructor for use in serialization
         */
        public ContactInfo() {
        }

        /**
         * @param secondaryEmail
         * @param secondaryFax
         * @param primaryFax
         * @param contactInfoId
         * @param primaryPhoneNumber
         * @param secondaryPhoneNumber
         * @param primaryEmail
         */
        public ContactInfo(Integer contactInfoId, String primaryPhoneNumber, String secondaryPhoneNumber, String primaryEmail, Object secondaryEmail, Object primaryFax, Object secondaryFax) {
            super();
            this.contactInfoId = contactInfoId;
            this.primaryPhoneNumber = primaryPhoneNumber;
            this.secondaryPhoneNumber = secondaryPhoneNumber;
            this.primaryEmail = primaryEmail;
            this.secondaryEmail = secondaryEmail;
            this.primaryFax = primaryFax;
            this.secondaryFax = secondaryFax;
        }

        public Integer getContactInfoId() {
            return contactInfoId;
        }

        public void setContactInfoId(Integer contactInfoId) {
            this.contactInfoId = contactInfoId;
        }

        public String getPrimaryPhoneNumber() {
            return primaryPhoneNumber;
        }

        public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
            this.primaryPhoneNumber = primaryPhoneNumber;
        }

        public String getSecondaryPhoneNumber() {
            return secondaryPhoneNumber;
        }

        public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
            this.secondaryPhoneNumber = secondaryPhoneNumber;
        }

        public String getPrimaryEmail() {
            return primaryEmail;
        }

        public void setPrimaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
        }

        public Object getSecondaryEmail() {
            return secondaryEmail;
        }

        public void setSecondaryEmail(Object secondaryEmail) {
            this.secondaryEmail = secondaryEmail;
        }

        public Object getPrimaryFax() {
            return primaryFax;
        }

        public void setPrimaryFax(Object primaryFax) {
            this.primaryFax = primaryFax;
        }

        public Object getSecondaryFax() {
            return secondaryFax;
        }

        public void setSecondaryFax(Object secondaryFax) {
            this.secondaryFax = secondaryFax;
        }

    }

    public static class FinancialInfo {

        @SerializedName("financialInfoId")
        @Expose
        private String financialInfoId;
        @SerializedName("insfrustructureValue")
        @Expose
        private Double insfrustructureValue;
        @SerializedName("cattleValue")
        @Expose
        private Double cattleValue;
        @SerializedName("currentAssetValue")
        @Expose
        private Double currentAssetValue;
        @SerializedName("totalAssetValue")
        @Expose
        private Double totalAssetValue;
        @SerializedName("otherFixedAssetValue")
        @Expose
        private Object otherFixedAssetValue;
        @SerializedName("salesAmount")
        @Expose
        private Double salesAmount;
        @SerializedName("businessCost")
        @Expose
        private Double businessCost;
        @SerializedName("netIncome")
        @Expose
        private Double netIncome;
        @SerializedName("totalCost")
        @Expose
        private Object totalCost;

        /**
         * No args constructor for use in serialization
         */
        public FinancialInfo() {
        }

        /**
         * @param insfrustructureValue
         * @param financialInfoId
         * @param otherFixedAssetValue
         * @param businessCost
         * @param salesAmount
         * @param cattleValue
         * @param totalAssetValue
         * @param netIncome
         * @param currentAssetValue
         * @param totalCost
         */
        public FinancialInfo(String financialInfoId, Double insfrustructureValue, Double cattleValue, Double currentAssetValue, Double totalAssetValue, Object otherFixedAssetValue, Double salesAmount, Double businessCost, Double netIncome, Object totalCost) {
            super();
            this.financialInfoId = financialInfoId;
            this.insfrustructureValue = insfrustructureValue;
            this.cattleValue = cattleValue;
            this.currentAssetValue = currentAssetValue;
            this.totalAssetValue = totalAssetValue;
            this.otherFixedAssetValue = otherFixedAssetValue;
            this.salesAmount = salesAmount;
            this.businessCost = businessCost;
            this.netIncome = netIncome;
            this.totalCost = totalCost;
        }

        public String getFinancialInfoId() {
            return financialInfoId;
        }

        public void setFinancialInfoId(String financialInfoId) {
            this.financialInfoId = financialInfoId;
        }

        public Double getInsfrustructureValue() {
            return insfrustructureValue;
        }

        public void setInsfrustructureValue(Double insfrustructureValue) {
            this.insfrustructureValue = insfrustructureValue;
        }

        public Double getCattleValue() {
            return cattleValue;
        }

        public void setCattleValue(Double cattleValue) {
            this.cattleValue = cattleValue;
        }

        public Double getCurrentAssetValue() {
            return currentAssetValue;
        }

        public void setCurrentAssetValue(Double currentAssetValue) {
            this.currentAssetValue = currentAssetValue;
        }

        public Double getTotalAssetValue() {
            return totalAssetValue;
        }

        public void setTotalAssetValue(Double totalAssetValue) {
            this.totalAssetValue = totalAssetValue;
        }

        public Object getOtherFixedAssetValue() {
            return otherFixedAssetValue;
        }

        public void setOtherFixedAssetValue(Object otherFixedAssetValue) {
            this.otherFixedAssetValue = otherFixedAssetValue;
        }

        public Double getSalesAmount() {
            return salesAmount;
        }

        public void setSalesAmount(Double salesAmount) {
            this.salesAmount = salesAmount;
        }

        public Double getBusinessCost() {
            return businessCost;
        }

        public void setBusinessCost(Double businessCost) {
            this.businessCost = businessCost;
        }

        public Double getNetIncome() {
            return netIncome;
        }

        public void setNetIncome(Double netIncome) {
            this.netIncome = netIncome;
        }

        public Object getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(Object totalCost) {
            this.totalCost = totalCost;
        }

    }

    public static class Guarantor {

        @SerializedName("personId")
        @Expose
        private String personId;
        @SerializedName("firstNameEn")
        @Expose
        private String firstNameEn;
        @SerializedName("firstNameBn")
        @Expose
        private String firstNameBn;
        @SerializedName("lastNameEn")
        @Expose
        private String lastNameEn;
        @SerializedName("lastNameBn")
        @Expose
        private String lastNameBn;
        @SerializedName("fullNameEn")
        @Expose
        private String fullNameEn;
        @SerializedName("fullNameBn")
        @Expose
        private String fullNameBn;
        @SerializedName("fathersNameEn")
        @Expose
        private String fathersNameEn;
        @SerializedName("fathersNameBn")
        @Expose
        private String fathersNameBn;
        @SerializedName("fathersOccuopation")
        @Expose
        private String fathersOccuopation;
        @SerializedName("mothersNameEn")
        @Expose
        private String mothersNameEn;
        @SerializedName("mothersNameBn")
        @Expose
        private String mothersNameBn;
        @SerializedName("mothersOccupation")
        @Expose
        private String mothersOccupation;
        @SerializedName("contactInfo")
        @Expose
        private ContactInfo contactInfo;
        @SerializedName("nidNumber")
        @Expose
        private String nidNumber;
        @SerializedName("birthDate")
        @Expose
        private String birthDate;
        @SerializedName("birthPlace")
        @Expose
        private Object birthPlace;
        @SerializedName("nationality")
        @Expose
        private String nationality;
        @SerializedName("occupation")
        @Expose
        private String occupation;
        @SerializedName("religion")
        @Expose
        private String religion;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("maritalStatus")
        @Expose
        private String maritalStatus;
        @SerializedName("spouseNameEn")
        @Expose
        private String spouseNameEn;
        @SerializedName("spouseNameBn")
        @Expose
        private Object spouseNameBn;
        @SerializedName("spouseOccupation")
        @Expose
        private String spouseOccupation;
        @SerializedName("numberOfChildren")
        @Expose
        private Integer numberOfChildren;
        @SerializedName("presentAddress")
        @Expose
        private PresentAddress presentAddress;
        @SerializedName("permanentAddress")
        @Expose
        private PermanentAddress permanentAddress;
        @SerializedName("businessAddress")
        @Expose
        private Object businessAddress;
        @SerializedName("tinNumber")
        @Expose
        private Object tinNumber;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("bankAccounts")
        @Expose
        private List<BankAccount> bankAccounts = null;
        @SerializedName("registrations")
        @Expose
        private List<Registration> registrations = null;
        @SerializedName("photoUrlOnNid")
        @Expose
        private String photoUrlOnNid;
        @SerializedName("photoUrl")
        @Expose
        private Object photoUrl;
        @SerializedName("nidFrontUrl")
        @Expose
        private Object nidFrontUrl;
        @SerializedName("nidBackUrl")
        @Expose
        private Object nidBackUrl;

        /**
         * No args constructor for use in serialization
         */
        public Guarantor() {
        }

        /**
         * @param nidNumber
         * @param occupation
         * @param contactInfo
         * @param gender
         * @param mothersOccupation
         * @param bankAccounts
         * @param nidFrontUrl
         * @param tinNumber
         * @param lastNameEn
         * @param fullNameEn
         * @param firstNameBn
         * @param birthPlace
         * @param createdAt
         * @param photoUrl
         * @param spouseNameEn
         * @param presentAddress
         * @param mothersNameEn
         * @param fathersNameEn
         * @param permanentAddress
         * @param businessAddress
         * @param registrations
         * @param nidBackUrl
         * @param lastNameBn
         * @param fullNameBn
         * @param birthDate
         * @param fathersOccuopation
         * @param religion
         * @param photoUrlOnNid
         * @param firstNameEn
         * @param spouseOccupation
         * @param numberOfChildren
         * @param nationality
         * @param spouseNameBn
         * @param personId
         * @param mothersNameBn
         * @param maritalStatus
         * @param fathersNameBn
         */
        public Guarantor(String personId, String firstNameEn, String firstNameBn, String lastNameEn, String lastNameBn, String fullNameEn, String fullNameBn, String fathersNameEn, String fathersNameBn, String fathersOccuopation, String mothersNameEn, String mothersNameBn, String mothersOccupation, ContactInfo contactInfo, String nidNumber, String birthDate, Object birthPlace, String nationality, String occupation, String religion, String gender, String maritalStatus, String spouseNameEn, Object spouseNameBn, String spouseOccupation, Integer numberOfChildren, PresentAddress presentAddress, PermanentAddress permanentAddress, Object businessAddress, Object tinNumber, String createdAt, List<BankAccount> bankAccounts, List<Registration> registrations, String photoUrlOnNid, Object photoUrl, Object nidFrontUrl, Object nidBackUrl) {
            super();
            this.personId = personId;
            this.firstNameEn = firstNameEn;
            this.firstNameBn = firstNameBn;
            this.lastNameEn = lastNameEn;
            this.lastNameBn = lastNameBn;
            this.fullNameEn = fullNameEn;
            this.fullNameBn = fullNameBn;
            this.fathersNameEn = fathersNameEn;
            this.fathersNameBn = fathersNameBn;
            this.fathersOccuopation = fathersOccuopation;
            this.mothersNameEn = mothersNameEn;
            this.mothersNameBn = mothersNameBn;
            this.mothersOccupation = mothersOccupation;
            this.contactInfo = contactInfo;
            this.nidNumber = nidNumber;
            this.birthDate = birthDate;
            this.birthPlace = birthPlace;
            this.nationality = nationality;
            this.occupation = occupation;
            this.religion = religion;
            this.gender = gender;
            this.maritalStatus = maritalStatus;
            this.spouseNameEn = spouseNameEn;
            this.spouseNameBn = spouseNameBn;
            this.spouseOccupation = spouseOccupation;
            this.numberOfChildren = numberOfChildren;
            this.presentAddress = presentAddress;
            this.permanentAddress = permanentAddress;
            this.businessAddress = businessAddress;
            this.tinNumber = tinNumber;
            this.createdAt = createdAt;
            this.bankAccounts = bankAccounts;
            this.registrations = registrations;
            this.photoUrlOnNid = photoUrlOnNid;
            this.photoUrl = photoUrl;
            this.nidFrontUrl = nidFrontUrl;
            this.nidBackUrl = nidBackUrl;
        }

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getFirstNameEn() {
            return firstNameEn;
        }

        public void setFirstNameEn(String firstNameEn) {
            this.firstNameEn = firstNameEn;
        }

        public String getFirstNameBn() {
            return firstNameBn;
        }

        public void setFirstNameBn(String firstNameBn) {
            this.firstNameBn = firstNameBn;
        }

        public String getLastNameEn() {
            return lastNameEn;
        }

        public void setLastNameEn(String lastNameEn) {
            this.lastNameEn = lastNameEn;
        }

        public String getLastNameBn() {
            return lastNameBn;
        }

        public void setLastNameBn(String lastNameBn) {
            this.lastNameBn = lastNameBn;
        }

        public String getFullNameEn() {
            return fullNameEn;
        }

        public void setFullNameEn(String fullNameEn) {
            this.fullNameEn = fullNameEn;
        }

        public String getFullNameBn() {
            return fullNameBn;
        }

        public void setFullNameBn(String fullNameBn) {
            this.fullNameBn = fullNameBn;
        }

        public String getFathersNameEn() {
            return fathersNameEn;
        }

        public void setFathersNameEn(String fathersNameEn) {
            this.fathersNameEn = fathersNameEn;
        }

        public String getFathersNameBn() {
            return fathersNameBn;
        }

        public void setFathersNameBn(String fathersNameBn) {
            this.fathersNameBn = fathersNameBn;
        }

        public String getFathersOccuopation() {
            return fathersOccuopation;
        }

        public void setFathersOccuopation(String fathersOccuopation) {
            this.fathersOccuopation = fathersOccuopation;
        }

        public String getMothersNameEn() {
            return mothersNameEn;
        }

        public void setMothersNameEn(String mothersNameEn) {
            this.mothersNameEn = mothersNameEn;
        }

        public String getMothersNameBn() {
            return mothersNameBn;
        }

        public void setMothersNameBn(String mothersNameBn) {
            this.mothersNameBn = mothersNameBn;
        }

        public String getMothersOccupation() {
            return mothersOccupation;
        }

        public void setMothersOccupation(String mothersOccupation) {
            this.mothersOccupation = mothersOccupation;
        }

        public ContactInfo getContactInfo() {
            return contactInfo;
        }

        public void setContactInfo(ContactInfo contactInfo) {
            this.contactInfo = contactInfo;
        }

        public String getNidNumber() {
            return nidNumber;
        }

        public void setNidNumber(String nidNumber) {
            this.nidNumber = nidNumber;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public Object getBirthPlace() {
            return birthPlace;
        }

        public void setBirthPlace(Object birthPlace) {
            this.birthPlace = birthPlace;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getReligion() {
            return religion;
        }

        public void setReligion(String religion) {
            this.religion = religion;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public String getSpouseNameEn() {
            return spouseNameEn;
        }

        public void setSpouseNameEn(String spouseNameEn) {
            this.spouseNameEn = spouseNameEn;
        }

        public Object getSpouseNameBn() {
            return spouseNameBn;
        }

        public void setSpouseNameBn(Object spouseNameBn) {
            this.spouseNameBn = spouseNameBn;
        }

        public String getSpouseOccupation() {
            return spouseOccupation;
        }

        public void setSpouseOccupation(String spouseOccupation) {
            this.spouseOccupation = spouseOccupation;
        }

        public Integer getNumberOfChildren() {
            return numberOfChildren;
        }

        public void setNumberOfChildren(Integer numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
        }

        public PresentAddress getPresentAddress() {
            return presentAddress;
        }

        public void setPresentAddress(PresentAddress presentAddress) {
            this.presentAddress = presentAddress;
        }

        public PermanentAddress getPermanentAddress() {
            return permanentAddress;
        }

        public void setPermanentAddress(PermanentAddress permanentAddress) {
            this.permanentAddress = permanentAddress;
        }

        public Object getBusinessAddress() {
            return businessAddress;
        }

        public void setBusinessAddress(Object businessAddress) {
            this.businessAddress = businessAddress;
        }

        public Object getTinNumber() {
            return tinNumber;
        }

        public void setTinNumber(Object tinNumber) {
            this.tinNumber = tinNumber;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public List<BankAccount> getBankAccounts() {
            return bankAccounts;
        }

        public void setBankAccounts(List<BankAccount> bankAccounts) {
            this.bankAccounts = bankAccounts;
        }

        public List<Registration> getRegistrations() {
            return registrations;
        }

        public void setRegistrations(List<Registration> registrations) {
            this.registrations = registrations;
        }

        public String getPhotoUrlOnNid() {
            return photoUrlOnNid;
        }

        public void setPhotoUrlOnNid(String photoUrlOnNid) {
            this.photoUrlOnNid = photoUrlOnNid;
        }

        public Object getPhotoUrl() {
            return photoUrl;
        }

        public void setPhotoUrl(Object photoUrl) {
            this.photoUrl = photoUrl;
        }

        public Object getNidFrontUrl() {
            return nidFrontUrl;
        }

        public void setNidFrontUrl(Object nidFrontUrl) {
            this.nidFrontUrl = nidFrontUrl;
        }

        public Object getNidBackUrl() {
            return nidBackUrl;
        }

        public void setNidBackUrl(Object nidBackUrl) {
            this.nidBackUrl = nidBackUrl;
        }

    }

    public static class PermanentAddress {

        @SerializedName("addressId")
        @Expose
        private Integer addressId;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("addressLine1")
        @Expose
        private String addressLine1;
        @SerializedName("addressLine2")
        @Expose
        private String addressLine2;
        @SerializedName("postCode")
        @Expose
        private String postCode;
        @SerializedName("postOffice")
        @Expose
        private String postOffice;
        @SerializedName("thana")
        @Expose
        private String thana;
        @SerializedName("district")
        @Expose
        private String district;
        @SerializedName("division")
        @Expose
        private String division;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("fullAddr")
        @Expose
        private String fullAddr;

        /**
         * No args constructor for use in serialization
         */
        public PermanentAddress() {
        }

        /**
         * @param division
         * @param country
         * @param thana
         * @param district
         * @param addressLine1
         * @param addressLine2
         * @param postCode
         * @param type
         * @param fullAddr
         * @param addressId
         * @param postOffice
         */
        public PermanentAddress(Integer addressId, String type, String addressLine1, String addressLine2, String postCode, String postOffice, String thana, String district, String division, String country, String fullAddr) {
            super();
            this.addressId = addressId;
            this.type = type;
            this.addressLine1 = addressLine1;
            this.addressLine2 = addressLine2;
            this.postCode = postCode;
            this.postOffice = postOffice;
            this.thana = thana;
            this.district = district;
            this.division = division;
            this.country = country;
            this.fullAddr = fullAddr;
        }

        public Integer getAddressId() {
            return addressId;
        }

        public void setAddressId(Integer addressId) {
            this.addressId = addressId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getPostOffice() {
            return postOffice;
        }

        public void setPostOffice(String postOffice) {
            this.postOffice = postOffice;
        }

        public String getThana() {
            return thana;
        }

        public void setThana(String thana) {
            this.thana = thana;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getFullAddr() {
            return fullAddr;
        }

        public void setFullAddr(String fullAddr) {
            this.fullAddr = fullAddr;
        }

    }

    public static class Person {

        @SerializedName("personId")
        @Expose
        private String personId;
        @SerializedName("firstNameEn")
        @Expose
        private String firstNameEn;
        @SerializedName("firstNameBn")
        @Expose
        private String firstNameBn;
        @SerializedName("lastNameEn")
        @Expose
        private String lastNameEn;
        @SerializedName("lastNameBn")
        @Expose
        private String lastNameBn;
        @SerializedName("fullNameEn")
        @Expose
        private String fullNameEn;
        @SerializedName("fullNameBn")
        @Expose
        private String fullNameBn;
        @SerializedName("fathersNameEn")
        @Expose
        private String fathersNameEn;
        @SerializedName("fathersNameBn")
        @Expose
        private String fathersNameBn;
        @SerializedName("fathersOccuopation")
        @Expose
        private String fathersOccuopation;
        @SerializedName("mothersNameEn")
        @Expose
        private String mothersNameEn;
        @SerializedName("mothersNameBn")
        @Expose
        private String mothersNameBn;
        @SerializedName("mothersOccupation")
        @Expose
        private String mothersOccupation;
        @SerializedName("contactInfo")
        @Expose
        private ContactInfo contactInfo;
        @SerializedName("nidNumber")
        @Expose
        private String nidNumber;
        @SerializedName("birthDate")
        @Expose
        private String birthDate;
        @SerializedName("birthPlace")
        @Expose
        private String birthPlace;
        @SerializedName("nationality")
        @Expose
        private String nationality;
        @SerializedName("occupation")
        @Expose
        private String occupation;
        @SerializedName("religion")
        @Expose
        private String religion;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("maritalStatus")
        @Expose
        private String maritalStatus;
        @SerializedName("spouseNameEn")
        @Expose
        private String spouseNameEn;
        @SerializedName("spouseNameBn")
        @Expose
        private Object spouseNameBn;
        @SerializedName("spouseOccupation")
        @Expose
        private String spouseOccupation;
        @SerializedName("numberOfChildren")
        @Expose
        private Integer numberOfChildren;
        @SerializedName("presentAddress")
        @Expose
        private PresentAddress presentAddress;
        @SerializedName("permanentAddress")
        @Expose
        private PermanentAddress permanentAddress;
        @SerializedName("businessAddress")
        @Expose
        private Object businessAddress;
        @SerializedName("tinNumber")
        @Expose
        private String tinNumber;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("bankAccounts")
        @Expose
        private List<BankAccount> bankAccounts = null;
        @SerializedName("registrations")
        @Expose
        private List<Registration> registrations = null;
        @SerializedName("photoUrlOnNid")
        @Expose
        private String photoUrlOnNid;
        @SerializedName("photoUrl")
        @Expose
        private Object photoUrl;
        @SerializedName("nidFrontUrl")
        @Expose
        private Object nidFrontUrl;
        @SerializedName("nidBackUrl")
        @Expose
        private Object nidBackUrl;

        /**
         * No args constructor for use in serialization
         */
        public Person() {
        }

        /**
         * @param nidNumber
         * @param occupation
         * @param contactInfo
         * @param gender
         * @param mothersOccupation
         * @param bankAccounts
         * @param nidFrontUrl
         * @param tinNumber
         * @param lastNameEn
         * @param fullNameEn
         * @param firstNameBn
         * @param birthPlace
         * @param createdAt
         * @param photoUrl
         * @param spouseNameEn
         * @param presentAddress
         * @param mothersNameEn
         * @param fathersNameEn
         * @param permanentAddress
         * @param businessAddress
         * @param registrations
         * @param nidBackUrl
         * @param lastNameBn
         * @param fullNameBn
         * @param birthDate
         * @param fathersOccuopation
         * @param religion
         * @param photoUrlOnNid
         * @param firstNameEn
         * @param spouseOccupation
         * @param numberOfChildren
         * @param nationality
         * @param spouseNameBn
         * @param personId
         * @param mothersNameBn
         * @param maritalStatus
         * @param fathersNameBn
         */
        public Person(String personId, String firstNameEn, String firstNameBn, String lastNameEn, String lastNameBn, String fullNameEn, String fullNameBn, String fathersNameEn, String fathersNameBn, String fathersOccuopation, String mothersNameEn, String mothersNameBn, String mothersOccupation, ContactInfo contactInfo, String nidNumber, String birthDate, String birthPlace, String nationality, String occupation, String religion, String gender, String maritalStatus, String spouseNameEn, Object spouseNameBn, String spouseOccupation, Integer numberOfChildren, PresentAddress presentAddress, PermanentAddress permanentAddress, Object businessAddress, String tinNumber, String createdAt, List<BankAccount> bankAccounts, List<Registration> registrations, String photoUrlOnNid, Object photoUrl, Object nidFrontUrl, Object nidBackUrl) {
            super();
            this.personId = personId;
            this.firstNameEn = firstNameEn;
            this.firstNameBn = firstNameBn;
            this.lastNameEn = lastNameEn;
            this.lastNameBn = lastNameBn;
            this.fullNameEn = fullNameEn;
            this.fullNameBn = fullNameBn;
            this.fathersNameEn = fathersNameEn;
            this.fathersNameBn = fathersNameBn;
            this.fathersOccuopation = fathersOccuopation;
            this.mothersNameEn = mothersNameEn;
            this.mothersNameBn = mothersNameBn;
            this.mothersOccupation = mothersOccupation;
            this.contactInfo = contactInfo;
            this.nidNumber = nidNumber;
            this.birthDate = birthDate;
            this.birthPlace = birthPlace;
            this.nationality = nationality;
            this.occupation = occupation;
            this.religion = religion;
            this.gender = gender;
            this.maritalStatus = maritalStatus;
            this.spouseNameEn = spouseNameEn;
            this.spouseNameBn = spouseNameBn;
            this.spouseOccupation = spouseOccupation;
            this.numberOfChildren = numberOfChildren;
            this.presentAddress = presentAddress;
            this.permanentAddress = permanentAddress;
            this.businessAddress = businessAddress;
            this.tinNumber = tinNumber;
            this.createdAt = createdAt;
            this.bankAccounts = bankAccounts;
            this.registrations = registrations;
            this.photoUrlOnNid = photoUrlOnNid;
            this.photoUrl = photoUrl;
            this.nidFrontUrl = nidFrontUrl;
            this.nidBackUrl = nidBackUrl;
        }

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getFirstNameEn() {
            return firstNameEn;
        }

        public void setFirstNameEn(String firstNameEn) {
            this.firstNameEn = firstNameEn;
        }

        public String getFirstNameBn() {
            return firstNameBn;
        }

        public void setFirstNameBn(String firstNameBn) {
            this.firstNameBn = firstNameBn;
        }

        public String getLastNameEn() {
            return lastNameEn;
        }

        public void setLastNameEn(String lastNameEn) {
            this.lastNameEn = lastNameEn;
        }

        public String getLastNameBn() {
            return lastNameBn;
        }

        public void setLastNameBn(String lastNameBn) {
            this.lastNameBn = lastNameBn;
        }

        public String getFullNameEn() {
            return fullNameEn;
        }

        public void setFullNameEn(String fullNameEn) {
            this.fullNameEn = fullNameEn;
        }

        public String getFullNameBn() {
            return fullNameBn;
        }

        public void setFullNameBn(String fullNameBn) {
            this.fullNameBn = fullNameBn;
        }

        public String getFathersNameEn() {
            return fathersNameEn;
        }

        public void setFathersNameEn(String fathersNameEn) {
            this.fathersNameEn = fathersNameEn;
        }

        public String getFathersNameBn() {
            return fathersNameBn;
        }

        public void setFathersNameBn(String fathersNameBn) {
            this.fathersNameBn = fathersNameBn;
        }

        public String getFathersOccuopation() {
            return fathersOccuopation;
        }

        public void setFathersOccuopation(String fathersOccuopation) {
            this.fathersOccuopation = fathersOccuopation;
        }

        public String getMothersNameEn() {
            return mothersNameEn;
        }

        public void setMothersNameEn(String mothersNameEn) {
            this.mothersNameEn = mothersNameEn;
        }

        public String getMothersNameBn() {
            return mothersNameBn;
        }

        public void setMothersNameBn(String mothersNameBn) {
            this.mothersNameBn = mothersNameBn;
        }

        public String getMothersOccupation() {
            return mothersOccupation;
        }

        public void setMothersOccupation(String mothersOccupation) {
            this.mothersOccupation = mothersOccupation;
        }

        public ContactInfo getContactInfo() {
            return contactInfo;
        }

        public void setContactInfo(ContactInfo contactInfo) {
            this.contactInfo = contactInfo;
        }

        public String getNidNumber() {
            return nidNumber;
        }

        public void setNidNumber(String nidNumber) {
            this.nidNumber = nidNumber;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getBirthPlace() {
            return birthPlace;
        }

        public void setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getReligion() {
            return religion;
        }

        public void setReligion(String religion) {
            this.religion = religion;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public String getSpouseNameEn() {
            return spouseNameEn;
        }

        public void setSpouseNameEn(String spouseNameEn) {
            this.spouseNameEn = spouseNameEn;
        }

        public Object getSpouseNameBn() {
            return spouseNameBn;
        }

        public void setSpouseNameBn(Object spouseNameBn) {
            this.spouseNameBn = spouseNameBn;
        }

        public String getSpouseOccupation() {
            return spouseOccupation;
        }

        public void setSpouseOccupation(String spouseOccupation) {
            this.spouseOccupation = spouseOccupation;
        }

        public Integer getNumberOfChildren() {
            return numberOfChildren;
        }

        public void setNumberOfChildren(Integer numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
        }

        public PresentAddress getPresentAddress() {
            return presentAddress;
        }

        public void setPresentAddress(PresentAddress presentAddress) {
            this.presentAddress = presentAddress;
        }

        public PermanentAddress getPermanentAddress() {
            return permanentAddress;
        }

        public void setPermanentAddress(PermanentAddress permanentAddress) {
            this.permanentAddress = permanentAddress;
        }

        public Object getBusinessAddress() {
            return businessAddress;
        }

        public void setBusinessAddress(Object businessAddress) {
            this.businessAddress = businessAddress;
        }

        public String getTinNumber() {
            return tinNumber;
        }

        public void setTinNumber(String tinNumber) {
            this.tinNumber = tinNumber;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public List<BankAccount> getBankAccounts() {
            return bankAccounts;
        }

        public void setBankAccounts(List<BankAccount> bankAccounts) {
            this.bankAccounts = bankAccounts;
        }

        public List<Registration> getRegistrations() {
            return registrations;
        }

        public void setRegistrations(List<Registration> registrations) {
            this.registrations = registrations;
        }

        public String getPhotoUrlOnNid() {
            return photoUrlOnNid;
        }

        public void setPhotoUrlOnNid(String photoUrlOnNid) {
            this.photoUrlOnNid = photoUrlOnNid;
        }

        public Object getPhotoUrl() {
            return photoUrl;
        }

        public void setPhotoUrl(Object photoUrl) {
            this.photoUrl = photoUrl;
        }

        public Object getNidFrontUrl() {
            return nidFrontUrl;
        }

        public void setNidFrontUrl(Object nidFrontUrl) {
            this.nidFrontUrl = nidFrontUrl;
        }

        public Object getNidBackUrl() {
            return nidBackUrl;
        }

        public void setNidBackUrl(Object nidBackUrl) {
            this.nidBackUrl = nidBackUrl;
        }


//        public com.sm.smlibrary.models.Person getModelPerson(){
//            com.sm.smlibrary.models.Person resultPerson = new com.sm.smlibrary.models.Person();
//
//            resultPerson.setPersonId(this.getPersonId());
//            this.personId = personId;
//            this.firstNameEn = firstNameEn;
//            this.firstNameBn = firstNameBn;
//            this.lastNameEn = lastNameEn;
//            this.lastNameBn = lastNameBn;
//            this.fullNameEn = fullNameEn;
//            this.fullNameBn = fullNameBn;
//            this.fathersNameEn = fathersNameEn;
//            this.fathersNameBn = fathersNameBn;
//            this.fathersOccuopation = fathersOccuopation;
//            this.mothersNameEn = mothersNameEn;
//            this.mothersNameBn = mothersNameBn;
//            this.mothersOccupation = mothersOccupation;
//            this.contactInfo = contactInfo;
//            this.nidNumber = nidNumber;
//            this.birthDate = birthDate;
//            this.birthPlace = birthPlace;
//            this.nationality = nationality;
//            this.occupation = occupation;
//            this.religion = religion;
//            this.gender = gender;
//            this.maritalStatus = maritalStatus;
//            this.spouseNameEn = spouseNameEn;
//            this.spouseNameBn = spouseNameBn;
//            this.spouseOccupation = spouseOccupation;
//            this.numberOfChildren = numberOfChildren;
//            this.presentAddress = presentAddress;
//            this.permanentAddress = permanentAddress;
//            this.businessAddress = businessAddress;
//            this.tinNumber = tinNumber;
//            this.createdAt = createdAt;
//            this.bankAccounts = bankAccounts;
//            this.registrations = registrations;
//            this.photoUrlOnNid = photoUrlOnNid;
//            this.registrationId = registrationId;
//            this.photoUrl = photoUrl;
//            this.nidFrontUrl = nidFrontUrl;
//            this.nidBackUrl = nidBackUrl;
//
//        }

    }

    public static class PresentAddress {

        @SerializedName("addressId")
        @Expose
        private Integer addressId;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("addressLine1")
        @Expose
        private String addressLine1;
        @SerializedName("addressLine2")
        @Expose
        private Object addressLine2;
        @SerializedName("postCode")
        @Expose
        private String postCode;
        @SerializedName("postOffice")
        @Expose
        private String postOffice;
        @SerializedName("thana")
        @Expose
        private String thana;
        @SerializedName("district")
        @Expose
        private String district;
        @SerializedName("division")
        @Expose
        private String division;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("fullAddr")
        @Expose
        private String fullAddr;

        /**
         * No args constructor for use in serialization
         */
        public PresentAddress() {
        }

        /**
         * @param division
         * @param country
         * @param thana
         * @param district
         * @param addressLine1
         * @param addressLine2
         * @param postCode
         * @param type
         * @param fullAddr
         * @param addressId
         * @param postOffice
         */
        public PresentAddress(Integer addressId, String type, String addressLine1, Object addressLine2, String postCode, String postOffice, String thana, String district, String division, String country, String fullAddr) {
            super();
            this.addressId = addressId;
            this.type = type;
            this.addressLine1 = addressLine1;
            this.addressLine2 = addressLine2;
            this.postCode = postCode;
            this.postOffice = postOffice;
            this.thana = thana;
            this.district = district;
            this.division = division;
            this.country = country;
            this.fullAddr = fullAddr;
        }

        public Integer getAddressId() {
            return addressId;
        }

        public void setAddressId(Integer addressId) {
            this.addressId = addressId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public Object getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(Object addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getPostOffice() {
            return postOffice;
        }

        public void setPostOffice(String postOffice) {
            this.postOffice = postOffice;
        }

        public String getThana() {
            return thana;
        }

        public void setThana(String thana) {
            this.thana = thana;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getFullAddr() {
            return fullAddr;
        }

        public void setFullAddr(String fullAddr) {
            this.fullAddr = fullAddr;
        }

    }

    public static class Registration {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("initiatedAt")
        @Expose
        private String initiatedAt;
        @SerializedName("comment")
        @Expose
        private String comment;
        @SerializedName("photoUrlFromNid")
        @Expose
        private String photoUrlFromNid;

        /**
         * No args constructor for use in serialization
         */
        public Registration() {
        }

        /**
         * @param initiatedAt
         * @param photoUrlFromNid
         * @param comment
         * @param id
         * @param type
         * @param status
         */
        public Registration(String id, String type, String status, String initiatedAt, String comment, String photoUrlFromNid) {
            super();
            this.id = id;
            this.type = type;
            this.status = status;
            this.initiatedAt = initiatedAt;
            this.comment = comment;
            this.photoUrlFromNid = photoUrlFromNid;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getInitiatedAt() {
            return initiatedAt;
        }

        public void setInitiatedAt(String initiatedAt) {
            this.initiatedAt = initiatedAt;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPhotoUrlFromNid() {
            return photoUrlFromNid;
        }

        public void setPhotoUrlFromNid(String photoUrlFromNid) {
            this.photoUrlFromNid = photoUrlFromNid;
        }

    }

    public static class GuarantorsDoc {

        @SerializedName("personId")
        private String personId;
        @SerializedName("photo")
        private String photo;
        @SerializedName("tin")
        private String tin;
        @SerializedName("name")
        private String name;
        @SerializedName("nidPhotoBack")
        private String nidBack;
        @SerializedName("nidPhotoFront")
        private String nidFront;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNidBack() {
            return nidBack;
        }

        public void setNidBack(String nidBack) {
            this.nidBack = nidBack;
        }

        public String getNidFront() {
            return nidFront;
        }

        public void setNidFront(String nidFront) {
            this.nidFront = nidFront;
        }

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getTin() {
            return tin;
        }

        public void setTin(String tin) {
            this.tin = tin;
        }

    }

    public static class Document {

        @SerializedName("applicantPhoto")
        private String applicantPhoto;
        @SerializedName("applicantNidPhotoFront")
        private String applicantNidPhotoFront;
        @SerializedName("applicantNidPhotoBack")
        private String applicantNidPhotoBack;
        @SerializedName("applicantTin")
        private String applicantTIN;
        @SerializedName("applicantBankStatement")
        private String applicantBankStatement;
        @SerializedName("applicantCibUndertakingSigned")
        private String applicantCibUndertakingSigned;
        @SerializedName("applicantCibUndertakingUnsigned")
        private String applicantCibUndertakingUnsigned;
        @SerializedName("guarantorsDocs")
        private List<GuarantorsDoc> guarantorsDocs = null;
        @SerializedName("guarantorCibUndertakingSigned")
        private String guarantorCibUndertakingSigned;
        @SerializedName("guarantorCibUndertakingUnsigned")
        private String guarantorCibUndertakingUnsigned;
        @SerializedName("businessPhotos")
        private List<String> businessPhotos = null;
        @SerializedName("businessTradeLicense")
        private String businessTradeLicense;
        @SerializedName("businessUtilyBillCopy")
        private String businessUtilyBillCopy;
        @SerializedName("businessInsuranceReceipt")
        private String businessInsuranceReceipt;
        @SerializedName("businessPurchaseReceipts")
        private List<Object> businessPurchaseReceipts = null;
        @SerializedName("banglaLoanFormUnsigned")
        private String banglaLoanFormUnsigned;
        @SerializedName("englishLoanFormUnsigned")
        private String englishLoanFormUnsigned;
        @SerializedName("banglaLoanFormSigned")
        private String banglaLoanFormSigned;
        @SerializedName("englishLoanFormSigned")
        private String englishLoanFormSigned;
        @SerializedName("loanApprovalReceipt")
        private String loanApprovalReceipt;

        public String getApplicantPhoto() {
            return applicantPhoto;
        }

        public void setApplicantPhoto(String applicantPhoto) {
            this.applicantPhoto = applicantPhoto;
        }

        public String getApplicantNidPhotoFront() {
            return applicantNidPhotoFront;
        }

        public void setApplicantNidPhotoFront(String applicantNidPhotoFront) {
            this.applicantNidPhotoFront = applicantNidPhotoFront;
        }

        public String getApplicantNidPhotoBack() {
            return applicantNidPhotoBack;
        }

        public void setApplicantNidPhotoBack(String applicantNidPhotoBack) {
            this.applicantNidPhotoBack = applicantNidPhotoBack;
        }

        public String getApplicantTin() {
            return applicantTIN;
        }

        public void setApplicantTin(String applicantTin) {
            this.applicantTIN = applicantTin;
        }

        public String getApplicantBankStatement() {
            return applicantBankStatement;
        }

        public void setApplicantBankStatement(String applicantBankStatement) {
            this.applicantBankStatement = applicantBankStatement;
        }

        public String getApplicantCibUndertakingSigned() {
            return applicantCibUndertakingSigned;
        }

        public void setApplicantCibUndertakingSigned(String applicantCibUndertakingSigned) {
            this.applicantCibUndertakingSigned = applicantCibUndertakingSigned;
        }

        public String getApplicantCibUndertakingUnsigned() {
            return applicantCibUndertakingUnsigned;
        }

        public void setApplicantCibUndertakingUnsigned(String applicantCibUndertakingUnsigned) {
            this.applicantCibUndertakingUnsigned = applicantCibUndertakingUnsigned;
        }

        public List<GuarantorsDoc> getGuarantorsDocs() {
            return guarantorsDocs;
        }

        public void setGuarantorsDocs(List<GuarantorsDoc> guarantorsDocs) {
            this.guarantorsDocs = guarantorsDocs;
        }

        public String getGuarantorCibUndertakingSigned() {
            return guarantorCibUndertakingSigned;
        }

        public void setGuarantorCibUndertakingSigned(String guarantorCibUndertakingSigned) {
            this.guarantorCibUndertakingSigned = guarantorCibUndertakingSigned;
        }

        public String getGuarantorCibUndertakingUnsigned() {
            return guarantorCibUndertakingUnsigned;
        }

        public void setGuarantorCibUndertakingUnsigned(String guarantorCibUndertakingUnsigned) {
            this.guarantorCibUndertakingUnsigned = guarantorCibUndertakingUnsigned;
        }

        public List<String> getBusinessPhotos() {
            return businessPhotos;
        }

        public void setBusinessPhotos(List<String> businessPhotos) {
            this.businessPhotos = businessPhotos;
        }

        public String getBusinessTradeLicense() {
            return businessTradeLicense;
        }

        public void setBusinessTradeLicense(String businessTradeLicense) {
            this.businessTradeLicense = businessTradeLicense;
        }

        public String getBusinessUtilyBillCopy() {
            return businessUtilyBillCopy;
        }

        public void setBusinessUtilyBillCopy(String businessUtilyBillCopy) {
            this.businessUtilyBillCopy = businessUtilyBillCopy;
        }

        public String getBusinessInsuranceReceipt() {
            return businessInsuranceReceipt;
        }

        public void setBusinessInsuranceReceipt(String businessInsuranceReceipt) {
            this.businessInsuranceReceipt = businessInsuranceReceipt;
        }

        public List<Object> getBusinessPurchaseReceipts() {
            return businessPurchaseReceipts;
        }

        public void setBusinessPurchaseReceipts(List<Object> businessPurchaseReceipts) {
            this.businessPurchaseReceipts = businessPurchaseReceipts;
        }

        public String getBanglaLoanFormUnsigned() {
            return banglaLoanFormUnsigned;
        }

        public void setBanglaLoanFormUnsigned(String banglaLoanFormUnsigned) {
            this.banglaLoanFormUnsigned = banglaLoanFormUnsigned;
        }

        public String getEnglishLoanFormUnsigned() {
            return englishLoanFormUnsigned;
        }

        public void setEnglishLoanFormUnsigned(String englishLoanFormUnsigned) {
            this.englishLoanFormUnsigned = englishLoanFormUnsigned;
        }

        public String getBanglaLoanFormSigned() {
            return banglaLoanFormSigned;
        }

        public void setBanglaLoanFormSigned(String banglaLoanFormSigned) {
            this.banglaLoanFormSigned = banglaLoanFormSigned;
        }

        public String getEnglishLoanFormSigned() {
            return englishLoanFormSigned;
        }

        public void setEnglishLoanFormSigned(String englishLoanFormSigned) {
            this.englishLoanFormSigned = englishLoanFormSigned;
        }

        public String getLoanApprovalReceipt() {
            return loanApprovalReceipt;
        }

        public void setLoanApprovalReceipt(String loanApprovalReceipt) {
            this.loanApprovalReceipt = loanApprovalReceipt;
        }

    }



    public ResponseGetLoanDetails(LoanDetails loanDetails) {
        this.loanDetails = loanDetails;
    }

    public LoanDetails getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(LoanDetails loanDetails) {
        this.loanDetails = loanDetails;
    }

    public static class LoanDetails {

        @SerializedName("loanId")
        @Expose
        private String loanId;
        @SerializedName("amount")
        @Expose
        private Double amount;
        @SerializedName("tenure")
        @Expose
        private Integer tenure;
        @SerializedName("borrower")
        @Expose
        private Borrower borrower;
        @SerializedName("guarantors")
        @Expose
        private List<Guarantor> guarantors = null;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("lender")
        @Expose
        private String lender;
        @SerializedName("agreementConfirmed")
        @Expose
        private Boolean agreementConfirmed;
        @SerializedName("submittedByUser")
        @Expose
        private Object submittedByUser;
        @SerializedName("extProposalCode")
        @Expose
        private Object extProposalCode;
        @SerializedName("extLoanStatus")
        @Expose
        private Object extLoanStatus;
        @SerializedName("extStatusUpdatedAt")
        @Expose
        private Object extStatusUpdatedAt;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("comment")
        @Expose
        private String comment;
        @SerializedName("borrowersBusiness")
        @Expose
        private BorrowersBusiness borrowersBusiness;
        @SerializedName("guarantor")
        @Expose
        private Guarantor guarantor;

        /**
         * No args constructor for use in serialization
         */
        public LoanDetails() {
        }

        /**
         * @param agreementConfirmed
         * @param extLoanStatus
         * @param amount
         * @param borrower
         * @param guarantor
         * @param extStatusUpdatedAt
         * @param extProposalCode
         * @param createdAt
         * @param lender
         * @param submittedByUser
         * @param comment
         * @param loanId
         * @param tenure
         * @param guarantors
         * @param status
         * @param borrowersBusiness
         */
        public LoanDetails(String loanId, Double amount, Integer tenure, Borrower borrower, List<Guarantor> guarantors, String status, String lender, Boolean agreementConfirmed, Object submittedByUser, Object extProposalCode, Object extLoanStatus, Object extStatusUpdatedAt, String createdAt, String comment, BorrowersBusiness borrowersBusiness, Guarantor guarantor) {
            super();
            this.loanId = loanId;
            this.amount = amount;
            this.tenure = tenure;
            this.borrower = borrower;
            this.guarantors = guarantors;
            this.status = status;
            this.lender = lender;
            this.agreementConfirmed = agreementConfirmed;
            this.submittedByUser = submittedByUser;
            this.extProposalCode = extProposalCode;
            this.extLoanStatus = extLoanStatus;
            this.extStatusUpdatedAt = extStatusUpdatedAt;
            this.createdAt = createdAt;
            this.comment = comment;
            this.borrowersBusiness = borrowersBusiness;
            this.guarantor = guarantor;
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

        public Borrower getBorrower() {
            return borrower;
        }

        public void setBorrower(Borrower borrower) {
            this.borrower = borrower;
        }

        public List<Guarantor> getGuarantors() {
            return guarantors;
        }

        public void setGuarantors(List<Guarantor> guarantors) {
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

        public Object getSubmittedByUser() {
            return submittedByUser;
        }

        public void setSubmittedByUser(Object submittedByUser) {
            this.submittedByUser = submittedByUser;
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

        public BorrowersBusiness getBorrowersBusiness() {
            return borrowersBusiness;
        }

        public void setBorrowersBusiness(BorrowersBusiness borrowersBusiness) {
            this.borrowersBusiness = borrowersBusiness;
        }

        public Guarantor getGuarantor() {
            return guarantor;
        }

        public void setGuarantor(Guarantor guarantor) {
            this.guarantor = guarantor;
        }
    }
}