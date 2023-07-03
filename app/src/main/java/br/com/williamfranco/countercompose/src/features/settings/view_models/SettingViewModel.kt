package br.com.williamfranco.countercompose.src.features.settings.view_models

import kotlinx.coroutines.flow.*

interface SettingViewModel {
    val isDarkTheme: StateFlow<Boolean>
    fun updateTheme(isDark: Boolean)
}

class SettingViewModelImpl : SettingViewModel {
    private val _isDarkTheme = MutableStateFlow(false)
    override val isDarkTheme: StateFlow<Boolean> = _isDarkTheme.asStateFlow()

    override fun updateTheme(isDark: Boolean) {
        _isDarkTheme.update { isDark }
    }
}
