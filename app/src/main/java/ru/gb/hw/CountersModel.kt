package ru.gb.hw

import ru.gb.hw.model.ButtonType

class CountersModel (private val mapper: EnumToIndexMapper){

    private val counters = mutableListOf(0, 0, 0)

     fun getCurrent(enum: ButtonType): Int {
        val index = mapper.mapEnumToIndex(enum)
        return counters[index]
    }

    fun next(enum: ButtonType): Int {
        val index = mapper.mapEnumToIndex(enum)
        counters[index]++
        return getCurrent(enum)
    }



}