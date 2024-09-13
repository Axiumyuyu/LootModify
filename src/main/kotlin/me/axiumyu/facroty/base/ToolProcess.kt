package me.axiumyu.facroty.base

import me.axiumyu.AttMap
import java.util.function.Consumer

interface ToolProcess {
    fun toolAttribute():Consumer<AttMap>

}