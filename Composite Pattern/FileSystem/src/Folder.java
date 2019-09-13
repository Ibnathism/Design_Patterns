import java.util.ArrayList;

public class Folder implements FileSystemElement {

    private String name;
    private String type;
    private String directory;
    private FileSystemElement parent;

    private ArrayList<File> listOfFiles;
    private ArrayList<Folder> listOfFolders;

    public Folder(String name) {
        this.name = name;
        this.type = "Folder";
        listOfFiles = new ArrayList<>();
        listOfFolders = new ArrayList<>();
    }

    public Folder() {
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
        int count = listOfFiles.size();
        for (Folder i : listOfFolders) {
            if (i.getComponentCount()==0) count++;
            else count = count + i.getComponentCount();
        }
        return count;
    }


    @Override
    public void add(FileSystemElement element) {
        if (element.getType().equalsIgnoreCase("Folder")){
            listOfFolders.add((Folder) element);
            ((Folder) element).setDirectory(this.directory+":\\"+element.getName());
            ((Folder) element).setParent(this);
        }
        else if (element.getType().equalsIgnoreCase("File")){
            listOfFiles.add((File)element);
            ((File) element).setDirectory(this.directory+":\\"+element.getName());
            ((File) element).setParent(this);
        }
        else {
            System.out.println("Wrong type");
        }
    }

    @Override
    public void remove(FileSystemElement element) {
        if (element.getType().equalsIgnoreCase("Folder")){
            Folder temp = (Folder)element;
            listOfFolders.remove(element);
            temp.setDirectory(null);
        }
        else if (element.getType().equalsIgnoreCase("File")){
            File temp = (File)element;
            listOfFiles.remove(element);
            temp.setDirectory(null);
        }
        else {
            System.out.println("Wrong type");
        }
    }

    @Override
    public FileSystemElement search(String name) {
        for (Folder folder:listOfFolders) {
            if (folder.getName().equalsIgnoreCase(name)) return folder;
        }
        for (File file:listOfFiles){
            if (file.getName().equalsIgnoreCase(name)) return file;
        }
        return null;
    }

    public ArrayList<File> getListOfFiles() {
        return listOfFiles;
    }

    public ArrayList<Folder> getListOfFolders() {
        return listOfFolders;
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
