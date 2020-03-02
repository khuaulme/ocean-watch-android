package org.wildaid.oceanwatch

import android.app.Application
import org.wildaid.oceanwatch.data.Repository

class OceanWatchApplication : Application() {

    val repository: Repository
        get() = ServiceLocator.provideRepository(this)
}