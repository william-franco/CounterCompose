package br.com.williamfranco.countercompose.src.routes

import androidx.compose.runtime.Composable

import androidx.navigation.compose.*

import br.com.williamfranco.countercompose.src.features.counter.view_models.*
import br.com.williamfranco.countercompose.src.features.counter.views.CounterView

import br.com.williamfranco.countercompose.src.features.settings.view_models.*
import br.com.williamfranco.countercompose.src.features.settings.views.SettingView

@Composable
fun RoutesApp() {
    val navController = rememberNavController()

    val counterViewModel: CounterViewModel = CounterViewModelImpl()
    val settingViewModel: SettingViewModel = SettingViewModelImpl()

    NavHost(
        navController = navController,
        startDestination = "counterView"
    ) {
        composable("counterView") {
            CounterView(navController, counterViewModel)
        }
        composable("settingView") {
            SettingView(navController, settingViewModel)
        }
    }
}
