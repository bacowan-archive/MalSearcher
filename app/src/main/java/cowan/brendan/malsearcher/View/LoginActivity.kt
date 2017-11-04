package cowan.brendan.malsearcher.View

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import cowan.brendan.malsearcher.BR
import cowan.brendan.malsearcher.R
import cowan.brendan.malsearcher.ViewModel.LoginViewModel
import cowan.brendan.malsearcher.databinding.LoginActivityBinding

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: LoginActivityBinding = DataBindingUtil.setContentView(this, R.layout.login_activity)
        val vm = LoginViewModel("username", "password")
        binding.setVariable(BR.vm, vm)
        binding.executePendingBindings()
    }
}
