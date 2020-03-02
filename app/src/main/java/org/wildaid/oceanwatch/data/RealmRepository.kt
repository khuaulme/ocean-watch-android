package org.wildaid.oceanwatch.data

import android.util.Log

class RealmRepository : Repository {
    override fun saveVessel(vessel: Vessel) {
        //todo implement
        Log.d("repo", vessel.vesselName)
    }
}