package me.axiumyu.facroty.materials

import me.axiumyu.AttMap
import me.axiumyu.config.Storage.attributeConfig
import me.axiumyu.config.Storage.ironConfig
import me.axiumyu.config.Storage.leatherConfig
import me.axiumyu.data.AttributeNum
import me.axiumyu.facroty.base.ArmorProcess
import org.bukkit.attribute.Attribute
import java.util.function.Consumer

object Leather : ArmorProcess {

    override fun armorAttribute(): Consumer<AttMap>{
        return Consumer<AttMap> {
            it[Attribute.GENERIC_ARMOR]!!.addArmor(leatherConfig["armor"] as Double, 0)
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.addArmor(leatherConfig["tough"] as Double, 0)
            it[Attribute.GENERIC_GRAVITY]!!.addArmor(leatherConfig["gravity"] as Double, 0)
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.addArmor(leatherConfig["speed"] as Double, 0)
        }
    }
}