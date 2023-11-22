package br.com.williamfranco.countercompose.src.dependency_injector

import br.com.williamfranco.countercompose.src.features.counter.view_models.*
import br.com.williamfranco.countercompose.src.features.settings.view_models.*

class DependencyInjector {
    // ViewModels
    val counterViewModel: CounterViewModel = CounterViewModelImpl()
    val settingViewModel: SettingViewModel = SettingViewModelImpl()
}
