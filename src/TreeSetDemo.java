
    import java.util.TreeSet;
    public class TreeSetDemo {
        public static void main(String[] args) {
            TreeSet<Character> treeset1 = new TreeSet<>();

            treeset1.add('a');
            treeset1.add('b');
            treeset1.add('g');
            treeset1.add('k');
            treeset1.add('r');
            treeset1.add('t');
            treeset1.add('z');

            System.out.println(treeset1);

            TreeSet<Character> treeset2 = new TreeSet<>();

            treeset2.add('m');
            treeset2.add('e');
            treeset2.add('s');
            treeset2.add('j');
            treeset2.add('a');
            treeset2.add('c');
            treeset2.add('k');

            System.out.println(treeset2);

           treeset1.retainAll(treeset2);
            System.out.println("Tree set intersection"+treeset1);

            treeset1.addAll(treeset2);
            System.out.println("Tree set union"+treeset1);

        }
    }
