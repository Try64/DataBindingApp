package com.shurjomukhi.databindingapp

import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class LendingAppRepository(
	private val api: APIServer
) {
	suspend fun getLoanDetails(loanID:String = "28718F55",token:String = "14f9dd0031392c3b45e4c27b4da38b61a18a0fb2"):Flow<DataState<LoanDetails>> = flow {
		emit(DataState.Loading)
		val response:Response<LoanDetails>?
		try {
		    response = api.getLoanDetails(loanID,token)
			if(response.isSuccessful){
				emit(DataState.Success(response.body()!!))
			}
			try{
				emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
			}catch (exception:Exception){
				emit(DataState.Error(Exception(exception.message)))
			}
		}catch (ex:Exception){
			emit(DataState.Error(Exception(ex.message)))
		}
	}
//
//
//	suspend fun getCountryList():Flow<DataState<CountriesGetResponse>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<CountriesGetResponse>?
//		try {
//			responseData = api.getCountryList()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun uploadNIDInfo(body:RequestPostKAMRegistration):Flow<DataState<ResponsePostKAMRegistrationFile>> = flow {
//
//		emit(DataState.Loading)
//		val response:Response<ResponsePostKAMRegistrationFile>?
//		try {
//			response = api.postNIDInfo(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//
//	}
//
//	suspend fun registrationNIDWithFile(nidFront:File,nidBack:File):Flow<DataState<ResponsePostKAMRegistrationFile>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostKAMRegistrationFile>?
//		try {
////			responseData = api.registration(countryName = countryName,
////			nidFront = MultipartBody.Part.createFormData("nidFront", nidFront.name, nidFront.asRequestBody("multipart/form-data".toMediaTypeOrNull())),
////			nidBack = MultipartBody.Part.createFormData("nidBack", nidBack.name, nidBack.asRequestBody("multipart/form-data".toMediaTypeOrNull())))
//			val uris1 = Uri.fromFile(nidFront)
//			val fileExtension1 = MimeTypeMap.getFileExtensionFromUrl(uris1.toString())
//			val mime1 =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension1.lowercase())
//
//			val requestFile0: RequestBody =
//				nidFront.asRequestBody(mime1?.toMediaTypeOrNull())
//
//			val nidFront0 = MultipartBody.Part.createFormData("nidFront", nidFront.name, requestFile0)
//
//			val uris = Uri.fromFile(nidBack)
//			val fileExtension = MimeTypeMap.getFileExtensionFromUrl(uris.toString())
//			val mime =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.lowercase())
//
//			val requestFile: RequestBody =
//				nidBack.asRequestBody(mime?.toMediaTypeOrNull())
//
//			val nidBack0 = MultipartBody.Part.createFormData("nidBack", nidBack.name, requestFile)
//
//			responseData = api.uploadNIDFiles(nidFront0,nidBack0)
//
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun updateROContactInfo(body:RequestPostUpdateROContactInfo) = flow{
//		emit(DataState.Loading)
//		val response:Response<ResponsePostUpdateROContactInfo>?
//		try{
//			response = api.updateROContactInfo(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun finalizeRORequest(body:RequestPostROAccountFinalization) = flow{
//		emit(DataState.Loading)
//		val response:Response<ResponsePostROAccountFinalization>?
//		try{
//			response = api.finalizeRORequest(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun getLogin(body:RequestROLogin):Flow<DataState<ResponseROLogin>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseROLogin>?
//		try {
//			responseData = api.login(body)
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun getMerchantList():Flow<DataState<ResponseGetMerchantList>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetMerchantList>?
//		try {
//			responseData = api.getMerchantList()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetMerchantList = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	/**
//	 * Merchant API CallBack Implementation
//	 */
//	suspend fun registrationNIDWithFileForMerchant(nidFront:File,nidBack:File):Flow<DataState<ResponsePostKAMRegistrationFile>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostKAMRegistrationFile>?
//		try {
//			val uris1 = Uri.fromFile(nidFront)
//			val fileExtension1 = MimeTypeMap.getFileExtensionFromUrl(uris1.toString())
//			val mime1 =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension1.lowercase())
//
//			val requestFile0: RequestBody =
//				nidFront.asRequestBody(mime1?.toMediaTypeOrNull())
//
//			val nidFront0 = MultipartBody.Part.createFormData("nidFront", nidFront.name, requestFile0)
//
//			val uris = Uri.fromFile(nidBack)
//			val fileExtension = MimeTypeMap.getFileExtensionFromUrl(uris.toString())
//			val mime =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.lowercase())
//
//			val requestFile: RequestBody =
//				nidBack.asRequestBody(mime?.toMediaTypeOrNull())
//
//			val nidBack0 = MultipartBody.Part.createFormData("nidBack", nidBack.name, requestFile)
//
//			responseData = api.merchantRegistration(nidFront0,nidBack0)
//
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun uploadNIDInfoForMerchant(body:RequestPostKAMRegistration):Flow<DataState<ResponsePostKAMRegistrationFile>> = flow {
//
//		emit(DataState.Loading)
//		val response:Response<ResponsePostKAMRegistrationFile>?
//		try {
//			response = api.postNIDInfoForMerchant(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//
//	}
//
//	suspend fun updateMerchantContactInfo(body:RequestPostUpdateROContactInfo) = flow {
//		emit(DataState.Loading)
//		val response:Response<ResponsePostUpdateROContactInfo>?
//		try{
//			response = api.updateMerchantContactInfo(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun registerStoreForMerchant(body:RequestPostRegisterStore) = flow{
//		emit(DataState.Loading)
//		val response:Response<ResponsePostRegisterStore>?
//		try{
//			response = api.registerStoreForMerchant(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun registerSettlementAccountForMerchant(body:RequestPostRegisterSettlementAccount) = flow{
//		emit(DataState.Loading)
//		val response:Response<ResponsePostRegisterSettlementAccount>?
//		try{
//			response = api.registerSettlementAccountForMerchant(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun submitRiskAssessmentAnswers(body:RequestPostRiskAssessment) = flow{
//		emit(DataState.Loading)
//		val response:Response<ResponsePostRiskAssessment>?
//		try{
//			response = api.postRiskAssessmentAnswers(body)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//				responsePostRiskAssessment = response.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun uploadBusinessDocuments(tin:File,tl:File):Flow<DataState<ResponsePostUploadBusinessDocuments>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostUploadBusinessDocuments>?
//		try {
////			responseData = api.registration(countryName = countryName,
////			nidFront = MultipartBody.Part.createFormData("nidFront", nidFront.name, nidFront.asRequestBody("multipart/form-data".toMediaTypeOrNull())),
////			nidBack = MultipartBody.Part.createFormData("nidBack", nidBack.name, nidBack.asRequestBody("multipart/form-data".toMediaTypeOrNull())))
//			val uris1 = Uri.fromFile(tin)
//			val fileExtension1 = MimeTypeMap.getFileExtensionFromUrl(uris1.toString())
//			val mime1 =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension1.lowercase())
//
//			val requestFile0: RequestBody =
//				tin.asRequestBody(mime1?.toMediaTypeOrNull())
//
//			val nidFront0 = MultipartBody.Part.createFormData("tin", tin.name, requestFile0)
//
//			val uris = Uri.fromFile(tl)
//			val fileExtension = MimeTypeMap.getFileExtensionFromUrl(uris.toString())
//			val mime =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.lowercase())
//
//			val requestFile: RequestBody =
//				tl.asRequestBody(mime?.toMediaTypeOrNull())
//
//			val nidBack0 = MultipartBody.Part.createFormData("tl", tl.name, requestFile)
//
//			val merchantID = MultipartBody.Part.createFormData("merchantId", responsePostRegisterStore?.responseData?.merchantId!!)
//
//			responseData = api.submitBusinessDocuments(merchantID,nidFront0,nidBack0)
//
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responsePostUploadBusinessDocuments = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun uploadAgreementDocuments(agreementFile:File):Flow<DataState<ResponsePostAgreementDocument>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostAgreementDocument>?
//		try {
////			responseData = api.registration(countryName = countryName,
////			nidFront = MultipartBody.Part.createFormData("nidFront", nidFront.name, nidFront.asRequestBody("multipart/form-data".toMediaTypeOrNull())),
////			nidBack = MultipartBody.Part.createFormData("nidBack", nidBack.name, nidBack.asRequestBody("multipart/form-data".toMediaTypeOrNull())))
//			val uris1 = Uri.fromFile(agreementFile)
//			val fileExtension1 = MimeTypeMap.getFileExtensionFromUrl(uris1.toString())
//			val mime1 =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension1.lowercase())
//
//			val requestFile0: RequestBody =
//				agreementFile.asRequestBody(mime1?.toMediaTypeOrNull())
//
//			val nidFront0 = MultipartBody.Part.createFormData("agreementFile", agreementFile.name, requestFile0)
//
//			//TODO: Place merchantID here
//			val merchantID = MultipartBody.Part.createFormData("merchantId", responsePostRegisterStore?.responseData?.merchantId!!)
//
//			responseData = api.submitAgreementDocuments(merchantID,nidFront0)
//
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responsePostAgreementDocument = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun requestForSubmission(id:String):Flow<DataState<ResponsePutSubmit>> = flow {
//		emit(DataState.Loading)
//		val response:Response<ResponsePutSubmit>?
//		try{
//			response = api.requestForSubmission(id)
//			if(response.isSuccessful){
//				emit(DataState.Success(response.body()!!))
//				responsePutSubmit = response.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(response.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun getAllDivisions():Flow<DataState<ResponseGetDivisions>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetDivisions>?
//		try {
//			responseData = api.getAllDivisions()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//		     	responseGetDivisions = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun getDistrictForDivision(id:String):Flow<DataState<ResponseGetDistrictForDivision>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetDistrictForDivision>?
//		try {
//			responseData = api.getDistrictForDivision(id)
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetDistrictForDivision = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun getAllDistricts():Flow<DataState<ResponseGetDistricts>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetDistricts>?
//		try {
//			responseData = api.getAllDistricts()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetDistricts = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun getUpazillasForDistrict(id:String):Flow<DataState<ResponseGetUpazillasForZilla>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetUpazillasForZilla>?
//		try {
//			responseData = api.getUpazillasForDistrict(id)
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetUpazillasForZilla = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun getBanksList():Flow<DataState<ResponseGetBanks>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetBanks>?
//		try {
//			responseData = api.getBanksList()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetBanks = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun getRiskAssessmentAndBusinessTypes():Flow<DataState<ResponseGetRiskAssessmentAndBusinessTypes>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetRiskAssessmentAndBusinessTypes>?
//		try {
//			responseData = api.getRiskAssessmentAndBusinessTypes()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetRiskAssessmentAndBusinessTypes = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//
//	suspend fun getDashboard():Flow<DataState<ResponseDashBoard>> = flow {
//		emit(DataState.Loading)
//		val responseData:Response<ResponseDashBoard>?
//		try {
//			responseData = api.getDashboard()
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//				responseGetDashboard = responseData.body()!!
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	/**
//	 *  Get Merchants overview So that we can see
//	 *  Which data, are provided by new Merchant
//	 *  @param merchantID = Merchant ID [received from backend]
//	 *  @return flow state of Either
//	 */
//
//	suspend fun getMerchantOverView(merchantID:String):Flow<DataState<ResponseGetMerchantOverview>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetMerchantOverview>?
//
//		try {
//			responseData = api.getMerchantOverview(merchantID)
//			if(responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun sendOTP(merchantID:String):Flow<DataState<ResponseGetSendAgreementOTPForMerchant>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetSendAgreementOTPForMerchant>?
//
//		try {
//			responseData = api.getSendAgreementOTP(merchantID)
//			if(responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else if(responseData.code() == 417){
//				emit(DataState.Error(Exception("Resend option is set to false. Try calling to proper API for resending OTP")))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}//getResendOTP -> ResponseGetResendOTP
//
//
//
//	suspend fun resendOTP(merchantID:String):Flow<DataState<ResponseGetSendAgreementOTPForMerchant>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponseGetSendAgreementOTPForMerchant>?
//
//		try {
//			responseData = api.getResendOTP(merchantID)
//			if(responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun checkForAgency(agencyCode:String):Flow<DataState<ResponseGetValidateAgency>> = flow{
//		emit(DataState.Loading)
//		val responseData: Response<ResponseGetValidateAgency>?
//
//		try {
//			responseData = api.validateAgency(agencyCode)
//			if(responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun verifyMerchantProvidedOTP(otpInfoId:Int,otpCode:String):Flow<DataState<ResponsePostVerifyOTP>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostVerifyOTP>?
//
//		try {
//			responseData = api.verifyMerchantProvidedOTP(otpInfoId,otpCode)
//			if(responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//	suspend fun uploadChequeDocuments(stAccountId:String,chequeBookPhoto:File):Flow<DataState<ResponsePostChequeBookDocument>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostChequeBookDocument>?
//		try {
////			responseData = api.registration(countryName = countryName,
////			nidFront = MultipartBody.Part.createFormData("nidFront", nidFront.name, nidFront.asRequestBody("multipart/form-data".toMediaTypeOrNull())),
////			nidBack = MultipartBody.Part.createFormData("nidBack", nidBack.name, nidBack.asRequestBody("multipart/form-data".toMediaTypeOrNull())))
//			val uris1 = Uri.fromFile(chequeBookPhoto)
//			val fileExtension1 = MimeTypeMap.getFileExtensionFromUrl(uris1.toString())
//			val mime1 =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension1.lowercase())
//
//			val requestFile0: RequestBody =
//				chequeBookPhoto.asRequestBody(mime1?.toMediaTypeOrNull())
//
//			val nidFront0 = MultipartBody.Part.createFormData("chequeBookPhoto", chequeBookPhoto.name, requestFile0)
//
//			//TODO: Place merchantID here
//			val stAccountID = MultipartBody.Part.createFormData("stAccountId", stAccountId)
//
//			responseData = api.submitChequeBookDocuments(stAccountID,nidFront0)
//
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}
//
//
//	suspend fun uploadUtilityDocuments(merchantId:String,utilityBillCopy:File):Flow<DataState<ResponsePostUploadUtilityDocuments>> = flow{
//		emit(DataState.Loading)
//		val responseData:Response<ResponsePostUploadUtilityDocuments>?
//		try {
////			responseData = api.registration(countryName = countryName,
////			nidFront = MultipartBody.Part.createFormData("nidFront", nidFront.name, nidFront.asRequestBody("multipart/form-data".toMediaTypeOrNull())),
////			nidBack = MultipartBody.Part.createFormData("nidBack", nidBack.name, nidBack.asRequestBody("multipart/form-data".toMediaTypeOrNull())))
//			val uris1 = Uri.fromFile(utilityBillCopy)
//			val fileExtension1 = MimeTypeMap.getFileExtensionFromUrl(uris1.toString())
//			val mime1 =
//				MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension1.lowercase())
//
//			val requestFile0: RequestBody =
//				utilityBillCopy.asRequestBody(mime1?.toMediaTypeOrNull())
//
//			val utilityBillCopyImage = MultipartBody.Part.createFormData("utilityBillCopy", utilityBillCopy.name, requestFile0)
//
//			//TODO: Place merchantID here
//			val merchantId = MultipartBody.Part.createFormData("merchantId", merchantId)
//
//			responseData = api.uploadUtilityDocument(merchantId,utilityBillCopyImage)
//
//			if (responseData.isSuccessful){
//				emit(DataState.Success(responseData.body()!!))
//			}else{
//				try{
//					emit(DataState.Error(Exception(Gson().fromJson(responseData.errorBody()!!.charStream(),APIError::class.java).errorMessageFromServer)))
//				}catch (exception:Exception){
//					emit(DataState.Error(Exception(exception.message)))
//				}
//
//			}
//		}catch(ex:Exception){
//			emit(DataState.Error(Exception(ex.message)))
//		}
//	}

}