import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Unesite putanju originalne fajle: ");
            String sourcePath = scanner.nextLine();
            File sourceFile = new File(sourcePath);

            if(!sourceFile.exists()){
                System.out.println("Greška: Izvorni fajl ne postoji ili je unešena kriva putanja.");
                return;
            }

            if(!sourceFile.canRead()){
                System.out.println("Greška: Nije moguće čitati izvornu fajlu.");
                return;
            }

            if(!sourceFile.canWrite()){
                System.out.println("Greška: Nije moguće pisati u izvornu datoteku.");
                return;
            }

            System.out.print("Unestie putanju destinacije i naziv fajle: ");
            String destPath = scanner.nextLine();
            File destFile = new File(destPath);

            if(destFile.exists()){
                System.out.print("Fajla već postoji. Želite li je prepisati? (da/ne): ");

                String answer = scanner.nextLine().trim().toLowerCase();

                if(answer.equals("ne")){
                    System.out.println("Prekid programa, postojeća fajla neće biti prepisana.");
                    return;
                }
            }

            try (
                    FileInputStream fis = new FileInputStream(sourceFile);
                    FileOutputStream fos = new FileOutputStream(destFile);
            ){
                int byteUnit;
                while((byteUnit = fis.read()) != -1){
                    fos.write(byteUnit);
                }
            }

            if(destFile.exists()) {
                System.out.println("Fajla je uspješno kopirana!");

                System.out.print("Želite li izbrisati novo kopiranu fajlu? (da/ne): ");
                String delAnswer = scanner.nextLine().trim().toLowerCase();

                if(delAnswer.equals("da")){
                    destFile.delete();
                    System.out.println("Kopija fajle je uspješno izbrisana!");
                    }
            }
            else{
                System.out.println("Greška: Kopija fajle nije uspjela!");
            }

        } catch(IOException e){
            System.out.println("Dogodila se I/O greška: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Neočekivana greška: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }
}


