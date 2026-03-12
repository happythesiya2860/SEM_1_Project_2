import java.util.*;
class Main{

    static int choice;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ob1 = new Main();
        System.out.println("Welcome to Darshit tours and travels");
        do{
        System.out.println("choose your option \n1.Register \n2.Login \n3.Exit");
         choice = sc.nextInt();
        switch(choice){
            case 1 : ob1.register();
                    ob1.password1();
            break;
            case 2 : ob1.login();
            ob1.location();
            ob1.print();
            break;
            case 3 : 
            break;
            default : System.out.println("Please enter valid choice");
            break;
        }
    }while (choice!=3); 
    }
    String name ;
    String num;
    String dob;
    int count = 0;
    int count1 = 0 ;
    String id1;
    String password;
    void register (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your good name ");
        name = sc.nextLine();
        String[] s1 = name.split(" ");
        do{
        System.out.println("Enter your mobile number ");
        num = sc.nextLine();
        if(num.length()==10){
            count++;
        }
        }while(count==0);
        System.out.println("Enter the Birth of date(dd/mm/yyyy)");
        dob = sc.nextLine();
        String[] s = dob.split("/");
        System.out.println("your user i'd "+s1[0]+s[2]);
        id1 = s1[0]+s[2];
    }
    void password1 (){
        int count2 = 0;
        int count3 = 0;
        int count4 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        password = sc.nextLine();
        for (int i = 0 ; i<password.length() ; i++){
        if(password.charAt(i)>='A'&&password.charAt(i)<='Z'){
            count2++;
        }
        if(password.charAt(i)>='a'&&password.charAt(i)<='z'){
            count3++;
        }
        if (password.charAt(i)>='1'&&password.charAt(i)<='9'){
            count4++;
        }
    }
    if(count2==0){
        password1();
    }
    if(count3==0){
        password1();
    }
    if (count4==0){
        password1();
    }
	System.out.println(id1);
    }
    String id ;
    String pass ;
    
    void login(){
		int count5 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user i'd ");
        id = sc.nextLine();
        System.out.println("Enter the password ");
        pass = sc.nextLine();
        if(id.equals(id1)){
            if(pass.equals(password)){
                System.out.println("Login suucessfully");
                date();
            }
            else {
                login();
            }
        }
        else {
            login();
        }
    }
    int month ;
    String monthname;
    int date;
    int year;
    void date (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year = sc.nextInt();
        System.out.println("Enter the month \n1.January \n2.February \n3.March \n4.April \n5.May \n6.June \n7.July \n8.August \n9.September \n10.october \n11.November \n12.December");
        month = sc.nextInt();
        switch (month){
            case 1 : monthname = "January";
            break ;
            case 2 : monthname = "February";
            break ;
            case 3 : monthname = "March";
            break ;
            case 4 : monthname = "April";
            break ;
            case 5 : monthname = "May";
            break ;
            case 6 : monthname = "June";
            break ;
            case 7 : monthname = "July";
            break ;
            case 8 : monthname = "Augest";
            break ;
            case 9 : monthname = "September";
            break ;
            case 10 : monthname = "October";
            break ;
            case 11 : monthname = "November";
            break ;
            case 12 : monthname = "December";
            break ;
        }
        date1();
    }
    String trdate;
    void date1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date ");
        date = sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            if(date<=31){
                System.out.println("Select date is "+date+"/"+monthname+"/"+year);
                trdate = date+"/"+monthname+"/"+year;
            }
            else {
                System.out.println("invalid date");
                date1();
            }
        }
        if(month==4||month==6||month==9||month==11){
            if(date<=30){
                System.out.println("Select date is "+date+"/"+monthname+"/"+year);
                trdate = date+"/"+monthname+"/"+year;
            }
            else{
                System.out.println("invalid date ");
                date1();
            }
        }
        if (month==2){
            if(date<=28){
                System.out.println("Select date is "+date+"/"+monthname+"/"+year);
                trdate = date+"/"+monthname+"/"+year;
            }
            else {
                System.out.println("invalid date ");
                date1();
            }
        }
    }
    int pessenger;
    int dep;
    int ar;
    int veh;
    int bus;
    int train;
    int flight;
    int bill;
    String choice6;
    String depp;
    String arp;
    String mode;
    String fclass;
    void location(){
        int choice8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pessenger");
        pessenger = sc.nextInt();
        System.out.println("Enter the Departure place \n1.Ahmedabad \n2.Banglore \n3.Chennai \n4.Delhi");
        dep = sc.nextInt();
        System.out.println("Enter the arrival place \n1.Ahmedabad \n2.Banglore \n3.Chennai \n4.Delhi");
        ar = sc.nextInt();
        System.out.println("Enter the vehical \n1.Bus \n2.Train \n3.Flight");
        veh = sc.nextInt();
        switch(dep){
            case 1: depp = "Ahmedabad";
                switch (ar){
                    case 1 : arp = "Ahmedabad";
                        switch(veh){
                            case 1 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                                choice8 = sc.nextInt();
                                if(choice8==1){
                                    fclass = "Business class";
                                }
                                if(choice8==2){
                                    fclass = "First class";
                                }
                                if(choice8==3){
                                    fclass = "Economy";
                                }
                                bill = 0*pessenger;
                            mode = "Bus";
                            break;
                            case 2 :
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                             bill = 0*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                                System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                                choice8 = sc.nextInt();
                                bill = 0*pessenger;
                                mode = "Flight";
                                if(choice8==1){
                                    fclass = "Business class";
                                }
                                if(choice8==2){
                                    fclass = "First class";
                                }
                                if(choice8==3){
                                    fclass = "Economy";
                                }
                            break;
                        }
                    break;
                    case 2 : arp = "Banglore";
                        switch(veh){
                            case 1 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 4000*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 5000*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 5990*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                    break;
                    case 3 : arp = "Chennai";
                        switch(veh){
                            case 1 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 4200*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 5450*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 6595*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                    break;
                    case 4 : arp = "Delhi";
                        switch(veh){
                            case 1 :
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 3500*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 3900*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 4200*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                    break;
            }
            break;
            case 2 : depp = "Banglore";
                switch (ar){
                    case 1 : arp = "Ahmedabad";
                        switch(veh){
                            case 1 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 4000*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 5000*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 5990*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                break;
                case 2 : arp = "Banglore";
                        switch(veh){
                            case 1 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 0*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 0*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 0*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                break;
                case 3 : arp = "Chennai";
                        switch(veh){
                            case 1 :
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 900*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 1200*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 2500*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                break;
                case 4 : arp = "Delhi";
                        switch(veh){
                            case 1 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 4000*pessenger;
                            mode = "Bus";
                            break;
                            case 2 : 
                            System.out.println("Enter for choice for class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            bill = 5200*pessenger;
                            mode = "Train";
                            break ;
                            case 3 : 
                            System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                            choice8 = sc.nextInt();
                            bill = 7000*pessenger;
                            mode = "Flight";
                            if(choice8==1){
                                fclass = "Business class";
                            }
                            if(choice8==2){
                                fclass = "First class";
                            }
                            if(choice8==3){
                                fclass = "Economy";
                            }
                            break;
                        }
                break;
            }
            break ;
            case 3 : depp = "Chennai";
            switch (ar){
                case 1 : arp = "Ahemedabad";
                    switch(veh){
                        case 1 : bill = 4200*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 5450*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 6595*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
            case 2 : arp = "Banglore";
                    switch(veh){
                        case 1 : bill = 900*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 1200*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 2500*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
            case 3 : arp = "Chennai";
                    switch(veh){
                        case 1 : bill = 0*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 0*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 0*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
            case 4 : arp = "Delhi";
                    switch(veh){
                        case 1 : bill = 3500*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 4300*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 5500*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
        }
            break;
            case 4 : depp = "Delhi";
            switch (ar){
                case 1 : arp = "Ahmedabad";
                    switch(veh){
                        case 1 : bill = 3500*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 3900*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 4200*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
            case 2 : arp = "Banglore";
                    switch(veh){
                        case 1 : bill = 4000*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 5200*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 7000*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
            case 3 : arp = "Chennai";
                    switch(veh){
                        case 1 : bill = 3500*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 4300*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 5500*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
            case 4 : arp = "Delhi";
                    switch(veh){
                        case 1 : bill = 0*pessenger;
                        mode = "Bus";
                        break;
                        case 2 : bill = 0*pessenger;
                        mode = "Train";
                        break ;
                        case 3 : 
                        System.out.println("Enter for choice flight class \n1.Business class \n2.First class \n3.Economy");
                        choice8 = sc.nextInt();
                        bill = 0*pessenger;
                        mode = "Flight";
                        if(choice8==1){
                            fclass = "Business class";
                        }
                        if(choice8==2){
                            fclass = "First class";
                        }
                        if(choice8==3){
                            fclass = "Economy";
                        }
                        break;
                    }
            break;
        }
            break;
        }
        book();
    }
    void book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to book room for stay(yes or no) ");
        choice6 = sc.nextLine();
        String s12 = "YES";
        String s13 = choice6.toUpperCase();
        if(s12.equals(s13)){
            hotel();
        }
        else {
            System.out.println("Total ticket price is : "+bill);
        }
    }
    int choice7; 
    int rent ;
    int day;
    int food ;
    int laundry;
    int spa;
    int hotelbill;
    int star1;
    int bar;
    void hotel (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice for hotel \n1. 5-star hotel \n2. 4-star hotel \n3. 3-star hotel");
        choice7 = sc.nextInt();
        System.out.println("Enter days for stay");
        day = sc.nextInt();
        switch(choice7){
            case 1 : star1 = 5;
                if (pessenger%2==0){
                    rent = (pessenger/2)*13000*day;
                }
                else {
                    rent = ((pessenger/2)+1)*13000*day;
                }
            break;
            case 2 : star1 = 4;
                if (pessenger%2==0){
                    rent = (pessenger/2)*10000*day;
                }
                else {
                    rent = ((pessenger/2)+1)*10000*day;
                }
            break;
            case 3 : star1 = 3;
                if (pessenger%2==0){
                    rent = (pessenger/2)*7000*day;
                }
                else {
                    rent = ((pessenger/2)+1)*7000*day;
                }
            break;
        }
        int count10;
        do{
            System.out.println("Enter the your choice for extra service \n1. Food order \n2.Laundry \n3.Bar \n4.Spa & saloon \n5.Exit");
            count10 = sc.nextInt();
            int choice11;
            switch(count10){
                case 1 :
                    System.out.println("On food order prices \n1. per veg meal 1200rs \n2. per non veg meal 1500rs");
                    choice11 = sc.nextInt();
                        switch(choice11){
                            case 1 : food = 1200;
                            break;
                            case 2 : food = 1500;
                            break;
                        }
                break;
                case 2 :
                        System.out.println("Chrages of Laundry is 100rs");
                        laundry = 100;
                break;
                case 3 : System.out.println("Bar charges is 1000rs");
                bar = 1000;
                break;
                case 4 : 
                System.out.println("Charges of spa per session is 1500rs");
                spa = 1500;
                break;
                case 5 :
                break;
            }
        }while(count10!=5);
        hotelbill = rent + food + laundry+bar+spa;
    }
    int total ;
    int gst;
    int totalbill;
    void print(){
        Scanner sc = new Scanner(System.in);
        total = bill+hotelbill;
        gst = (total*18)/100;
        totalbill = total+gst;
        System.out.println("******************************************************************************");
        System.out.println();
        System.out.println("                --:Darshit Tours & Travel:--                 ");
        System.out.println();
        System.out.println("       PASSENGER DETAILS       ");
        System.out.println();
        System.out.println("Name                 :- "+name);
        System.out.println();
        System.out.println("Date of Birth        :- "+dob);
        System.out.println();
        System.out.println("Mobile number        :- "+num);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("       TRAVELLING DETAILS      ");
        System.out.println();
        System.out.println("Date of Journey       :- "+trdate);
        System.out.println();
        System.out.println("Departure from        :- "+depp);
        System.out.println();
        System.out.println("Arrival at            :- "+arp);
        System.out.println();
        System.out.println("ride vehical          :- "+mode);
        System.out.println();
        System.out.println("Class                 :- "+fclass);
        System.out.println();
        System.out.println("Number of pessenger   :- "+pessenger);
        System.out.println();
        System.out.println("Total bill for Travel :- "+bill);
        System.out.println("----------------------------------------");
        System.out.println("       HOTEL DETAILS           ");
        System.out.println();
        System.out.println("City                   :- "+arp);
        System.out.println();
        System.out.println("Hotel Star             :- "+star1);
        System.out.println();
        System.out.println("Number od days         :- "+day);
        System.out.println();
        System.out.println("Total bill for Hotel   :- "+hotelbill);
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Total bill for this Tour");
        System.out.println();
        System.out.println("1. Total bill           :- "+total);
        System.out.println();
        System.out.println("GST                   :- 18%");
        System.out.println();
        System.out.println("Total gst                :- "+gst);
        System.out.println();
        System.out.println("Total bill for this tour :-"+totalbill);
        System.out.println();
        System.out.println("choose the payment method \n1.Google pay \n2.upi id \n3.Debit card \n4.Net banking");
        int choice13 = sc.nextInt();
        System.out.println("--------Thank you !!--------");
    }
}