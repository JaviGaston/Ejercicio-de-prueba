package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
Column(modifier = Modifier.background(Color.Cyan).fillMaxSize()) {
    Column(modifier = Modifier.padding(40.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.background(Color.Gray).fillMaxWidth().weight(1f), verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.background(Color.Red).weight(1f), horizontalAlignment = Alignment.Start)
            {
                Text("hola")
            }
            Spacer(modifier = Modifier.weight(1f))

            Column(modifier = Modifier.background(Color.Red).weight(1f), horizontalAlignment = Alignment.End) {
                Text("hola")
                Text("hola")
                Text("hola")
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Spacer(modifier = Modifier.weight(1f))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f).background(Color.White).fillMaxSize()
            ) {
                Text("hola")
            }
            Spacer(modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.background(Color.Green).weight(1f), horizontalArrangement = Arrangement.SpaceAround)
        {
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier.background(Color.Blue).fillMaxHeight().weight(2f), horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("1")
                }
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("2")
                }
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                Text("3")
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier.background(Color.Magenta).fillMaxHeight().weight(4f), horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("4")
                }
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("5")
                }
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("6")
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier.background(Color.Black).fillMaxHeight().weight(2f), horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("7")
                }
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("8")
                }
                Button(onClick = {}, modifier = Modifier.clip(shape = CircleShape)){
                    Text("9")
                }
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting()
    }
}