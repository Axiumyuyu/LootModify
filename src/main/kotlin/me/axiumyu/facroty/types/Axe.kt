package me.axiumyu.facroty.types

import me.axiumyu.AttMap
import me.axiumyu.facroty.base.ToolProcess
import org.bukkit.inventory.EquipmentSlotGroup
import java.util.function.Consumer

object Axe : ToolProcess {
    const val CRAFT_COUNT = 3.0

    @JvmField
    val slot: EquipmentSlotGroup = EquipmentSlotGroup.MAINHAND

    override fun toolAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{
        }
    }
}
