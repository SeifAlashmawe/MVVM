package hope.afterlifeprojects.seif.french.moviesnerds;

public class MovieModle {

    String name;
    String date;
    String descripetion;
    int id;

    public MovieModle(String name, String date, String descripetion, int id) {
        this.name = name;
        this.date = date;
        this.descripetion = descripetion;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescripetion() {
        return descripetion;
    }

    public void setDescripetion(String descripetion) {
        this.descripetion = descripetion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
