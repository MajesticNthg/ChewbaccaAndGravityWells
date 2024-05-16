import java.util.ArrayList;

public class Level1 {
    public static boolean TransformTransform(int A[], int N) {
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i : A)
            listA.add(i);

        B = transform(listA, N, B);
        B = transform(B, B.size(), B);

        int sum = 0;
        for (int i : B) {
            sum += i;
        }

        if (sum % 2 == 0) return true;
        return false;
    }
    public static ArrayList<Integer> transform (ArrayList<Integer> listA, int N, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        int k = 0;
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= N- 1 - i; j++) {
                k = i + j;
                C.add(maxInt(listA, j, k));
            }
        }
        return C;
    }
    public static int maxInt (ArrayList<Integer> B, int j, int k) {
        int max = 0;
        for (int x = j; x <= k; x++) {
            if (B.get(x) >= max) {
                max = B.get(x);
            }
        }
        return max;
    }
}

