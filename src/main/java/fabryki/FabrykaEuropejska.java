package fabryki;

import auta.Europejski;
import auta.EuropejskiLuxury;
import auta.EuropejskiSedan;
import auta.EuropejskiSmall;

public class FabrykaEuropejska extends Fabryka {
    public static Europejski stworz(String typ) {
        switch(typ) {
            case "luxury":
                return new EuropejskiLuxury();
            case "sedan":
                return new EuropejskiSedan();
            case "small":
                return new EuropejskiSmall();
            default:
                return null;
        }
    }
}
