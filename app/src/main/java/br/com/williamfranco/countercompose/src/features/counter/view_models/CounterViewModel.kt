package br.com.williamfranco.countercompose.src.features.counter.view_models

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

interface CounterViewModel {
    val counter: StateFlow<Int>
    fun increment()
}

class CounterViewModelImpl : CounterViewModel {
    private val _counter = MutableStateFlow(0)
    override val counter: StateFlow<Int> = _counter.asStateFlow()

    override fun increment() {
        _counter.update { count -> count + 1 }
    }
}
