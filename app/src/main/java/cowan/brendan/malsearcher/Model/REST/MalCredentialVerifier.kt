package cowan.brendan.malsearcher.Model.REST

import cowan.brendan.malsearcher.Model.DefaultUrlReader
import cowan.brendan.malsearcher.Model.UrlReader
import okhttp3.Credentials
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by user on 11/4/2017.
 */
class MalCredentialVerifier(private val api : MalCredentialAPI) : CredentialVerifier {

    override fun verify(username: String, password: String, callback: (pass : Boolean) -> Unit) {
        val credentials = Credentials.basic(username, password)
        val call : Call<MalAuthorizationResponse> = api.authorize(credentials)
        call.enqueue(object:Callback<MalAuthorizationResponse> {
            override fun onResponse(call: Call<MalAuthorizationResponse>?, response: Response<MalAuthorizationResponse>?) {
                callback(true)
            }
            override fun onFailure(call: Call<MalAuthorizationResponse>?, t: Throwable?) {
                callback(false)
            }
        })
    }
}