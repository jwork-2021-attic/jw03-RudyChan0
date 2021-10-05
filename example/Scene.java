package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;

import example.classloader.SteganographyClassLoader;

public class Scene {

    public static void main(String[] args) throws Exception {  

        Line line = new Line(7);
        line.put(Gourd.ONE, 6);
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        Geezer theGeezer = Geezer.getTheGeezer();

        // SteganographyClassLoader loader = new SteganographyClassLoader(
        //         new URL("https://cdn.njuics.cn/example.BubbleSorter.png"));
        // Class c = loader.loadClass("example.BubbleSorter");
        
        // SteganographyClassLoader loader = new SteganographyClassLoader(
        //         new URL("https://github.com/jwork-2021/jw03-RudyChan0/blob/main/example.s181860011.code.InsertionSorter.png"));
        // Class c = loader.loadClass("example.s181860011.code.InsertionSorter");

        // SteganographyClassLoader loader = new SteganographyClassLoader(
        //         new URL("https://github.com/jwork-2021/jw03-RudyChan0/blob/main/example.s181860011.code.SelectionSorter.png"));
        // Class c = loader.loadClass("example.s181860011.code.SelectionSorter");
        
        SteganographyClassLoader loader = new SteganographyClassLoader(
                new URL("https://github.com/jwork-2021/jw03-RudyChan0/blob/main/S191220057.InsertSorter.png"));
        Class c = loader.loadClass("S191220057.InsertSorter");


        Sorter sorter = (Sorter) c.newInstance();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);

        BufferedWriter writer;
        //writer = new BufferedWriter(new FileWriter("result_selection.txt"));
        writer = new BufferedWriter(new FileWriter("result_insertion_other.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
