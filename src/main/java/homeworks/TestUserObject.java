package homeworks;

public class TestUserObject {
    public static void main(String[] args) {

        User user1=new User("John Doe","john.doe","abc",10);
        User user2=new User("Patel Harsh","patel.harsh","123abc",11);
        User user3=new User("Kim Yan","kim.yan","admin",12);
        User user4=new User("Brad Pitt","brad.pitt","abcdef",13);
        User user5=new User("David Clark","david.clark","123456",14);

        User[] users={user1,user2,user3,user4,user5};

        evenID(users);
        getUsersWithLessFirstName(users);

        for(User usr: users){
            System.out.println(usr);
        }
    }
    //Print full names of users that has even userId number
    public static void evenID(User[] users){
        for(User usr : users){
            if(usr.getId()%2==0){
                System.out.println(usr.getFullName());
            }
        }
    }

    //Print full names for those who has first name less than 4 letters.
    public static void getUsersWithLessFirstName(User[] users){
        for(User usr: users){
            if(usr.getFullName().substring(0, usr.getFullName().indexOf(' ')).length()<4){
                System.out.println(usr.getFullName());
            }
        }
    }
}
