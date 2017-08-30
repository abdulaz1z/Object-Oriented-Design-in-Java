package domain;

public class User {
    //required
    private String userName;
    private String emailAddress;

    //optional
    private String fName;
    private String lName;
    private String phoneNum;
    private String address;

    private User(Builder builder){
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.phoneNum = builder.phoneNum;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //Builder class with same field variable as User class
    public static class Builder{
        //required
        private String userName;
        private String emailAddress;

        //optional
        private String fName;
        private String lName;
        private String phoneNum;
        private String address;

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String fName){
            this.fName = fName;
            return this;
        }

        public Builder lastName(String lName){
            this.lName = lName;
            return this;
        }

        public Builder phoneNumber(String phoneNum){
            this. phoneNum = phoneNum;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}


