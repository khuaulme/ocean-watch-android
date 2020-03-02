package org.wildaid.oceanwatch

import android.content.Context
import org.wildaid.oceanwatch.data.RealmRepository
import org.wildaid.oceanwatch.data.Repository

object ServiceLocator {

    @Volatile
    var repository: Repository? = null

    fun provideRepository(context: Context): Repository {
        synchronized(this) {
            return repository ?: repository ?: createRepository(context)
        }
    }

    private fun createRepository(context: Context): Repository {
        return RealmRepository()
    }
}
