package exception.lists.threads.files;

public class writingtoFiles {

    Formatter f = new Formatter("a.txt");

    f.format("%s", "Hi ");
    f.format("%s", "there");
    f.close();

}
