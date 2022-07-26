package Patterns.Behavioral.Memento;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 11:06 PM
 */
public class FileWriterClient {
    public static void main(String[] args) throws Exception {

        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

        fileWriter.write("First Set of Data\n");
        System.out.println(fileWriter+"\n");
        // let`s save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");
        //checking file contents
        System.out.println(fileWriter+"\n");
        //let's undo to last save
        caretaker.undo(fileWriter);
        //checking file content again
        System.out.println(fileWriter+"\n");
    }
}
