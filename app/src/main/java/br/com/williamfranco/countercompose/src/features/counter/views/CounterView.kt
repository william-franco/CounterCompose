package br.com.williamfranco.countercompose.src.features.counter.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

import br.com.williamfranco.countercompose.src.features.counter.view_models.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterView(counterViewModel: CounterViewModel) {
    val counterState by counterViewModel.counter.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Counter")
                },
            )
        },
        content = {padding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize().padding(padding)
            ) {
                Text("You have pushed this button this many times ", color = Color.Black)
                Text("$counterState", color = Color.Black)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { counterViewModel.increment() },
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        }
    )
}

@Preview
@Composable
fun DefaultPreview() {
    val counterViewModel: CounterViewModel = CounterViewModelImpl()

    CounterView(counterViewModel)
}
