package anasalbassam.com.interactivestory.Model;

/**
 * Created by analbassam on 11/23/2016.
 */

public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        text = mText;
        nextPage = mNextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }


}
