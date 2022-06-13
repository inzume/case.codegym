package SubjectComputerAndCustumer;

import java.io.Serializable;

public class Food  implements Serializable {
    String tyFood;

    public Food() {
    }

    public Food(String tyFood) {
        this.tyFood = tyFood;
    }

    public String getTyFood() {
        return tyFood;
    }

    public void setTyFood(String tyFood) {
        this.tyFood = tyFood;
    }

    @Override
    public String toString() {
        return
                "Food='" + tyFood + '\'' +
                '}';
    }
}
