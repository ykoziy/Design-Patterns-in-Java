/*
 * Factory method allows you to create objects without specifying the exact class of object that will be created
 */
public class FactoryMethodDriver {
    public static void main(String[] args) { 
        Enemy enemy = EnemyFactory.getEnemy("Goomba");
        enemy.speak();
        
        enemy = EnemyFactory.getEnemy("Buzzy beetle");
        enemy.speak();
        
        enemy = EnemyFactory.getEnemy("koopa troopa");
        enemy.speak();
    }
}
