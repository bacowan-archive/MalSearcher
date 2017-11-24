package cowan.brendan.malsearcher.Model.REST

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

/**
 * Created by user on 11/19/2017.
 */
interface MalCredentialAPI {
    @GET("account/verify_credentials.xml")
    fun authorize(@Header("Authorization") credentials : String) : Call<MalAuthorizationResponse>
}