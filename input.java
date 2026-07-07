import java.util.Scanner;
public class InputNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("กรุณาใส่ตัวเลข (ใส่ -1 เพื่อจบเกม) : ");
            num = scanner.nextInt();

        while(num == -1){
            System.out.print("กรุณาใส่ตัวเลข (ใส่ -1 เพื่อจบเกม) : ");
            num = scanner.nextInt();
        }

        //ผลรวม
        double sum = SUM(num);
        //ค่าเฉลี่ย
        double avg = AVG(num);
        //ค่าสูงสุด
        double max = MAX(num);
        //ค่าต่ำที่สุด
        double min = MIN(num);

        System.out.println("ผลรวม : " +sum);
        System.out.println("ค่าเแลี่ย : " +avg);
        System.out.println("ค่าสูงสุด : " +max);
        System.out.println("ค่าต่ำที่สุด : " +min);
    
        scanner.close();
    }
}
