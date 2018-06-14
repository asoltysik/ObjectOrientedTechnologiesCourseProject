package fabryki;

import auta.Azjatycki;
import auta.AzjatyckiLuxury;
import auta.AzjatyckiSedan;
import auta.AzjatyckiSmall;

public class FabrykaAzjatycka extends Fabryka {
    public static Azjatycki stworz(String typ) {
        switch(typ) {
            case "luxury":
                return new AzjatyckiLuxury();
            case "sedan":
                return new AzjatyckiSedan();
            case "small":
                return new AzjatyckiSmall();
            default:
                return null;
        }
    }
}
