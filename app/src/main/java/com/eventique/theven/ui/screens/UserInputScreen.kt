package com.eventique.theven.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eventique.theven.data.UserDataUiEvents
import com.eventique.theven.data.giveAnswer
import com.eventique.theven.ui.ButtonComponent
import com.eventique.theven.ui.ImageComponent
import com.eventique.theven.ui.TextComponent
import com.eventique.theven.ui.TextFieldComponent
import com.eventique.theven.ui.TopBar
import com.eventique.theven.ui.UserInputViewModel


@Composable
fun UserInputScreen(
    userInputViewModel: UserInputViewModel) {
    var showAnswer by remember { mutableStateOf(false) }
    var answer by remember { mutableStateOf("") }
    Surface(
        modifier =  Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column (
            modifier= Modifier
                .fillMaxSize()
                .padding(18.dp)
        ){
            Spacer(modifier = Modifier.size(
                40.dp))
            TopBar("Welcome To Pirate's Pursuit!")
            Spacer(modifier = Modifier.size(
                40.dp))
            TextComponent(textValue = "Enter you Code word here!")
            Spacer(modifier = Modifier.size(
                30.dp))
            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvent(
                    UserDataUiEvents.UserNameEntered(it)
                )
            })
            println("ooooooooo${showAnswer}")
            Spacer(modifier = Modifier.size(
                30.dp))
            if(!userInputViewModel.uiState.value.nameEntered.isNullOrEmpty()) {
                ButtonComponent(
                    submit = {
                        showAnswer=true
                        answer = userInputViewModel.uiState.value.nameEntered
                    }

                )
            }
            println("ooooooooo${showAnswer}")
            println("ooooooooo${answer}")
            Spacer(modifier = Modifier.size(
                30.dp))

            AnimatedVisibility(showAnswer) {
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource("compose-multiplatform.xml"), null)
                    TextComponent(giveAnswer(answer))
                    ImageComponent(answer)
//                    TextComponent(textValue = "finalanswer")
                }
            }
        }

    }

}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen(userInputViewModel = UserInputViewModel())
}

