package com.example.practice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SpotifyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifyBody()
        }
    }
}

@Composable
fun SpotifyBody(){
    Scaffold {padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding()
                .background(color = Color.Black)
        ){
            Row (
                modifier = Modifier
                    .padding(start = 20.dp)
            ){
                Text("Recently Played",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ))

                Row(
                    modifier = Modifier
                        .padding(start = 40.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround

                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_notifications_none_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp),
                        tint = Color.White
                    )
                    Icon(
                        painter = painterResource(R.drawable.baseline_history_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp),
                        tint = Color.White
                    )
                    Icon(
                        painter = painterResource(R.drawable.outline_settings_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp),
                        tint = Color.White
                    )
                }
            }
            
            Row {
                Column(
                    modifier = Modifier
                        .padding(all = 20.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Lana del rey",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White),
                    modifier = Modifier
                        .padding(all = 10.dp)
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(all = 20.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Marvin Gaye",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White),
                        modifier = Modifier
                            .padding(all = 10.dp)
                    )

                }
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.apple),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .padding(start = 20.dp)
                )
                Column {
                    Text("#SPOTIFYWRAPPED",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.White),
                        modifier = Modifier
                            .padding(start = 10.dp, top = 20.dp)
                    )
                    Text("Your 2021 in review",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White),
                        modifier = Modifier
                            .padding(all = 10.dp)
                    )
                }

            }
            Row {
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                            .padding( top = 50.dp)
                    )
                    Text(
                        "Your top songs 2021",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        ),
                        modifier = Modifier
                            .padding(start = 40.dp, top = 10.dp)
                    )
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                            .padding( top = 50.dp)
                    )
                    Text("Your artist reavealed",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White),
                        modifier = Modifier
                            .padding(start = 40.dp, top = 10.dp)
                    )
                }
            }

            Text("Editor's Picks",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White),
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp)
                )
            Row {
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(170.dp)
                            .width(170.dp)
                            .padding( top = 20.dp)
                    )
                    Text(
                        "Ed Sheeran, Big Sean,",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.White
                        ),
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp)
                    )
                    Text(
                        "Juice WRLD, Post Malone",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.White
                        ),
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp)
                    )
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(170.dp)
                            .width(170.dp)
                            .padding( top = 20.dp)
                    )
                    Text("Mitski, Tame Imapala,",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.White),
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp)
                    )
                    Text("Glass Animals, Charlie XCX",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.White),
                        modifier = Modifier
                            .padding(start = 20.dp, top = 10.dp)
                    )
                }
            }
        }

    }
}

@Preview
@Composable
fun SpotifyPreview(){
    SpotifyBody()
}