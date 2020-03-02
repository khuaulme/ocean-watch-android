package org.wildaid.oceanwatch.vessel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.wildaid.oceanwatch.data.Repository
import org.wildaid.oceanwatch.data.Vessel

class VesselViewModel(private val repository: Repository) : ViewModel() {
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
        repository.saveVessel(createVessel())
        snackbarText.value = "To be implemented"
    }

    private fun createVessel(): Vessel {
        return Vessel(
            vesselName.value,
            permitNumber.value,
            homePort.value,
            nationality.value,
            date.value,
            business.value,
            location.value,
            emsType.value,
            registeryNumber.value
        )
    }
}
