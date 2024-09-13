package me.axiumyu.facroty

import me.axiumyu.AttMap
import me.axiumyu.facroty.materials.*
import me.axiumyu.facroty.types.Axe
import me.axiumyu.facroty.types.Boots
import me.axiumyu.facroty.types.Chestplate
import me.axiumyu.facroty.types.Helmet
import me.axiumyu.facroty.types.Hoe
import me.axiumyu.facroty.types.Leggings
import me.axiumyu.facroty.types.Pickaxe
import me.axiumyu.facroty.types.Shovel
import me.axiumyu.facroty.types.Sword
import java.util.*

object AttributeFactory {
    fun getMap(name: String) : AttMap {
        val map = AttMap()
        var isTool = false
        val names = name.split("_")
        map.clear()
        /*
        调用顺序必须为先type再Material
         */
        when (names[1].lowercase()) {
            "helmet" -> {
                Helmet.armorAttribute().accept(map)
            }

            "chestplate" -> {
                Chestplate.armorAttribute().accept(map)
            }

            "leggings" -> {
                Leggings.armorAttribute().accept(map)
            }

            "boots" -> {
                Boots.armorAttribute().accept(map)
            }

            "axe" -> {
                isTool = true
                Axe.toolAttribute().accept(map)
            }

            "sword" -> {
                isTool = true
                Sword.toolAttribute().accept(map)
            }

            "pickaxe" -> {
                isTool = true
                Pickaxe.toolAttribute().accept(map)
            }

            "shovel" -> {
                isTool = true
                Shovel.toolAttribute().accept(map)
            }

            "hoe" -> {
                isTool = true
                Hoe.toolAttribute().accept(map)
            }
        }
        when (names[0].lowercase()) {
            "wooden" -> {
                Wooden.toolAttribute().accept(map)
            }

            "stone" -> {
                Stone.toolAttribute().accept(map)
            }

            "chainmail" -> {
                Chainmail.armorAttribute().accept(map)
            }

            "leather" -> {
                Leather.armorAttribute().accept(map)
            }

            "iron" -> {
                if (isTool) Iron.toolAttribute().accept(map) else Iron.armorAttribute().accept(map)
            }

            "diamond" -> {
                if (isTool) Diamond.toolAttribute().accept(map) else Diamond.armorAttribute().accept(map)
            }

            "golden" -> {
                if (isTool) Golden.toolAttribute().accept(map) else Golden.armorAttribute().accept(map)
            }
        }
        return map
    }

}