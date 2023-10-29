
// Bubble- sort Algorithms

//public class Main {
//
//    public static void main(String[] args) {
//
//        int a[] ={ 4,2,1,6,4,7};
//                int n=a.length;
//        for(int i=0; i<n; i++)
//        {
//            for (int j = 0; j < n - i-1; j++)
//            {
//                if (a[j] > a[j + 1])
//                {
//                    int t = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = t;
//                }
//            }
//        }
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//    }
//
//    }


// selection-sort ALgorithm


//public class Main {
//
//    static void f(int a[]) {
//        int n = a.length;
//        for (int i = 0; i < n - 1; i++) {
//            int m = i;
//            for (int j = i + 1; j < n; j++) {
//                if (a[j] < a[m]) {
//                    m = j;
//                }
//            }
//            int t = a[i];
//            a[i] = a[m];
//            a[m] = t;
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        int a[] = {7, 4, 3, 2, 1};
//        f(a);
//        for(int j=0; j<a.length; j++)
//        {
//            System.out.println(a[j]+" ");
//        }
//
//    }
//}


// Insertion-sort Algorithm

//public class Main {
//
//    static void f(int a[]) {
//        int n = a.length;
//        for (int i = 0; i < n ; i++) {
//            int m = i;
//            while ( m>0&& a[m]<a[m-1])
//            {
//
//                int t=a[m];
//                a[m]=a[m-1];
//                a[m-1]=t;
//                m--;
//            }
//           
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        int a[] = {7, 4, 3, 2, 1};
//        f(a);
//        for(int j=0; j<a.length; j++)
//        {
//            System.out.println(a[j]+" ");
//        }
//
//    }
//}






