package com.example.prakpam2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prakpam2.ui.theme.PrakPAM2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakPAM2Theme {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        BasicLayout(modifier = Modifier.padding(innerPadding))
    }
   }
  }
 }
}
@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Login",
            style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Ini adalah halaman login")
                    Image(
                    painter = painterResource(id = R.drawable.logoku), // Pastikan ini adalah gambar yang benar
            contentDescription = null,
            modifier = modifier.padding(top = 20.dp).size(200.dp)
        )
        Text(text = "nama", modifier = Modifier.padding(top = 20.dp))
        Text(
            text = "Mutiara Aulia Salsabila",
            color = Color.Magenta,
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )









