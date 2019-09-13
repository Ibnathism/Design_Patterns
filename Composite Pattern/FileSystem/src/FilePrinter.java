public class FilePrinter {

    public static String printList(FileSystemElement element){
        if (element==null) return "";
        int indent = 0;
        StringBuilder stringBuilder = new StringBuilder();
        printList(element, indent, stringBuilder);
        return stringBuilder.toString();
    }
    public static void printList(FileSystemElement element, int indent, StringBuilder stringBuilder){
        stringBuilder.append(getIndentString(indent));
        stringBuilder.append("-----");
        stringBuilder.append(element.getName());
        stringBuilder.append("\n");
        if (element.getType().equalsIgnoreCase("File")){
            System.out.println("Not a composite object");
        }
        else if (element.getType().equalsIgnoreCase("Folder")){
            Folder temp = (Folder)element;
            for (Folder folder:temp.getListOfFolders()){
                printList(folder, indent+1, stringBuilder);
            }
            for (File file : temp.getListOfFiles()){
                printFile(file, indent+1, stringBuilder);
            }
        }
        else if (element.getType().equalsIgnoreCase("Drive")){
            Drive temp = (Drive)element;
            for (Folder folder:temp.getListOfFolders()){
                printList(folder, indent+1, stringBuilder);
            }
            for (File file : temp.getListOfFiles()){
                printFile(file, indent+1, stringBuilder);
            }
        }
        else System.out.println("Not a proper file type");


    }

    private static void printFile(File file, int indent, StringBuilder stringBuilder){
        stringBuilder.append(getIndentString(indent));
        stringBuilder.append("-----");
        stringBuilder.append(file.getName());
        stringBuilder.append("\n");
    }

    private static String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("     ");
        }
        return sb.toString();
    }
    public static String printDetails(FileSystemElement element){
        if (element == null) return "";
        else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Details of ").append(element.getName()).append(" : ");
            stringBuilder.append("\n");
            stringBuilder.append("Name : ").append(element.getName());
            stringBuilder.append("\n");
            stringBuilder.append("Type : ").append(element.getType());
            stringBuilder.append("\n");
            stringBuilder.append("Directory : ").append(element.getDirectory());
            stringBuilder.append("\n");
            stringBuilder.append("Component Count : ").append(element.getComponentCount());
            stringBuilder.append("\n");
            return stringBuilder.toString();
        }
    }
}
