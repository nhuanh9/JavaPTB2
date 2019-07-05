import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào c: ");
        int c = scanner.nextInt();
        String str = "";
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        if (ptb2.getA() == 0){
            if (ptb2.getB() == 0){
                if (ptb2.getC() == 0){
                    str = "Vô số nghiệm";
                } else {
                    str = "Vô Nghiệm";
                }
                System.out.println(str);
            } else {
                str = "Phương trình có nghiệm là: ";
                str+=(float)(-ptb2.getC()/ptb2.getB());
            }

        } else if (ptb2.getDiscriminant()<0){
            str="Phương trình vô nghiệm";
        } else {
            str = "Phương trình có nghiệm thứ 1 là: "+ptb2.getRoot1();
            str += "\nPhương trình có nghiệm thứ 2 là: "+ptb2.getRoot2();
        }
        System.out.println(str);
    }
}
