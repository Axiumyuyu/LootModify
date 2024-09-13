package me.axiumyu.config

import taboolib.module.configuration.Config
import taboolib.module.configuration.ConfigFile

object Storage {
    @Config("config.yml")
    lateinit var config: ConfigFile

    @Config("attribute.yml")
    lateinit var attributeConfig: ConfigFile

    @Config("material/leather.yml")
    lateinit var leatherConfig: ConfigFile

    @Config("material/chainmail.yml")
    lateinit var chainmailConfig: ConfigFile

    @Config("material/gold.yml")
    lateinit var goldenConfig: ConfigFile

    @Config("material/iron.yml")
    lateinit var ironConfig: ConfigFile

    @Config("material/diamond.yml")
    lateinit var diamondConfig: ConfigFile

    @Config("material/netherite.yml")
    lateinit var netheriteConfig: ConfigFile

    @Config("type/helmet.yml")
    lateinit var helmetConfig: ConfigFile

    @Config("type/chestplate.yml")
    lateinit var chestplateConfig: ConfigFile

    @Config("type/leggings.yml")
    lateinit var leggingsConfig: ConfigFile

    @Config("type/boots.yml")
    lateinit var bootsConfig: ConfigFile

    @Config("type/sword.yml")
    lateinit var swordConfig: ConfigFile

    @Config("type/shovel.yml")
    lateinit var shovelConfig: ConfigFile

    @Config("type/pickaxe.yml")
    lateinit var pickaxeConfig: ConfigFile

    @Config("type/axe.yml")
    lateinit var axeConfig: ConfigFile

    @Config("type/hoe.yml")
    lateinit var hoeConfig: ConfigFile



    init {
        /*
        每个属性都有一定的随机偏移，此项用于控制偏移误差的最大量
        均值为0的正态分布的标准差，可用此值确定最终结果落在[标准值+偏移量,标准值-偏移量]的概率（即置信区间）
         */
        config["interval"] = 1.96
        /*
        每个属性都有一定的随机偏移，此项用于控制偏移的大小
         */
        config["offset"] = 0.3

        attributeConfig["armor"] = 1
        attributeConfig["tough"] = 0.5
        attributeConfig["gravity"] = 4
        attributeConfig["speed"] = 2.5
        attributeConfig["scale"] = 3
        attributeConfig["exp-kb-res"] = 0.5
        attributeConfig["kb-res"] = 0.5
        attributeConfig["health"] = 0.5

        

        leatherConfig["armor"] = 0.5
        chainmailConfig["armor"] = 0.6
        goldenConfig["armor"] = 0.7
        ironConfig["armor"] = 0.75
        diamondConfig["armor"] = 0.8
        netheriteConfig["armor"] = 0.85

        leatherConfig["tough"] = 0.5
        chainmailConfig["tough"] = 0.6
        goldenConfig["tough"] = 0.7
        ironConfig["tough"] = 0.8
        diamondConfig["tough"] = 0.9
        netheriteConfig["tough"] = 1

        leatherConfig["gravity"] = 0
        chainmailConfig["gravity"] = 10
        goldenConfig["gravity"] = 20
        ironConfig["gravity"] = 15
        diamondConfig["gravity"] = 25
        netheriteConfig["gravity"] = 30

        leatherConfig["speed"] = 0
        chainmailConfig["speed"] = 10
        goldenConfig["speed"] = 15
        ironConfig["speed"] = 20
        diamondConfig["speed"] = 25
        netheriteConfig["speed"] = 30

        leatherConfig["scale"] = 0
        chainmailConfig["scale"] = 10
        goldenConfig["scale"] = 15
        ironConfig["scale"] = 20
        diamondConfig["scale"] = 25
        netheriteConfig["scale"] = 30

        helmetConfig["oxygen-rate"] =0.6
        helmetConfig["oxygen"] = 25

        chestplateConfig["exp-kb-res-rate"] =0.6
        chestplateConfig["exp-kb-res"] = 25
        chestplateConfig["kb-res-rate"] =0.6
        chestplateConfig["kb-res"] = 25
        chestplateConfig["health-rate"] =0.6
        chestplateConfig["health"] = 4

        leggingsConfig["walk-height-rate"] =0.6
        leggingsConfig["walk-height"] = 0.5
        leggingsConfig["sneak-speed-rate"] =0.6
        leggingsConfig["sneak-speed"] = 15
        leggingsConfig["move-efficiency-rate"] =0.6
        leggingsConfig["move-efficiency"] = 15

        bootsConfig["safe-fall-rate"] =0.6
        bootsConfig["safe-fall"] = 1
        bootsConfig["jump-strength-rate"] =0.6
        bootsConfig["jump-strength"] = 15
        bootsConfig["water-move-rate"] =0.6
        bootsConfig["water-move"] = 15


        if (config.file?.exists() != true) config.saveToFile()
        if (attributeConfig.file?.exists() != true) attributeConfig.saveToFile()
        if (leatherConfig.file?.exists() != true) leatherConfig.saveToFile()
        if (chainmailConfig.file?.exists() != true) chainmailConfig.saveToFile()
        if (ironConfig.file?.exists() != true) ironConfig.saveToFile()
        if (diamondConfig.file?.exists() != true) diamondConfig.saveToFile()
        if (netheriteConfig.file?.exists() != true) netheriteConfig.saveToFile()
        if (goldenConfig.file?.exists() != true) goldenConfig.saveToFile()
        if (helmetConfig.file?.exists() != true) helmetConfig.saveToFile()
        if (chestplateConfig.file?.exists() != true) chestplateConfig.saveToFile()
        if (leggingsConfig.file?.exists() != true) leggingsConfig.saveToFile()
        if (bootsConfig.file?.exists() != true) bootsConfig.saveToFile()
        if (swordConfig.file?.exists() != true) swordConfig.saveToFile()
        if (shovelConfig.file?.exists() != true) shovelConfig.saveToFile()
        if (pickaxeConfig.file?.exists() != true) pickaxeConfig.saveToFile()
        if (axeConfig.file?.exists() != true) axeConfig.saveToFile()
        if (hoeConfig.file?.exists() != true) hoeConfig.saveToFile()

    }

}