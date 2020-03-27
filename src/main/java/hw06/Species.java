package hw06;

public enum Species {
    CAT (1),
    DOG (2),
    GIRAFFE (3),
    MONKEY (4),
    SNAKE (5)
    ;
    private int enumaration = 0;

    Species(int enumeration) {
        this.enumaration = enumaration;
    }
}
