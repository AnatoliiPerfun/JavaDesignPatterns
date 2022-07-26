package Patterns.Behavioral.Memento;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 11:05 PM
 */
public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }
    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
