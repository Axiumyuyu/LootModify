package me.axiumyu.facroty.materials

import me.axiumyu.AttMap
import me.axiumyu.config.Storage.attributeConfig
import me.axiumyu.config.Storage.ironConfig
import me.axiumyu.data.AttributeNum
import me.axiumyu.facroty.base.ArmorProcess
import me.axiumyu.facroty.base.ToolProcess
import org.bukkit.attribute.Attribute
import java.util.function.Consumer

object Iron : ToolProcess,ArmorProcess {

    override fun armorAttribute(): Consumer<AttMap> {
        return Consumer<AttMap> {
            it[Attribute.GENERIC_ARMOR]!!.addArmor(ironConfig["armor"] as Double, 0)
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.addArmor(ironConfig["tough"] as Double, 0)
            it[Attribute.GENERIC_GRAVITY]!!.addArmor(ironConfig["gravity"] as Double, 0)
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.addArmor(ironConfig["speed"] as Double, 0)
        }

    }

    override fun toolAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{
        }
    }
}
