package com.example.counter.presenter


import com.example.counter.model.CounterModel
import com.example.counter.view.CounterView

class CounterPresenter {
    private val model = CounterModel()
    private lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.changeCount(model.count)
    }

    fun decrement() {
        model.decrement()
        view.changeCount(model.count)
    }

    fun showToast(num: Int, text: String) {
        if (model.count == num) {
            view.showToast(text)
        }
    }

    fun changeTextColor(num: Int, color: Int) {
        if (model.count >= num) {
            view.changeTextColor(color)
        }
    }


    fun attachView(view: CounterView) {
        this.view = view
    }


}