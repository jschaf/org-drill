

public class Person {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String title;


    private Person(String lastName, String firstName, String middleName, String title) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.title = title;
    }

    public static class Builder {

        private String lastName;
        private String firstName;
        private String middleName;
        private String title;

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Person build() {
            return new Person(this.lastName, this.firstName, this.middleName, this.title);
        }
    }
}
