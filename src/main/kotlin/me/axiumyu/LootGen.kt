package me.axiumyu

import com.destroystokyo.paper.MaterialTags.*
import me.axiumyu.config.Storage
import me.axiumyu.facroty.AttributeFactory
import org.bukkit.attribute.AttributeModifier
import org.bukkit.event.world.LootGenerateEvent
import taboolib.common.platform.event.EventPriority
import taboolib.common.platform.event.SubscribeEvent


class LootGen {
    companion object {
        @JvmField
        val RANGE_INDEX = (Storage.config["offset"] as Double) / (Storage.config["interval"] as Double)

        @JvmField
        val TOOLS =
            WOODEN_TOOLS.values + STONE_TOOLS.values + IRON_TOOLS.values + DIAMOND_TOOLS.values + NETHERITE_TOOLS.values
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST,ignoreCancelled = true)
    fun onLootGen(event: LootGenerateEvent) {
        event.loot.forEach { ist ->
            /*
            从一个空的Map开始添加键值对，键为属性名字，值为AttributeNum
            每次构造时只需要传入对应的数值到AttributeNum里面(可以是不完整的），等到所有构造过程完成，finalNum可以计算后即传回map
            传回参数后遍历map添加属性
            */
            if (ARMOR.isTagged(ist.type)) {
                val itemName = ist.type.name.lowercase()
                val map = AttributeFactory.getMap(itemName)
                map.forEach { (key, value) ->
                    ist.editMeta {
                      it.addAttributeModifier(key, AttributeModifier(value.namespacedKey,value.armorValue,value.op,value.slot))
                  }
                }
            }else if (TOOLS.contains(ist.type)){
                val itemName = ist.type.name.lowercase()
                val map = AttributeFactory.getMap(itemName)
                map.forEach { (key, value) ->
                    ist.editMeta {
                        it.addAttributeModifier(key, AttributeModifier(value.namespacedKey,value.toolValue,value.op,value.slot))
                    }
                }
            }
        }


    }

}