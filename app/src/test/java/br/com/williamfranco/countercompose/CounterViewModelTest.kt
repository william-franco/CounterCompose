package br.com.williamfranco.countercompose

import br.com.williamfranco.countercompose.src.features.counter.view_models.CounterViewModel
import br.com.williamfranco.countercompose.src.features.counter.view_models.CounterViewModelImpl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.*
import org.junit.Assert.assertEquals
import org.junit.Test

class CounterViewModelTest {
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun incrementTest() = runTest {
        val testDispatcher = UnconfinedTestDispatcher(testScheduler)
        Dispatchers.setMain(testDispatcher)

        try {
            val counterViewModel: CounterViewModel = CounterViewModelImpl()
            assertEquals(0, counterViewModel.counter.value)
            counterViewModel.increment()
            assertEquals(1, counterViewModel.counter.value)
        } finally {
            Dispatchers.resetMain()
        }
    }
}
