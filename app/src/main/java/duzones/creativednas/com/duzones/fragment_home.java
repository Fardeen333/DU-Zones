package duzones.creativednas.com.duzones;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;
import java.util.Random;

public class fragment_home extends Fragment implements View.OnClickListener {

    public FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mref = database.getReference("result_url");
    DatabaseReference db,db2,db3;
    public String result_url;
    AdRequest adRequest;
    public String visibility,noticetext,noticelink;
    private static final String APP_ID = "ca-app-pub-7180287377976427~2306652579";
    private InterstitialAd interstitialAd;
    int zrandom,colorrandom;
    TextView noticetextview;
    CardView noticecardviewtop;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

      //  Toast.makeText(getActivity(), "Welcome", Toast.LENGTH_SHORT).show();
        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
        Toast.makeText(getActivity(), "initialized", Toast.LENGTH_SHORT).show();
            }
        });
        colorchoose();
        noticetextview = view.findViewById(R.id.noticetext);
        noticecardviewtop = view.findViewById(R.id.noticecard);
        noticecardviewtop.setOnClickListener(this);
        if(colorrandom==1)
        noticecardviewtop.setCardBackgroundColor(Color.parseColor("#ff3838"));
        else if(colorrandom==2)
        noticecardviewtop.setCardBackgroundColor(Color.parseColor("#ff8b38"));
        else if(colorrandom==3)
        noticecardviewtop.setCardBackgroundColor(Color.parseColor("#19a800"));
        else if(colorrandom==5)
        noticecardviewtop.setCardBackgroundColor(Color.parseColor("#a80097"));
        else if(colorrandom==0)
        noticecardviewtop.setCardBackgroundColor(Color.parseColor("#eb0062"));
        else
            noticecardviewtop.setCardBackgroundColor(Color.parseColor("#f67a2c"));
        noticecardviewtop.setVisibility(View.GONE);

        AdView adview = view.findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        adview.loadAd(adRequest);


        interstitialAd = new InterstitialAd(Objects.requireNonNull(getContext()));
        interstitialAd.setAdUnitId("ca-app-pub-7180287377976427/8354499258");
        //  interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712"); //testadd
        interstitialAd.loadAd(adRequest);


        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(int i) {
                adRequest = new AdRequest.Builder().build();
                interstitialAd.loadAd(adRequest);
            }

            @Override
            public void onAdLeftApplication() {
                adRequest = new AdRequest.Builder().build();
                interstitialAd.loadAd(adRequest);
            }

            @Override
            public void onAdOpened() {

            }

            @Override
            public void onAdClosed() {
                // Load the next interstitial.

                // Toast.makeText(getActivity(), "working", Toast.LENGTH_SHORT).show();
            }

        });



        db = FirebaseDatabase.getInstance().getReference("notice_text").child("visibility");
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                visibility = dataSnapshot.getValue(String.class);
                //Toast.makeText(home.this, "Welcome", Toast.LENGTH_LONG).show();
                if(Objects.equals(visibility, "yes"))
                {   noticecardviewtop.setVisibility(View.VISIBLE);
                    db2 = FirebaseDatabase.getInstance().getReference("notice_text").child("data");
                    db2.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                           noticetext = dataSnapshot.getValue(String.class);
                           noticetextview.setText(noticetext);
                           db3 = FirebaseDatabase.getInstance().getReference("notice_text").child("link");
                           db3.addValueEventListener(new ValueEventListener() {
                               @Override
                               public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                   noticelink = dataSnapshot.getValue(String.class);

                               }

                               @Override
                               public void onCancelled(@NonNull DatabaseError databaseError) {

                               }
                           });
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getActivity(), "Network Unreachable", Toast.LENGTH_SHORT).show();
            }
        });




        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                result_url = dataSnapshot.getValue().toString();
                // Toast.makeText(getActivity(), result_url, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getActivity(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });


        CardView syllabuscard = view.findViewById(R.id.card_syllabus);
        syllabuscard.setOnClickListener(this);
        CardView paperscard = view.findViewById(R.id.card_papers);
        paperscard.setOnClickListener(this);
        CardView attendancecard = view.findViewById(R.id.card_attendance);
        attendancecard.setOnClickListener(this);
        CardView timetablecard = view.findViewById(R.id.card_timetable);
        timetablecard.setOnClickListener(this);
        CardView datesheetcard = view.findViewById(R.id.card_datesheet);
        datesheetcard.setOnClickListener(this);
        CardView collegecard = view.findViewById(R.id.card_colleges);
        collegecard.setOnClickListener(this);
        CardView cutoffcard = view.findViewById(R.id.card_cutoffs);
        cutoffcard.setOnClickListener(this);
        CardView eventscard = view.findViewById(R.id.card_events);
        eventscard.setOnClickListener(this);
        CardView resultcard = view.findViewById(R.id.card_results);
        resultcard.setOnClickListener(this);
        CardView admissioncard = view.findViewById(R.id.card_admissions);
        admissioncard.setOnClickListener(this);
        CardView noticecard = view.findViewById(R.id.card_notices);
        noticecard.setOnClickListener(this);
        CardView internshipcard = view.findViewById(R.id.card_internships);
        internshipcard.setOnClickListener(this);
        CardView internals = view.findViewById(R.id.card_internals);
        internals.setOnClickListener(this);

        CardView whome = view.findViewById(R.id.card_whome);
        whome.setOnClickListener(this);
        CardView wadmission = view.findViewById(R.id.card_wadmissions);
        wadmission.setOnClickListener(this);
        CardView wexam = view.findViewById(R.id.card_wexam);
        wexam.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if(v.getId() == R.id.noticecard)
        {
            Intent a = new Intent(".tryfirebase");
            // Toast.makeText(getActivity(), "kkk", Toast.LENGTH_SHORT).show();
            a.putExtra("link_to_pass", noticelink);
            startActivity(a);
        }

        if (v.getId() == R.id.card_syllabus) {
            Intent ic = new Intent(getActivity(), Courselistforsyll.class);
            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(ic);
            if (showad() == 1)
                interstitialAd.show();
        }

        if (v.getId() == R.id.card_internships) {
            Intent ic = new Intent(getActivity(), internships.class);
            if (showad() == 1)
            {
                interstitialAd.show();
            }


            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(ic);
           if (showad() == 1)
            {
                interstitialAd.show();
            }
        }


        if (v.getId() == R.id.card_notices) {

            Intent ic = new Intent(getActivity(), notices.class);
            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(ic);

            if (showad() == 1) {
                interstitialAd.show();
            }
        }

        if (v.getId() == R.id.card_attendance) {
                Intent a1 = new Intent(".attendances");
                //Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                startActivity(a1);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }


        if (v.getId() == R.id.card_timetable) {

            Intent a1 = new Intent(".timetables");
            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(a1);

            if (showad() == 1) {
                interstitialAd.show();
            }
        }


        if (v.getId() == R.id.card_datesheet) {

            showPopUp();
        }


        if (v.getId() == R.id.card_papers) {

            Intent ic = new Intent(".Courselist");
            // Toast.makeText(getActivity(), "Will be available on next update!", Toast.LENGTH_LONG).show();
            startActivity(ic);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }

        if (v.getId() == R.id.card_colleges) {

            Intent a1 = new Intent(".collegelist");
            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(a1);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }

        if (v.getId() == R.id.card_cutoffs) {

            Intent a2 = new Intent(".Cutoffs");
            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(a2);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }

        if (v.getId() == R.id.card_results) {

            Intent a22 = new Intent(".grade_card");
            a22.putExtra("link_to_pass", result_url);
            //   Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
            startActivity(a22);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }


        if (v.getId() == R.id.card_events) {
            Intent a3 = new Intent(".collegeevents");
            //  Toast.makeText(getActivity(), "Loading...", Toast.LENGTH_SHORT).show();
            startActivity(a3);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }

        if (v.getId() == R.id.card_internals) {

            Intent a3 = new Intent(".internals");
            //  Toast.makeText(getActivity(), "Loading...", Toast.LENGTH_SHORT).show();
            startActivity(a3);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }

        if (v.getId() == R.id.card_admissions) {

            Intent a3 = new Intent(".Admission");
            //  Toast.makeText(getActivity(), "Loading...", Toast.LENGTH_SHORT).show();
            startActivity(a3);
            if (showad() == 1) {
                interstitialAd.show();
            }
        }


        if (v.getId() == R.id.card_whome) {




            Intent a = new Intent(".tryfirebase");
            // Toast.makeText(getActivity(), "kkk", Toast.LENGTH_SHORT).show();
            a.putExtra("link_to_pass", "http://du.ac.in/du/");
            startActivity(a);

            // Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();

        }


        if (v.getId() == R.id.card_wadmissions) {

            Intent a = new Intent(".tryfirebase");
            // Toast.makeText(getActivity(), "kkk", Toast.LENGTH_SHORT).show();
            a.putExtra("link_to_pass", "http://admission.du.ac.in/");
            startActivity(a);
            //Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();

        }


        if (v.getId() == R.id.card_wexam) {

            Intent a = new Intent(".tryfirebase");
            //Toast.makeText(getActivity(), "kkk", Toast.LENGTH_SHORT).show();
            a.putExtra("link_to_pass", "http://exam.du.ac.in/");
            startActivity(a);

            //Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();


        }
    }

    public void showPopUp() {
        View inflate = ((LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.custompopup, null);
        final AlertDialog create = new AlertDialog.Builder(getContext()).create();
        create.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.close);
        CardView cardView = (CardView) inflate.findViewById(R.id.datesheet1);
        CardView cardView2 = (CardView) inflate.findViewById(R.id.datesheet2);
        create.show();
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(getActivity(), Datesheets1.class);
                startActivity(a);

                create.dismiss();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(getActivity(), Datesheets2.class);
                startActivity(a);

                create.dismiss();
            }
        });
    }

    public int showad() {
        zrandom = new Random().nextInt(10) + 2;
        if (zrandom == 1 || zrandom == 10) {
            return 1;
        } else if (zrandom > 4 && zrandom % 2 == 0)
            return 1;

        else return 1;
    }

    public int colorchoose() {
        colorrandom = new Random().nextInt(6);
        return  colorrandom;
    }

}
