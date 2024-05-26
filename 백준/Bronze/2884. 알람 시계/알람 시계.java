import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H>0 && M>=45){
            System.out.print(H+" ");
            System.out.println(M-45);
        }else if(H>0 && M<45){
            System.out.print(H-1+" ");
            System.out.println(60-(45-M));
        }else if(H==0 && M>=45){
            System.out.print(H+" ");
            System.out.println(M-45);
        }else if(H==0 && M<45){
            System.out.print("23 ");
            System.out.println(60-(45-M));
        }

        sc.close();

    }
}