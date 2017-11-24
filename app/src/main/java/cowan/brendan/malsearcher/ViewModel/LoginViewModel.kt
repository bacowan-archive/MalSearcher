package cowan.brendan.malsearcher.ViewModel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField
import cowan.brendan.malsearcher.BR
import cowan.brendan.malsearcher.Model.DatabaseManager
import cowan.brendan.malsearcher.Model.MalDatabaseManager

class LoginViewModel constructor(
        private val dbManager : DatabaseManager,
        var closeFunction: () -> Unit = fun() = Unit) : BaseObservable() {

    @Bindable
    var username: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.vm)
        }
    @Bindable
    var password: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.vm)
        }
    //val username : ObservableField<String> = ObservableField()
    //val password : ObservableField<String> = ObservableField()

    fun loginClick()
    {
        dbManager.verifyCredentials(username, password, {pass ->
            if (pass)
                closeFunction()
        })
    }
}