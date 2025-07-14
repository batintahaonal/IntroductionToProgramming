package ders1;

public class Trial {
    public static void main(String[] args) {
        String input = "batin taha onal";  
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                int value = lower - 'a' + 1;
                output.append(value);
            } else {
                output.append(c);
            }
        }
        System.out.println(output.toString());
    }
}

