package com.paulterry.apps.mylists.data

import com.paulterry.apps.mylists.models.ListItem

class DataSource {
    fun getListItems(): List<ListItem> {
        return listOf<ListItem>(
            ListItem("Shopping", "Do the shopping."),
            ListItem("Clean the house"),
            ListItem("Play games", "Video games or board games?")
        )
    }
}