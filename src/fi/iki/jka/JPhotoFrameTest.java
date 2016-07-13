package fi.iki.jka;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

//import org.jmock.Expectations;
import javax.swing.*;

/**
 * Created by ape19 on 13/07/2016.
 */
public class JPhotoFrameTest {

    //@Rule
    //public JUnitRuleMockery context = new JUnitRuleMockery();

    //JOptionPane thePane = context.mock(JOptionPane.class);

    @Test
    public void testEmptyAlbum() throws Exception {
        JPhotoFrame frame = new JPhotoFrame();
        JPhotoCollection mockPhotoCollection = new JPhotoCollection();
        TestMessageViewer messageViewer = new TestMessageViewer();
        JPhotoList mockPhotoList = new JPhotoList(mockPhotoCollection,0);
        frame.startSlideShow(mockPhotoCollection,mockPhotoList,messageViewer);

        assertEquals(messageViewer.lastMessageShown,"No photos to show!");


    }
}
