package me.axiumyu.facroty.materials

import me.axiumyu.AttMap
import me.axiumyu.config.Storage.diamondConfig
import me.axiumyu.facroty.base.ArmorProcess
import me.axiumyu.facroty.base.ToolProcess
import org.bukkit.attribute.Attribute
import java.util.function.Consumer

object Diamond : ToolProcess, ArmorProcess {


    override fun armorAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{
            it[Attribute.GENERIC_ARMOR]!!.addArmor(diamondConfig["armor"] as Double, 0)
            it[Attribute.GENERIC_ARMOR_TOUGHNESS]!!.addArmor(diamondConfig["tough"] as Double, 0)
            it[Attribute.GENERIC_GRAVITY]!!.addArmor(diamondConfig["gravity"] as Double, 0)
            it[Attribute.GENERIC_MOVEMENT_SPEED]!!.addArmor(diamondConfig["speed"] as Double, 0)
            it[Attribute.GENERIC_SCALE]!!.addArmor(diamondConfig["scale"] as Double, 0)
        }
    }

    override fun toolAttribute(): Consumer<AttMap> {
        return Consumer<AttMap>{
        }
    }
}
