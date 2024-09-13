package me.axiumyu.enum

import org.bukkit.NamespacedKey
import org.bukkit.attribute.Attribute
import kotlin.math.PI
import kotlin.math.ln
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random
import org.bukkit.attribute.Attribute.*


object AttributeNameSpace {
    init {
        throw UnsupportedOperationException("No instance")
    }

    @JvmStatic
    fun axiumyuKey(name: String): NamespacedKey {
        return NamespacedKey("axiumyu", name)
    }

    @JvmStatic
    fun randomNum(u: Double, d: Double, min: Number, max: Number): Double {
        if (d <= 0) return u
        var x: Double
        var times = 0
        do {
            times++
            val u1: Double = Random.nextDouble()
            val u2: Double = Random.nextDouble()
            val z: Double = sqrt(-2 * ln(u1)) * sin(2 * PI * u2)
            x = u + d * z
            if (times > 100) throw Exception("Random number generation failed")
        } while (x < min.toDouble() || x > max.toDouble())
        return String.format("%.3f", x).toDouble()
    }

    @JvmStatic
    fun randomNum(u: Double, d: Double): Double {
        if (d <= 0) return u
        val u1: Double = Random.nextDouble()
        val u2: Double = Random.nextDouble()
        val z: Double = sqrt(-2 * ln(u1)) * sin(2 * PI * u2)
        val x: Double = u + d * z
        return String.format("%.2f", x).toDouble()
    }

    @JvmField
    val CHANCE = axiumyuKey("chance")

    @JvmField
    val TIME_LEFT = axiumyuKey("time_left")

    @JvmField
    val MINE_SPEED_BASE = axiumyuKey("mine_speed_base")

    @JvmField
    val ARMOR_BASE = axiumyuKey("armor_base")

    @JvmField
    val ARMOR_TOUGH_BASE = axiumyuKey("armor_through_base")

    @JvmField
    val KB_RES_BASE = axiumyuKey("kb_res_base")

    @JvmField
    val EXP_KB_RES_BASE = axiumyuKey("exp_kb_res_base")

    @JvmField
    val HEALTH_BASE = axiumyuKey("health_base")

    @JvmField
    val SPEED_BASE = axiumyuKey("speed_base")

    @JvmField
    val OXYGEN_BASE = axiumyuKey("oxygen_base")

    @JvmField
    val SCALE_BASE = axiumyuKey("scale_base")

    @JvmField
    val STEP_HEIGHT_BASE = axiumyuKey("step_height_base")

    @JvmField
    val SNEAK_WALK_BASE = axiumyuKey("steak_walk_base")

    @JvmField
    val MOVE_EFFICIENCY_BASE = axiumyuKey("move_efficiency_base")

    @JvmField
    val SAFE_FALL_HEIGHT_BASE = axiumyuKey("safe_fall_height_base")

    @JvmField
    val JUMP_STRENGTH_BASE = axiumyuKey("jump_strength_base")

    @JvmField
    val WATER_MOVE_EFF_BASE = axiumyuKey("water_move_eff_base")

    @JvmField
    val GRAVITY_BASE = axiumyuKey("gravity_base")

    @JvmField
    val namespacedKeyMap: HashMap<Attribute, NamespacedKey> = hashMapOf(
        GENERIC_GRAVITY to GRAVITY_BASE,
        GENERIC_ARMOR to ARMOR_BASE,
        GENERIC_ARMOR_TOUGHNESS to ARMOR_TOUGH_BASE,
        PLAYER_MINING_EFFICIENCY to MINE_SPEED_BASE,
        GENERIC_KNOCKBACK_RESISTANCE to KB_RES_BASE,
        GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE to EXP_KB_RES_BASE,
        GENERIC_MAX_HEALTH to HEALTH_BASE,
        GENERIC_MOVEMENT_SPEED to SPEED_BASE,
        GENERIC_OXYGEN_BONUS to OXYGEN_BASE,
        GENERIC_SCALE to SCALE_BASE,
        GENERIC_STEP_HEIGHT to STEP_HEIGHT_BASE,
        PLAYER_SNEAKING_SPEED to SNEAK_WALK_BASE,
        GENERIC_MOVEMENT_EFFICIENCY to MOVE_EFFICIENCY_BASE,
        GENERIC_SAFE_FALL_DISTANCE to SAFE_FALL_HEIGHT_BASE,
        GENERIC_JUMP_STRENGTH to JUMP_STRENGTH_BASE,
        GENERIC_WATER_MOVEMENT_EFFICIENCY to WATER_MOVE_EFF_BASE
    )

}