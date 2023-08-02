import dk.sdu.mmmi.cbse.common.services.IBulletCreator;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;

import dk.sdu.mmmi.cbse.common.util.SPILocator;

module Enemy {
    requires Common;

    uses SPILocator;
    uses IBulletCreator;

    provides IGamePluginService with dk.sdu.mmmi.cbse.enemy.EnemyPlugin;
    provides IEntityProcessingService with dk.sdu.mmmi.cbse.enemy.EnemyControlSystem;
}