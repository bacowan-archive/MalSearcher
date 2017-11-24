package cowan.brendan.malsearcher.Model.Modules

import cowan.brendan.malsearcher.Model.DatabaseManager
import cowan.brendan.malsearcher.Model.MalDatabaseManager
import cowan.brendan.malsearcher.Model.REST.CredentialVerifier
import cowan.brendan.malsearcher.Model.REST.MalCredentialAPI
import cowan.brendan.malsearcher.Model.REST.MalCredentialVerifier
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import javax.inject.Singleton

/**
 * Created by user on 11/13/2017.
 */
@Module
class MalDatabaseManagerModule {

    private val BASE_URL : String = "https://myanimelist.net/api/"

    @Provides @Singleton fun provideCredentialVerifier(api: MalCredentialAPI) : CredentialVerifier = MalCredentialVerifier(api)
    @Provides @Singleton fun provideCredentialVerifierApi() : MalCredentialAPI {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create()).build()
        return retrofit.create(MalCredentialAPI::class.java)
    }
    @Provides @Singleton fun provideDatabasemanager(verifier: CredentialVerifier) : DatabaseManager = MalDatabaseManager(verifier)
}