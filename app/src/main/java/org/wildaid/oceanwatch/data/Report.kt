package org.wildaid.oceanwatch.data

import io.realm.RealmList
import io.realm.RealmObject
import java.time.LocalDate

open class Boat(
    var name: String? = "",
    var homePort: String? = "",
    var nationality: String? = "",
    var permitNumber: String? = "",
    var licenseNumber: String? = "",
    var ems: RealmList<Ems>?,
    var lastDelivery: Delivery,
    var other: RealmList<OtherAttribute>? = null
) : RealmObject()

open class Ems(
    var emsType: String? = "",
    var emsDescription: String? = "",
    var registryNumber: String? = ""
) : RealmObject()

open class Delivery(
    var date: LocalDate?,
    var location: String? = "",
    var business: String? = "",
    var other: RealmList<OtherAttribute>? = null
) : RealmObject()

open class OtherAttribute(
    var key: String = "",
    var value: String = ""
) : RealmObject()