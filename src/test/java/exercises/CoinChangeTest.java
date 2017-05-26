package exercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class CoinChangeTest {

    @Test
    public void returnEmptyArrayWhenInputIsZero() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = coins.getCoin(0);
        assertEquals(expected, actual);
    }

    @Test
    public void returnOnePennyWhenInputIsOne() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("penny"));
        ArrayList<String> actual = coins.getCoin(1);
        assertEquals(expected, actual);
    }

    @Test
    public void returnTwoPenniesWhenInputIsTwo() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("penny", "penny"));
        ArrayList<String> actual = coins.getCoin(2);
        assertEquals(expected, actual);
    }

    @Test
    public void returnOneNickelWhenInputIsFive() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("nickel"));
        ArrayList<String> actual = coins.getCoin(5);
        assertEquals(expected, actual);
    }

    @Test
    public void returnOneNickelOnePennyWhenInputIsSix() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("nickel", "penny"));
        ArrayList<String> actual = coins.getCoin(6);
        assertEquals(expected, actual);
    }

    @Test
    public void returnOneDimeWhenInputIsTen() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("dime"));
        ArrayList<String> actual = coins.getCoin(10);
        assertEquals(expected, actual);
    }

    @Test
    public void returnOneDimeOneNickelOnePennyWhenInputIsSixTeen() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("dime", "nickel", "penny"));
        ArrayList<String> actual = coins.getCoin(16);
        assertEquals(expected, actual);
    }


    @Test
    public void returnOneQuarterWhenInputIsTwentyFive() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("quarter"));
        ArrayList<String> actual = coins.getCoin(25);
        assertEquals(expected, actual);
    }

    @Test
    public void returnTwoQuartersOneDimeOneNickelOnePennyWhenInputIsSixtySix() {
        CoinChange coins = new CoinChange();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("quarter", "quarter", "dime", "nickel", "penny"));
        ArrayList<String> actual = coins.getCoin(66);
        assertEquals(expected, actual);
    }
}
