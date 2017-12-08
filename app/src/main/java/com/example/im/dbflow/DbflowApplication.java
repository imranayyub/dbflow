package com.example.im.dbflow;

import android.app.Application;
import android.util.Log;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import timber.log.Timber;


/**
 * Created by Im on 07-12-2017.
 */

public class DbflowApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
        FlowManager.init(this);

//        TestModel testModel=new TestModel();
//        testModel.name="Imran";
//        testModel.fname="Mohd Ayyub";
////        testModel.id= UUID.fromString("11");
//        testModel.save();
//        testModel.insert();
//        List<TestModel> testModels = SQLite.select()
//                .from(TestModel.class)
//                .where(TestModel_Table.name.like("Imran"))
//                .queryList();
//        for(TestModel t: testModels)
//        Log.d("Name ", String.valueOf(t.name));
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        FlowManager.destroy();
    }
}
