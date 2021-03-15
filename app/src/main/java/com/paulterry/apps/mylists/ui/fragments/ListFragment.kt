package com.paulterry.apps.mylists.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.paulterry.apps.mylists.adapters.MyListsAdapter
import com.paulterry.apps.mylists.databinding.FragmentListBinding
import com.paulterry.apps.mylists.viewModels.MyListsViewModel

class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null
    private val binding
        get() = _binding!!

    private val sharedViewModel: MyListsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.listItemRecyclerView.adapter = sharedViewModel.items.value?.let { MyListsAdapter(it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}