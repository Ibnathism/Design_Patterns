public interface FileSystemElement {
    String getName();
    String getType();
    String getDirectory();
    int getComponentCount();
    FileSystemElement search(String name);
    void add(FileSystemElement element);
    void remove(FileSystemElement element);
}
