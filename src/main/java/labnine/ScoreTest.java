package labnine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Scores a three-part wizard test.
 *
 * @author Solutions Repository
 */
public class ScoreTest {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner to read file
    File file = null;
    Scanner input = null;
    try {
      file = new File("../../../../inputs/test.scores");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    // Get name
    
    String name = input.nextLine();
    
    // Load scores
    String magicWordsScore = input.nextLine();
    String potionsScore = input.nextLine();
    String styleScore = input.nextLine();
    
    WizardTest test = new WizardTest(name, magicWordsScore, potionsScore, styleScore);
    test.grade();
    System.out.print(test);
  }
}