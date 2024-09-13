package me.axiumyu.facroty.types

import me.axiumyu.AttMap
import me.axiumyu.config.Storage.attributeConfig
import me.axiumyu.data.AttributeNum
import me.axiumyu.facroty.base.ArmorProcess
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeModifier
import org.bukkit.inventory.EquipmentSlotGroup
import java.util.function.Consumer

object Boots : ArmorProcess {
    const val CRAFT_COUNT = 4.0

    @JvmField
    val slot: EquipmentSlotGroup = EquipmentSlotGroup.FEET

    override fun armorAttribute(): Consumer<AttMap> {
        return Consumer<AttMap> {
            it[Attribute.GENERIC_ARMOR] = AttributeNum(CRAFT_COUNT, 1)
            it[Attribute.GENERIC_ARMOR]!!.addArmor(attributeConfig["armor"] as Double, 2)
            it[Attribute.GENERIC_ARMOR]!!.slot = this.slot
            it[Attribute.GENERIC_ARMOR]!!.op = AttributeModifier.Operation.ADD_NUMBER

            it[Attribute.GENERIC_ARMOR_TOUGHNESS]= AttributeNum(CRAFT_COUNT, 1)
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.addArmor(attributeConfig["tough"] as Double, 2)
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.slot = this.slot
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.op = AttributeModifier.Operation.ADD_NUMBER

            it[Attribute.GENERIC_SCALE]= AttributeNum(CRAFT_COUNT, 1)
            it[Attribute.GENERIC_SCALE]!!.addArmor(attributeConfig["scale"] as Double, 2)
            it[Attribute.GENERIC_SCALE]!!.slot = this.slot
            it[Attribute.GENERIC_SCALE]!!.op = AttributeModifier.Operation.ADD_SCALAR

            it[Attribute.GENERIC_GRAVITY] = AttributeNum(CRAFT_COUNT, 1)
            it[Attribute.GENERIC_GRAVITY]!!.addArmor(attributeConfig["gravity"] as Double, 2)
            it[Attribute.GENERIC_GRAVITY]!!.slot = this.slot
            it[Attribute.GENERIC_GRAVITY]!!.op = AttributeModifier.Operation.ADD_SCALAR

            it[Attribute.GENERIC_MOVEMENT_SPEED]= AttributeNum(CRAFT_COUNT, 1)
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.addArmor(attributeConfig["speed"] as Double, 2)
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.slot = this.slot
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.op = AttributeModifier.Operation.ADD_SCALAR
        }
    }


}
