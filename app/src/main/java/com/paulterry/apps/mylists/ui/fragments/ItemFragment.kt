package com.paulterry.apps.mylists.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.paulterry.apps.mylists.R
import com.paulterry.apps.mylists.databinding.FragmentItemBinding
import com.paulterry.apps.mylists.viewModels.MyListsViewModel

class ItemFragment : Fragment() {
    private var _binding: FragmentItemBinding? = null
    private val binding
        get() = _binding!!

    private val sharedViewModel: MyListsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.saveButton.setOnClickListener {
            sharedViewModel.addNewItem(
                binding.itemTextEditText.text.toString(),
                binding.itemDescriptionEditText.text.toString(),
                binding.itemLinkEditText.text.toString()
            )

            findNavController().navigate(R.id.action_itemFragment_to_listFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}