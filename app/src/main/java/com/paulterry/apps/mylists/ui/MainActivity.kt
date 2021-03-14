package com.paulterry.apps.mylists.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.paulterry.apps.mylists.adapters.MyListsAdapter
import com.paulterry.apps.mylists.databinding.ActivityMainBinding
import com.paulterry.apps.mylists.viewModels.MyListsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}