package com.wgarrioc.lab_06

/**
 * Represents a Wizard character that can cast spells using mana.
 *
 * A Wizard has a name, current mana, and spell power stat. The
 * Wizard needs sufficient Mana to cast spells, and spell power
 * is used to calculate how much damage is dealt when a valid spell
 * is cast.
 *
 * @property name The name of the Wizard.
 * @property mana The current mana available for spell casting.
 * @property spellPower The base power used for spell damage calculation.
 */
class Wizard(val name:String, var mana:Int, var spellPower: Int) {

    /**
     * Casts a spell and returns the damage dealt. Drains mana.
     *
     * Supported Spells:
     * - "Explosion": costs 10 mana, deals 3 x spellPower damage.
     * - "Frostbite": costs 5 mana, deals 2 x spellPower damage.
     *
     * If the Wizard does not have enough mana to cast the spell, or the
     * spell name is invalid, the spell fails and returns 0.
     *
     * @param spell The spell to cast.
     * @returns The integer amount of damage dealt, or 0 if the spell fails.
     */
    fun castSpell(spell:String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0
            }
            else -> {
                return 0
            }
        }
    }
}