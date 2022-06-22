public class Student{
    private String givenName;
    private String familyName;
    private String userName;
    private String major;
    public String institutionEmailAddress;

    public Student (String name, String famName, String maj){
        givenName = name;
        familyName = famName;
        major = maj;
        createUserName();
    }

    private String createUserName(){

        String first2 = givenName.substring(0,2);
        String first3 = familyName.substring(0,3);

        

        char x = familyName.charAt(0);
        char w = givenName.charAt(0);
 


        String multiple = Integer.toString(x* w);
        String multipleremainder = multiple.substring(multiple.length()-3, multiple.length());

        userName = (first3.toLowerCase() + first2.toLowerCase() + multipleremainder);
        return (userName);


    }

    public String getEmailAddress(){
        return (userName + "@student.otago.ac.nz");
    }

    public void setMajor(String maj){
        major = maj;

    }

    public String toString(){
        return(givenName + " " + familyName + " Email: " + userName + "@student.otago.ac.nz" +  ",   Username:   " + userName + ", Majoring in " + major);
    }
















}