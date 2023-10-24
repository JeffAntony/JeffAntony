
import java.util.*;

public class Main {
    public static void main(String[] args) {

//1)string :
//        print
//
//        regex is my learning platform


//        String n = "Regex is my learning Paltform";
//            System.out.println(n);
//        }
//    }

//
//2)
//        string :
//        print
//
//        regex is my learning platform
//        count : number of characters


//        String n = "Regex is my Learning platfrom";
//        char b[] = n.toCharArray();
//        int v = b.length;
//        System.out.println("The lenght of the String = " + v);
//    }
//}


//        3)String :
//    input a character check characher present or not ?
//        how many time present ?
//

//        String b = "Hello";
//        char [] f = b.toCharArray();
//        char a='e';
//        int c=0;
//
//        for(int i=0; i<f.length; i++)
//        {
//
//            if (a==f[i])
//            {
//                System.out.println("Present " + a+" at"+i);
//                c++;
//
//            }
//
//        }
//        System.out.println("number of times present = "+c);
//
//
//    }
//}

//        String v = " Regex is my learning platform";
//        char d[] = v.toCharArray();
//        int c = 0;
//
//        for (int i = 0; i < d.length; i++)
//        {
//            if (d[i] == 'a' || d[i] == 'e' || d[i] == 'o' || d[i] == 'u')
//            {
//                System.out.println("Vowel is present = "+d[i]);
//                c++;
//
//            }
//            else
//            {
//                System.out.println("consonant is present = "+d[i]);
//                continue;
//            }
////            System.out.println(c);
//        }
//        System.out.println("count of vowel present =  "+c);
//
//    }
//}


//        5)
//        want to find index :user
//        i =>indexing
//        --------------

//        String g = "Hen";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give user input");
//        char a = sc.next().charAt(0);
//        char b[] = g.toCharArray();
//        for (int i = 0; i < b.length; i++)
//        {
//            if (b[i] == a)
//            {
//                System.out.println("The index of the element = " + i);
//            }
//        }
//    }
//}

//        6)
//        String is print reverse


//        String h = "yellow";
//        char[] j = h.toCharArray();
//        for (int i = j.length -1; i >= 0; i--)
//        {
//            System.out.print(j[i]);
//        }
//    }
//}

        //(7)        to check the string is pallindrome or not ?
//->array pallindrome logic
//
//String h="HiiH";
//int count=0;
//char b[]=h.toCharArray();
//for(int i=0; i<b.length/2; i++)
//{
//  if( b[i]!=b[b.length-1-i])
//  {
//      count++;
//  }
//}
//if(count>0)
//{
//    System.out.println("not a palindromic sequence");
//}
//else
//{
//    System.out.println("palindromic sequence");
//}
//}
//    }
//


//        (7)    which character is duplicate in string?
//        how much?

//        String h = "Nine";
//        char []b = h.toCharArray();
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//
//
//        for (int i = 0; i < b.length; i++)
//        {
//            for (int j = i + 1; j < b.length; j++)
//            {
//                if (c == b[i])
//                {
//                    System.out.println(b[j]);
//
//                }
//
////     System.out.println("the character is duplicating");
//
//            }
//        }
//    }
//}


        String h = "Nine";
        char[] b = h.toCharArray();
        int s[][] = new int[][]{{4, 6, 8, 3,}};
        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {
                    System.out.println("Duplicate character: " + b[j]);
                }
            }
        }
    }
}
