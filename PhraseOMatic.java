public class PhraseOMatic {
    public static void main (String [] args) {
        String [] numbers = {"one", "two", "three","four", "five",
        "six", "seven", "eight", "nine", "ten"};
        String [] colors = {"orange", "blue","yellow", "green", "purple",
        "brown", "black", "red", "gold"};
        String [] animals = { "dog", "cat", "horse", "panda", "duck",
                "cow", "monkey", "rabbit", "rat", "snake", "frog"};

        int favoriteNumber = numbers.length;
        int favoriteColor = colors.length;
        int favoriteAnimal = animals.length;

        int rand1 = (int) (Math.random() + favoriteNumber)
        int rand2 = (int) (Math.random()+ favoriteColor)
        int rand3 = (int) (Math.random() + favoriteAnimal)

        String phrase = numbers[favoriteNumber] + "" + colors [favoriteColor] +
                "" + animals[favoriteAnimal];
        System.out.println ("What we need is a " + phrase)
    }
}
