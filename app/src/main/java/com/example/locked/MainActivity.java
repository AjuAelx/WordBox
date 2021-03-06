package com.example.locked;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView verses, books, count, outOf, times, duplicate;
    FloatingActionButton fab;
    Random random;
    int number;
    List<Integer> accessed;
    int clicked = 0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        verses = findViewById(R.id.verses);
        outOf = findViewById(R.id.outOf);
        count = findViewById(R.id.count);
        books = findViewById(R.id.books);
        fab = findViewById(R.id.addEvent);
        times = findViewById(R.id.times);
        duplicate = findViewById(R.id.duplicate);

        random = new Random();
        accessed = new ArrayList<>();
        newRandomVerse();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked();
            }
        });

        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                clicked();
                return false;
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void clicked() {
        clicked = clicked+1;
        times.setText("clicked " + clicked + " times");
        newRandomVerse();
    }

    @SuppressLint("SetTextI18n")
    private void newRandomVerse() {

        number = random.nextInt(111-1)+1;
        if (accessed.contains(number)){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    duplicate.setText("Skipped Duplicate");
                }
            }, 50);
            newRandomVerse();
        }
        else {
            duplicate.setText("");
            accessed.add(number);
            if (accessed.size() == 110){
                accessed.clear();
                Toast.makeText(this, "Refreshed", Toast.LENGTH_SHORT).show();
                clicked = 0;
                times.setText("");
                times.setText("Refreshed...");
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        times.setText("clicked " + clicked + " times");
                    }
                }, 1000);
            }
        }

        count.setText(String.valueOf(number));
        outOf.setText(number + " out of 400");

        if (number == 1){
            verses.setText("ഞാൻ നിന്നെ സമൃദ്ധമായി അനുഗ്രഹിക്കും.");
            books.setText("ഉല്പത്തി 22.17");
        }
        else if (number == 2){
            verses.setText("ഇതാ ഞാൻ നിന്നോടുകൂടെയുണ്ട്. നീ പോകുന്നിടത്തെല്ലാം ഞാൻ നിന്നെ കാത്തുരക്ഷിക്കും.");
            books.setText("ഉല്പത്തി 28.15");
        }
        else if (number == 3){
            verses.setText("നിങ്ങൾ ഭയപ്പെടാതെ ഉറച്ചുനില്ക്കുവിൻ. നിങ്ങൾക്കുവേണ്ടി ഇന്ന് കർത്താവ് ചെയ്യാൻ പോകുന്ന രക്ഷാകൃത്യം നിങ്ങൾ കാണും.");
            books.setText("പുറപ്പാട് 14.13");
        }
        else if (number == 4){
            verses.setText("ഞാൻ നിന്നെ സുഖപ്പെടുത്തുന്ന കർത്താവാണ്.");
            books.setText("പുറപ്പാട് 15.26");
        }
        else if (number == 5){
            verses.setText("ഞാൻ തന്നെ നിന്നോടുകൂടെ വരികയും നിനക്ക് ആശ്വാസം നല്കുകകും ചെയ്യും.");
            books.setText("പുറപ്പാട് 33.14");
        }
        else if (number == 6){
            verses.setText("നിങ്ങളുടെ ദൈവമായ കർത്താവ് നിങ്ങളുടെ എല്ലാ അദ്ധ്വാനങ്ങളിലും നിങ്ങളെ അനുഗ്രഹിച്ചിരുന്നു.");
            books.setText("നിയമാ. 2.7");
        }
        else if (number == 7){
            verses.setText("അലസത ഒരുവനെ ഗാഢനിദ്രയിലാഴ്ത്തുന്നു. മടിയന് പട്ടിണി കിടക്കേണ്ടി വരും.");
            books.setText("സുഭാ. 19.15");
        }
        else if (number == 8){
            verses.setText("നിഷ്കളങ്കനെ ദൈവം ഉപേക്ഷിക്കുകയില്ല.");
            books.setText("ജോബ് 8.20");
        }
        else if (number == 9){
            verses.setText("ഞാൻ പ്രശാന്തമായി കിടന്നുറങ്ങും. എന്തെന്നാൽ കർത്താവേ അങ്ങ് തന്നെയാണ് എനിക്ക് സുരക്ഷിതത്വം നൽകുന്നത്.");
            books.setText("സങ്കീർത്തനം 4.8");
        }
        else if (number == 10){
            verses.setText("അവിടുത്തെ നന്മയും കരുണയും ജീവിതകാലം മുഴുവനും എന്നെ അനുഗമിക്കും");
            books.setText("സങ്കീർത്തനം 23.6");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 11){
            verses.setText("കർത്താവിനെ അന്വേഷിക്കുന്നവർക്ക് ഒന്നിനും കുറവുണ്ടാവുകയില്ല.");
            books.setText("സങ്കീർത്തനം 34.10");
        }
        else if (number == 12){
            verses.setText("കർത്താവിൽ ആശ്രയിക്കുന്നവനെ അവിടുത്തെ സ്നേഹം വലയം ചെയ്യും.");
            books.setText("സങ്കീർത്തനം 31.10");
        }
        else if (number == 13){
            verses.setText("ദൈവമാണ് നമ്മുടെ അഭയവും ശക്തിയും. കഷ്ടതകളിൽ അവിടുന്ന് സുനിശ്ചിതമായ തുണയാണ്.");
            books.setText("സങ്കീർത്തനം 46.1");
        }
        else if (number == 14){
            verses.setText("ദൈവത്തിൽ മാത്രമാണ് എനിക്ക് ആശ്വാസം. അവിടുന്നാണ് എനിക്ക് രക്ഷ നൽകുന്നത്.");
            books.setText("സങ്കീർത്തനം 62.1");
        }
        else if (number == 15){
            verses.setText("കർത്താവ് നല്ലവനാണ്. അവിടുത്തെ കാരുണ്യം ശാശ്വതമാണ്. അവിടുത്തെ വിശ്വസ്തത തലമുറകളോളം നിലനിൽക്കും.");
            books.setText("സങ്കീർത്തനം 100.5");
        }
        else if (number == 16){
            verses.setText("അവിടുന്ന് തന്റെ വചനമയച്ചു അവരെ സൗഖ്യമാക്കി. വിനാശത്തിൽ നിന്നു വിടുവിച്ചു.");
            books.setText("സങ്കീർത്തനം 107.20");
        }
        else if (number == 17){
            verses.setText("നിന്റെ പ്രയത്നം കർത്താവിൽ അർപ്പിക്കുക. നിന്റെ പദ്ധതികൾ ഫലമണിയും.");
            books.setText("സുഭാഷിതങ്ങൾ 16.3");
        }
        else if (number == 18){
            verses.setText("കഷ്ടതകളിലൂടെ കടന്നുപോകുന്നെങ്കിലും എന്റെ ജീവനെ അവിടുന്ന് പരിപാലിക്കുന്നു.");
            books.setText("സങ്കീർത്തനം 138.7");
        }
        else if (number == 19){
            verses.setText("നിന്റെ എല്ലാ പ്രവർത്തികളും ദൈവവിചാരത്തോടെയാകട്ടെ. അവിടുന്ന് നിനക്ക് വഴിതെളിച്ചു തരും.");
            books.setText("സുഭാഷിതങ്ങൾ 7.6");
        }
        else if (number == 20){
            verses.setText("അവിടുന്ന് ഹൃദയം തകർന്നവരെ സൗഖ്യപ്പെടുത്തുകയും അവരുടെ മുറിവുകൾ വച്ചുകെട്ടുകയും ചെയുന്നു.");
            books.setText("സങ്കീർത്തനം 147.3");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 21){
            verses.setText("ഉന്മേഷമുള്ള മനസ്സ് രോഗം സഹിക്കുന്നു. തളർന്ന മനസിനെ ആർക്കു താങ്ങാൻ കഴിയും.");
            books.setText("സുഭാഷിതങ്ങൾ 18.14");
        }
        else if (number == 22){
            verses.setText("കർത്താവേ, മരുന്നോ ലേപനൗഷധമോ അല്ല, എല്ലാവരെയും സുഖപ്പെടുത്തുന്ന അങ്ങയുടെ വചനമാണ് അവരെ സുഖപ്പെടുത്തിയത്.");
            books.setText("സങ്കീർത്തനം 27.10");
        }
        else if (number == 23){
            verses.setText("അപ്പനും അമ്മയും എന്നെ ഉപേക്ഷിച്ചാലും കർത്താവ് എന്നെ കൈക്കൊള്ളും.");
            books.setText("സങ്കീർത്തനം 27.10");
        }
        else if (number == 24){
            verses.setText("അവിടുന്ന് എന്റെ അഭയസങ്കേതമാണ്. അനർത്ഥങ്ങളിൽനിന്ന് അവിടുന്ന് എന്നെ രക്ഷിക്കുന്നു.");
            books.setText("സങ്കീർത്തനം 32.7");
        }
        else if (number == 25){
            verses.setText("അവിടുന്ന് സൗഖ്യവും ജീവനും അനുഗ്രഹവും പ്രദാനം ചെയ്യുന്നു.");
            books.setText("പ്രഭാഷകൻ 34.17");
        }
        else if (number == 26){
            verses.setText("മകനെ രോഗം വരുമ്പോൾ ഉദാസീനനാകാതെ കർത്താവിനോടു പ്രാർത്ഥിക്കുക. അവിടുന്ന് നിന്നെ സുഖപ്പെടുത്തും.");
            books.setText("പ്രഭാഷകൻ  38.9");
        }
        else if (number == 27){
            verses.setText("തളർന്നവന് അവിടുന്ന് ബലം നൽകുന്നു. ദുർബലന് ശക്തി പകരുകയും ചെയുന്നു.");
            books.setText("ഏശയ്യാ 40.29");
        }
        else if (number == 28){
            verses.setText("കർത്താവേ, എന്നെ സുഖപ്പെടുത്തണമേ. അപ്പോൾ ഞാൻ സൗഖ്യമുള്ളവനാകും. എന്നെ രക്ഷിക്കണമേ. അപ്പോൾ ഞാൻ രക്ഷപെടും.");
            books.setText("ജെറമിയ  17.14");
        }
        else if (number == 29){
            verses.setText("ഞാൻ നിനക്ക് വീണ്ടും ആരോഗ്യം നൽകും. നിന്റെ മുറിവുകൾ സുഖപ്പെടുത്തും.");
            books.setText("ജെറമിയ 30.17");
        }
        else if (number == 30){
            verses.setText("ക്ഷിണിതരെ ഞാൻ ശക്തിപ്പെടുത്തും. ദുഃഖിതരെ ഞാൻ ആശ്വസിപ്പിക്കും.");
            books.setText("ജെറമിയ 31.25");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 31){
            verses.setText("മുറിവേറ്റതിനെ ഞാൻ വച്ചുകെട്ടും. ബലഹീനമായതിനെ ഞാൻ ശക്തിപ്പെടുത്തും.");
            books.setText("എസെക്കിയേൽ 34.16");
        }
        else if (number == 32){
            verses.setText("വിശ്വാസത്തോടെയുള്ള പ്രാർത്ഥന രോഗിയെ സുഖപ്പെടുത്തും.");
            books.setText("യാക്കോബ് 5.15");
        }
        else if (number == 33){
            verses.setText("വിശ്വാസത്തോടെ പ്രാർഥിക്കുന്നതെല്ലാം നിങ്ങൾക്കു ലഭിക്കും.");
            books.setText("വി. മത്തായി 21.22");
        }
        else if (number == 34){
            verses.setText("അദ്ധ്വാനിക്കുന്നവരും ഭാരം വഹിക്കുന്നവരുമായ നിങ്ങളെല്ലാവരും എന്റെ അടുക്കൽ വരുവിൻ. ഞാൻ നിങ്ങളെ ആശ്വസിപ്പിക്കാം.");
            books.setText("വി. മത്തായി 11.28");
        }
        else if (number == 35){
            verses.setText("ഞാൻ ശാന്തശീലനും വിനീതഹൃദയനുമാകയാൽ എന്റെ നുകം വഹിക്കുകയും എന്നിൽനിന്ന് പഠിക്കുകയും ചെയ്യുവിൻ. അപ്പോൾ നിങ്ങൾക്ക് ആശ്വാസം ലഭിക്കും.");
            books.setText("വി. മത്തായി 11.29");
        }
        else if (number == 36){
            verses.setText("എന്റെ ഏറ്റവും എളിയ ഈ സഹോദരന്മാരിൽ ഒരുവന് നിങ്ങൾ ഇത് ചെയ്തുകൊടുത്തപ്പോൾ എനിക്കു തന്നെയാണ് ചെയ്തു തന്നത്.");
            books.setText("വി. മത്തായി  25.40");
        }
        else if (number == 37){
            verses.setText("പ്രാർത്ഥിക്കുകയും യാചിക്കുകയും ചെയുന്ന എന്തും ലഭിക്കുമെന്ന് വിശ്വസിക്കുവിൻ. നിങ്ങൾക്ക് ലഭിക്കുക തന്നെ ചെയ്യും.");
            books.setText("വി. മാർക്കോസ് 11.24");
        }
        else if (number == 38){
            verses.setText("മറ്റുള്ളവർ നിങ്ങളോടു എങ്ങനെ പെരുമാറണമെന്ന് നിങ്ങൾ ആഗ്രഹിക്കുന്നുവോ, അങ്ങനെതന്നെ നിങ്ങൾ അവരോടു പെരുമാറുവിൻ");
            books.setText("വി. ലൂക്കാ 6.31");
        }
        else if (number == 39){
            verses.setText("ഗോതമ്പുമണി നിലത്തുവീണ് അഴിയുന്നില്ലെങ്കിൽ അത് അതേപടി ഇരിക്കും. അഴിയുന്നെങ്കിലോ അത് വളരെ ഫലം പുറപ്പെടുവിക്കും.");
            books.setText("വി. യോഹന്നാൻ 12.24");
        }
        else if (number == 40){
            verses.setText("എന്നെ കൂടാതെ നിങ്ങൾക്ക് ഒന്നും ചെയാൻ കഴിയുകയില്ല.");
            books.setText("വി. യോഹന്നാൻ 15.5");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 41){
            verses.setText("കർത്താവിന്റെ നാമം വിളിച്ചപേക്ഷിക്കുന്നവർ രക്ഷ പ്രാപിക്കും.");
            books.setText("നടപടി 2.21");
        }
        else if (number == 42){
            verses.setText("കർത്താവായ യേശുവിൽ വിശ്വസിക്കുക. നീയും നിന്റെ കുടുംബവും രക്ഷ പ്രാപിക്കും");
            books.setText("നടപടി 16.31");
        }
        else if (number == 43){
            verses.setText("ഞാൻ നിന്നോടുകൂടെയുണ്ട്. ആരും നിന്നെ ആക്രമിക്കുകയോ ഉപദ്രവിക്കുകയോ ഇല്ല.");
            books.setText("നടപടി 18.10");
        }
        else if (number == 44){
            verses.setText("ദൈവത്തെ സ്നേഹിക്കുന്നവർക്ക് അവിടുത്തെ പദ്ധതിയനുസരിച്ച്  വിളിക്കപ്പെട്ടവർക്ക് അവിടുന്ന് സകലവും നന്മക്കായി പരിണമിപ്പിക്കുന്നു.");
            books.setText("റോമാ 8.28");
        }
        else if (number == 45){
            verses.setText("മനുഷ്യന്റെ ആഗ്രഹമോ പ്രയത്നമോ അല്ല, ദൈവത്തിന്റെ ദയയാണ് എല്ലാറ്റിന്റെയും അടിസ്ഥാനം.");
            books.setText("റോമാ 9.16");
        }
        else if (number == 46){
            verses.setText("സ്നേഹമായിരിക്കട്ടെ നിങ്ങളുടെ ലക്\u200Cഷ്യം.");
            books.setText("1 കോറിന്തോസ് 14.1");
        }
        else if (number == 47){
            verses.setText("ക്രിസ്തു നിങ്ങളെ സ്നേഹിച്ചതുപോലെ നിങ്ങൾ പരസ്പരം സ്നേഹത്തിൽ ജീവിക്കുവിൻ.");
            books.setText("എഫേസോസ് 5.2");
        }
        else if (number == 48){
            verses.setText("മനുഷ്യനുവേണ്ടിയല്ല. കർത്താവിനുവേണ്ടി എന്ന പോലെ സന്മനസോടെ ശുശ്രുഷ ചെയ്യണം.");
            books.setText("എഫേസോസ് 6.7");
        }
        else if (number == 49){
            verses.setText("നിങ്ങളുടെ സംസാരം എപ്പോഴും കരുണാമസൃണവും ഹൃദ്യവുമായിരിക്കട്ടെ.");
            books.setText("കൊളോസോസ് 4.6");
        }
        else if (number == 50){
            verses.setText("കർത്താവ് ക്ഷമാശീലനും, അചഞ്ചലസ്നേഹം കവിഞ്ഞൊഴുകുന്നവനുമാണ്.");
            books.setText("സംഖ്യ 14.18");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 51){
            verses.setText("അവൻ തന്റെ ജനത്തെ അവരുടെ പാപങ്ങളിൽനിന്ന് മോചിപ്പിക്കും.");
            books.setText("വി. മത്തായി 1.21");
        }
        else if (number == 52){
            verses.setText("ക്രിസ്തുവിന്റെ സമാധാനം നിങ്ങളുടെ ഹൃദയങ്ങളെ ഭരിക്കട്ടെ.");
            books.setText("കൊളോസോസ് 3.5");
        }
        else if (number == 53){
            verses.setText("നിങ്ങൾ ലോകത്തിന്റെ പ്രകാശമാണ്.");
            books.setText("വി. മത്തായി 5.13");
        }
        else if (number == 54){
            verses.setText("ശത്രുക്കളെ സ്നേഹിക്കുവിൻ. നിങ്ങളെ ദ്വേഷിക്കുന്നവർക്കു നന്മ ചെയ്യുവിൻ.");
            books.setText("വി. ലൂക്കാ 6.27");
        }
        else if (number == 55){
            verses.setText("മനുഷ്യർക്ക് അസാദ്ധ്യമായാത് ദൈവത്തിന് സാധ്യമാണ്.");
            books.setText("വി. ലൂക്കാ 18.27");
        }
        else if (number == 56){
            verses.setText("നിന്റെ വിശ്വാസം നിന്നെ രക്ഷിച്ചിരിക്കുന്നു. സമാധാനത്തോടെ പൊയ്ക്കൊള്ളുക.");
            books.setText("വി. ലൂക്കാ 8.48");
        }
        else if (number == 57){
            verses.setText("ദൈവം നമ്മുടെ പക്ഷത്തെങ്കിൽ ആരു നമ്മുക്ക് എതിരു നിൽക്കും.");
            books.setText("റോമാ 8.31");
        }
        else if (number == 58){
            verses.setText("കർത്താവിന്റെ നാമം വിളിച്ചപേക്ഷിക്കുന്ന എല്ലാവരും രക്ഷ പ്രാപിക്കും.");
            books.setText("റോമാ 10.13");
        }
        else if (number == 59){
            verses.setText("നിങ്ങൾ അന്യോന്യം സഹോദരതുല്യം സ്നേഹിക്കുവിൻ. പരസ്\u200Cപരം ബഹുമാനിക്കുന്നതിൽ ഓരോരുത്തരും മുന്നിട്ടുനിൽക്കുവിൻ.");
            books.setText("റോമാ 12.10");
        }
        else if (number == 60){
            verses.setText("പ്രത്യാശയിൽ സന്തോഷിക്കുവിൻ; ക്ലേശങ്ങളിൽ സഹനശീലരായിരിക്കുവിൻ; പ്രാർത്ഥനയിൽ സ്ഥിരതയുള്ളവരായിരിക്കുവിൻ.");
            books.setText("റോമാ 12.12");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 61){
            verses.setText("ആത്മപ്രശംസ ചെയ്യരുത്, മറ്റുള്ളവർ നിന്നെ പ്രശംസിക്കട്ടെ. അന്യന്റെ നാവാണ്, നിന്റേതല്ല, അതു ചെയ്യേണ്ടത്. ");
            books.setText("സുഭാഷിതങ്ങൾ 27.2");
        }
        else if (number == 62){
            verses.setText("കർത്താവേ, എന്റെ ശക്തിയുടെ ഉറവിടമേ, ഞാൻ അങ്ങയെ സ്നേഹിക്കുന്നു.");
            books.setText("സങ്കീർത്തനം 18.1");
        }
        else if (number == 63){
            verses.setText("കൂടെകൂടെടെ ഗുണദോഷിക്കപ്പെട്ടിട്ടും മർക്കടമുഷ്ടിപിടിക്കുന്നവൻ രക്ഷപ്പെടാനാവാത്ത തകർച്ചയിൽ പെട്ടെന്നു പതിക്കും..");
            books.setText("സുഭാഷിതങ്ങൾ 29.1");
        }
        else if (number == 64){
            verses.setText("അനുസരിക്കാൻ സന്നദ്ധരെങ്കിൽ നിങ്ങൾ ഐശ്വര്യം ആസ്വദിക്കും.");
            books.setText("ഏശയ്യാ 1.19");
        }
        else if (number == 65){
            verses.setText("കർത്താവേ, അങ്ങയുടെ കാരുണ്യം എന്നിൽനിന്ന് പിൻവലിക്കരുതേ ! അവിടുത്തെ സ്നേഹവും വിശ്വസ്തതയും എന്നെ സംരക്ഷിക്കട്ടെ.");
            books.setText("സങ്കീർത്തനം 40.11");
        }
        else if (number == 66){
            verses.setText("വിശ്വസ്തൻ സമൃദ്ധമായി അനുഗ്രഹിക്കപ്പെടും.");
            books.setText("സുഭാഷിതങ്ങൾ 28.20");
        }
        else if (number == 67){
            verses.setText("നിനക്ക് ചെയ്യാൻ കഴിവുള്ള നന്മ അത് ലഭിക്കാൻ അവകാശമുള്ളവർക്ക് നിഷേധിക്കരുത്.");
            books.setText("സുഭാഷിതങ്ങൾ 3.27");
        }
        else if (number == 68){
            verses.setText("ബലമുള്ളവരായ നാം ബലഹീനരുടെ പോരായ്മകൾ സഹിക്കുകയാണ് വേണ്ടത്. ");
            books.setText("റോമാ 15.1");
        }
        else if (number == 69){
            verses.setText("ഓരോരുത്തർക്കും അവകാശപ്പെട്ടിരുന്നത് കൊടുക്കുവിൻ.");
            books.setText("റോമാ 13.7");
        }
        else if (number == 70){
            verses.setText("പ്രാർത്ഥനയിൽ സ്ഥിരതയുള്ളവരായിരിക്കുവിൻ.");
            books.setText("റോമാ 12.12");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 71){
            verses.setText("കർത്താവായ ദൈവമാണ് എന്റെ ബലം.");
            books.setText("ഹബക്കൂക്ക് 3.19");
        }
        else if (number == 72){
            verses.setText("നീതിയുടെ പരിണതഫലം പ്രശാന്തതയും എന്നേയ്\u200Cക്കുമുള്ള പ്രത്യാശയുമായിരിക്കും");
            books.setText("ഏശയ്യാ 32.17");
        }
        else if (number == 73){
            verses.setText("കർത്താവാണ് എല്ലാ നന്മയും നൽകുന്നത്.");
            books.setText("തോബിത്  4.19");
        }
        else if (number == 74){
            verses.setText("നല്ല വാക്ക് ദാനത്തേക്കാൾ വിശിഷ്ടമാണ്.");
            books.setText("പ്രഭാഷകൻ 18.16");
        }
        else if (number == 75){
            verses.setText("കർത്താവിൽ നിന്നാണ് രക്ഷ.");
            books.setText("യോനാ 2.9");
        }
        else if (number == 76){
            verses.setText("കർത്താവിന്റെ അനുഗ്രഹമാണ് ദൈവഭക്തന് സമ്മാനം.");
            books.setText("പ്രഭാഷകൻ 11.22");
        }
        else if (number == 77){
            verses.setText("ദൈവവചനം ആദരിക്കുന്നവൻ ഉൽക്കർഷം നേടും. കർത്താവിൽ ആശ്രയിക്കുന്നവൻ ഭാഗ്യവാൻ.");
            books.setText("സുഭാഷിതങ്ങൾ 16.20");
        }
        else if (number == 78){
            verses.setText("കർത്താവിൽ വിശ്വാസമർപ്പിക്കുന്നവൻ സുരക്ഷിതനത്രേ.");
            books.setText("സുഭാഷിതങ്ങൾ 29.25");
        }
        else if (number == 79){
            verses.setText("കർത്താവായിരിക്കും നിന്റെ നിത്യമായ പ്രകാശം.");
            books.setText("ഏശയ്യാ 60.19");
        }
        else if (number == 80){
            verses.setText("സമ്പതേറുമ്പോൾ അതനുസരിച്ചു ദാനം ചെയ്യുക.");
            books.setText("തോബിത് 4.8");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 81){
            verses.setText(" നിങ്ങളുടെ ദൈവമായ കർത്താവ് കരുണയുള്ള ദൈവമാണ്.");
            books.setText("നിയമാവർത്തനം 4.31");
        }
        else if (number == 82){
            verses.setText("ദൈവത്തിൽ ആശ്രയിക്കുന്നവൻ വീണ്ടും ശക്തി പ്രാപിക്കും.");
            books.setText("ഏശയ്യാ 40.31");
        }
        else if (number == 83){
            verses.setText("വിശുദ്ധിയിലേക്കാണ് ദൈവം നമ്മെ വിളിച്ചിരിക്കുന്നത്.");
            books.setText("1 തെസലോനിക്ക 4.7");
        }
        else if (number == 84){
            verses.setText("തിന്മയ്ക്ക് തിന്മയോ നിന്ദനത്തിന് നിന്ദനമോ പകരം കൊടുക്കാതെ അനുഗ്രഹിക്കുവിൻ.");
            books.setText("1 പത്രോസ് 3.9");
        }
        else if (number == 85){
            verses.setText("കരുണയുള്ളവർ ഭാഗ്യവാന്മാർ, എന്തെന്നാൽ അവർക്ക് കരുണ ലഭിക്കും.");
            books.setText("വി. മത്തായി 5.7");
        }
        else if (number == 86){
            verses.setText("ദയാശീലൻ തനിക്കു തന്നെ ഗുണം ചെയ്യുന്നു.");
            books.setText("സുഭാഷിതങ്ങൾ 11.17");
        }
        else if (number == 87){
            verses.setText("ക്ഷമാശീലന് കുറച്ചുകാലത്തേയ്ക്കു മാത്രമേ സഹിക്കേണ്ടി വരികയുള്ളു.");
            books.setText("പ്രഭാഷകൻ 1.23");
        }
        else if (number == 88){
            verses.setText("അദ്ധ്വാനിക്കുന്നവന് സുഖനിദ്ര ലഭിക്കുന്നു.");
            books.setText("സഭാപ്രസംഗം 5.12");
        }
        else if (number == 89){
            verses.setText("നീ എനിക്ക് വിലപ്പെട്ടവനും ബഹുമാന്യനും പ്രിയങ്കരനുമാണ്.");
            books.setText("ഏശയ്യാ 43.4");
        }
        else if (number == 90){
            verses.setText("ദാനമായി നിങ്ങൾക്കു കിട്ടി. ദാനമായിത്തന്നെ കൊടുക്കുവിൻ. ");
            books.setText("വി. മത്തായി 10.8");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 91){
            verses.setText("ജീവിതകാലം മുഴുവൻ നിന്റെ പ്രവൃത്തികൾ നീതിനിഷ്ഠമായിരിക്കട്ടെ.");
            books.setText("തോബിത് 4.5");
        }
        else if (number == 92){
            verses.setText("ഭയപ്പെടേണ്ട ഞാൻ നിന്നെ രക്ഷിച്ചിരിക്കുന്നു.");
            books.setText("ഏശയ്യാ 43.1");
        }
        else if (number == 93){
            verses.setText("ശക്തനും ധീരനുമായിരിക്കുക. നിന്റെ ദൈവമായ കർത്താവ് നീ പോകുന്നിടത്തെല്ലാം നിന്നോടുകൂടെയുണ്ടായിരിക്കും.");
            books.setText("ജോഷ്വാ 1.7");
        }
        else if (number == 94){
            verses.setText("അമ്മയെ മഹത്വപ്പെടുത്തുന്നവൻ നിക്ഷേപം കൂട്ടിവയ്ക്കുന്നു.");
            books.setText("പ്രഭാഷകൻ 3.4");
        }
        else if (number == 95){
            verses.setText("ദൈവഭക്തിയാണ് ജ്ഞാനത്തിന്റെ ഉറവിടം.");
            books.setText("പ്രഭാഷകൻ 9.10");
        }
        else if (number == 96){
            verses.setText("ദൈവത്തോട് ചേർന്നുനില്ക്കുക. അവിടുന്ന് നിങ്ങളോടും ചേർന്ന് നിൽക്കും.");
            books.setText("യാക്കോബ് 4.8");
        }
        else if (number == 97){
            verses.setText("നിന്റെ എല്ലാ പ്രവൃത്തികളും ദൈവവിചാരത്തോടെയാകട്ടെ.");
            books.setText("സുഭാഷിതങ്ങൾ 3.6");
        }
        else if (number == 98){
            verses.setText("എന്റെ രക്ഷകനായ ദൈവത്തിനുവേണ്ടി ഞാൻ കാത്തിരിക്കും. ");
            books.setText("മിക്കാ 7.7");
        }
        else if (number == 99){
            verses.setText("എന്റെ ദൈവം എന്റെ പ്രാർത്ഥന കേൾക്കും.");
            books.setText("മിക്കാ 7.7");
        }
        else if (number == 100){
            verses.setText("നന്മ ചെയ്യുന്നതിലും നിങ്ങൾക്കുള്ളവ പങ്കുവയ്ക്കുന്നതിലും ഉപേക്ഷ വരുത്തരുത്.");
            books.setText("ഹെബ്രായർ 13.16");
        }
        //-----------------------------------------------------------------------------------------
        if (number == 101){
            verses.setText("ഞാൻ നിന്റെ കൂടെ ഉണ്ടായിരിക്കും. നിന്നെ ഞാൻ അനുഗ്രഹിക്കുകയും ചെയ്യും.");
            books.setText("ഉല്പത്തി 26.3");
        }
        else if (number == 102){
            verses.setText("എന്റെ ദൈവമേ, അങ്ങയുടെ ഹിതം നിറവേറ്റുകയാണ്\u200C എന്റെ സന്തോഷം, അങ്ങയുടെ നിയമം എന്റെ ഹൃദയത്തിലുണ്ട്.");
            books.setText("സങ്കീർത്തനം 40.8");
        }
        else if (number == 103){
            verses.setText("കർത്താവിന്റെ പദ്ധതികൾ ശാശ്വതമാണ്; അവിടുത്തെ ചിന്തകൾ തലമുറകളോളം നിലനിൽക്കുന്നു.");
            books.setText("സങ്കീർത്തനം 33.11");
        }
        else if (number == 104){
            verses.setText("കർത്താവ് നിഷ്കളങ്കരുടെ ദിനങ്ങൾ അറിയുന്നു; അവരുടെ അവകാശം ശാശ്വതമായിരിക്കും.");
            books.setText("സങ്കീർത്തനം 37.18");
        }
        else if (number == 105){
            verses.setText("തന്റെ ദൈവത്തിൽ ആശ്രയിച്ചിരുന്നതുകൊണ്ട് അവന് ഒരു പോറൽ പോലും ഏറ്റതായി കണ്ടില്ല.");
            books.setText("ദാനിയേൽ 6.23");
        }
        else if (number == 106){
            verses.setText("ഒരാൾ ഉദാരമായി നൽകിയിട്ടും കൂടുതൽ ധനികനാകുന്നു. നൽകേണ്ടത് പിടിച്ചുവച്ചിട്ടും മറ്റൊരുവന്റെ ദാരിദ്ര്യം വർദ്ധിക്കുന്ന.");
            books.setText("സുഭാഷിതങ്ങൾ 11.24");
        }
        else if (number == 107){
            verses.setText("കർത്താവിനെ കാത്തിരിക്കുന്നവരേ, ദുർബലരാകാതെ ധൈര്യം അവലംബിക്കുവിൻ.");
            books.setText("സങ്കീർത്തനം 31.24");
        }
        else if (number == 108){
            verses.setText("കർത്താവിന് നമ്മെക്കുറിച്ച് വിചാരമുണ്ട്. അവിടുന്ന് നമ്മെ അനുഗ്രഹിക്കും.");
            books.setText("സങ്കീർത്തനം 115.12");
        }
        else if (number == 109){
            verses.setText("പിതാവിന്റെ അനുഗ്രഹം മക്കളുടെ ഭവനങ്ങളെ ബലവത്താക്കും.");
            books.setText("പ്രഭാഷകൻ 3.9");
        }
        else if (number == 110){
            verses.setText("നന്മ ചെയ്യുന്നതിൽ നിങ്ങൾ തീക്ഷ്ണതയുള്ളവരാണെങ്കിൽ നിങ്ങളെ ഉപദ്രവിക്കാൻ ആർക്കു കഴിയും?");
            books.setText("1 പത്രോസ് 3.13");
        }
    }
}
