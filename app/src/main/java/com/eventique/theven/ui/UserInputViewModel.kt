package com.eventique.theven.ui

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.eventique.theven.data.UserDataUiEvents
import com.eventique.theven.data.UserInputScreenState

class UserInputViewModel: ViewModel() {

    companion object{
        const val TAG = "UserInputViewModel"
    }
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents) {
        when(event){
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
                Log.d(TAG, "onEvent:UserNameEntered->> ")
                Log.d(TAG, "${uiState.value}")
            }
        }
    }
}



