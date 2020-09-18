
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        printHeader();
        Map<Integer, String > beaufortDictionary = createBeaufortDictionary();

        while (true)
        {
            System.out.print("Podaj skalę Beauforta: / Input Beaufort scale: ");

            try
            {
                int beaufortScale = Integer.parseInt(in.next());
                System.out.println(beaufortDictionary.get(beaufortScale));
            }
            catch (Exception e)
            {
                System.out.println("Nieprawidłowa wartość :(");
            }

            System.out.println("Restart program? (Y/n)");

            String restart = in.next().toLowerCase();

            if (!restart.equals("y"))
                break;

            System.out.println("===============================================");
        }
    }

    private static void printHeader(){
        System.out.println("Źródło treści programu: https://zaglewgore.pl/skala-beauforta/");
        System.out.println("===============================================");
        System.out.println("Skala Beauforta dla laików.");
        System.out.println("Autor: Jacek Kudlański");
        System.out.println("===============================================");
        System.out.println(" Siłę wiatru określa się za pomocą umownej, opisowej skali Beauforta.\n" +
                "  Podstawą, na której opiera się określenie siły wiatru jest wygląd powierzchni morza (nie wyskość fal !).\n" +
                "Jest to skala 13 stopniowa (0 - 12) °B." +
                " Każdemu stopniowi skali siły wiatru odpowiada określony przedział prędkości wiatru.\n" +
                "  Jedynie najwyższy, 12°B stanowi przedział jednostronnie otwarty (Vw > 32.6 m/s lub Vw > 64 w),\n" +
                " ponieważ dalszy wzrost, powyżej dolnej granicy, prędkości wiatru nie daje już widocznych zmian w\n" +
                "  wyglądzie powierzchni morza." +
                " Zestawienie stopni siły wiatru, odpowiadających im przedziałów prędkości wiatru,\n" +
                "   nazw polskich i angielskich, odpowiednich stopni siły wiatru,\n" +
                " wyświetli się po wprowadzeniu liczby ze skali Beauforta:");
        System.out.println("===============================================");
    }

    private static Map<Integer, String> createBeaufortDictionary()
    {
        String[] scaleDescription = {
                //0°B
                "0°B => cisza => calm => 0,0 - 0,2 m/s => <1W \n" + "Morze gładkie jak lustro.",
                //1°B
                "1°B => powiew => light air => 0,2 - 1,5 m/s => 1 - 3 W \n" + "Na powierzchni wody tworzą się zmarszczki o wyglądzie łusek.",
                //2°B
                "2°B => słaby wiart => light breeze => 1,6 - 3,3 m/s => 4 - 6 W \n" +
                        "Na powierzchni morza występują krótkie, dość wyraźne falki o szklistych grzbietach. Żadna z tych falek nie załamuje się.",
                //3°B
                "3°B => łagodny wiart => gentle breeze => 3,4 - 5,4 m/s => 7 - 10 W\n" +
                        "Grzbiety falek stają się wyraźnie wydłużone i zaostrzone, pojedyńcze grzbiety zaczynają się załamywać,\n" +
                        "tworząca się piana ma szklisty wygląd. Na powierzchni morza pojawiają się pierwsze,\n" +
                        "pojedyńcze białe grzebienie w dużym oddaleniu od siebie.",
                //4°B
                "4°B => umiarkowany wiart => moderate breeze => 5,5 - 7,9 m/s => 11 - 15 W \n" +
                        "Poprzednio małe fale zaczynają się wydłużać, na powierzchni morza pojawia się sporo białych grzebieni.",
                //5°B
                "5°B => dość silny wiart => fresh breeze => 8,0 - 10,7 m/s => 16 - 21 W\n" +
                        "Fale stają się wyraźne i dobrze wykształcone, ich długość wyraźnie wzrosła. Duży odstek fal załamuje się,\n" +
                        "na powierzchni wody dużo białych grzebieni, plamy piany utrzymują się się dość długo, pojawiają się pierwsze bryzgi.",
                //6°B
                "6°B => silny wiart => strong breeze => 10,8 - 13,8 m/s => 22 - 27 W\n" +
                        "Zaczynają się tworzyć duże fale o silnie wykształconych, stromych i pienistych grzbietach.\n" +
                        "Fale intensywnie załamują się, bryzgi tworzą się powszechnie.",
        };

        Map<Integer, String> beaufortDictionary = new HashMap<Integer, String>();
        int dictionaryKey = 0;

        for (String description : scaleDescription)
        {
            beaufortDictionary.put(dictionaryKey, description);
            dictionaryKey++;
        }

        return beaufortDictionary;
    }
}
