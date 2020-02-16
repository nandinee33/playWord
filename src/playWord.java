import java.util.Scanner;

public class playWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = a.length();
        int d = b.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < c; i++) {
            arr1[a.charAt(i) - 97]++;
        }
        for (int j = 0; j < d; j++) {
            arr2[b.charAt(j) - 97]++;
        }
        int r = 0;
        for (int k = 0; k < 26; k++) {
            if (arr1[k] != arr2[k]) {
                r = r + Math.abs(arr1[k] - arr2[k]);
            }
        }
        System.out.println(r);
    }
}
