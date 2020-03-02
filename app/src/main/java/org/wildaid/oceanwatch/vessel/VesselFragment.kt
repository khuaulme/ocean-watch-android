package org.wildaid.oceanwatch.vessel

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar

import org.wildaid.oceanwatch.R
import org.wildaid.oceanwatch.databinding.VesselFragmentBinding
import org.wildaid.oceanwatch.util.getViewModelFactory

class VesselFragment : Fragment() {

    private lateinit var viewDataBinding: VesselFragmentBinding

    private lateinit var viewModel: VesselViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel =
            ViewModelProviders.of(this, getViewModelFactory()).get(VesselViewModel::class.java)

        val root = inflater.inflate(R.layout.vessel_fragment, container, false)
        viewDataBinding = VesselFragmentBinding.bind(root).apply {
            this.viewmodel = viewModel
        }

        viewDataBinding.lifecycleOwner = this.viewLifecycleOwner
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.snackbarText.observe(
            viewLifecycleOwner,
            Observer {
                Snackbar.make(view!!, viewModel.snackbarText.value!!, Snackbar.LENGTH_LONG).show()
            })
    }
}
