package br.com.williamfranco.countercompose.src.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

import br.com.williamfranco.countercompose.src.dependency_injector.*
import br.com.williamfranco.countercompose.src.features.counter.views.CounterView
import br.com.williamfranco.countercompose.src.features.settings.views.SettingView

@Composable
fun RoutesApp(dependencies: DependencyInjector) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "counterView"
    ) {
        composable("counterView") {
            CounterView(navController, dependencies.counterViewModel)
        }
        composable("settingView") {
            SettingView(navController, dependencies.settingViewModel)
        }
    }
}
