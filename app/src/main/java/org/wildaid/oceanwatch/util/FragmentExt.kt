package org.wildaid.oceanwatch.util

import androidx.fragment.app.Fragment
import org.wildaid.oceanwatch.OceanWatchApplication
import org.wildaid.oceanwatch.base.ViewModelFactory

fun Fragment.getViewModelFactory(): ViewModelFactory {
    val repository = (requireContext().applicationContext as OceanWatchApplication).repository
    return ViewModelFactory(repository, this)
}