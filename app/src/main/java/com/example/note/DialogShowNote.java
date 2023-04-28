package com.example.note;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class DialogShowNote extends DialogFragment {

    private Note mNote;

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_show_note,null);

        TextView txtTitle = dialogView.findViewById(R.id.txtTitle);
        TextView txtDescription = dialogView.findViewById(R.id.txtDescription);
        TextView txtImportant = dialogView.findViewById(R.id.textViewImportant);
        TextView txtTodo = dialogView.findViewById(R.id.textViewTodo);
        TextView txtIdea = dialogView.findViewById(R.id.textViewIdea);

        txtTitle.setText(mNote.getmTitle());
        txtDescription.setText(mNote.getmDescription());

        if (!mNote.ismImportant()) {
            txtImportant.setVisibility(View.GONE);
        }
        if (!mNote.ismTodo()) {
            txtTodo.setVisibility(View.GONE);
        }
        if (!mNote.ismIdea()) {
            txtIdea.setVisibility(View.GONE);
        }

        Button btnOk = dialogView.findViewById(R.id.btnOk);
        builder.setView(dialogView).setMessage("Your Note");
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return builder.create();
    }
    public void sendNoteSelected(Note noteSelected) {
        mNote = noteSelected;
    }
}
