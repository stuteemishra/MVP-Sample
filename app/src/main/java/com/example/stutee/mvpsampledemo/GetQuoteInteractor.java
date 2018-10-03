package com.example.stutee.mvpsampledemo;

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);

}
