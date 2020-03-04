package org.wildaid.oceanwatch.vessel

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar
import org.wildaid.oceanwatch.R
import org.wildaid.oceanwatch.databinding.VesselFragmentBinding
import org.wildaid.oceanwatch.util.getViewModelFactory

class VesselFragment : Fragment(R.layout.vessel_fragment) {
    private val fragmentViewModel: VesselViewModel by viewModels { getViewModelFactory() }

    private lateinit var viewDataBinding: VesselFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewDataBinding = VesselFragmentBinding.bind(view).apply {
            this.viewmodel = fragmentViewModel
            this.lifecycleOwner = this@VesselFragment.viewLifecycleOwner
        }

        fragmentViewModel.snackbarText.observe(viewLifecycleOwner, Observer(::showSnackBarMessage))
    }

    private fun showSnackBarMessage(message: String) {
        Snackbar.make(requireView(), message, Snackbar.LENGTH_LONG).show()
    }
}
