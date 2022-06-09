package store.dide.cifravet.ui.views

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import store.dide.cifravet.R
import store.dide.cifravet.data.openFragment
import store.dide.cifravet.databinding.StartscreenLayoutBinding

class StartFragment : Fragment(R.layout.startscreen_layout) {

    private var _binding: StartscreenLayoutBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = StartFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = StartscreenLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonContinue.setOnClickListener(){
//            findNavController().navigate(R.id.action_startFragment_to_pinFragment)
//            findNavController().navigate(R.id.action_startFragment_to_mainFragment)
//            findNavController().navigate(R.id.action_startFragment_to_mainEmptyFragment)
//            findNavController().navigate(R.id.action_startFragment_to_shopsFragment)
            AlertDialogStart().show(requireActivity().supportFragmentManager, "StartAlert")
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}