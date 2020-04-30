package prog;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) return true;
        else if(file.getName().toLowerCase().endsWith(".html")) return true;
        else if(file.getName().toLowerCase().endsWith(".htm")) return true;
        return false;


    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
