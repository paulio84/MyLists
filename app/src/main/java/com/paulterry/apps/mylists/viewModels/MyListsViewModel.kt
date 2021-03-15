package com.paulterry.apps.mylists.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paulterry.apps.mylists.data.DataSource
import com.paulterry.apps.mylists.models.ListItem

class MyListsViewModel : ViewModel() {
    private val _items = MutableLiveData(DataSource().getListItems())
    val items: LiveData<List<ListItem>> = _items

    fun addNewItem(text: String, description: String? = null, link: String? = null) {
        val items = _items.value?.toMutableList()
        items?.add(0, ListItem(text, description, link))
        if (items != null) {
            _items.value = items.toList()
        }
    }
}