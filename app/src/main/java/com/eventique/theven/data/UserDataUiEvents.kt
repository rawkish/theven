package com.eventique.theven.data

sealed class UserDataUiEvents{
    data class UserNameEntered(val name:String) :UserDataUiEvents()

}