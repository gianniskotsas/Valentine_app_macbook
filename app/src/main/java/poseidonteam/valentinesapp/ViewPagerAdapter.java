package poseidonteam.valentinesapp;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ViewPagerAdapter extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.image_a,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }



    @SuppressLint("ServiceCast")

    @NonNull

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.custom_layout,null);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);

        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;

        vp.addView(view,0);

        return view;
    }

    @Override
    public int getCount() {

        return images.length;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;

    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}

