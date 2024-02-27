package br.senai.sp.jandira.projetoimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projetoimc.ui.theme.ProjetoIMCTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Column(
            horizontalAlignment = CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFE61753))
        ){
            Image(painterResource(id = R.drawable.imagem),
                contentDescription = "",
                modifier = Modifier
                    .width(70.dp)
                    .height(100.dp)
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
            )
        }
        Card(
            modifier = Modifier
                .width(365.dp)
                .height(400.dp)
                .padding(start = 30.dp)
                .offset(y = -50.dp),
            colors = CardDefaults.cardColors(Color(0xfff2f5f7)),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
        )
        {
            Column(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
            ) {

                Text(
                    modifier = Modifier.align(CenterHorizontally),
                    fontWeight = FontWeight.Bold,
                    text = "Seus Dados",
                    fontSize = 28.sp,
                    color = Color(0xFFE61753)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Seu Peso:",
                    color = Color(0xFFE61753)
                )
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Seu Peso em kg")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White,
                            unfocusedBorderColor = Color(0xFFE61753),
                            focusedBorderColor = Color(0xFFE61753),
                            unfocusedPlaceholderColor = Color.Gray,
                        )

                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Sua Altura:",
                    color = Color(0xFFE61753),

                )
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Sua Altura em cm")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White,
                            unfocusedBorderColor = Color(0xFFE61753),
                            focusedBorderColor = Color(0xFFE61753),
                            unfocusedPlaceholderColor = Color.Gray,
                        )
                )
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xFFE61753)),
                    modifier = Modifier
                        .height(60.dp)
                        .width(280.dp),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp
                    )

                }
            }
        }

        Card (
            modifier = Modifier
                .padding(start = 30.dp)
                .width(340.dp)
                .height(100.dp),
            colors = CardDefaults.cardColors(Color(0xff329F6B)),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
        ){ Row{
            Column(
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            ) {

                Text(
                    modifier = Modifier
                        .padding(start = 20.dp),
                    text = "Resultado",
                    fontSize = 20.sp,
                    color = Color.White
                )

                Text(
                    modifier = Modifier
                        .padding(start = 15.dp),
                    text = "Peso Ideal",
                    fontSize = 22.sp,
                    color = Color.White
                )

            }

            Text(
                modifier = Modifier
                    .padding(start = 50.dp, top = 28.dp),
                text = "21.3",
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = Color.White
            )
        }

        }

        }



    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProjetoIMCTheme {
        Greeting()
    }
}