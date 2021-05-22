package org.tensorflow.lite.examples.detection;


import android.os.AsyncTask;

import org.tensorflow.lite.examples.detection.env.Logger;

public class AsyncTaskRun extends AsyncTask<String,Integer,String> {
    private static final Logger LOGGER = new Logger();

    public AsyncTaskRun() {
        super();
    }


    @Override
    protected String doInBackground(String...  strings) {

        LOGGER.i("Laptop tespit edildi.");


        return "Process finished Successfully !";
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // işlem başlamadan önceki hazırlıkları yaptık.


    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        // işlem bitti ve son gösterge
        // dönen "Process finished Successfully !" bu string ifadeyi textview'e basalım
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        // burada önemli bir nokta : genellikle values[0] şeklinde kullanılır.
        // burası , her işlem döndüğünde progress'e doInBackground'dan publishProgress() ile
        // paslanan değeri yazacak
    }

    @Override
    protected void onCancelled(String s) {
        super.onCancelled(s);

    }
}
