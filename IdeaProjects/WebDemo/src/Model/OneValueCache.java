package Model;

import java.math.BigInteger;
import java.util.Arrays;

class OneValueCache {
    private final BigInteger lastNumber;
    private final BigInteger[] lsatFactors;

    public OneValueCache(BigInteger lastNumber, BigInteger[] lsatFactors) {
        this.lastNumber = lastNumber;
        this.lsatFactors = Arrays.copyOf(lsatFactors,lsatFactors.length);
    }
}
