package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
        ilkDortEleman(l);
        System.out.println();
        ilkDortElemanGec(l);
    }
    //1) küçükten büyüğe sırala sonra ilk 4 elemanı yazdır
    public static void ilkDortEleman(List<Integer> l) {
        l.stream().sorted().limit(4).forEach(metodLambda2::bosluklaYazdir);
    }
    //2) küçükten büyüğe sırala ilk 4 elemanı atla
    public static void ilkDortElemanGec(List<Integer> l) {
        l.stream().sorted().skip(4).forEach(metodLambda2::bosluklaYazdir);
    }
}
