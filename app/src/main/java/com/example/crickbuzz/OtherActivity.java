package com.example.crickbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.crickbuzz.CustomAdapter;
import com.example.crickbuzz.FullScreen_Activity;
import com.example.crickbuzz.R;

public class OtherActivity extends AppCompatActivity {

    ListView listView;

    ImageButton btn;
    CustomAdapter adapter;
    String team;

    String name[] = {"Hardik Pandya (C)", "Shubman Gill", "David Miller","Abhinav Manohar","Sai Sudharsan","Wriddhiman Saha","Matthew Wade","Rashid Khan","Rahul Tewatia","Vijay Shankar","Mohammed Shami"};
    String num[] = {"ALL RAUNDER", "Batter", "Batter","Batter","Batter","Batter/Wicket-keeper","Batter/Wicket-keeper","Bowler","All-Rounder","All-Rounder","Bowler"};


    String born[]={"11 October 1993 (age 29 years)","8 September 1999 (age 23 years)","10 June 1989 (age 33 years)","16 September 1994 (age 28)",
            "15 October 2001 (age 21 years)","24 October 1984 (age 38 years)","26 December 1987 (age 35 years)","20 September 1998 (age 24 years)",
            "20 May 1993 (age 29 years)","26 January 1991 (age 32 years)","3 September 1990 (age 32 years)"};

    String place[]={"Choryasi","Fazilka","Pietermaritzburg, South Africa","Bengaluru","Chennai","Siliguri","Hobart, Australia",
            "Nangarhar, Afghanistan","Faridabad","Tirunelveli","Amroha"};

    String nc[]={"Kung Fu Pandya","Smoothman Gill","Killer Miller","--","--","Wriddhi, Superman, Papali",
            "Wadey, Wado","Afghanistan's Afridi","The Iceman","Shankar","Lalaji"};

    String role[]={"ALL RAUNDER", "Batter", "Batter","Batting all-rounder","Batter","Batter/Wicket-keeper",
            "Batter/Wicket-keeper","Bowling all-rounder","Batting Allrounder","Batting All-Rounder","Bowler"};

    String batting[]={"Right-handed","Right-handed","Left-handed","Right-handed","Left-handed","Right-handed",
            "Left-handed","Right-handed","Left Handed Bat","Right Handed Bat","Right-handed"};

    String bolling[]={"Right-arm medium-fast","Right-arm offbreak","Left-arm orthodox","Leg break googly","Leg break","--",
            "Right-arm medium","Right-arm leg break","Right-arm legbreak","Right-arm medium","Right-arm fast"};

    int GTimgArr[] = {R.drawable.gt_1, R.drawable.gt_2, R.drawable.gt_3,R.drawable.gt_4,R.drawable.gt_5,R.drawable.gt_6,R.drawable.gt_7,R.drawable.gt_8,R.drawable.gt_9,R.drawable.gt_10,R.drawable.gt_11};


    int CSKimgArr[] = {R.drawable.csk_1, R.drawable.csk_2, R.drawable.csk_3,R.drawable.csk_4,R.drawable.csk_5,R.drawable.csk_6,R.drawable.csk_7,R.drawable.csk_8,R.drawable.csk_9,R.drawable.csk_10,R.drawable.csk_11};

    String CSKname[]={"MS Dhoni","Devon Conway","Ruturaj Gaikwad","Ambati Rayudu","Subhranshu Senapati","Moeen Ali",
            "Shivam Dube","Rajvardhan Hangargekar","Dwaine Pretorius","Mitchell Santner","Ravindra Jadeja"};
    String CSKnum[]={"Batter/Wicket-keeper","Batter","Batter","Batter/Wicket-keeper","Batsmen","All-Rounder","All-Rounder",
            "Bowler","All-Rounder","Bowler","All-Rounder"};
    String CSKborn[]={"7 July 1981 (age 41 years)","8 July 1991 (age 31 years)","31 January 1997 (age 26 years)","23 September 1985 (age 37 years)",
            "30 December 1996 (age 26 years)","18 June 1987 (age 35 years)","26 June 1993 (age 29 years)","10 November 2002 (age 20 years)",
            "29 March 1989 (age 34 years)","5 February 1992 (age 31 years)","6 December 1988 (age 34 years)"};
    String CSKplace[]={"Ranchi","Johannesburg, South Africa","Pune","Guntur","Keonjhar","Birmingham, United Kingdom",
            "Mumbai","Tuljapur","Randfontein, South Africa","Hamilton, New Zealand","Navagam"};
    String CSKnc[] = {"Mahi", "Conway", "Rutu", "--", "--", "Moe",
            "--", "--", "Dwaine Pretorius   ", "Flatline", "Rockstar, Jaddu, Sir Jadeja"};
    String CSKrole[]={"wicket-keeper batsman","Wicket-keeper-batter","Batter","Batsman","Batsman",
            "Batsman","Batting Allrounder","Bowling Allrounder","Bowler","Bowling Allrounder","Bowling Allrounder"};
    String CSKbatting[]={"Right Handed Bat","Left Handed Bat","Right-handed","Right Handed Bat","Right Handed Bat",
            "Right Handed Bat","Left Handed Bat","Left Handed Bat","Right Handed Bat","Right Handed Bat","Left Handed Bat"};
    String CSKbolling[]={"Right-arm medium","Right-arm medium","Right-arm off break","Right-arm offbreak","Right-arm medium",
            "Right-arm medium","Right-arm offbreak","Right-arm medium","Right-arm fast-medium","Right-arm fast-medium","Left-arm orthodox"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        listView = findViewById(R.id.other_Listview);

        team=getIntent().getStringExtra("team");

        if(team.equals("GT"))
        {
            adapter = new CustomAdapter(OtherActivity.this, name, num, GTimgArr,born,place,nc,role,batting,bolling);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    System.out.println("Position=" + position);
                    Toast.makeText(OtherActivity.this, "Item Clicked=" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OtherActivity.this, FullScreen_Activity.class);
                    intent.putExtra("pos", position);
                    intent.putExtra("name", name);
                    intent.putExtra("num", num);
                    intent.putExtra("img", GTimgArr);
                    intent.putExtra("born", born);
                    intent.putExtra("place", place);
                    intent.putExtra("nc", nc);
                    intent.putExtra("role", role);
                    intent.putExtra("batting", batting);
                    intent.putExtra("bolling", bolling);
                    startActivity(intent);

                }
            });
        }
        else {
            adapter = new CustomAdapter(OtherActivity.this, CSKname, CSKnum, CSKimgArr,CSKborn,CSKplace,CSKnc,CSKrole,CSKbatting,CSKbolling);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    System.out.println("Position=" + position);
                    Toast.makeText(OtherActivity.this, "Item Clicked=" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OtherActivity.this, FullScreen_Activity.class);
                    intent.putExtra("pos", position);
                    intent.putExtra("name", CSKname);
                    intent.putExtra("num", CSKnum);
                    intent.putExtra("img", CSKimgArr);
                    intent.putExtra("born", CSKborn);
                    intent.putExtra("place", CSKplace);
                    intent.putExtra("nc", CSKnc);
                    intent.putExtra("role", CSKrole);
                    intent.putExtra("batting", CSKbatting);
                    intent.putExtra("bolling", CSKbolling);
                    startActivity(intent);

                }
            });
        }
        listView.setAdapter(adapter);

    }
}