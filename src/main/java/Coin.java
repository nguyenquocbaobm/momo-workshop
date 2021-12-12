public enum Coin {
    TEN_CENTS(10),
    TWENTY_CENTS(20),
    FIFTY_CENTS(50),
    HUNDRED_CENTS(100),
    TWO_HUNDRED_CENTS(200);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public static int[] parseCoins(String coins) {
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for (int index = 0; index < numberCoinsInText.length; index++) {
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }

    public int getValue() {
        return this.value;
    }
}
