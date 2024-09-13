package me.axiumyu.facroty.types

import me.axiumyu.AttMap
import me.axiumyu.facroty.base.ArmorProcess
import org.bukkit.inventory.EquipmentSlotGroup
import java.util.function.Consumer

object Chestplate: ArmorProcess {
    const val CRAFT_COUNT = 8.0

    @JvmField
    val slot: EquipmentSlotGroup = EquipmentSlotGroup.CHEST

    override fun armorAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{

        }
    }
}
