import java.util.Scanner;
class LookSay {
    public static String nextTerm(String prevString){
        StringBuilder current = new StringBuilder();
        int count = 1;

        for (int i = 1; i < prevString.length(); i++){
            if (prevString.charAt(i) == prevString.charAt(i - 1)){
                count++;
            } else {
                current.append(count).append(prevString.charAt(i - 1));
                count = 1;
            }
        }
        current.append(count).append(prevString.charAt(prevString.length() - 1));

        return current.toString();
        }

        public static String countAndSay(int n){
            if (n == 1)
                return "1";
            String prevString = countAndSay(n - 1);

            return nextTerm(prevString);
        }

        public static void main(String[] args){
            int target = 911; //type to exit the loop
            int n = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter n: ");
                n = scanner.nextInt();
                if (n == target) {
                    break;
                }
                System.out.println(countAndSay(n));
            }
            scanner.close();
        }
    }   
