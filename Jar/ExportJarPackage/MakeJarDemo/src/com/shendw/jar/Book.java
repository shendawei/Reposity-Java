package com.shendw.jar;

public class Book
{
    String mBookName;
    String mAuthor;
    int    mPages;
    int    mTheme;

    public Book()
    {
    }
    
    public String getmBookName()
    {
        return mBookName;
    }

    public void setmBookName(String bookName)
    {
        this.mBookName = bookName;
    }

    public String getmAuthor()
    {
        return mAuthor;
    }

    public void setmAuthor(String author)
    {
        this.mAuthor = author;
    }

    public int getmPages()
    {
        return mPages;
    }

    public void setmPages(int pages)
    {
        this.mPages = pages;
    }

    public int getmTheme()
    {
        return mTheme;
    }

    public void setmTheme(int theme)
    {
        this.mTheme = theme;
    }

}
