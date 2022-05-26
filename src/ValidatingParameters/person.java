package ValidatingParameters;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        if(name == null || name.equals("") || name.length() > 40 || age > 0 && age < 120){
            throw new IllegalArgumentException("Follow the criteria bro");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
