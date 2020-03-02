package org.wildaid.oceanwatch.vessel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VesselViewModel : ViewModel() {
    val vesselName = MutableLiveData<String>()
    val permitNumber = MutableLiveData<String>()
    val homePort = MutableLiveData<String>()
    val nationality = MutableLiveData<String>()
    val date = MutableLiveData<String>()
    val business = MutableLiveData<String>()
    val location = MutableLiveData<String>()

    //todo add array?
    val emsType = MutableLiveData<String>()
    val registeryNumber = MutableLiveData<String>()

    val snackbarText = MutableLiveData<String>()

    fun onNextClick() {
        snackbarText.value = "To be implemented"
    }
}
