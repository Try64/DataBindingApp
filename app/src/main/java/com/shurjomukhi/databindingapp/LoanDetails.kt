package com.shurjomukhi.databindingapp


import com.google.gson.annotations.SerializedName

data class LoanDetails(
    val agreementConfirmed: Boolean?,
    val amount: Double?,
    val borrower: Borrower?,
    val borrowersBusiness: BorrowersBusiness?,
    val comment: String?,
    val createdAt: String?,
    val document: Document?,
    val extLoanStatus: Any?,
    val extProposalCode: Any?,
    val extStatusUpdatedAt: Any?,
    val guarantors: List<Guarantor?>?,
    val lastModifiedAt: String?,
    val lender: String?,
    val loanId: String?,
    val loanObjective: String?,
    val locked: Boolean?,
    val reviewId: Any?,
    val status: String?,
    val tenure: Int?
) {
    data class Borrower(
        val borrowerId: String?,
        val borrowerType: String?,
        val businessId: String?,
        val createdAt: String?,
        val existingEmiAmount: Double?,
        val existingLoanAmount: Double?,
        val familySpendCost: Double?,
        val loanId: String?,
        val locked: Boolean?,
        val otherIncome: Double?,
        val otherLiabilityAmount: Double?,
        val person: Person?,
        val totalIncome: Double?
    ) {
        data class Person(
            val bankAccounts: List<BankAccount?>?,
            val birthDate: String?,
            val birthPlace: String?,
            val businessAddress: Any?,
            val contactInfo: ContactInfo?,
            val createdAt: String?,
            val fathersNameBn: String?,
            val fathersNameEn: String?,
            val fathersOccuopation: String?,
            val firstNameBn: String?,
            val firstNameEn: String?,
            val fullNameBn: String?,
            val fullNameEn: String?,
            val gender: String?,
            val lastNameBn: String?,
            val lastNameEn: String?,
            val maritalStatus: String?,
            val mothersNameBn: String?,
            val mothersNameEn: String?,
            val mothersOccupation: String?,
            val nationality: String?,
            val nidNumber: String?,
            val numberOfChildren: Int?,
            val occupation: String?,
            val permanentAddress: PermanentAddress?,
            val personId: String?,
            val photoUrlOnNid: String?,
            val presentAddress: PresentAddress?,
            val registrations: List<Registration?>?,
            val religion: String?,
            val spouseNameBn: Any?,
            val spouseNameEn: String?,
            val spouseOccupation: String?,
            val tinNumber: String?
        ) {
            data class BankAccount(
                val accountName: String?,
                val accountNumber: String?,
                val bankAccountId: String?,
                val bankAccountType: String?,
                val bankName: String?,
                val branchName: String?,
                val createdAt: String?,
                val currency: String?,
                val nominees: List<Any?>?,
                val routingNumber: Int?
            )

            data class ContactInfo(
                val contactInfoId: Int?,
                val primaryEmail: String?,
                val primaryFax: String?,
                val primaryPhoneNumber: String?,
                val secondaryEmail: String?,
                val secondaryFax: String?,
                val secondaryPhoneNumber: String?
            )

            data class PermanentAddress(
                val addressId: Int?,
                val addressLine1: String?,
                val addressLine2: String?,
                val country: String?,
                val district: String?,
                val division: String?,
                val fullAddr: String?,
                val postCode: String?,
                val postOffice: String?,
                val thana: String?,
                val type: String?
            )

            data class PresentAddress(
                val addressId: Int?,
                val addressLine1: String?,
                val addressLine2: String?,
                val country: String?,
                val district: String?,
                val division: String?,
                val fullAddr: String?,
                val postCode: String?,
                val postOffice: String?,
                val thana: String?,
                val type: String?
            )

            data class Registration(
                val comment: String?,
                val id: String?,
                val initiatedAt: String?,
                val photoUrlFromNid: String?,
                val status: String?,
                val type: String?
            )
        }
    }

    data class BorrowersBusiness(
        val address: Address?,
        val calfCount: Int?,
        val category: String?,
        val contactInfo: ContactInfo?,
        val createdAt: String?,
        val employeeCount: Int?,
        val eshtablishYear: Int?,
        val farmId: String?,
        val farmPremise: String?,
        val fatteningCowCount: Int?,
        val financialInfo: FinancialInfo?,
        val milkProdCowCount: Int?,
        val name: String?,
        val ownershipType: String?,
        val sector: String?,
        val shedCapacityInNumber: Int?,
        val shedCapacityInUnits: String?,
        val tradeLicenseNumber: String?,
        val tradeLicenseValidity: String?
    ) {
        data class Address(
            val addressId: Int?,
            val addressLine1: String?,
            val addressLine2: String?,
            val country: String?,
            val district: String?,
            val division: String?,
            val fullAddr: String?,
            val postCode: String?,
            val postOffice: String?,
            val thana: String?,
            val type: String?
        )

        data class ContactInfo(
            val contactInfoId: Int?,
            val primaryEmail: String?,
            val primaryFax: String?,
            val primaryPhoneNumber: String?,
            val secondaryEmail: String?,
            val secondaryFax: String?,
            val secondaryPhoneNumber: String?
        )

        data class FinancialInfo(
            val businessCost: Double?,
            val cattleValue: Double?,
            val currentAssetValue: Double?,
            val financialInfoId: String?,
            val insfrustructureValue: Double?,
            val netIncome: Double?,
            val otherFixedAssetValue: Double?,
            val salesAmount: Double?,
            val totalAssetValue: Double?,
            val totalCost: Double?
        )
    }

    data class Document(
        val applicantBankStatement: String?,
        val applicantCibUndertakingSigned: String?,
        val applicantCibUndertakingUnsigned: Any?,
        val applicantNidPhotoBack: String?,
        val applicantNidPhotoFront: String?,
        val applicantPhoto: String?,
        val applicantTin: String?,
        val banglaLoanFormSigned: String?,
        val banglaLoanFormUnsigned: Any?,
        val businessInsuranceReceipt: String?,
        val businessPhotos: List<String?>?,
        val businessPurchaseReceipts: List<Any?>?,
        val businessTradeLicense: String?,
        val businessUtilyBillCopy: String?,
        val englishLoanFormSigned: String?,
        val englishLoanFormUnsigned: Any?,
        val guarantorCibUndertakingSigned: String?,
        val guarantorCibUndertakingUnsigned: Any?,
        val guarantorsDocs: List<GuarantorsDoc?>?,
        val loanApprovalReceipt: String?
    ) {
        data class GuarantorsDoc(
            val name: String?,
            val nidPhotoBack: String?,
            val nidPhotoFront: String?,
            val personId: String?,
            val photo: String?,
            val tin: String?
        )
    }

    data class Guarantor(
        val createdAt: String?,
        val guarantorId: String?,
        val loanId: String?,
        val locked: Boolean?,
        val person: Person?,
        val relationWithBorrower: String?
    ) {
        data class Person(
            val bankAccounts: List<BankAccount?>?,
            val birthDate: String?,
            val birthPlace: String?,
            val businessAddress: Any?,
            val contactInfo: ContactInfo?,
            val createdAt: String?,
            val fathersNameBn: String?,
            val fathersNameEn: String?,
            val fathersOccuopation: String?,
            val firstNameBn: String?,
            val firstNameEn: String?,
            val fullNameBn: String?,
            val fullNameEn: String?,
            val gender: String?,
            val lastNameBn: String?,
            val lastNameEn: String?,
            val maritalStatus: String?,
            val mothersNameBn: String?,
            val mothersNameEn: String?,
            val mothersOccupation: String?,
            val nationality: String?,
            val nidNumber: String?,
            val numberOfChildren: Int?,
            val occupation: String?,
            val permanentAddress: PermanentAddress?,
            val personId: String?,
            val photoUrlOnNid: String?,
            val presentAddress: PresentAddress?,
            val registrations: List<Registration?>?,
            val religion: String?,
            val spouseNameBn: Any?,
            val spouseNameEn: Any?,
            val spouseOccupation: Any?,
            val tinNumber: String?
        ) {
            data class BankAccount(
                val accountName: String?,
                val accountNumber: String?,
                val bankAccountId: String?,
                val bankAccountType: String?,
                val bankName: String?,
                val branchName: String?,
                val createdAt: String?,
                val currency: String?,
                val nominees: List<Any?>?,
                val routingNumber: Int?
            )

            data class ContactInfo(
                val contactInfoId: Int?,
                val primaryEmail: String?,
                val primaryFax: String?,
                val primaryPhoneNumber: String?,
                val secondaryEmail: String?,
                val secondaryFax: String?,
                val secondaryPhoneNumber: String?
            )

            data class PermanentAddress(
                val addressId: Int?,
                val addressLine1: String?,
                val addressLine2: String?,
                val country: String?,
                val district: String?,
                val division: String?,
                val fullAddr: String?,
                val postCode: String?,
                val postOffice: String?,
                val thana: String?,
                val type: String?
            )

            data class PresentAddress(
                val addressId: Int?,
                val addressLine1: String?,
                val addressLine2: String?,
                val country: String?,
                val district: String?,
                val division: String?,
                val fullAddr: String?,
                val postCode: String?,
                val postOffice: String?,
                val thana: String?,
                val type: String?
            )

            data class Registration(
                val comment: String?,
                val id: String?,
                val initiatedAt: String?,
                val photoUrlFromNid: String?,
                val status: String?,
                val type: String?
            )
        }
    }
}