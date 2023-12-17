package lab1.course2.group6.voitovich;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[args.length];
        for (int i = 0; i < args.length; i++) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Сыр")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Яблоко")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Мороженое")) {
                breakfast[i] = new IceCream(parts[1]);
            }
        }
        for (Food item : breakfast) {
            item.consume();
        }


        Food ice_cream = new IceCream("карамель");
        System.out.println("Мороженое: " + countFoods(breakfast, ice_cream));

        System.out.println("Всего хорошего!");



    }

    static int countFoods(Food[] breakfast, Food food) {
        int count = 0;
        for (int i = 0; i < breakfast.length; ++i) {
            if (breakfast[i] == null) break;
            if (breakfast[i].equals(food)) {
                ++count;
            }
        }
        return count;
    }
}