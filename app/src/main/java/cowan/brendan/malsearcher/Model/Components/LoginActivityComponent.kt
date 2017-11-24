package cowan.brendan.malsearcher.Model.Components

import cowan.brendan.malsearcher.Model.MalDatabaseManager
import cowan.brendan.malsearcher.Model.Modules.MalDatabaseManagerModule
import cowan.brendan.malsearcher.View.LoginActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by user on 11/15/2017.
 */
@Singleton
@Component(modules = arrayOf(MalDatabaseManagerModule::class))
interface LoginActivityComponent {
    fun inject(activity: LoginActivity)
}