package TEST;

import java.util.Scanner;

public class C01높이입력삼각형 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.printf("높이 입력 : ");
        int h = sc.nextInt();

        for (int i = 0; i < h; i++) {
        	
            // 공백
            for (int j = 0; j <= (h - 2) - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }		

	}

}
