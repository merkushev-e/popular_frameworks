package ru.gb.hw.mvpmultiply

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable

import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.subjects.BehaviorSubject
import moxy.MvpPresenter


class MultiplyPresenter: MvpPresenter<MultiplyView>() {
    private val compositeDisposable = CompositeDisposable()
    private val subject = BehaviorSubject.create<String>()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        observe()
    }

    private fun observe() {
        val disposable = subject
            .map { it.toInt()}
            .map { it * it }
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                viewState.showResults(it)
            }

        compositeDisposable.add(disposable)
    }


    fun onButtonClicked(number: String) {
        subject.onNext(number)
    }

    override fun onDestroy() {
        compositeDisposable.dispose()
        super.onDestroy()
    }

}
