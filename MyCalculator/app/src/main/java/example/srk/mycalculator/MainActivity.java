package example.srk.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubt;
    private Button btnMult;
    private Button btnDivi;
    private TextView txtResult;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editText);
        operand2 = (EditText) findViewById(R.id.editText2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnDivi = (Button) findViewById(R.id.btnDivi);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnSubt = (Button) findViewById(R.id.btnSubt);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v){
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());

                double theResult = oper1 + oper2;
                txtResult.setText(Double.toString(theResult));

            }}
            else{
                    Toast.makeText(MainActivity.this,"please enter two values", Toast.LENGTH_LONG).show();
                }
                                       });

            btnSubt.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                                               double oper1 = Double.parseDouble(operand1.getText().toString());
                                               double oper2 = Double.parseDouble(operand2.getText().toString());

                                               double theResult = oper1 - oper2;
                                               txtResult.setText(Double.toString(theResult));

                                           }
                                           } else{
                    Toast.makeText(MainActivity.this,"please enter two values", Toast.LENGTH_LONG).show();
                } });

                btnMult.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                                                   double oper1 = Double.parseDouble(operand1.getText().toString());
                                                   double oper2 = Double.parseDouble(operand2.getText().toString());

                                                   double theResult = oper1 * oper2;
                                                   txtResult.setText(Double.toString(theResult));

                                               }

                                               }else{
                        Toast.makeText(MainActivity.this,"please enter two values", Toast.LENGTH_LONG).show();
                    } });
                    btnDivi.setOnClickListener(new View.OnClickListener()

                    {
                        @Override
                        public void onClick (View v){
                            if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                                double oper1 = Double.parseDouble(operand1.getText().toString());
                                double oper2 = Double.parseDouble(operand2.getText().toString());

                                double theResult = oper1 / oper2;
                                txtResult.setText(Double.toString(theResult));

                            } else{
                                Toast.makeText(MainActivity.this,"please enter two values", Toast.LENGTH_LONG).show();
                            } }});

                        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
                    }

                    @Override
                    public boolean onCreateOptionsMenu(Menu menu) {
                        // Inflate the menu; this adds items to the action bar if it is present.
                        getMenuInflater().inflate(R.menu.menu_main, menu);
                        return true;
                    }

                    @Override
                    public boolean onOptionsItemSelected(MenuItem item) {
                        // Handle action bar item clicks here. The action bar will
                        // automatically handle clicks on the Home/Up button, so long
                        // as you specify a parent activity in AndroidManifest.xml.
                        int id = item.getItemId();

                        //noinspection SimplifiableIfStatement
                        if (id == R.id.action_settings) {
                            return true;
                        }

                        return super.onOptionsItemSelected(item);
                    }
                }
