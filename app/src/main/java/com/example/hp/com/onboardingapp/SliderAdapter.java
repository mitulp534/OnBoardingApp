package com.example.hp.com.onboardingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //arrays for image
    public int[] slide_images = {
            R.drawable.slide_welcome,
            R.drawable.slide_project,
            R.drawable.slide_skills,
            R.drawable.slide_professional
    };

    //for headings
    public String[] slide_headings = {
            "Journey till the Professional Developer" ,
            "Projects makes developer perfect" ,
            "Increase skills by working on projects" ,
            "Are you ready to become a professional developer?"

    };

    //for description
    public String[] slide_description = {
            "Start your journey from zero development skills to the professional level skills. Increase your logical thinking, measure your progress of programming, Solve the Errors and Get better and better, Everyday until you become the professional developer" ,
                    "Practice makes a man perfect similarly building project makes developer perfect.  " ,
                    "Improve your logical programming skills with competitive questions in the project." ,
                    "Make yourself confident and comfortable for the future projects and your new professional developer life."
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container,int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view  = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.heading_slideScreen1);
        TextView slideDescription = (TextView) view.findViewById(R.id.description_slideScreen1);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_description[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
