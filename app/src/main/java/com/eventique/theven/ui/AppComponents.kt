package com.eventique.theven.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eventique.theven.R

@Composable
fun TopBar(value:String){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Welcome To Treasure Hunt",
            color= Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.size(60.dp),
            painter = painterResource(id = R.drawable.header),
            contentDescription = value
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar("Welcome To Pirate's Pursuit")
}


@Composable
fun ImageComponent(value:String){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        when(value.lowercase()){
            "jack_sparrow"-> Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.stage81),
                contentDescription = value
            )
            "el_dorado"->Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.stage82),
                contentDescription = value
            )
            "black_beard"->Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.stage83),
                contentDescription = value
            )
            "black_pearl"->Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.stage84),
                contentDescription = value
            )
            else->""
        }


    }

}



@Composable
fun TextComponent(
    textValue:String
) {
    Text(text = textValue,
        color= Color.Black,
        fontSize = 19.sp,
        fontWeight = FontWeight.Light
    )
}

@Preview(showBackground = true)
@Composable
fun TextComponentPreview(

){
    TextComponent(textValue = "Please Enter Your Codeword.")
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent(
    onTextChanged : (name:String) -> Unit
){
    var currentValue by remember{
        mutableStateOf("")
    }

    val localFocusManager = LocalFocusManager.current
    OutlinedTextField(
        modifier =Modifier.fillMaxWidth(),
        value = currentValue,
        onValueChange = {
            currentValue = it
            onTextChanged(it)
        },
        placeholder = {
            Text(text="Decoded Word",
                fontSize = 15.sp,
                fontWeight=FontWeight.ExtraLight)
        },
        textStyle = TextStyle.Default.copy(fontSize=22.sp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions {
            localFocusManager.clearFocus()
        }
    )
 }

@Preview(showBackground = true)
@Composable
fun TextFieldPreview(){
//    TextFieldComponent()
}


@Composable
fun ButtonComponent(
    submit:()->Unit
){
    val localFocusManager = LocalFocusManager.current
    Button(
        modifier  =Modifier.fillMaxWidth(),
        onClick ={
            submit()
            localFocusManager.clearFocus()
        }) {
        TextComponent(textValue = "Submit")
    }

}







