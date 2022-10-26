package com.shurjomukhi.databindingapp

import androidx.lifecycle.*
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class DefaultViewModel(private val repository: LendingAppRepository):ViewModel(),LifecycleObserver {


    private val _loanDetailsMLD: MutableLiveData<DataState<LoanDetails>> = MutableLiveData()
    val loanDetailsLD: LiveData<DataState<LoanDetails>>
        get() = _loanDetailsMLD

    fun getLoanDetails(loanID:String = "28718F55",token:String = "14f9dd0031392c3b45e4c27b4da38b61a18a0fb2"){
        viewModelScope.launch {
            repository.getLoanDetails(loanID,token ).onEach {
                _loanDetailsMLD.value = it
            }.launchIn(viewModelScope)
        }
    }



//    private val countriesMLD: MutableLiveData<DataState<CountriesGetResponse>> = MutableLiveData()
//    val countriesLD: LiveData<DataState<CountriesGetResponse>>
//        get() = countriesMLD
//
//    fun getCountries(){
//        viewModelScope.launch {
//            repository.getCountryList().onEach {
//                countriesMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val registrationByFileMLD: MutableLiveData<DataState<ResponsePostKAMRegistrationFile>> = MutableLiveData()
//    val registrationByFileLD: LiveData<DataState<ResponsePostKAMRegistrationFile>>
//        get() = registrationByFileMLD
//
//    fun requestRegistrationWithFile(front: File,back:File){
//        viewModelScope.launch {
//            repository.registrationNIDWithFile(front,back).onEach {
//                registrationByFileMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val registrationByInputMLD: MutableLiveData<DataState<ResponsePostKAMRegistrationFile>> = MutableLiveData()
//    val registrationByInputLD: LiveData<DataState<ResponsePostKAMRegistrationFile>>
//        get() = registrationByInputMLD
//
//    fun requestRegistrationWithInfo(body: RequestPostKAMRegistration){
//        viewModelScope.launch {
//            repository.uploadNIDInfo(body).onEach {
//                registrationByInputMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val roContactUpdateMLD: MutableLiveData<DataState<ResponsePostUpdateROContactInfo>> = MutableLiveData()
//    val roContactUpdateLD: LiveData<DataState<ResponsePostUpdateROContactInfo>>
//        get() = roContactUpdateMLD
//
//    fun updateContactInfoForRO(body: RequestPostUpdateROContactInfo){
//        viewModelScope.launch {
//            repository.updateROContactInfo(body).onEach {
//                roContactUpdateMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val roAccountFinalizeMLD: MutableLiveData<DataState<ResponsePostROAccountFinalization>> = MutableLiveData()
//    val roAccountFinalizeLD: LiveData<DataState<ResponsePostROAccountFinalization>>
//        get() = roAccountFinalizeMLD
//
//    fun finalizeAccountForRO(body: RequestPostROAccountFinalization){
//        viewModelScope.launch {
//            repository.finalizeRORequest(body).onEach {
//                roAccountFinalizeMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val responseLoginMLD: MutableLiveData<DataState<ResponseROLogin>> = MutableLiveData()
//    val responseLoginLD: LiveData<DataState<ResponseROLogin>>
//        get() = responseLoginMLD
//
//    fun login(body: RequestROLogin){
//        viewModelScope.launch {
//            repository.getLogin(body).onEach {
//                responseLoginMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val getMerchantListMLD: MutableLiveData<DataState<ResponseGetMerchantList>> = MutableLiveData()
//    val getMerchantListLD: LiveData<DataState<ResponseGetMerchantList>>
//        get() = getMerchantListMLD
//
//    fun getMerchantList(){
//        viewModelScope.launch {
//            repository.getMerchantList().onEach {
//                getMerchantListMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    /**
//     * Space for Merchant CallBacks
//     */
//
//    private val merchantRegistrationByFileMLD: MutableLiveData<DataState<ResponsePostKAMRegistrationFile>> = MutableLiveData()
//    val merchantRegistrationByFileLD: LiveData<DataState<ResponsePostKAMRegistrationFile>>
//        get() = merchantRegistrationByFileMLD
//
//    fun requestMerchantRegistrationWithFile(front: File,back:File){
//        viewModelScope.launch {
//            repository.registrationNIDWithFileForMerchant(front,back).onEach {
//                merchantRegistrationByFileMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val merchantRegistrationByInputMLD: MutableLiveData<DataState<ResponsePostKAMRegistrationFile>> = MutableLiveData()
//    val merchantRegistrationByInputLD: LiveData<DataState<ResponsePostKAMRegistrationFile>>
//        get() = merchantRegistrationByInputMLD
//
//    fun requestMerchantRegistrationWithInfo(body: RequestPostKAMRegistration){
//        viewModelScope.launch {
//            repository.uploadNIDInfoForMerchant(body).onEach {
//                merchantRegistrationByInputMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val merchantContactUpdateMLD: MutableLiveData<DataState<ResponsePostUpdateROContactInfo>> = MutableLiveData()
//    val merchantContactUpdateLD: LiveData<DataState<ResponsePostUpdateROContactInfo>>
//        get() = merchantContactUpdateMLD
//
//    fun updateContactInfoForMerchant(body: RequestPostUpdateROContactInfo){
//        viewModelScope.launch {
//            repository.updateMerchantContactInfo(body).onEach {
//                merchantContactUpdateMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//
//    private val registerStoreMLD: MutableLiveData<DataState<ResponsePostRegisterStore>> = MutableLiveData()
//    val registerStoreLD: LiveData<DataState<ResponsePostRegisterStore>>
//        get() = registerStoreMLD
//
//    fun registerStoreForMerchant(body: RequestPostRegisterStore){
//        viewModelScope.launch {
//            repository.registerStoreForMerchant(body).onEach {
//                registerStoreMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val registerSettlementAccountMLD: MutableLiveData<DataState<ResponsePostRegisterSettlementAccount>> = MutableLiveData()
//    val registerSettlementAccountLD: LiveData<DataState<ResponsePostRegisterSettlementAccount>>
//        get() = registerSettlementAccountMLD
//
//    fun registerSettlementAccountForMerchant(body: RequestPostRegisterSettlementAccount){
//        viewModelScope.launch {
//            repository.registerSettlementAccountForMerchant(body).onEach {
//                registerSettlementAccountMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val responsePostRiskAssessmentMLD: MutableLiveData<DataState<ResponsePostRiskAssessment>> = MutableLiveData()
//    val responsePostRiskAssessmentLD: LiveData<DataState<ResponsePostRiskAssessment>>
//        get() = responsePostRiskAssessmentMLD
//
//    fun submitForChangeMerchantStatus(body: RequestPostRiskAssessment){
//        viewModelScope.launch {
//            repository.submitRiskAssessmentAnswers(body).onEach {
//                responsePostRiskAssessmentMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val responsePostUploadBusinessDocumentsMLD: MutableLiveData<DataState<ResponsePostUploadBusinessDocuments>> = MutableLiveData()
//    val responsePostUploadBusinessDocumentsLD: LiveData<DataState<ResponsePostUploadBusinessDocuments>>
//        get() = responsePostUploadBusinessDocumentsMLD
//
//    fun postBusinessDocuments(tin:File,tl:File){
//        viewModelScope.launch {
//            repository.uploadBusinessDocuments(tin,tl).onEach {
//                responsePostUploadBusinessDocumentsMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val responsePostAgreementDocumentMLD: MutableLiveData<DataState<ResponsePostAgreementDocument>> = MutableLiveData()
//    val responsePostAgreementDocumentLD: LiveData<DataState<ResponsePostAgreementDocument>>
//        get() = responsePostAgreementDocumentMLD
//
//    fun postAgreementDocuments(agreementFile:File){
//        viewModelScope.launch {
//            repository.uploadAgreementDocuments(agreementFile).onEach {
//                responsePostAgreementDocumentMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val responsePutSubmitMLD: MutableLiveData<DataState<ResponsePutSubmit>> = MutableLiveData()
//    val responsePutSubmitLD: LiveData<DataState<ResponsePutSubmit>>
//        get() = responsePutSubmitMLD
//
//    fun submitForChangeMerchantStatus(id:String){
//        viewModelScope.launch {
//            repository.requestForSubmission(id).onEach {
//                responsePutSubmitMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val getDivisionsMLD: MutableLiveData<DataState<ResponseGetDivisions>> = MutableLiveData()
//    val getDivisionsLD: LiveData<DataState<ResponseGetDivisions>>
//        get() = getDivisionsMLD
//
//    fun getAllDivisions(){
//        viewModelScope.launch {
//            repository.getAllDivisions().onEach {
//                getDivisionsMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val getDistrictForDivisionMLD: MutableLiveData<DataState<ResponseGetDistrictForDivision>> = MutableLiveData()
//    val getDistrictForDivisionLD: LiveData<DataState<ResponseGetDistrictForDivision>>
//        get() = getDistrictForDivisionMLD
//
//    fun getDistrictForDivision(id:String){
//        viewModelScope.launch {
//            repository.getDistrictForDivision(id).onEach {
//                getDistrictForDivisionMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val getAllDistrictsMLD: MutableLiveData<DataState<ResponseGetDistricts>> = MutableLiveData()
//    val getAllDistrictsLD: LiveData<DataState<ResponseGetDistricts>>
//        get() = getAllDistrictsMLD
//
//    fun getAllDistricts(){
//        viewModelScope.launch {
//            repository.getAllDistricts().onEach {
//                getAllDistrictsMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val getUpazillasForDistrictMLD: MutableLiveData<DataState<ResponseGetUpazillasForZilla>> = MutableLiveData()
//    val getUpazillasForDistrictLD: LiveData<DataState<ResponseGetUpazillasForZilla>>
//        get() = getUpazillasForDistrictMLD
//
//    fun getUpazillasForDistrict(id:String){
//        viewModelScope.launch {
//            repository.getUpazillasForDistrict(id).onEach {
//                getUpazillasForDistrictMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val responseGetBanksMLD: MutableLiveData<DataState<ResponseGetBanks>> = MutableLiveData()
//    val responseGetBanksLD: LiveData<DataState<ResponseGetBanks>>
//        get() = responseGetBanksMLD
//
//    fun getBanksList(){
//        viewModelScope.launch {
//            repository.getBanksList().onEach {
//                responseGetBanksMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val responseGetRiskAssessmentAndBusinessTypesMLD: MutableLiveData<DataState<ResponseGetRiskAssessmentAndBusinessTypes>> = MutableLiveData()
//    val responseGetRiskAssessmentAndBusinessTypesLD: LiveData<DataState<ResponseGetRiskAssessmentAndBusinessTypes>>
//        get() = responseGetRiskAssessmentAndBusinessTypesMLD
//
//    fun getRiskAssessmentAndBusinessTypes(){
//        viewModelScope.launch {
//            repository.getRiskAssessmentAndBusinessTypes().onEach {
//                responseGetRiskAssessmentAndBusinessTypesMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val getDashboardMLD: MutableLiveData<DataState<ResponseDashBoard>> = MutableLiveData()
//    val getDashboardLD: LiveData<DataState<ResponseDashBoard>>
//        get() = getDashboardMLD
//
//    fun getDashboard(){
//        viewModelScope.launch {
//            repository.getDashboard().onEach {
//                getDashboardMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//    private val getMerchantOverviewMLD: MutableLiveData<DataState<ResponseGetMerchantOverview>> = MutableLiveData()
//    val getMerchantOverviewLD: LiveData<DataState<ResponseGetMerchantOverview>>
//        get() = getMerchantOverviewMLD
//
//    fun getOverviewForMerchant(merchantID:String){
//        viewModelScope.launch {
//            repository.getMerchantOverView(merchantID).onEach {
//                getMerchantOverviewMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//
//    private val sendOtpMLD: MutableLiveData<DataState<ResponseGetSendAgreementOTPForMerchant>> = MutableLiveData()
//    val sendOtpLD: LiveData<DataState<ResponseGetSendAgreementOTPForMerchant>>
//        get() = sendOtpMLD
//
//    fun sendAgreementOtpToMerchant(merchantID:String){
//        viewModelScope.launch {
//            repository.sendOTP(merchantID).onEach {
//                sendOtpMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//
//
//    fun reSendAgreementOtpToMerchant(merchantID:String){
//        viewModelScope.launch {
//            repository.resendOTP(merchantID).onEach {
//                sendOtpMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val checkForAgencyMLD: MutableLiveData<DataState<ResponseGetValidateAgency>> = MutableLiveData()
//    val checkForAgencyLD: LiveData<DataState<ResponseGetValidateAgency>>
//        get() = checkForAgencyMLD
//
//    fun checkForAgency(agencyCode:String){
//        viewModelScope.launch {
//            repository.checkForAgency(agencyCode).onEach {
//                checkForAgencyMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val checkForOtpMLD: MutableLiveData<DataState<ResponsePostVerifyOTP>> = MutableLiveData()
//    val checkForOtpLD: LiveData<DataState<ResponsePostVerifyOTP>>
//        get() = checkForOtpMLD
//
//    fun verifyMerchantProvidedOTP(otpInfoId:Int,otpCode:String){
//        viewModelScope.launch {
//            repository.verifyMerchantProvidedOTP(otpInfoId,otpCode).onEach {
//                checkForOtpMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//
//    private val chequeBookPhotoUploadMLD: MutableLiveData<DataState<ResponsePostChequeBookDocument>> = MutableLiveData()
//    val chequeBookPhotoUploadLD: LiveData<DataState<ResponsePostChequeBookDocument>>
//        get() = chequeBookPhotoUploadMLD
//
//    fun chequeBookPhotoUpload(stAccountId:String,chequeBookPhoto:File){
//        viewModelScope.launch {
//            repository.uploadChequeDocuments(stAccountId,chequeBookPhoto).onEach {
//                chequeBookPhotoUploadMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }
//
//
//    private val uploadUtilityDocumentMLD: MutableLiveData<DataState<ResponsePostChequeBookDocument>> = MutableLiveData()
//    val uploadUtilityDocumentLD: LiveData<DataState<ResponsePostChequeBookDocument>>
//        get() = uploadUtilityDocumentMLD
//
//    fun uploadUtilityDocument(merchantId:String,utilityBillCopy:File){
//        viewModelScope.launch {
//            repository.uploadChequeDocuments(merchantId,utilityBillCopy).onEach {
//                uploadUtilityDocumentMLD.value = it
//            }.launchIn(viewModelScope)
//        }
//    }


}