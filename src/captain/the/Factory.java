package captain.the;

import com.almasb.fxgl.entity.*;
import com.almasb.fxgl.entity.component.CollidableComponent;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.physics.box2d.dynamics.BodyType;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;

@SetEntityFactory
public class Factory implements EntityFactory {
    int counterino;
    @Spawns("enemy")
    public Entity newEnemy(SpawnData data) {

        return Entities.builder()
                .type(Types.ENEMY)
                .from(data)
                //.viewFromTextureWithBBox("8bitTriangle.png")
                .viewFromNodeWithBBox(new Rectangle(25, 25, Color.RED))
                .with(new CollidableComponent(true))
                .with(new EnemyControl())
                .build();




    }
        /*

    @Spawns("bullet")
    public  Entity newBullet(SpawnData data){
        PhysicsComponent physics = new PhysicsComponent();
        physics.setBodyType(BodyType.DYNAMIC);

        return Entities.builder()
                .type(Types.BULLET)
                .from(data)
                .with(new BulletControls())
                .build();

        }
*/

}
