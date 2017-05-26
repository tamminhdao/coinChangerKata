package exercises;

import java.util.ArrayList;
import java.util.TreeMap;

public class CoinChange {

    private TreeMap<Integer, String> coinsCatalog = new TreeMap<>();

    public CoinChange() {
        addCoinsToCatalog();
    }

    private void addCoinsToCatalog(){
        coinsCatalog.put(25, "quarter");
        coinsCatalog.put(10, "dime");
        coinsCatalog.put(5, "nickel");
        coinsCatalog.put(1, "penny");
    }

    private void determineCorrectCoin(int amount, ArrayList<String> result) {
        if (amount == 0) {
            return;
        }

        int max = coinsCatalog.floorKey(amount);
        result.add(coinsCatalog.get(max));
        determineCorrectCoin(amount - max, result);
    }

    public ArrayList<String> getCoin(int amount) {
        ArrayList<String> result = new ArrayList<>();

        determineCorrectCoin(amount, result);
        return result;
    }
}
