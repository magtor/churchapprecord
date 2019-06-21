package com.church.churchapp.uichurch;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class DialogListMotivo extends DialogFragment {
    private String motivoiOracion ;
    public DialogListMotivo() {
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return createSingleListDialog();
    }

    public AlertDialog createSingleListDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final CharSequence[] items = new CharSequence[6];


        items[0] = "Espiritual";
        items[1] = "Matrimonio";
        items[2] = "Hijos";
        items[3] = "Salud";
        items[4] = "Finanzas";
        items[5] = "Estudios";


        builder.setTitle("Seleccione Un Dia")
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        /*Toast.makeText(
                                getActivity(),
                                "Seleccionaste:" + items[which],
                                Toast.LENGTH_SHORT)
                                .show();*/
                        motivoiOracion = String.valueOf(items[which]);
                        ((miembros) getActivity()).setMotivo(motivoiOracion);

                    }
                });

        return builder.create();
    }

}
