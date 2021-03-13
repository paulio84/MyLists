package com.paulterry.apps.mylists.viewModels

import androidx.lifecycle.ViewModel
import com.paulterry.apps.mylists.data.DataSource
import com.paulterry.apps.mylists.models.ListItem

class MyListsViewModel : ViewModel() {
    private var _items: MutableList<ListItem> =
        DataSource().getListItems() as MutableList<ListItem>
    val items: List<ListItem>
        get() = _items
}