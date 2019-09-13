public enum ComputerName {
    COMPUTER_A("CPU_A", "MMU_A"), COMPUTER_B("CPU_B", "MMU_B"), COMPUTER_C("CPU_C", "MMU_C");


    private String cpu;
    private String mmu;
    ComputerName(String cpu, String mmu) {
        this.cpu = cpu;
        this.mmu = mmu;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMmu() {
        return mmu;
    }
}
