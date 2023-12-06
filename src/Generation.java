public class Generation <T extends Number>{
    private T[] array;

    public Generation(T[] array) {
        this.array = array;
    }

    public double generation(){
        double sum = 0.0;

        for (T value: array){
            sum += value.doubleValue();
        }
        return sum;
    }
}
