package com.example.projetcv.ui.parcours;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import com.example.projetcv.R;

public class SliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

//    private TextView slideHeading, slideDescription;
//    private ImageView slide_imageView;


    public SliderAdapter(Context context) {

        this.context = context;
    }

    // img Array
    public int[] image_slide ={
            R.drawable.mars,
            R.drawable.iset_sfax,
            R.drawable.iit


    };

    // heading Array
    public String[] heading_slide ={
            "baccalauréat en informatique ",
            "licence appliquée en technologie de l'informatique développement des systèmes d'information",
            "2 éme année GÉNIE LOGICIEL ET INFORMATIQUE DÉCISIONNELLE ",
            //"test de connaissance du français"
            //"FUNDAMENTALS OF DEEP LEARNING FOR COMPUTER VISION"
    };

    // description Array
    public String[] description_slide ={
            "lycée 20 mars 1956 sfax",
            "institut supérieur des études technologiques sfax",
            "institut international de technologie sfax"
    };




    @Override
    public int getCount() {

        return heading_slide.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);
        container.addView(view);

        ImageView slide_imageView = view.findViewById(R.id.imageView1);
        TextView slideHeading = view.findViewById(R.id.tvHeading);
        TextView slideDescription = view.findViewById(R.id.tvDescription);

        slide_imageView.setImageResource(image_slide[position]);
        slideHeading.setText(heading_slide[position]);
        slideDescription.setText(description_slide[position]);

        return view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        View view = (View) object;
//        container.removeView(view);
//    }

}


