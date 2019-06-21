package com.church.churchapp.uichurch;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.church.churchapp.R;

import java.util.Calendar;

public class miembros extends FragmentActivity {
    private EditText editFecha,editDiaPrefe;
    private TextView textViewMotivo;
    private Button buttonFecha,buttonDiaPre,buttonMotivo;
    private RadioButton radioVisita,radioAcepto,radioReconcilio,radioBautismo;
    private RadioButton radioSoltero,radioCasado,radioDivorciado;
    private RadioButton radioClaro,radioMovistart;
    private RadioButton radioAM,radioPM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miembros);
        radioVisita =(RadioButton) findViewById(R.id.radioButtonVisita);
        radioAcepto = (RadioButton) findViewById(R.id.radioButtonAcepto);
        radioBautismo = (RadioButton) findViewById(R.id.radioButtonBau);
        radioReconcilio = (RadioButton) findViewById(R.id.radioButtonRecon);
        radioSoltero = (RadioButton)findViewById(R.id.radioButtonSol);
        radioCasado = (RadioButton) findViewById(R.id.radioButtonCasa);
        radioDivorciado = (RadioButton) findViewById(R.id.radioButtonDivo);
        radioClaro = (RadioButton) findViewById(R.id.radioButtonClaro);
        radioMovistart = (RadioButton) findViewById(R.id.radioButtonMovi);
        radioAM = (RadioButton)findViewById(R.id.radioButtonAm);
        radioPM = (RadioButton) findViewById(R.id.radioButtonPM);
        editFecha = (EditText) findViewById(R.id.editTextfecha);
        editDiaPrefe = (EditText)findViewById(R.id.editdiaprefe);
        textViewMotivo = (TextView)findViewById(R.id.textViewdmotivo1);
        buttonFecha = (Button) findViewById(R.id.buttonFecha);
        buttonDiaPre = (Button)findViewById(R.id.buttondiaprefe) ;
        buttonMotivo = (Button) findViewById(R.id.buttonMotivo);
        buttonDiaPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                FragmentManager fragmentListSemana = getSupportFragmentManager();
                new DialogListSemana().show(fragmentListSemana, "DialogListSemana");


            }
        });
        buttonFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                setCurrentDate();
            }
        });
        buttonMotivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                FragmentManager fragmentListMotivo = getSupportFragmentManager();
                new DialogListMotivo().show(fragmentListMotivo, "DialogListMotivo");

            }
        });
        radioVisita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioTipoMember(1);
            }
        });
        radioAcepto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioTipoMember(2);
            }
        });
        radioBautismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioTipoMember(3);
            }
        });
        radioReconcilio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioTipoMember(4);
            }
        });
        radioSoltero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioEstadoCivil(1);
            }
        });
        radioCasado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioEstadoCivil(2);
            }
        });
        radioDivorciado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioEstadoCivil(3);
            }
        });
        radioClaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioOperadora(1);
            }
        });
        radioMovistart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioOperadora(2);
            }
        });
        radioAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioHorario(1);
            }
        });
        radioPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                setChangeRadioHorario(2);
            }
        });

    }
    public void setMotivo(String motivo){
         textViewMotivo.setText(motivo);
    }
    public void setDia(String diasemana){
        editDiaPrefe.setText(diasemana);
    }
    private void setChangeRadioTipoMember(int radio){
        if( radio == 1) {

            radioVisita.setChecked(true);
            radioBautismo.setChecked(false);
            radioReconcilio.setChecked(false);
            radioAcepto.setChecked(false);
        }
        if( radio == 2) {

            radioVisita.setChecked(false);
            radioBautismo.setChecked(false);
            radioReconcilio.setChecked(false);
            radioAcepto.setChecked(true);
        }
        if( radio == 3) {
            radioVisita.setChecked(false);
            radioBautismo.setChecked(true);
            radioReconcilio.setChecked(false);
            radioAcepto.setChecked(false);
        }
        if( radio == 4) {

            radioVisita.setChecked(false);
            radioBautismo.setChecked(false);
            radioReconcilio.setChecked(true);
            radioAcepto.setChecked(false);
        }
    }
    private void setChangeRadioEstadoCivil(int radio){
        if( radio == 1) {

            radioSoltero.setChecked(true);
            radioCasado.setChecked(false);
            radioDivorciado.setChecked(false);

        }
        if( radio == 2) {

            radioSoltero.setChecked(false);
            radioCasado.setChecked(true);
            radioDivorciado.setChecked(false);

        }
        if( radio == 3) {

            radioSoltero.setChecked(false);
            radioCasado.setChecked(false);
            radioDivorciado.setChecked(true);

        }

    }
    private void setChangeRadioOperadora(int radio){
        if( radio == 1) {

            radioClaro.setChecked(true);
            radioMovistart.setChecked(false);


        }
        if( radio == 2) {

            radioClaro.setChecked(false);
            radioMovistart.setChecked(true);

        }


    }
    private void setChangeRadioHorario(int radio){
        if( radio == 1) {

            radioAM.setChecked(true);
            radioPM.setChecked(false);

        }
        if( radio == 2) {

            radioAM.setChecked(false);
            radioPM.setChecked(true);

        }


    }
    private void setCurrentDate() {
        // Process to get Current Date
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Launch Date Picker Dialog
        DatePickerDialog dpd = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        // Display Selected date in textbox

                            editFecha.setText(dayOfMonth + "/"+ (monthOfYear + 1)+"/"+year);
                            //  fechaGrabar = String.valueOf(year)+ "-" + String.valueOf(monthOfYear + 1)+"-"+String.valueOf(dayOfMonth);

                    }
                }, year, month, day);
        dpd.show();

    }
    private void validarEntrada(){

    }
}
