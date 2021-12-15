package ru.gb.hw

import ru.gb.hw.model.ButtonType
import java.lang.NullPointerException

class EnumToIndexMapper {

    fun mapEnumToIndex(enum: ButtonType): Int{
        return when(enum){
            ButtonType.FIRST_BUTTON -> 0
            ButtonType.SECOND_BUTTON -> 1
            ButtonType.THIRD_BUTTON -> 2

        }
    }

    fun mapIndexToEnum(index: Int): ButtonType{
        return when(index){
            0 -> ButtonType.FIRST_BUTTON
            1 -> ButtonType.SECOND_BUTTON
            2 -> ButtonType.THIRD_BUTTON

            else -> throw NullPointerException("not allowed id")
        }
    }
}