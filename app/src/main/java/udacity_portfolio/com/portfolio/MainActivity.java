package udacity_portfolio.com.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int NUMBER_OF_BUTTONS = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

    }

    private void initUI(){

        Button [] dashboardButtonArray = new Button[NUMBER_OF_BUTTONS];

        dashboardButtonArray [0] = (Button) findViewById(R.id.btn_spotify_streamer);
        dashboardButtonArray [1] = (Button) findViewById(R.id.btn_football_scores);
        dashboardButtonArray [2] = (Button) findViewById(R.id.btn_library_app);
        dashboardButtonArray [3] = (Button) findViewById(R.id.btn_build_it_bigger);
        dashboardButtonArray [4] = (Button) findViewById(R.id.btn_xyz_reader);
        dashboardButtonArray [5] = (Button) findViewById(R.id.btn_capstone);

        for (Button button : dashboardButtonArray) {

            button.setOnClickListener(this);
        }
    }

    private void showShortToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_spotify_streamer:
                showShortToast("This button will launch Spotify Streamer App");
            break;

            case R.id.btn_football_scores:
                showShortToast("This button will launch Football Scores App");
            break;

            case R.id.btn_library_app:
                showShortToast("This button will launch Library App");
            break;

            case R.id.btn_build_it_bigger:
                showShortToast("This button will launch Build It Bigger App");
            break;

            case R.id.btn_xyz_reader:
                showShortToast("This button will launch XYZ Reader App");
            break;

            case R.id.btn_capstone:
                showShortToast("This button will launch My Capstone App");
            break;
        }
    }
}
