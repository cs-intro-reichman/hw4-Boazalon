public class Primes {
    public static void main(String[] args) {

        final int N = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean [N+1];
        isPrime[0]= false;
        isPrime[1]= false;
        double count = 0;

        for(int i =2; i < isPrime.length; i++ ){
            isPrime[i]=true;
        }

        for(int i = 2; i <= Math.sqrt(N); i++) {
            for(int j = i*2; j<= N; j+= i ){
                isPrime[j] = false;
            }
        }
        

        System.out.println("Prime numbers up to "+N+":");
        for(int i = 2; i< isPrime.length; i++)
        {
            if (isPrime[i]==true) {
                System.out.println(i);
                count++;
            }
        }
        double pri = (count/N)*100;
        System.out.println("There are "+count+" primes between 2 and "+ N+ " ("+(int)pri+"% are primes)");

        

    }
}