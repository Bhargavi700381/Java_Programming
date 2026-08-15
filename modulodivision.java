class modulodivision {
    public static void main(String[] args) {
        int vehicleNumber = 278; 
        int lastDigit=vehicleNumber%10;
        int evenOdd=lastDigit%2;
        System.out.println("Last digit of vehicle number: " + lastDigit);
        System.out.println("Even/Odd check (0 = Even, 1 = Odd): " + evenOdd);
    }
}
