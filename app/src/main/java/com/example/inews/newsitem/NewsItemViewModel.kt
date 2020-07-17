package com.example.inews.newsitem

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsItemViewModel : ViewModel(){

    // The internal MutableLiveData String that stores the status of the most recent request
    private val _response = MutableLiveData<String>()
    // The external immutable LiveData for the request status String
    val response: LiveData<String>
        get() = _response

    /**
     * Call getNewsItems() on init so we can display status immediately.
     */
    init {
        getNewsItems()
    }

    /**
     * Sets the value of the status LiveData to the News API status.
     */
    private fun getNewsItems() {
        _response.value = "Set the News API Response here!"
    }
}