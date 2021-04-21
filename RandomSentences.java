import java.util.Random;

public class RandomSentences {
  static String[] common_noun = { "man", "woman", "fish", "elephant", "unicorn" };
  static String[] conjunction = { "and", "or", "but", "because" };
  static String[] proper_noun = { "Fred", "Jane", "Richard Nixon", "Miss America" };
  static String[] determiner = { "the", "a", "every", "some", "an" };
  static String[] adjective = { "big", "tiny", "pretty", "bald" };
  static String[] intransitive_verb = { "runs", "jumps", "talks", "sleeps" };
  static String[] transitive_verb = { "loves", "hates", "sees", "knows", "looks for", "finds" };

  // One thing you can do is genralize the thnigs you repeate a lot.
  // For example move your random expression to a function
  static int random(int max) {
    // this is an other random way to get the random int and it's more varied than
    // Math.random() * max
    return (new Random()).nextInt(max);
  }

  // One other common pattern is to move your access to list indexer to a function
  static String randomItem(String[] listOfStrings) {
    // because we have only one place where the list are accessed we can add the
    // space here
    return listOfStrings[random(listOfStrings.length)] + " ";
  }

  public static void main(String args[]) {
    System.out.println(sentence());
  }

  // one other thngs you can change is use the return type of the function instead
  // of printing in the function
  public static String sentence() {
    if (Math.random() > 0.25) {
      return simple_sentence() + randomItem(conjunction) + sentence();
    }
    return simple_sentence();
  }

  private static String simple_sentence() {
    return noun_phrase() + verb_phrase();
  }

  // in this function a good thing to do is to remove nesting fo the if
  // statements, it makes the code much easier to read.
  private static String noun_phrase() {
    if (Math.random() > 0.50) {
      return randomItem(proper_noun);
    }

    if (Math.random() > 0.50) {
      return randomItem(determiner) + randomItem(common_noun);
    }

    if (Math.random() > 0.50) {
      return randomItem(determiner) + randomItem(adjective) + randomItem(common_noun);
    }

    if (Math.random() > 0.50) {
      return randomItem(determiner) + randomItem(common_noun) + "who " + verb_phrase();
    }

    return randomItem(determiner) + randomItem(adjective) + randomItem(common_noun) + "who " + verb_phrase();
  }

  private static String verb_phrase() {
    if (Math.random() > 0.5) {
      return randomItem(intransitive_verb);
    }

    if (Math.random() > 0.5) {
      return randomItem(intransitive_verb) + noun_phrase();
    }

    if (Math.random() > 0.25) {
      return "is " + randomItem(adjective);
    }

    return "believes that " + simple_sentence();
  }
}
