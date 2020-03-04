package org.wildaid.oceanwatch.data

import android.content.Context

object ServiceLocator {

    @Volatile
    var repository: Repository? = null

    fun provideRepository(context: Context): Repository {
        synchronized(this) {
            return repository
                ?: repository
                ?: createRepository(
                    context
                )
        }
    }

    private fun createRepository(context: Context): Repository {
        return RealmRepository()
    }
}
