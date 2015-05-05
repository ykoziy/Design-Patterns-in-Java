public class Multiplication extends MathHandler {
    @Override
    public void handleRequest(Numbers request) {
        if(request.getOperation() == "mult") {
            System.out.println(request.getNum1() + " * " + request.getNum1() + " = " + 
                               (request.getNum1() * request.getNum2()));
        } else {
            successor.handleRequest(request);
        }
    }
}
