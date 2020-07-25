package bun.bunrpg3.mobs;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;

public class MobAttributes {
    public static void setMaxHealth(LivingEntity mob, int health){
        mob.getAttribute(org.bukkit.attribute.Attribute.GENERIC_MAX_HEALTH).setBaseValue(health);
        mob.setHealth(health);
    }

    public static double getMaxHealth(LivingEntity mob){
        return mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue();
    }

    public static void setKnockBackResistance (LivingEntity mob, double amount){
        mob.getAttribute(org.bukkit.attribute.Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(amount);
    }

    public static void setDamage (LivingEntity mob, double amount){
        mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(amount);
    }
}
