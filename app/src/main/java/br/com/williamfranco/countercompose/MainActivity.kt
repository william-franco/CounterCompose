package br.com.williamfranco.countercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme

import br.com.williamfranco.countercompose.src.dependency_injector.*
import br.com.williamfranco.countercompose.src.routes.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dependencies = DependencyInjector()

        setContent {
            MaterialTheme {
                RoutesApp(dependencies)
            }
        }
    }
}
