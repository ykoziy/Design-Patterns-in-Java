/*
 * Contains factory method that returns object requested
 */
public class EnemyFactory {
    public static Enemy getEnemy(String name)
    {
        if(name.equalsIgnoreCase("Goomba")) {
            return new Goomba();
        } else if(name.equalsIgnoreCase("Koopa Troopa")) {
            return new KoopaTroopa();
        } else if(name.equalsIgnoreCase("Buzzy Beetle")) {
            return new BuzzyBeetle();
        }
        return null;    
    }
}
