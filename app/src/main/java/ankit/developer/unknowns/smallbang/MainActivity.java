package ankit.developer.unknowns.smallbang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import xyz.hanks.library.SmallBang;
import xyz.hanks.library.SmallBangListener;

public class MainActivity extends AppCompatActivity {

    SmallBang smallBang;

    Button btnEDMT;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smallBang = SmallBang.attach2Window(this);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.imageView);
        btnEDMT = (Button)findViewById(R.id.btnEDMT);
        btnEDMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallBang.bang(v);
                smallBang.setmListener(new SmallBangListener() {
                    @Override
                    public void onAnimationStart() {
                    }
                    @Override
                    public void onAnimationEnd() {

                        Toast.makeText(getApplicationContext(),"Clicked +1",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smallBang.bang(view);
                smallBang.setmListener(new SmallBangListener() {
                    @Override
                    public void onAnimationStart() {
                    }
                    @Override
                    public void onAnimationEnd() {

                        Toast.makeText(getApplicationContext(),"Clicked +1",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smallBang.bang(view);
                smallBang.setmListener(new SmallBangListener() {
                    @Override
                    public void onAnimationStart() {
                    }
                    @Override
                    public void onAnimationEnd() {
                        Toast.makeText(getApplicationContext(),"Clicked +1",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}

