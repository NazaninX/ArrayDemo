package arraydemo;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[10];
        
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
            System.out.print(a[i] + " ");
            sum = sum + a[i];
        }
        
        int min = a[0];
        int max = a[0];
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
                maxIndex = i;
            }
            if(min > a[i]) {
                min = a[i];
                minIndex = i;
            }
        }
        
        System.out.println("\nSum = " + sum + " avg = " + sum/a.length);
        System.out.println("Min = " + min + " min index = " + minIndex);
        System.out.println("Max = " + max + " max index = " + maxIndex);
    }    
}