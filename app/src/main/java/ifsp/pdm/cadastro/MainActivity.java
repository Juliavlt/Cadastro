package ifsp.pdm.cadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ifsp.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{
    private ActivityMainBinding amb; //classe de binding com o xml
    private Formulario form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        form = new Formulario();
        radio();
        spinner();

        amb.btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = amb.nomeCompleto.getText().toString();
                String telefone = amb.telefone.getText().toString();
                String email = amb.email.getText().toString();
                Boolean ingressarLista = amb.checkBox.isChecked();
                String cidade = amb.cidade.getText().toString();

                form.setNome(name);
                form.setIngressarLista(ingressarLista);
                form.setEmail(email);
                form.setTelefone(telefone);
                form.setCidade(cidade);
                Toast.makeText(getApplicationContext(), form.toString(), Toast.LENGTH_LONG).show();
            }
        });

        amb.btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amb.nome.setText("");
                amb.email.setText("");
                amb.telefone.setText("");
                amb.cidade.setText("");
                if (amb.checkBox.isChecked()) {
                    amb.checkBox.setChecked(false);
                }
                amb.sexo.setActivated(false);
            }
        });


    }

    public void spinner(){
        amb.estado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                form.setUF(adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}

        });
    }

    public void radio(){
        amb.sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.feminino){
                    form.setSexo(amb.feminino.getText().toString());
                }else{
                    form.setSexo(amb.masculino.getText().toString());
                }

            }
        });
    }
}
