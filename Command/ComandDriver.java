/*
 * Command pattern encapsulates a request as an object.
 */
public class ComandDriver {
    public static void main(String[] args) { 
        Player player = new Player();
        
        //various commands as objects
        Command fire = new Fire(player);
        Command jump = new Jump(player);
        Command moveRight = new MoveRight(player);

        Action action = new Action();
        
        char c = 'f';
        switch(c) {
            case 'd': 
                action.doAction(moveRight);
                break;
            case 'w': 
                action.doAction(jump); 
                break;
            case 'f':
                action.doAction(fire);
                break;
            default:              
        }
         
    }
}
