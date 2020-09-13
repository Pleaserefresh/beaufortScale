package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        System.out.println("Źródło treści programu: https://zaglewgore.pl/skala-beauforta/");
        System.out.println("===============================================");
        System.out.println("Skala Beauforta dla laików.");
        System.out.println("Autor: Jacek Kudlański");
        System.out.println("===============================================");
        System.out.println("Siłę wiatru określa się za pomocą umownej, opisowej skali Beauforta. \n" +
                "Podstawą, na której opiera się określenie siły wiatru jest wygląd powierzchni morza (nie wyskość fal !). \n" +
                "Jest to skala 13 stopniowa (0 - 12) °B.\n" +
                "Każdemu stopniowi skali siły wiatru odpowiada określony przedział prędkości wiatru. \n" +
                "Jedynie najwyższy, 12°B stanowi przedział jednostronnie otwarty (Vw > 32.6 m/s lub Vw > 64 w), \n" +
                "ponieważ dalszy wzrost, powyżej dolnej granicy, prędkości wiatru nie daje już widocznych zmian w \n" +
                "wyglądzie powierzchni morza.\n" +
                "Zestawienie stopni siły wiatru, odpowiadających im przedziałów prędkości wiatru, \nnazw polskich i " +
                "angielskich, odpowiednich stopni siły wiatru, \nwyświetli się po wprowadzeniu liczby ze skali Beauforta:");
        System.out.println("===============================================");
        boolean run = true;
        while (run) {
            System.out.print("Podaj skalę Beauforta: / Input Beaufort scale: ");
            byte beaufortScale = in.nextByte();
            if (beaufortScale == 0) {
                System.out.println(beaufortScale + " B" + " => cisza => calm => 0,0 - 0,2 m/s => <1W \n" +
                        "Morze gładkie jak lustro.");
                System.out.println("===============================================");
            } else if (beaufortScale == 1) {
                System.out.println(beaufortScale + " B" + " => powiew => light air => 0,2 - 1,5 m/s => 1 - 3 W \n" +
                        "Na powierzchni wody tworzą się zmarszczki o wyglądzie łusek.");
                System.out.println("===============================================");

            } else if (beaufortScale == 2) {
                System.out.println(beaufortScale + " B" + " => słaby wiart => light breeze => 1,6 - 3,3 m/s => 4 - 6 W \n" +
                        "Na powierzchni morza występują krótkie, dość wyraźne falki o szklistych grzbietach. Żadna z tych falek nie załamuje się.");
                System.out.println("===============================================");
            } else if (beaufortScale == 3) {
                System.out.println(beaufortScale + " B" + " => łagodny wiart => gentle breeze => 3,4 - 5,4 m/s => 7 - 10 W \n" +
                        "Grzbiety falek stają się wyraźnie wydłużone i zaostrzone, pojedyńcze grzbiety zaczynają się załamywać, \n" +
                        "tworząca się piana ma szklisty wygląd. Na powierzchni morza pojawiają się pierwsze, \n" +
                        "pojedyńcze białe grzebienie w dużym oddaleniu od siebie.");
                System.out.println("===============================================");
            } else if (beaufortScale == 4) {
                System.out.println(beaufortScale + " B" + " => umiarkowany wiart => moderate breeze => 5,5 - 7,9 m/s => 11 - 15 W \n" +
                        "Poprzednio małe fale zaczynają się wydłużać, na powierzchni morza pojawia się sporo białych grzebieni.");
                System.out.println("===============================================");
            } else if (beaufortScale == 5) {
                System.out.println(beaufortScale + " B" + " => dość silny wiart => fresh breeze => 8,0 - 10,7 m/s => 16 - 21 W \n" +
                        "Fale stają się wyraźne i dobrze wykształcone, ich długość wyraźnie wzrosła. Duży odstek fal załamuje się, \n" +
                        "na powierzchni wody dużo białych grzebieni, plamy piany utrzymują się się dość długo, pojawiają się pierwsze bryzgi.");
                System.out.println("===============================================");
            } else if (beaufortScale == 6) {
                System.out.println(beaufortScale + " B" + " => silny wiart => strong breeze => 10,8 - 13,8 m/s => 22 - 27 W \n" +
                        "Zaczynają się tworzyć duże fale o silnie wykształconych, stromych i pienistych grzbietach. \n" +
                        "Fale intensywnie załamują się, bryzgi tworzą się powszechnie.");
                System.out.println("===============================================");
            } else if (beaufortScale == 7) {
                System.out.println(beaufortScale + " B" + " => bardzo silny wiart => near gale => 13,9 - 17,1 m/s => 28 - 33 W \n" +
                        "Silnie asymetryczna, łamiąca się fala. Porywana przez wiatr z łamiących się grzbietów piana \n" +
                        "zaczyna się układać w pasma równoległe do kierunku wiatru.");
                System.out.println("===============================================");
            } else if (beaufortScale == 8) {
                System.out.println(beaufortScale + " B" + " => sztorm => gale => 17,2 - 20,7 m/s => 34 - 40 W \n" +
                        "Odrywane od wierzchołków łamiących się fal bryzgi zaczynają wirować w powietrzu. \n" +
                        "Piana układa się w długie, bardzo wyraźnie wyraźnie wykształcone pasma zgodne z kierunkiem wiatru.");
                System.out.println("===============================================");
            } else if (beaufortScale == 9) {
                System.out.println(beaufortScale + " B" + " => silny sztorm => strong gale => 20,8 - 24,4 m/s => 41 - 47 W \n" +
                        "Odrywane od wierzchołków łamiących się fal bryzgi zaczynają wirować w powietrzu. \n" +
                        "Piana układa się w długie, bardzo wyraźnie wyraźnie wykształcone pasma zgodne z kierunkiem wiatru.");
                System.out.println("===============================================");
            } else if (beaufortScale == 10) {
                System.out.println(beaufortScale + " B" + " => bardzo silny sztorm => storm => 24,5 - 28,4 m/s => 48 - 55 W \n" +
                        "Powierzchnia morza niemal w całości biała od piany, również między pasmami piany, piana i \n" +
                        "woda bezpośrednio z powierzchni morza zaczyna być wyrywana przez wiatr w powietrze. \n" +
                        "Widzialność pozioma zaczyna się wyraźnie zmniejszać od wzrastającej ilości pyłu wodnego w powietrzu.");
                System.out.println("===============================================");
            } else if (beaufortScale == 11) {
                System.out.println(beaufortScale + " B" + " => gwałtowny sztorm => violent storm => 28,5 - 32,6 m/s => 56 - 63 W \n" +
                        "Wiatr wszędzie porywa i rozpyla wierzchołki fal, powierzchnia morza całkowicie biała. \n" +
                        "Widzialność pozioma zmniejszona, powierzchni morza w większym oddaleniu od statku słabo widoczna.");
                System.out.println("===============================================");
            } else if (beaufortScale == 12) {
                System.out.println(beaufortScale + " B" + " => huragan => hurricane => 32,7 < m/s => 64 < W \n" +
                        "Zatraca się granica między powietrzem a wodą; powietrze przesycone pyłem wodnym, bryzgami i \n" +
                        "unoszonymi przez wiatr płatami piany. Widzialność bardzo ograniczona. Otwarty przedział.");
                System.out.println("===============================================");
            } else {
                System.out.println("Poza skalą. \nOut of scale.");
                System.out.println("===============================================");
            }
            System.out.println("Restart program? (Y/n)");
            String restart = in.next().toLowerCase();
            run = restart.equals("y");
            System.out.println("===============================================");
        }
    }
}