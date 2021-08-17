public class Variable {
    
    public static void main(String[] args) {
        //Intel Core i5-7500 specifications:
        byte coreNum = 4;
        short threadNum = 4;
        int lithography = 14;
        Long cache = 6L;
        float baseFrequency = 3.40f;
        double maxFrequency = 3.8;
        char generation = '7';
        boolean isProcessorGraphicsExist = true;
        System.out.println("Intel Core i5-7500 Processor specifications:");
        System.out.println("Number of cores = " + coreNum);
        System.out.println("Number of threads = " + threadNum);
        System.out.println("Lithography = " + lithography + " nm");
        System.out.println("Cache size = " + cache + " MB");
        System.out.println("Base frequency = " + baseFrequency + " GHz");
        System.out.println("Max frequency = " + maxFrequency + " GHz");
        System.out.println("Generation = " + generation + "th");
        System.out.println("Processor graphics presence = "+ isProcessorGraphicsExist);
    }
}