package com.example.sunscout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunscout.ui.theme.Bakbak
import com.example.sunscout.ui.theme.ButtonColor
import com.example.sunscout.ui.theme.LightRed
import com.example.sunscout.ui.theme.Sun
import com.example.sunscout.ui.theme.SunScoutTheme
import com.example.sunscout.ui.theme.Wine

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunScoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable

fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize() // Fills the available space with the gradient background
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        LightRed,
                        Wine
                    )
                )
            ) ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.sun),
            contentDescription = "image of sunhat",
            modifier=Modifier
                .size(200.dp)

        )

        Text(
            text = "SunScout",
            fontFamily = Bakbak,
            color = Sun,
            fontSize = 64.sp,
            textAlign = TextAlign.Center
        )
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
            modifier = Modifier
                .size(width = 281.dp, height = 60.dp)
                .padding(10.dp)


            ) {
            Text("Login")
            
        }
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
            modifier = Modifier
                .size(width = 281.dp, height = 60.dp)
                .padding(10.dp)
        ) {
            Text("Register")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SunScoutTheme {
        Greeting("Android")
    }
}