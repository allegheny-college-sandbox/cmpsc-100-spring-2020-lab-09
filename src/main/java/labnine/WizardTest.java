package labnine;

public class WizardTest {

  private final String name;
  private final String magicWords;
  private final String potions;
  private final String style;
  private final int total;
  private boolean isPassing = false;

  public WizardTest(String name, String magicWords, String potions, String style) {
    this.name = name;
    this.magicWords = magicWords;
    this.potions = potions;
    this.style = style;
    this.total = getNumericScore(magicWords) 
                 + getNumericScore(potions) 
                 + getNumericScore(style);
  }
  
  private int getNumericScore(String score) {
    int numericScore;
    switch(score) {
      case "AA":
        numericScore = 3;
        break;
      case "A":
        numericScore = 2;
        break;
      case "BA":
        numericScore = 1;
        break;
      default:
        numericScore = 0;
        break;
    }
    return numericScore;
  }
  
  public void grade() {
    double average = (double)this.total / 3;
    if (average > 1.0) {
      this.isPassing = true;
    }
  }
  
  public String toString() {
    String score;
    score = "Name: " + this.name + "\n\n";
    score += "Magic Words:\t" + this.magicWords + "\n";
    score += "Potions:\t" + this.potions + "\n";
    score += "Style:\t\t" + this.style + "\n";
    score += "\n";
    if(this.isPassing) {
      score += "PASSED";
    } else {
      score += "FAILED";
    }
    return score;
  }
}