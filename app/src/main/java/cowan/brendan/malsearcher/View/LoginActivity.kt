package cowan.brendan.malsearcher.View

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import cowan.brendan.malsearcher.BR
import cowan.brendan.malsearcher.Model.Components.DaggerLoginActivityComponent
import cowan.brendan.malsearcher.Model.Components.LoginActivityComponent
import cowan.brendan.malsearcher.Model.DatabaseManager
import cowan.brendan.malsearcher.Model.Modules.MalDatabaseManagerModule
import cowan.brendan.malsearcher.R
import cowan.brendan.malsearcher.ViewModel.LoginViewModel
import cowan.brendan.malsearcher.databinding.LoginActivityBinding
import javax.inject.Inject

class LoginActivity : Activity() {

    @Inject lateinit var dbManager: DatabaseManager
    val component : LoginActivityComponent = DaggerLoginActivityComponent.builder().malDatabaseManagerModule(MalDatabaseManagerModule()).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        val binding: LoginActivityBinding = DataBindingUtil.setContentView(this, R.layout.login_activity)
        val vm = LoginViewModel(dbManager, closeFunction = {startMainActivity()})
        binding.vm = vm
        binding.executePendingBindings()
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
