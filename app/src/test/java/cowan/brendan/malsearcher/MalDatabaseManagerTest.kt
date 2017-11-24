package cowan.brendan.malsearcher

import cowan.brendan.malsearcher.Model.REST.CredentialVerifier
import cowan.brendan.malsearcher.Model.MalDatabaseManager
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by user on 11/15/2017.
 */
class MalDatabaseManagerTest {

    //TODO: make constants

    @Mock
    lateinit var mockCredentialVerifier : CredentialVerifier

    lateinit var databaseManager : MalDatabaseManager

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        databaseManager = MalDatabaseManager(mockCredentialVerifier)
    }

    // TODO: remove this test. It just tests that the dbmanager delegates, which can be handled better in kotlin
    @Test
    fun credentialsCorrect()
    {
        //Mockito.`when`(mockCredentialVerifier.verify("username", "password")).thenReturn(true)
        //assertTrue(databaseManager.verifyCredentials("username", "password"))
    }
}