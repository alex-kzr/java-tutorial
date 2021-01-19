public class Main {
    public static void main(String[] args){

        DeviceFactory deviceFactory = getFactoryByLanguageCode("ru");

        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(23,15);
    }

    private static DeviceFactory getFactoryByLanguageCode(String languageCode) {
        switch (languageCode) {
            case "ru": return new RuDeviceFactory();
            case "en": return new EnDeviceFactory();
            default: throw new RuntimeException("Unsupported language code: " + languageCode);
        }
    }
}

interface Mouse {
    void click();
}

interface Keyboard {
    void print();
}

interface Touchpad {
    void track(int deltaX, int deltaY);
}

class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Mouse click");
    }
}

class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Print");
    }
}

class EnTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Moved " + deltaX + " on the X axis and " + deltaY + " on the axis Y");
    }
}

class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }
}

class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Печатаем строку");
    }
}

class RuTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Передвинулись на " + deltaX + " по оси X и " + deltaY + " по оси Y");
    }
}

interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

class EnDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}

class RuDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}