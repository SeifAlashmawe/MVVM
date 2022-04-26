package hope.afterlifeprojects.seif.french.moviesnerds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  MovieModle getMovieFromDatabase(){
         return new MovieModle("cast away","1994","good",1);

    }

    public void getMovie(View view) {


    }
}