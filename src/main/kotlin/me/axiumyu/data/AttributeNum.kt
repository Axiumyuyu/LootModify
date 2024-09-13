package me.axiumyu.data

import org.bukkit.NamespacedKey
import org.bukkit.attribute.AttributeModifier.Operation
import org.bukkit.inventory.EquipmentSlotGroup

data class AttributeNum(val num1: Double, val index1: Int) {
    /*
    numList[0] :由Material决定
    numList[1] :由Type决定
    numList[2] :由Attribute决定
     */
    private val armorList: MutableList<Double> = mutableListOf(0.0, 0.0, 0.0)
    private val toolList: MutableList<Double> = mutableListOf(0.0, 0.0, 0.0)
    lateinit var op: Operation
    lateinit var slot: EquipmentSlotGroup
    lateinit var namespacedKey: NamespacedKey
    val armorValue by lazy { armorList[0] * armorList[1] * armorList[2] }
    val toolValue by lazy { toolList[0] * toolList[1] * toolList[2] }

    init {
        addArmor(num1, index1)
    }

    fun addArmor(num: Double, index: Int) {
        if (armorList[index] == 0.0) {
            armorList[index] = num
        } else {
            throw IllegalArgumentException("AttributeNum already has a value at index $index")
        }
    }

    fun addTool(num: Double, index: Int) {
        if (toolList[index] == 0.0) {
            toolList[index] = num
        } else {
            throw IllegalArgumentException("AttributeNum already has a value at index $index")
        }
    }
}
