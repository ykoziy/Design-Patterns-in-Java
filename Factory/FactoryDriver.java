/*
 * Factory creates objects without exposing the instantiation logic to the client. SIMPLIFIED VERSION OF FACTORY METHOD PATTERN!!
 * Not really "official" GoF pattern, but useful to know.
 */
public class FactoryDriver {
    public static void main(String[] args) { 
        Enemy enemy = EnemyFactory.getEnemy("Goomba");
        enemy.speak();
        
        enemy = EnemyFactory.getEnemy("Buzzy beetle");
        enemy.speak();
        
        enemy = EnemyFactory.getEnemy("koopa troopa");
        enemy.speak();
    }
}
