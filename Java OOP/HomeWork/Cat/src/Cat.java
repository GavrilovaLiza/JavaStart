public class Cat {

    private String name;
    private int age;
    private String breed;
    private String sex;
    private String favoritefood;


    public Cat(String name, int age, String breed, String sex, String favoritefood) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.sex = sex;
        this.favoritefood = favoritefood;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFavoritefood() {
        return favoritefood;
    }

    public void setFavoritefood(String favoritefood) {
        this.favoritefood = favoritefood;
    }

    protected void wantToEat() {
        System.out.println("Meow, meow, meeeooow!");
    }

    protected void respondToAName(){
        System.out.println(name + ", you're near?");
        System.out.println("Mr-r, meow!");
    }

    @Override
    public String toString(){
        return "NAME: " + name + "; AGE: " + age + "; BREED: " + breed + "SEX: " + sex + "FAWORITE FOOD: " +
                favoritefood;
    }

}
