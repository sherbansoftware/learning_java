package Collection.Collection_Iteration.Iterable.SimpleExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;


public class UrlLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();

    public UrlLibrary() {
        urls.add("http://www.caveofprogramming.com");
        urls.add("http://www.facebook.com/caveofprogramming");
        urls.add("http://news.bbc.co.uk");
        urls.add("https://www.digi24.ro/live/digi24");
    }


    private class UrlIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }

                br.close();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }
    }

    //    @NotNull
//    @Override
//    public Iterator<String> iterator() {
//        return urls.iterator();
//    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }

}