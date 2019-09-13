public class File implements FileSystemElement {

    private String name;
    private String type;
    private String directory;
    private int componentCount;
    private FileSystemElement parent;

    public File() {
    }

    public File(String name) {
        this.name = name;
        this.type = "File";
        this.componentCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getDirectory() {
        return "\""+directory+"\"";
    }

    @Override
    public int getComponentCount() {
        return componentCount;
    }

    @Override
    public FileSystemElement search(String name) {
        return null;
    }


    @Override
    public void add(FileSystemElement element) {
    }

    @Override
    public void remove(FileSystemElement element) {
    }




    public FileSystemElement getParent() {
        return parent;
    }

    public void setParent(FileSystemElement parent) {
        this.parent = parent;
    }


    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
