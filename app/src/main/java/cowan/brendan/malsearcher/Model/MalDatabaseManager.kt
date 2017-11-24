package cowan.brendan.malsearcher.Model

import cowan.brendan.malsearcher.Model.REST.CredentialVerifier
import javax.inject.Inject
import javax.security.auth.callback.Callback

/**
 * Created by user on 11/15/2017.
 */
class MalDatabaseManager constructor(val credentialVerifier : CredentialVerifier) : DatabaseManager {
    override fun verifyCredentials(username: String, password: String, callback: (pass: Boolean) -> Unit) = credentialVerifier.verify(username, password, callback)
}