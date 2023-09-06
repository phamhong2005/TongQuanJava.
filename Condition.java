import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
//        bài 1 :
//        Scanner number = new Scanner(System.in);
//        Scanner number1 = new Scanner(System.in);
//
//        System.out.println("Input");

//        int a = number.nextInt();
//        System.out.println("OutPut");
//        int b = number1.nextInt();
//
//        if (a % b ==0){
//            System.out.println(a + " Có chia hết cho " + b);
//        }
//        else {
//            System.out.println(a + " Không chia hết cho " + b);
//        }

//          bài 2:
//        Scanner inputAge = new Scanner(System.in);
//
//        System.out.println("Input Age");
//        int age = inputAge.nextInt();
//        if (age>16){
//            System.out.println("Đủ Tuổi Nhập Học");
//        }
//        else {
//            System.out.println("Không đủ điều kiện");
//        }

//        bài 3

//        Scanner number = new Scanner(System.in);
//
//        System.out.println("Nhập A");
//        int number1 = number.nextInt();
//        if (number1 > 0){
//            System.out.println(number1 + "Lớn hơn 0");
//        }
//        else {
//            System.out.println(number1 + "Nhỏ hơn 0");
//        }

//        bài 4
//
//        Scanner number = new Scanner(System.in);
//        Scanner number1 = new Scanner(System.in);
//        Scanner number2 = new Scanner(System.in);
//
//        System.out.println("Input A");
//        int a = number.nextInt();
//        System.out.println("Input B");
//        int b = number1.nextInt();
//        System.out.println("Input C");
//        int c = number2.nextInt();
//
//        if (a > b && b > c) {
//            System.out.println("Max là " + a);
//        } else if (b > a && b > c) {
//            System.out.println("Max là " + b);
//        } else if (b > a && c > b) {
//            System.out.println("Max là " + c);
//        } else {
//            System.out.println("Max là " + c);
//        }


//        bài 5

//        Scanner Poin = new Scanner(System.in);
//        Scanner Poin2 =  new Scanner(System.in);
//
//        System.out.println("Poin1 ");
//        double diem1 = Poin.nextDouble();
//        System.out.println("Poin2");
//        double diem2 = Poin2.nextDouble();
//        System.out.println("Điểm Trung Bình Là : ");
//        double tb = (diem1+diem2)/2;
//
//        if (tb==10){
//            System.out.println("Xuất sắc");
//        } else if (tb<10 && tb >=8) {
//            System.out.println("Giỏi");
//        } else if (tb<8 && tb >=6.5) {
//            System.out.println("khá");
//        }
//        else {
//            System.out.println("Trung Bình");
//        }

//        bài 6

//        Scanner Product = new Scanner(System.in);
//        double vnd;
//
//        System.out.println("Nhập số SP");
//        int newProduct = Product.nextInt();
//        if (newProduct>0 && newProduct<=5){
//            System.out.println(vnd=newProduct * 13.06);
//        } else if (newProduct >5 && newProduct <=12) {
//            System.out.println(vnd = newProduct*15.05);
//        } else if (newProduct>12 && newProduct <= 35) {
//            System.out.println(vnd = newProduct * 17.574);
//        }else {
//            System.out.println(vnd = newProduct*20.0);
//        }

//        bài 7
//            Scanner telephone = new Scanner(System.in);
//
//        System.out.println("Nhập số phút gọi");
//        double menute = telephone.nextDouble();
//        if (menute > 0 && menute<=2){
//            System.out.println("Cước điện thoại là " + ":"+ menute * 0.86);
//        }
//        else if (menute>2 && menute <=5) {
//            System.out.println("Cước điện thoại là " + ":"+ menute * 1.20);
//        } else if (menute > 5 && menute <= 10) {
//            System.out.println("Cước điện thoại là " + ":"+ menute*1.678);
//        } else if (menute>10 && menute <=16) {
//            System.out.println("Cước điện thoại là " + ":"+ menute * 1.98);
//        }
//        else {
//            System.out.println("Cước điện thoại là " + ":"+ menute * 2.22);
//        }
//
//
//        bài 8
//
//        Scanner doC = new Scanner(System.in);
//
//        System.out.println("Nhập độ C");
//        double number = doC.nextDouble();
//
//        double f = number * 9/5 +32;
//        System.out.println("Độ f la :"+ f + " Độ" );


