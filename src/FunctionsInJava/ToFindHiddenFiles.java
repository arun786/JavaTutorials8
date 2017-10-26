package FunctionsInJava;

import java.io.File;
import java.io.FileFilter;

public class ToFindHiddenFiles {
    public static void main(String[] args) {
        FindFilesPriorToJava8();
        FindHiddenFilesJava8Way();

    }

    public static void FindFilesPriorToJava8() {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });


        for (int i = 0; i < hiddenFiles.length; i++)
            System.out.println(hiddenFiles[i]);
    }

    public static void FindHiddenFilesJava8Way() {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        for (int i = 0; i < hiddenFiles.length; i++)
            System.out.println(hiddenFiles[i]);

    }
}
