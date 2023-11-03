package br.com.williamfranco.countercompose.src.features.counter.view_models

import br.com.williamfranco.countercompose.src.features.counter.models.*

import kotlinx.coroutines.flow.*

interface CounterViewModel {
    val counter: StateFlow<CounterModel>
    fun increment()
}

class CounterViewModelImpl : CounterViewModel {
    private val _counter = MutableStateFlow(CounterModel(0))
    override val counter: StateFlow<CounterModel> = _counter.asStateFlow()

    override fun increment() {
        _counter.value = CounterModel(_counter.value.count + 1)
    }
}
