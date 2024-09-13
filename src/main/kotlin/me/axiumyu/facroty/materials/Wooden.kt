package me.axiumyu.facroty.materials

import me.axiumyu.AttMap
import me.axiumyu.facroty.base.ToolProcess
import java.util.function.Consumer

object Wooden : ToolProcess {

    override fun toolAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{
        }
    }
}