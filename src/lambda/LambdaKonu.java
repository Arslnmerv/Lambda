package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaKonu {
    public static void main(String[] args) {

         /*lambda( functional programing )          -                java ( structured programing )
        1) nasıl yaparım, ne yaparım                -         ne yaparımdan çok nasıl yaparım düşünülür
        2) kod kısalığı, kod okunabilirliği ve hatasız  -       kod genelde uzundur, başkası sizin
            kod yazma bakımındna elverişli                             ne yaptığınızı anlamaybilir
        3) lambda sadece collection larda array lerde kullanılır
               (map lerde kullanılmaz)


        */
        List<Integer> l = new ArrayList<>(Arrays.asList(14, 9, 13, 4, 9, 2, 4, 14, 15));

        System.out.println("Java ile");
        yazdirJava(l);
        System.out.println("\nLambda ile");
        yazdirLambda(l);
        System.out.println("\nJava ile");
        ciftsayiYazdir(l);
        System.out.println("\nLambda ile");
        ciftsayiYazdirL(l);
        System.out.println("\nJava ile");
        tekSayilarinKaresi(l);
        System.out.println("\nLambda ile");
        tekSayilarinKaresiL(l);
    }

    public static void tekSayilarinKaresiL(List<Integer> l) {

        l.stream().filter(t -> t % 2 != 0).forEach(t -> System.out.print(t * t + " "));

    }

    public static void tekSayilarinKaresi(List<Integer> l) {


        for (Integer w : l) {

            if (w % 2 == 1) {

                System.out.print(w * w + " ");
            }
        }

    }

    public static void ciftsayiYazdirL(List<Integer> l) {

//		                 lambda expression (-> arrow function)
        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(+t + " "));

    }

    public static void ciftsayiYazdir(List<Integer> l) {

        for (Integer w : l) {

            if (w % 2 == 0) {

                System.out.print(w + " ");
            }
        }

    }

    // 1. List'in elemanlarini yanyana yazdir (JAVA)
    public static void yazdirJava(List<Integer> l) {

        for (Integer w : l) {

            System.out.print(w + " ");
        }

    }

    // 1. List'in elemanlarini yanyana yazdir (Lambda)
    public static void yazdirLambda(List<Integer> l) {

        l.stream().forEach(t -> System.out.print(t + " "));
    }
}
