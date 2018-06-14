package fabryki;

import auta.Amerykanski;
import auta.AmerykanskiLuxury;
import auta.AmerykanskiSedan;
import auta.AmerykanskiSmall;

public class FabrykaAmerykanska extends Fabryka {
    public static Amerykanski stworz(String typ) {
        switch(typ) {
            case "luxury":
                return new AmerykanskiLuxury();
            case "sedan":
                return new AmerykanskiSedan();
            case "small":
                return new AmerykanskiSmall();
            default:
                return null;
        }
    }
}
