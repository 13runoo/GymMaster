package br.com.gymmaster

import android.os.Bundle
import android.view.Menu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.gymmaster.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Week()
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                }
            )
        }
    ) { paddingValues ->
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
                    label = { Text("Nome") }
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Sobrenome") }
                )
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
            Spacer(Modifier.height(25.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Spacer(Modifier.width(24.dp))
                OutlinedButton(onClick = { }) {
                    Text("Cadastrar-se")
                }

            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Edit() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                }
            )
        }
    ) { paddingValues ->
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
                    label = { Text("Alterar Nome") }
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Alterar Sobrenome") }
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Alterar Email") }
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Alterar Senha") }
                )

            }
            Spacer(Modifier.height(25.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Spacer(Modifier.width(24.dp))
                OutlinedButton(onClick = { }) {
                    Text("Cadastrar-se")
                }

            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Week() {
    Scaffold(


    ) { paddingValues ->
        Column(
            Modifier.fillMaxSize().padding(
                vertical = paddingValues.calculateTopPadding(),
                horizontal = 16.dp
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Menu, "Navegação")
                }
                Image(painterResource(R.drawable.logo_gym), "Logo Do Aplicativo", modifier = Modifier.size(90.dp))
                Icon(
                    Icons.Default.AccountCircle,
                    "Account icon",
                )

            }
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Dias de treinos na semana", fontSize = 30.sp)

                WeekButton("Segunda-Feira",{})
                WeekButton("Terça-Feira",{})
                WeekButton("Quarta-Feira",{})
                WeekButton("Quinta-Feira",{})
                WeekButton("Sexta-Feira",{})
                WeekButton("Sábado",{})
                WeekButton("Domingo",{})




            }
        }
    }

}

@Composable
private fun WeekButton(text:String, onClick: ()->Unit) {
    TextButton(
        onClick = onClick
    ) {
        Text(text, fontSize = 30.sp)
    }
}











