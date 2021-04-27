package day_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovesInSquaredStringsTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests vertMirror");
        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
        testing(MovesInSquaredStrings.oper(MovesInSquaredStrings::vertMirror, s), r);
        s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx";
        r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP";
        testing(MovesInSquaredStrings.oper(MovesInSquaredStrings::vertMirror, s), r);

        System.out.println("Fixed Tests horMirror");
        s = "lVHt\nJVhv\nCSbg\nyeCt";
        r = "yeCt\nCSbg\nJVhv\nlVHt";
        testing(MovesInSquaredStrings.oper(MovesInSquaredStrings::horMirror, s), r);
        s = "njMK\ndbrZ\nLPKo\ncEYz";
        r = "cEYz\nLPKo\ndbrZ\nnjMK";
        testing(MovesInSquaredStrings.oper(MovesInSquaredStrings::horMirror, s), r);
    }

}