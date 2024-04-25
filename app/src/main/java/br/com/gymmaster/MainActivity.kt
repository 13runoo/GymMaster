package br.com.gymmaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.gymmaster.ui.theme.GymMasterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GymMasterTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Login()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                }
            )
        }
    )
    { paddingValues ->
        Column(
            Modifier.fillMaxSize().padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Column {
                Image(painterResource(R.drawable.logo_gym), "")
                Text("Transforme sua agenda,")
                Text("Transforme seu corpo!")
            }
            Button(onClick = {}) {
                Text("Entrar")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                }
            )
        }
    )
    { paddingValues ->
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            Modifier.fillMaxSize().padding(
                vertical = paddingValues.calculateTopPadding(),
                horizontal = 48.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(painterResource(R.drawable.logo_gym), "Logo Do Aplicativo")
            Column {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") }
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Senha") }
                )
            }
            Spacer(Modifier.height(16.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {}) {
                    Text("Login")
                }
                Spacer(Modifier.width(24.dp))
                OutlinedButton(onClick = { }) {
                    Text("Cadastrar-se")
                }

            }

        }
    }


}