//        double C = 3;
//        double f ;
//        f = C * 9/5 +32;
//        System.out.println(f);

//        bài 9

//        Scanner met = new Scanner(System.in);
//        System.out.println("Nhập mét vô");
//        double meet = met.nextDouble();
//        double ft = meet * 3.2808;
//
//        System.out.println("Độ Ft Là" +ft);


//        bài 10
//        Scanner Sv = new Scanner(System.in);
//
//        System.out.println("Nhập Cạnh a");
//        int a = Sv.nextInt();
//        int S = a * a ;
//            System.out.println("Hình vuông cạnh " + a + " có diện tích là "+ S);
//            bài 11
//            Scanner canh1 = new Scanner(System.in);
//            Scanner canh2 = new Scanner(System.in);
//
//            System.out.println("Nhập cạnh a");
//            int a = canh1.nextInt();
//            System.out.println("Nhập cạnh b");
//            int b = canh2.nextInt();
//
//            int S = a * b ;
//            System.out.println("Diện tích hình chữ nhật là " + S);

//            bài 12
//            Scanner canh1 = new Scanner(System.in);
//            Scanner canh2 = new Scanner(System.in);
//
//            System.out.println("Nhập a");
//            int a = canh1.nextInt();
//            System.out.println("Nhập b");
//            int b = canh2.nextInt();
//
//            double c = (a * b)/2;
//            System.out.println(c);


//            bài 13
//            Scanner a2 = new Scanner(System.in);
//            Scanner b2 = new Scanner(System.in);
//
//            System.out.println("Nhập a");
//            int a = a2.nextInt();
//            System.out.println("Nhập b");
//            int b = b2.nextInt();;
//
//            if (a == 0){
//                if (b == 0){
//                    System.out.println("Vô số nghiệm");
//                }
//                else {
//                    System.out.println("Vô nghiệm");
//                }
//            }
//            else {
//                System.out.println(-b/a);
//            }

//            bài 14
//
//            Scanner number1 = new Scanner(System.in);
//            Scanner number2 = new Scanner(System.in);
//            Scanner number3 = new Scanner(System.in);
//
//            int a = number1.nextInt();
//            int b = number2.nextInt();
//            int c = number3.nextInt();
//
//            double denta = Math.pow(b,2) - 4 * a * c ;
//            double d = java.lang.Math.sqrt(denta);
//            double n1 = (-b+d)/2*a;
//            double n2 = (-b-d)/2*a;
//
//
//            if(denta >0){
//
//                System.out.println("Phương trình có nghiệm 1 là " + n1 + " và nghiệm 2 là " + n2);
//            }
//             else if (denta < 0){
//                System.out.println("Phương trình vô nghiệm");
//            }else {
//                System.out.println("Phương trình có nghiệm" + -b/2*a);
//            }


//            bài 15


//            Scanner age1 = new Scanner(System.in);
//
//            System.out.println("Nhập age đi");
//            int age = age1.nextInt();
//            if (age > 0 && age <120){
//                System.out.println(age + " Là tuổi của con người");
//            }
//            else {
//                System.out.println("Là tuổi của con cặc");
//            }

//            bài 16

//        Scanner number1 = new Scanner(System.in);
//        Scanner number2 = new Scanner(System.in);
//        Scanner number3 = new Scanner(System.in);
//
//        System.out.println("Nhập a");
//        int a = number1.nextInt();
//        System.out.println("Nhập b");
//        int b = number2.nextInt();
//        System.out.println("Nhập c");
//        int c = number3.nextInt();
//        if (a > 0 && b > 0 && c > 0) {
//            if (a + b > c && b + c > a && a + c > b) {
//                System.out.println(a + "," + b + "," + c + "là ba cạnh của tam giác");
//            } else {
//                System.out.println(a + "," + b + "," + c + "Không phải là cạnh của tam giác");
//            }
//        } else {
//            System.out.println("không phải là cạnh của tam giác");
//        }


    }
}
