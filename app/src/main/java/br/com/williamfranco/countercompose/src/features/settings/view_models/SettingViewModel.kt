package br.com.williamfranco.countercompose.src.features.settings.view_models

import kotlinx.coroutines.flow.*

interface SettingViewModel {
    val isDarkTheme: StateFlow<Boolean>
    fun changeTheme(isDark: Boolean)
}

class SettingViewModelImpl : SettingViewModel {
    private val _isDarkTheme = MutableStateFlow(false)
    override val isDarkTheme: StateFlow<Boolean> = _isDarkTheme.asStateFlow()

    override fun changeTheme(isDark: Boolean) {
        _isDarkTheme.update { isDark }
    }
}
