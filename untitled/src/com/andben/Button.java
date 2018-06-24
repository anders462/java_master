package com.andben;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addListener(OnClickListener listner) {
        this.onClickListener = listner;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        void onClick(String title);
    }
}
