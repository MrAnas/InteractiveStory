package anasalbassam.com.interactivestory.Model;

import anasalbassam.com.interactivestory.R;

/**
 * Created by analbassam on 11/23/2016.
 */

public class Story {

    private Page[] mPages;

    public Story(){
        mPages = new Page[7];

        mPages[0] = new Page();
        mPages[0].setImageId(R.drawable.page0);
        mPages[0].setText("test");
        mPages[0].setChoice1(new Choice());
        mPages[0].setChoice2(new Choice());

    }
}
