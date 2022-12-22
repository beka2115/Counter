package com.example.counter

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.presenter.CounterPresenter
import com.example.counter.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    private var presenter = CounterPresenter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.increment()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }
        }
    }


    override fun changeCount(count: Int) {
        binding.counterTv.text = count.toString()
        presenter.showToast(10, "Поздравляем")
        presenter.changeTextColor(15,Color.GREEN)
    }

    override fun showToast(text: String) {
        showToasts(text)
    }

    override fun changeTextColor(color: Int) {
        binding.counterTv.setTextColor(color)
    }
}