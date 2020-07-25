package bun.bunrpg3.mobs;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.util.Vector;

import static bun.bunrpg3.mobs.MobAttributes.*;


public class SkeletonBoss implements Listener {

    @EventHandler
    void skeletonKing(EntitySpawnEvent e){
        if(e.getEntity() instanceof LivingEntity){
            if(e.getEntity().getType() == EntityType.SKELETON){
                LivingEntity mob =(LivingEntity) e.getEntity();
                setMaxHealth(mob,100);
                mob.setCustomName("SkeleKing");
            }
        }
    }

    @EventHandler
    void skeletonKingAtacc(EntityDamageByEntityEvent e){

        if(e.getDamager() instanceof Skeleton){
            LivingEntity skeletonKing = (LivingEntity) e.getDamager();
            if (getMaxHealth(skeletonKing) == 100){
                LivingEntity victim = (LivingEntity) e.getEntity();
                victim.setVelocity(new Vector(0 ,100,0));
            }
        }
    }
}
