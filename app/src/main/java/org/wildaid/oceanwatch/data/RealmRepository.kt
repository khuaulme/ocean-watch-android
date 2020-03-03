package org.wildaid.oceanwatch.data

import android.util.Log

class RealmRepository : Repository {
    override fun saveBoat(boat: Boat) {
        //todo implement
        Log.d("repo", boat.name)
    }
}