// 1.
public class Main {
    public static void main(String[] args){

    int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    for(int i = 0; i<month_days.length;i++)
    {
        System.out.println(months[i] + " "+ month_days[i]);
    }
}
}

// 2.
public class Main {
    public static void main(String[] args) {

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < month_days.length; i++) {
            if (month_days[i] == 31) System.out.println(months[i]);
        }
    }
}

// 3.
public class Main {
    public static void main(String[] args) {

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < month_days.length; i++) {
            if (month_days[i] < 31) System.out.println(months[i] + " " + month_days[i]);
        }
    }
}

// 4.
public class Main {
    public static void main(String[] args) {

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int n=0;
        for (int i = 0; i < month_days.length; i++) {
            if (month_days[i] < 31) n=n + month_days[i];
        }
        System.out.println(n);
    }
}

// 5.
public class Main {
    public static void main(String[] args){

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for(int i = 0; i<month_days.length;i++)
        {
            System.out.println(months[i] + " "+ month_days[i]);
        }
    }
}