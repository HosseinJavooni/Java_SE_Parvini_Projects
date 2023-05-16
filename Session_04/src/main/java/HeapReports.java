public class HeapReports {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();

        System.out.println("runtime.availableProcessors() -> " + runtime.availableProcessors());
        System.out.println("runtime.maxMemory() -> " + runtime.maxMemory());
        System.out.println("runtime.totalMemory() -> " + runtime.totalMemory());
        System.out.println("runtime.freeMemory() -> " + runtime.freeMemory());
        System.out.println("used memory -> " + (runtime.totalMemory() - runtime.freeMemory()));
    }
}
