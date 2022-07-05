package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.utils.Constants
import retrofit2.Retrofit
import javax.inject.Inject

class RegisterViewModel
@Inject constructor(
    private val retrofit: Retrofit
): BaseViewModel() {

    init {
        Log.d(Constants.LOG_TAG, "RegisterViewModel is Created")
    }

}