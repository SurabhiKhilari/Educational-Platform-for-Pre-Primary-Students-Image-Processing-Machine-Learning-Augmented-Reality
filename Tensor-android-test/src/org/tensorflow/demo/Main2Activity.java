package org.tensorflow.demo;

/**
 * Created by srushti on 15-03-2018.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.tensorflow.demo.tracking.DataStore;

public class Main2Activity extends Activity {
    private Button button;
    private Button button2;
    private Button button27;
    private Button button28;
    private Button button29;
    private Button button30;
    private Button button31;
    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    private Button button36;
    private Button button37;
    private Button button38;
    private Button button39;
    private Button button40;
    private Button button41;
    private Button button42;
    private Button button43;
    private Button button44;
    private Button button45;
    private Button button47;
    private Button button48;
    private Button button49;
    private Button button52;
    private Button button53;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity(button.getText().toString());
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity4(button2.getText().toString());
            }
        });


        button27 = findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2(button27.getText().toString());
            }
        });

        button28 = findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity5(button28.getText().toString());
            }
        });

        button29 = findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2(button29.getText().toString());
            }
        });

        button30 = findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity3(button30.getText().toString());
            }
        });

        button31 = findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2(button31.getText().toString());
            }
        });

        button32 = findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity3(button32.getText().toString());
            }
        });

        button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2(button33.getText().toString());
            }
        });

        button34 = findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity5(button34.getText().toString());
            }
        });

        button35 = findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity4(button35.getText().toString());
            }
        });

        button36 = findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2(button36.getText().toString());
            }
        });

        button37 = findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity3(button37.getText().toString());
            }
        });

        button38 = findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2(button38.getText().toString());
            }
        });

        button39 = findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity5(button39.getText().toString());
            }
        });

        button40 = findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity3(button40.getText().toString());
            }
        });

        button41 = findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity4(button41.getText().toString());
            }
        });

        button42 = findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity(button42.getText().toString());
            }
        });

        button43 = findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity5(button43.getText().toString());
            }
        });

        button44 = findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity4(button44.getText().toString());
            }
        });

        button45 = findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity4(button45.getText().toString());
            }
        });

        button47 = findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity(button47.getText().toString());
                ;
            }
        });

        button48 = findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity(button48.getText().toString());

            }
        });

        button49 = findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity(button49.getText().toString());

            }
        });

        button52 = findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity3(button52.getText().toString());
            }
        });

        button53 = findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity5(button53.getText().toString());
            }
        });

    }

    public void openClassifierActivity(String buttonLabel) {
        DataStore.buttonSelected=buttonLabel;
        Intent intent = new Intent(this, ClassifierActivity.class);
        startActivity(intent);
    }

    public void openClassifierActivity2(String buttonLabel) {
        DataStore.buttonSelected=buttonLabel;

        Intent intent = new Intent(this, ClassifierActivity2.class);
        startActivity(intent);
    }

    public void openClassifierActivity3(String buttonLabel) {
        DataStore.buttonSelected=buttonLabel;

        Intent intent = new Intent(this, ClassifierActivity3.class);
        startActivity(intent);
    }

    public void openClassifierActivity4(String buttonLabel) {
        DataStore.buttonSelected=buttonLabel;

        Intent intent = new Intent(this, ClassifierActivity4.class);
        startActivity(intent);
    }

    public void openClassifierActivity5(String buttonLabel) {
        DataStore.buttonSelected=buttonLabel;

        Intent intent = new Intent(this, ClassifierActivity5.class);
        startActivity(intent);
    }
}

