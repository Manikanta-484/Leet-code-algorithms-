class Heart {
    public static void main(String[] args) {
int n = 6;
for (int i = n / 2; i <= n; i += 2) {

    // Print leading spaces
    for (int j = 1; j < n - i; j += 2) {
        System.out.print(" ");
    }

    // Print first half of stars
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    // Print trailing spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    // Print second half of stars
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println(); // Move to the next line
}

for (int i = n; i >= 1; i--) {

    // Print leading spaces
    for (int j = i; j < n; j++) {
        System.out.print(" ");
    }

    // Print stars
    for (int j = 1; j <= (i * 2) - 1; j++) {
        System.out.print("*");
    }

    System.out.println(); // Move to the next line
}
       
    }
}