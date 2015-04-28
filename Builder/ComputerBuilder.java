public class ComputerBuilder implements Builder {
    private Computer pc;
    
    public ComputerBuilder() {
        this.pc = new Computer();
    }
    
    @Override
    public void buildCase() {
        pc.setCase("Cooler Master HAF 932");
    }
    
    @Override
    public void buildPsu() {
        pc.setPsu("CORSAIR TX Series CMPSU-750TX 750W");
    }
    
    @Override
    public void buildMotherboard() {
        pc.setMotherboard("ASUS P6X58D Premium");
    }
    
    @Override
    public void buildCpu() {
        pc.setCpu("Intel Core i7-930 Bloomfield");
    }
    
    @Override
    public void buildRam() {
        pc.setRam("OCZ Gold 6GB (3 x 2GB) 240-Pin DDR3 SDRAM DDR3 1600");
    }
    
    @Override
    public void buildGpu() {
        pc.setGpu("Gigabyte AMD Radeon HD 7950 3GB GDDR5");
    }
    
    @Override
    public void buildHdd() {
        pc.setHdd("Seagate Barracuda 7200.11 ST3500320AS 500GB");
    }
    
    @Override
    public Computer getComputer() {
        return pc;
    }
    
}
