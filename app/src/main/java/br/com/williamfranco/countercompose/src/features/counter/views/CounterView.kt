package br.com.williamfranco.countercompose.src.features.counter.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

import br.com.williamfranco.countercompose.src.features.counter.view_models.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterView(navController: NavController, counterViewModel: CounterViewModel) {
    val counterState by counterViewModel.counter.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Counter")
                },
                actions = {
                    IconButton(
                        onClick = { navController.navigate("settingView") }
                    ) {
                        Icon(Icons.Default.Settings, contentDescription = "Settings")
                    }
                }
            )
        },
        content = {padding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize().padding(padding)
            ) {
                Text("You have pushed this button this many times ", color = Color.Black)
                Text("${counterState.count}", color = Color.Black)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { counterViewModel.increment() },
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    )
}
