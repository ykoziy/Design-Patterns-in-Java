import java.util.ArrayList;

/*
 * Interpreter pattern, specifies how to evaluate sentences in the language defined.
 */
public class InterpreterDriver {
    public static void main(String[] args) {
        String roman = "MCMXXVIII";
        Context c = new Context(roman);
        
        ArrayList<Expression> parse = new ArrayList<>();
        parse.add(new Thousands());
        parse.add(new Hundreds());
        parse.add(new Tens());
        parse.add(new Ones());
        
        for (Expression e : parse) {
            e.interpret(c);
        }
        
        System.out.println(roman + " = " + c.getOutput());
    }
}
