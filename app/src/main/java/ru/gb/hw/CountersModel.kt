package ru.gb.hw

import ru.gb.hw.model.ButtonType

class CountersModel {
    private val counters = mutableListOf(0, 0, 0)
    private val mapper = EnumToIndexMapper()

    private fun getCurrent(index: Int): Int {
        return counters[index]
    }

    fun next(enum: ButtonType): Int {
        val index = mapper.mapEnumToIndex(enum)
        counters[index]++
        return getCurrent(index)
    }



}