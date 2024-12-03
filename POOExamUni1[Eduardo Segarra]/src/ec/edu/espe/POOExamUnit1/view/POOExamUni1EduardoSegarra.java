package ec.edu.espe.POOExamUnit1.view;

import ec.edu.espe.POOExamUnit1.model.Picture;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author G406
 */
public class POOExamUni1EduardoSegarra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name, author, deliveredDate, fileName = "pictures";
        
        System.out.println("Type the id of the picture: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type the name of the picture: ");
        name = scanner.nextLine();
        System.out.println("Type the name of the author: ");
        author = scanner.nextLine();
        System.out.println("Type the date that the picture was delivered: ");
        deliveredDate = scanner.nextLine();
        
        Picture newPicture = new Picture(id, name, author, deliveredDate);
        
        FileManager.save(newPicture, fileName);
    }
    
}
