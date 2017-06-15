package com.example.vanshit.rsf_likeus;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Vanshit on 06-15-2017.
 */

public class first extends Fragment {

    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myview = inflater.inflate(R.layout.like_us,container,false);
        String url = "https://www.facebook.com/ReachingSky/";
        WebView view = (WebView) myview.findViewById(R.id.FbPage);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
        view.setWebViewClient(new WebViewClient());
        return myview;
    }
}
