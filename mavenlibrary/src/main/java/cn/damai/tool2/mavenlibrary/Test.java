package cn.damai.tool2.mavenlibrary;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import leakcanary.LeakCanary;
import leakcanary.OnHeapAnalyzedListener;
import shark.HeapAnalysis;

/**
 * @author lanche.ysl
 * @date 2020/11/23 11:33 AM
 */
public class Test {

    public static void installLeak(final Application application) {
        LeakCanary.Config build = LeakCanary.getConfig().newBuilder().onHeapAnalyzedListener(new OnHeapAnalyzedListener() {
            @Override
            public void onHeapAnalyzed(@NotNull HeapAnalysis heapAnalysis) {
                Log.e("MavenLog", "onHeapAnalyzed");

            }
        }).build();
        LeakCanary.setConfig(build);
    }
}
