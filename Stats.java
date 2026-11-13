import java.util.Arrays;
public class Stats {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum=0.0;
        double count=0.0;
		for (String arg : args) {
		int value = Integer.parseInt(arg);
		if (value > max) {
			max = value;
    }
    if(value<min){
		min=value;
	}
}
count=args.length;
	double avg=sum/count;
System.out.println("Count: " + count);
System.out.println("Sum: " + sum);
System.out.println("Min: " + min);
System.out.println("Max: " + max);
System.out.printf("Average: %.2f%n", avg);
    }
}
