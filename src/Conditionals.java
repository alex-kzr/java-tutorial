public class Conditionals {

    public void ifElseMethod (int count) {
        if (count > 5) {
            printOut("if count > 5 used and count was equal " + count);
            count += 1;
            printOut("result count equal " + count);
        } else if (count < 0) {
            printOut("else if < 0 used and count was equal " + count);
            count = -10;
            printOut("result count equal " + count);
        } else {
            printOut("else used and count was equal " + count);
            count += 5;
            printOut("result count equal " + count);
        }
    }

    public void switchMethod (int count) {
        switch (count) {
            case 5:
                printOut("case 5 used and count was equal " + count);
                break;
            case 10:
                printOut("case 10 used and count was equal " + count);
                break;
            default:
                printOut("default used and count was equal " + count);
        }
    }

    public void ternaryConditionalMethod (int count) {
        printOut("ternare conditional used and count was equal " + count);
        count = count > 0 ? count + 1 : count + 5;
        printOut("result count equal " + count);
    }


    private void printOut (String s) {
        System.out.println(s);
    }


}
