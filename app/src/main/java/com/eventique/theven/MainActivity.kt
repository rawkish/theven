package com.eventique.theven

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.eventique.theven.ui.screens.ThevenNavigationGraph
import com.eventique.theven.ui.theme.ThevenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThevenTheme {
                TreasureHunt()
            }
        }
    }
}

@Composable
fun TreasureHunt(){
    ThevenNavigationGraph()

}

