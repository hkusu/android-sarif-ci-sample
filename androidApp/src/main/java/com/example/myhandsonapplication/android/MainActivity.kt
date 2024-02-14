package com.example.myhandsonapplication.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myhandsonapplication.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    GreetingView2(Greeting().greet(),"abc")
                }
            }
        }
    }
}

@Composable
fun GreetingView2 (text: String, text2: String) {
    Text(text = text)
    Text(text = text2)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView2("Hello, Android!", "abc")
    }
}

fun hoge() {}
