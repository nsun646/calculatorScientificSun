public class Converter {
    public static double converter(double volume, int unit, int convUnit) {
        switch (unit) {
            case 1:
                switch (convUnit) {
                    case 1: // mL
                        return volume;
                    case 2: // L
                        return volume * 0.001;
                    case 3: // cm^3
                        return volume;
                    case 4: // m^3
                        return volume / 1000000;
                    case 5: // tsp
                        return volume * 0.202884;
                    case 6: // tbsp
                        return volume * 0.067628;
                    case 7: // fl oz
                        return volume * 0.033814;
                    case 8: // c
                        return volume * 0.00422675;
                    case 9: // pt
                        return volume * 0.00175975;
                    case 10: // qt
                        return volume * 0.00105669;
                    case 11: //gal
                        return volume / 3785;
                    case 12: //in^3
                        return volume / 16.387;
                    case 13: // ft^3
                        return volume / 28320;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 2:
                switch (convUnit) {
                    case 1, 3: // mL
                        return volume * 1000;
                    case 2: // L
                        return volume;
                    case 4: // m^3
                        return volume / 1000;
                    case 5: // tsp
                        return volume * 202.9;
                    case 6: // tbsp
                        return volume * 67.628;
                    case 7: // fl oz
                        return volume * 33.814;
                    case 8: // c
                        return volume * 4.226;
                    case 9: // pt
                        return volume * 1.75975;
                    case 10: // qt
                        return volume * 1.05669;
                    case 11: //gal
                        return volume / 3.785;
                    case 12: //in^3
                        return volume / 61.0237;
                    case 13: // ft^3
                        return volume / 28.317;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 3:
                switch (convUnit) {
                    case 1: // mL
                        return volume;
                    case 2: // L
                        return volume * 0.001;
                    case 3: // cm^3
                        return volume;
                    case 4: // m^3
                        return volume / 1000000;
                    case 5: // tsp
                        return volume * 0.202884;
                    case 6: // tbsp
                        return volume * 0.067628;
                    case 7: // fl oz
                        return volume * 0.033814;
                    case 8: // c
                        return volume * 0.00422675;
                    case 9: // pt
                        return volume * 0.00175975;
                    case 10: // qt
                        return volume * 0.00105669;
                    case 11: //gal
                        return volume / 3785;
                    case 12: //in^3
                        return volume / 16.387;
                    case 13: // ft^3
                        return volume / 28320;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 4:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 1000000;
                    case 2: // L
                        return volume * 1000;
                    case 4: // m^3
                        return volume;
                    case 5: // tsp
                        return volume * 202884;
                    case 6: // tbsp
                        return volume * 67628;
                    case 7: // fl oz
                        return volume * 33814;
                    case 8: // c
                        return volume * 4226.75;
                    case 9: // pt
                        return volume * 1759.75;
                    case 10: // qt
                        return volume * 1056.69;
                    case 11: //gal
                        return volume / 264.172;
                    case 12: //in^3
                        return volume / 61023.7;
                    case 13: // ft^3
                        return volume / 35.3147;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 5:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 4.92892;
                    case 2: // L
                        return volume * 1000;
                    case 4: // m^3
                        return volume / 202900;
                    case 5: // tsp
                        return volume;
                    case 6: // tbsp
                        return volume / 3;
                    case 7: // fl oz
                        return volume / 6;
                    case 8: // c
                        return volume / 48;
                    case 9: // pt
                        return volume / 115.3;
                    case 10: // qt
                        return volume / 192;
                    case 11: //gal
                        return volume / 768;
                    case 12: //in^3
                        return volume / 3.325;
                    case 13: // ft^3
                        return volume / 5745;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 6:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 14.7868;
                    case 2: // L
                        return volume / 67.628;
                    case 4: // m^3
                        return volume / 67630;
                    case 5: // tsp
                        return volume * 3;
                    case 6: // tbsp
                        return volume;
                    case 7: // fl oz
                        return volume / 2;
                    case 8: // c
                        return volume / 16;
                    case 9: // pt
                        return volume / 38.43;
                    case 10: // qt
                        return volume / 64;
                    case 11: //gal
                        return volume / 256;
                    case 12: //in^3
                        return volume / 1.108;
                    case 13: // ft^3
                        return volume / 1915;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 7:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 29.5735;
                    case 2: // L
                        return volume / 33.814;
                    case 4: // m^3
                        return volume / 33810;
                    case 5: // tsp
                        return volume * 6;
                    case 6: // tbsp
                        return volume * 2;
                    case 7: // fl oz
                        return volume;
                    case 8: // c
                        return volume / 8;
                    case 9: // pt
                        return volume / 19.215;
                    case 10: // qt
                        return volume / 32;
                    case 11: //gal
                        return volume / 128;
                    case 12: //in^3
                        return volume / 1.80469;
                    case 13: // ft^3
                        return volume /  957.5;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 8:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume / 236.588;
                    case 2: // L
                        return volume / 4.227;
                    case 4: // m^3
                        return volume / 4227;
                    case 5: // tsp
                        return volume * 48;
                    case 6: // tbsp
                        return volume * 16;
                    case 7: // fl oz
                        return volume * 8;
                    case 8: // c
                        return volume;
                    case 9: // pt
                        return volume / 2.402;
                    case 10: // qt
                        return volume / 4;
                    case 11: //gal
                        return volume / 16;
                    case 12: //in^3
                        return volume * 14.4375;
                    case 13: // ft^3
                        return volume / 119.7;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 9:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 568.261;
                    case 2: // L
                        return volume / 1.76;
                    case 4: // m^3
                        return volume * 0.000473176;
                    case 5: // tsp
                        return volume * 96;
                    case 6: // tbsp
                        return volume * 32;
                    case 7: // fl oz
                        return volume * 19.2152;
                    case 8: // c
                        return volume * 2;
                    case 9: // pt
                        return volume;
                    case 10: // qt
                        return volume / 1.665;
                    case 11: //gal
                        return volume / 6.661;
                    case 12: //in^3
                        return volume * 28.875;
                    case 13: // ft^3
                        return volume * 0.01671;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 10:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 946.353;
                    case 2: // L
                        return volume / 1.057;
                    case 4: // m^3
                        return volume / 1057;
                    case 5: // tsp
                        return volume * 192;
                    case 6: // tbsp
                        return volume * 64;
                    case 7: // fl oz
                        return volume * 32;
                    case 8: // c
                        return volume * 4;
                    case 9: // pt
                        return volume * 1.66535;
                    case 10: // qt
                        return volume;
                    case 11: //gal
                        return volume / 4;
                    case 12: //in^3
                        return volume * 57.75;
                    case 13: // ft^3
                        return volume * 0.033;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 11:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 3785.41;
                    case 2: // L
                        return volume * 3.78541;
                    case 4: // m^3
                        return volume * 768;
                    case 5: // tsp
                        return volume * 256;
                    case 6: // tbsp
                        return volume * 128;
                    case 7: // fl oz
                        return volume * 32;
                    case 8: // c
                        return volume * 16;
                    case 9: // pt
                        return volume * 6.66139;
                    case 10: // qt
                        return volume * 4;
                    case 11: //gal
                        return volume;
                    case 12: //in^3
                        return volume * 231;
                    case 13: // ft^3
                        return volume * 0.133681;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 12:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 16.3871;
                    case 2: // L
                        return volume / 61.024;
                    case 4: // m^3
                        return volume / 61020;
                    case 5: // tsp
                        return volume * 3.32468;
                    case 6: // tbsp
                        return volume * 1.10823;
                    case 7: // fl oz
                        return volume * 0.554113;
                    case 8: // c
                        return volume / 14.438;
                    case 9: // pt
                        return volume / 28.875;
                    case 10: // qt
                        return volume / 57.75;
                    case 11: //gal
                        return volume / 231;
                    case 12: //in^3
                        return volume;
                    case 13: // ft^3
                        return volume / 1728;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
            case 13:
                switch (convUnit) {
                    case 1, 3: // mL, cm^3
                        return volume * 28316.8;
                    case 2: // L
                        return volume * 28.3168;
                    case 4: // m^3
                        return volume * 0.0283168;
                    case 5: // tsp
                        return volume * 5745.04;
                    case 6: // tbsp
                        return volume * 1915;
                    case 7: // fl oz
                        return volume * 957.506;
                    case 8: // c
                        return volume * 119.688;
                    case 9: // pt
                        return volume * 49.8307;
                    case 10: // qt
                        return volume * 29.9221;
                    case 11: //gal
                        return volume * 7.48052;
                    case 12: //in^3
                        return volume * 1728;
                    case 13: // ft^3
                        return volume;
                    default:
                        System.out.println("Error: Invalid Operator");
                }
                break;
        }
        return 0.0;
    }
}
