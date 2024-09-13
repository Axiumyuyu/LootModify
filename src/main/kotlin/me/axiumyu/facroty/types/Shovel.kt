package me.axiumyu.facroty.types

import me.axiumyu.AttMap
import me.axiumyu.facroty.base.ToolProcess
import org.bukkit.inventory.EquipmentSlotGroup
import org.bukkit.inventory.ItemStack
import java.util.function.Consumer

object Shovel : ToolProcess {
    const val CRAFT_COUNT = 1.0

    @JvmField
    val slot: EquipmentSlotGroup = EquipmentSlotGroup.MAINHAND

    override fun toolAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{

        }
    }

}
