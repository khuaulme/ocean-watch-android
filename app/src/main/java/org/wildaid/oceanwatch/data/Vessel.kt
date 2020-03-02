package org.wildaid.oceanwatch.data

import io.realm.RealmObject

open class Vessel(
    var vesselName: String? = "",
    var permitNumber: String? = "",
    var homePort: String? = "",
    var nationality: String? = "",
    var date: String? = "",
    var business: String? = "",
    var location: String? = "",
    var emsType: String? = "",
    var registeryNumber: String? = ""
) : RealmObject() {
}