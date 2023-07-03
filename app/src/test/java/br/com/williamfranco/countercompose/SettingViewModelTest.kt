package br.com.williamfranco.countercompose

import br.com.williamfranco.countercompose.src.features.settings.view_models.SettingViewModel
import br.com.williamfranco.countercompose.src.features.settings.view_models.SettingViewModelImpl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.*
import org.junit.Assert.assertEquals
import org.junit.Test

class SettingViewModelTest {
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun changeThemeTest() = runTest {
        val testDispatcher = UnconfinedTestDispatcher(testScheduler)
        Dispatchers.setMain(testDispatcher)

        try {
            val settingViewModel: SettingViewModel = SettingViewModelImpl()
            assertEquals(false, settingViewModel.isDarkTheme.value)
            settingViewModel.updateTheme(true)
            assertEquals(true, settingViewModel.isDarkTheme.value)
        } finally {
            Dispatchers.resetMain()
        }
    }
}
