public class Addition extends MathHandler {
    @Override
    public void handleRequest(Numbers request) {
        if(request.getOperation() == "add") {
            System.out.println(request.getNum1() + " + " + request.getNum1() + " = " + 
                               (request.getNum1() + request.getNum2()));
        } else {
            successor.handleRequest(request);   
        }
    }
}
