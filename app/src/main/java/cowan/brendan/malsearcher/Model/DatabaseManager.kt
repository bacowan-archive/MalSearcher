package cowan.brendan.malsearcher.Model

/**
 * Created by user on 11/5/2017.
 */
interface DatabaseManager {
    fun verifyCredentials(username : String, password : String, callback: (pass: Boolean) -> Unit)
}