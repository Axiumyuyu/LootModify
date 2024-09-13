package me.axiumyu.facroty.types


import me.axiumyu.AttMap
import me.axiumyu.data.AttributeNum
import me.axiumyu.enum.AttributeNameSpace.OXYGEN_BASE
import me.axiumyu.enum.AttributeNameSpace.randomNum
import me.axiumyu.facroty.base.ArmorProcess
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeModifier
import org.bukkit.inventory.EquipmentSlotGroup
import org.bukkit.inventory.ItemStack
import java.util.function.Consumer

object Helmet : ArmorProcess {
    const val CRAFT_COUNT = 5.0

    @JvmField
    val slot: EquipmentSlotGroup = EquipmentSlotGroup.HEAD

    override fun armorAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{
        }
    }

}
