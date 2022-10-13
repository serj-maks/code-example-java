package com.vault.io_api.ex08;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    final static String PATH = "temp";
    final static String EXT = ".tmp";

    // delete all files by extension only in this dir (without recursive deleting)
    public static void main(String[] args) throws IOException {
        deleteAllFilesByExt1(new File(PATH), EXT);
        deleteAllFilesByExt2(PATH, EXT);
        deleteAllFilesByExt3(PATH, EXT);
        deleteAllFilesByExt4(PATH, EXT);
    }

    public static void deleteAllFilesByExt1(File path, String ext) {
        File folder = new File(String.valueOf(path));
        File fList[] = folder.listFiles();
        for (int i = 0; i < fList.length; i++) {
            String pes = String.valueOf(fList[i]);
            if (pes.endsWith(ext)) {
                fList[i].delete();
            }
        }
    }

    public static void deleteAllFilesByExt2(String path, String ext) {
        GenericExtFilter filter = new GenericExtFilter(ext);
        File dir = new File(path);
        //list out all the file name with .tmp extension
        String[] list = dir.list(filter);
        if (list.length == 0) return;
        File fileDelete;
        for (String file : list) {
            String temp = new StringBuffer(path)
                    .append(File.separator)
                    .append(file).toString();
            fileDelete = new File(temp);
            boolean isdeleted = fileDelete.delete();
            System.out.println("file : " + temp + " is deleted : " + isdeleted);
        }
    }

    //inner class, generic extension filter
    public static class GenericExtFilter implements FilenameFilter {
        private String ext;

        public GenericExtFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }

    public static void deleteAllFilesByExt3(String path, String ext) {
        File folder = new File(path);
        Arrays.stream(folder.listFiles())
                .filter(file -> file.getName().endsWith(ext))
                .forEach(File::delete);
    }

    public static void deleteAllFilesByExt4(String path, String ext) {
        // Creating filter with given extension by
        // creating an object of FileExtFilter
        FileExtFilter filter = new FileExtFilter(ext);

        // Now, creating an object of FIle  class
        File direction = new File(path);

        // Cresting an array if strings to
        // list out all the file name
        // using the list() with .txt extension
        String[] list = direction.list(filter);

        // Iterating over the array of strings
        // using basic length() method
        for (int i = 0; i < list.length; i++) {
            // printing the elements
            System.out.println(list[i]);
        }

        // Base condition check when array of strinfg is
        // empty Then simply return
        if (list.length == 0)
            return;

        File fileDelete;

        // Now looking for the file  in the
        for (String file : list) {

            String temp = new StringBuffer(path)
                    .append(File.separator)
                    .append(file)
                    .toString();

            // Storing the file
            fileDelete = new File(temp);

            // Checking whether the file is deleted
            boolean isdeleted = fileDelete.delete();

            // Print true if file is deleted
            System.out.println("file : " + temp
                    + " is deleted : "
                    + isdeleted);
        }
    }

    //inner class, generic extension filter
    public static class FileExtFilter implements FilenameFilter {
        // Extension
        private String extension;

        // Comparator
        public FileExtFilter(String extension) {

            // This keyword refers to current object itself
            this.extension = extension;
        }

        public boolean accept(File directory, String name) {

            // Returning the file name along with the file
            // extension type
            return (name.endsWith(extension));
        }
    }
}
