/*
 * Product, represents complex object that is being built
 */
public class Computer {
    private String computerCase;
    private String psu;
    private String motherboard;
    private String cpu; 
    private String ram;
    private String gpu;
    private String hdd;
    
    public String getCase() {
        return computerCase;
    }
    
    public void setCase(String computerCase) {
        this.computerCase = computerCase;
    }
    
    public String getPsu() {
        return psu;
    }
    
    public void setPsu(String psu) {
        this.psu = psu;
    }
    
    public String getMotherboard() {
        return motherboard;
    }
    
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }  
    
    public String getCpu() {
        return cpu;
    }
    
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
    public String getRam() {
        return ram;
    }
    
    public void setRam(String ram) {
        this.ram = ram;
    }
    
    public String getGpu() {
        return gpu;
    }
    
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getHdd() {
        return hdd;
    }
    
    public void setHdd(String hdd) {
        this.hdd = hdd;
    }    
}
