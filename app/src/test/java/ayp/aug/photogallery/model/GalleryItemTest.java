package ayp.aug.photogallery.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by wind on 8/16/2016 AD.
 */
public class GalleryItemTest {

    GalleryItem mGalleryItem;

    @Before
    public void setUp() {
        mGalleryItem = new GalleryItem();
    }

    @Test
    public void test_settled_caption() throws Exception {
        mGalleryItem.setCaption("Hello");

        assertThat(mGalleryItem.getCaption(), is("Hello"));
    }

    @Test
    public void test_settled_id() throws Exception {
        mGalleryItem.setCaption("Hello");
        mGalleryItem.setId("9217h286129o");

        assertThat(mGalleryItem.getCaption(), is("Hello"));
        assertThat(mGalleryItem.getId(), is("9217h286129o"));
    }
}