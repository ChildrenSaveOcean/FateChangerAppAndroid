package com.kidssaveocean.fatechanger.letters.data.source.local;

import android.util.Log;

import com.kidssaveocean.fatechanger.Repository;
import com.kidssaveocean.fatechanger.letters.data.Letter;

import java.util.List;

import io.reactivex.Flowable;

public class LettersLocalDataSource implements Repository<Letter> {
    private static final String TAG = "LettersLocalDataSource";
    private LetterDao letterDao;

    //region singleton implementation
    private static LettersLocalDataSource INSTANCE;

    public static LettersLocalDataSource getInstance(LetterDao letterDao) {
        if (INSTANCE == null) {
            INSTANCE = new LettersLocalDataSource(letterDao);
        }
        return INSTANCE;
    }

    private LettersLocalDataSource(LetterDao letterDao) {
        this.letterDao = letterDao;
    }
    //endregion

    @Override
    public void add(Letter item) {
        Log.d(TAG, "add");
        letterDao.insertLetter(item);
    }

    @Override
    public void update(Letter item) {
        // Todo
    }

    @Override
    public void remove(Letter item) {
        // Todo
    }

    @Override
    public Flowable<List<Letter>> getAll() {
        Log.d(TAG, "getAll");
        Flowable<List<Letter>> result =  letterDao.getAllLetters();
        return result;
    }

    @Override
    public void removeAll() {
        Log.d(TAG, "removeAll");
        letterDao.deleteAllLetters();
    }
}
