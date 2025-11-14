package com.example.practice1


import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice1.ui.theme.Practice1Theme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()
        }
    }
}

@Composable
fun ProfileBody(){
    Scaffold {padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding))
        {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null
                )
                Text("labish13",
                    style = TextStyle(
                    fontWeight = FontWeight.Bold
                ))
                Icon(
                    painter = painterResource(R.drawable.baseline_more_vert_24),
                    contentDescription = null
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
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

                Column (

                ) {
                    Text("131",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold
                        ))
                    Text("posts")
                }
                Column {
                    Text("13.1M",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold
                        ))
                    Text("followers")
                }
                Column {
                    Text("1",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold
                        ))
                    Text("followings")
                }
            }

            Column (
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp)
                    .fillMaxWidth()
            ){
                Text("labish13",
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    ))
            }

            Column (
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp)
                    .fillMaxWidth()
            ){
                Text("khfg jsdhfbkj jsdhfjc",
                    style = TextStyle(
                        fontSize = 15.sp
                    ))
                Text("khfg jsdhfbkj jsdhfjc",
                    style = TextStyle(
                        fontSize = 15.sp
                    ))
            }

            Button(
                onClick = { /* TODO: Add follow action */ },
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(2.dp, Color.Blue),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(0.9f)
            ) {
                Text(
                    text = "Follow",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story",
                        style = TextStyle(
                            fontSize = 15.sp
                        ),
                    modifier = Modifier
                        .padding(start = 30.dp))
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story",
                        style = TextStyle(
                            fontSize = 15.sp
                        ),
                        modifier = Modifier
                            .padding(start = 30.dp))
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.apple),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story",
                        style = TextStyle(
                            fontSize = 15.sp
                        ),
                        modifier = Modifier
                            .padding(start = 30.dp))
                }
            }

        }
    }
}

@Preview
@Composable
fun previewProfileBody(){
    ProfileBody()
}