package cowan.brendan.malsearcher.Model.REST

/**
 * Created by user on 11/4/2017.
 */
interface CredentialVerifier {
    fun verify(username : String, password : String, callback: (pass : Boolean) -> Unit)
}