package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class TotemFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        TotemFrameDecoder decoder = new TotemFrameDecoder();

        Assert.assertEquals(
                binary("24243031303841413836343234343032363036333433377c3141303030303030313430313031303130313031343131313030303032374241304535373030333130303030303030302e3030303030303030303030302e303030304e30303030302e3030303045303438313536"),
                decoder.decode(null, null, binary("24243031303841413836343234343032363036333433377c3141303030303030313430313031303130313031343131313030303032374241304535373030333130303030303030302e3030303030303030303030302e303030304e30303030302e3030303045303438313536")));

        Assert.assertEquals(
                binary("242442393335363839353033373537383531387c4141244750524d432c3036313730382e3030302c412c333734302e323033332c4e2c30323132382e383132312c452c33382e38352c3237322e33362c3132313131332c2c2c412a35327c30322e337c30312e337c30312e397c3030303030303030303030307c32303133313131323036313730387c31343034313430327c30303030303030307c30303245323137317c303030307c302e323137327c383930327c34463945"),
                decoder.decode(null, null, binary("242442393335363839353033373537383531387c4141244750524d432c3036313730382e3030302c412c333734302e323033332c4e2c30323132382e383132312c452c33382e38352c3237322e33362c3132313131332c2c2c412a35327c30322e337c30312e337c30312e397c3030303030303030303030307c32303133313131323036313730387c31343034313430327c30303030303030307c30303245323137317c303030307c302e323137327c383930327c344639450d0a")));

        Assert.assertEquals(
                binary("242442393335363839353033373537383531387c4141244750524d432c3036313730382e3030302c412c333734302e323033332c4e2c30323132382e383132312c452c33382e38352c3237322e33362c3132313131332c2c2c412a35327c30322e337c30312e337c30312e397c3030303030303030303030307c32303133313131323036313730387c31343034313430327c30303030303030307c30303245323137317c303030307c302e323137327c383930327c34463945"),
                decoder.decode(null, null, binary("0d0a242442393335363839353033373537383531387c4141244750524d432c3036313730382e3030302c412c333734302e323033332c4e2c30323132382e383132312c452c33382e38352c3237322e33362c3132313131332c2c2c412a35327c30322e337c30312e337c30312e397c3030303030303030303030307c32303133313131323036313730387c31343034313430327c30303030303030307c30303245323137317c303030307c302e323137327c383930327c344639450d0a")));

    }

}
