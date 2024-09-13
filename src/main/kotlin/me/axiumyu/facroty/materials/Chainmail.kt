package me.axiumyu.facroty.materials

import me.axiumyu.AttMap
import me.axiumyu.config.Storage.attributeConfig
import me.axiumyu.config.Storage.chainmailConfig
import me.axiumyu.data.AttributeNum
import me.axiumyu.facroty.base.ArmorProcess
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeModifier
import java.util.function.Consumer

object Chainmail :ArmorProcess {
    override fun armorAttribute(): Consumer<AttMap> {
        return Consumer<AttMap> {
            it[Attribute.GENERIC_ARMOR]!!.addArmor(chainmailConfig["armor"] as Double, 0)
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.addArmor(chainmailConfig["tough"] as Double, 0)
            it[Attribute.GENERIC_GRAVITY]!!.addArmor(chainmailConfig["gravity"] as Double, 0)
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.addArmor(chainmailConfig["speed"] as Double, 0)
            it[Attribute.GENERIC_SCALE]!!.addArmor(chainmailConfig["scale"] as Double, 0)
        }
    }
}

