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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice1.ui.theme.Green

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardBody()
        }
    }
}

@Composable
fun CardBody(){
    Scaffold { padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding()
                .background(Green)

        ){
            Row{
                Column {
                    Text(
                        "Card",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 30.sp
                        ),
                        modifier = Modifier
                            .padding(top = 35.dp, start = 10.dp)
                    )
                    Text(
                        "Simple and easy to use app",
                        style = TextStyle(
                            fontSize = 15.sp,
                            color = Color.White,
                        ),
                        modifier = Modifier
                            .padding(top = 5.dp, start = 10.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .padding(all = 10.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }
            }

            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )

            Row (
                modifier = Modifier
                    .padding(20.dp)
            ){
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .weight(1f)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            painter = painterResource(R.drawable.baseline_menu_book_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                        )
                        Text("Text",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ))
                    }
                }
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .weight(1f)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            painter = painterResource(R.drawable.baseline_house_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                        )
                        Text("Address",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ))
                    }
                }
            }
            Row (
                modifier = Modifier
                    .padding(20.dp)
            ){
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .weight(1f)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            painter = painterResource(R.drawable.baseline_face_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                        )
                        Text("Character",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ))
                    }
                }
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .weight(1f)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            painter = painterResource(R.drawable.baseline_credit_card_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                        )
                        Text("Bank Card",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ))
                    }
                }
            }
            Row (
                modifier = Modifier
                    .padding(20.dp)
            ){
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .weight(1f)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            painter = painterResource(R.drawable.baseline_key_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                        )
                        Text("Password",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ))
                    }
                }
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .weight(1f)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            painter = painterResource(R.drawable.baseline_card_giftcard_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                        )
                        Text("Logistics",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ))
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(20.dp)
            ){
                Card(
                    modifier = Modifier
                        .height(80.dp)
                        .weight(1f)
                ) {
                    Row  (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,

                    ){
                        Icon(
                            painter = painterResource(R.drawable.outline_settings_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .padding(start = 10.dp)
                        )
                        Text("Setting",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ),
                        modifier = Modifier
                            .padding(start = 15.dp)
                        )
                    }
                }

            }
        }
    }
}

@Composable
@Preview
fun previewCardBody(){
    CardBody()
}