package ayp.aug.photogallery.network;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import ayp.aug.photogallery.model.GalleryItem;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by wind on 8/16/2016 AD.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class FlickrFetchrAndroidTest {

    private FlickrFetchr mFlickFetchr;

    @Before
    public void setUp() throws Exception {
        mFlickFetchr = new FlickrFetchr();
    }

    @Test
    public void testGetUrlString() throws Exception {
        String stringResult = mFlickFetchr.getUrlString("https://www.bignerdranch.com");

        assertThat(stringResult, containsString("bignerd"));
    }

    @Test
    public void testFetchItems() throws Exception {
        List<GalleryItem> galleryItemList = mFlickFetchr.fetchItems();

        assertThat(galleryItemList.size(), is(100));
    }
}