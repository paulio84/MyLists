package com.paulterry.apps.mylists.models

data class ListItem(
    val text: String,
    val description: String? = null,
    val link: String? = null
)