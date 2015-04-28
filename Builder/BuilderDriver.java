/*
 * Builder pattern, separates object construction from its representation 
 */
public class BuilderDriver {
    public static void main(String[] args) { 
        Builder b = new ComputerBuilder();
        Director d = new Director();
        Computer pc = d.buildComputer(b);
        
        System.out.println("Computer Built");
        System.out.println("Case: " + pc.getCase());
        System.out.println("Power Supply: " + pc.getPsu());
        System.out.println("Motherboard: " + pc.getMotherboard());
        System.out.println("CPU: " + pc.getCpu());
        System.out.println("RAM: " + pc.getRam());
        System.out.println("Video card: " + pc.getGpu());
        System.out.println("Hard Drive: " + pc.getHdd());
    }
}
