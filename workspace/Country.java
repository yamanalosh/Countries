// Name: Yaman Alosh
// Date: 1/16/25
// Makes country objects as well as their capital, language, and image file.
// Enables you to do certain things with the countries.
public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;
  // add constructors
  public Country() {
    name = "China";
    capital = "Beijing";
    language = "Chinese";
    imageFile = "China.jpg";
  }
  public Country(String countryName, String countryCapital, String countryLanguage, String countryImage) {
    name = countryName;
    capital = countryCapital;
    language = countryLanguage;
    imageFile = countryImage;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName() {
    return name;
  }
  public String getCapital() {
    return capital;
  }
  public String getLanguage() {
    return language;
  }
  public String getImageFile() {
    return imageFile;
  }
  public void setName(String newName) {
    name = newName;
  }
  public void setCapital(String newCapital) {
    capital = newCapital;
  }
  public void setLanguage(String newLanguage) {
    language = newLanguage;
  }
  public void setImageFile(String newImageFile) {
    imageFile = newImageFile;
  }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString() {
    return "The capital of " + name + " is " + capital + " and its language is " + language + ".";
  }

 
}