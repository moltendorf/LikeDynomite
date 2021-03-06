package net.moltendorf.bukkit.likedynomite

import org.bukkit.entity.EntityType
import java.util.Arrays
import java.util.HashSet

/**
 * Settings

 * @author moltendorf
 */
class Settings {
  val enabled = true // Whether or not the plugin is enabled at all; interface mode.

  val max = 1_000_000 // Maximum number of TNT in queue.
  val rate = 1 // Number of TNT to spawn per tick.

  // Entities that can be damaged by TNT.
  val damageable = HashSet(Arrays.asList(
    EntityType.BAT,
    EntityType.BLAZE,
    EntityType.CAVE_SPIDER,
    EntityType.CHICKEN,
    EntityType.COW,
    EntityType.CREEPER,
    EntityType.ENDERMAN,
    EntityType.ENDER_DRAGON,
    EntityType.GHAST,
    EntityType.GIANT,
    EntityType.IRON_GOLEM,
    EntityType.MAGMA_CUBE,
    EntityType.MINECART_TNT,
    EntityType.MUSHROOM_COW,
    EntityType.PIG,
    EntityType.PIG_ZOMBIE,
    EntityType.PLAYER,
    EntityType.SHEEP,
    EntityType.SILVERFISH,
    EntityType.SKELETON,
    EntityType.SLIME,
    EntityType.SNOWMAN,
    EntityType.SPIDER,
    EntityType.SQUID,
    EntityType.WITCH,
    EntityType.WITHER,
    EntityType.ZOMBIE
  ))
}
