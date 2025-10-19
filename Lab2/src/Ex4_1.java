public class Ex4_1 {

    public static void Goldbach(int m, int n) {
        System.out.println("Goldbach");
        if(m%2==1)
            m++;
        if(n%2==1)
            n--;
        for(int k = m ; k <= n ; k+=2)
            for(int i = 2 ; i <= k/2 ; i++){
                if(prime(i))
                    if(prime(k-i)){
                        System.out.println(k + " = " + i + "+" + (k-i));
                        break;
                    }
            }
    }

    private static boolean prime(int isPrime)
    {
        for(int j = 2; j <= Math.sqrt(isPrime) ; j++)
            if(isPrime % j == 0)
                return false;

        return true;
    }
}
