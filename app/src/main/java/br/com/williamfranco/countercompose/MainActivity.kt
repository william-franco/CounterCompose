package br.com.williamfranco.countercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme

import br.com.williamfranco.countercompose.src.features.counter.view_models.*
import br.com.williamfranco.countercompose.src.features.counter.views.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val counterViewModel: CounterViewModel = CounterViewModelImpl()

        setContent {
            MaterialTheme {
                CounterView(counterViewModel)
            }
        }
    }
}
