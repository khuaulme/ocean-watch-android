package org.wildaid.oceanwatch.vessel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.realm.RealmList
import org.wildaid.oceanwatch.data.Repository
import org.wildaid.oceanwatch.data.Boat
import org.wildaid.oceanwatch.data.Delivery
import org.wildaid.oceanwatch.data.Ems
import java.time.LocalDate

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
        repository.saveBoat(createBoat())
        snackbarText.value = "To be implemented"
    }

    private fun createBoat(): Boat {
        return Boat(
            name = vesselName.value,
            homePort = homePort.value,
            nationality = nationality.value,
            permitNumber = permitNumber.value,
            lastDelivery = createDelivery(),
            ems = createEms()
        )
    }

    private fun createEms(): RealmList<Ems> {
        //todo
        return RealmList<Ems>()
    }

    private fun createDelivery(): Delivery {
        return Delivery(
            date = LocalDate.parse(date.value),
            business = business.value,
            location = location.value
        )
    }
}
