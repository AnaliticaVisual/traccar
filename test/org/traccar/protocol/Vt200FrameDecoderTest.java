package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class Vt200FrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        Vt200FrameDecoder decoder = new Vt200FrameDecoder();

        Assert.assertEquals(
                binary("28631037309456208400340102dc0906171616454415760201144494473f920a0c0000030500200100417c1f383a9d1090510000006a00007000000e00180ee129"),
                decoder.decode(null, null, binary("28631037309456208400340102dc0906171616454415760201144494473f920a0c0000030500200100417c1f383a9d1090510000006a00007000000e00180ee129")));

        Assert.assertEquals(
                binary("28631037309456208400340102f51306171327294418267501208948170231071f0000044300200100005f02180000667500000000000000000000080000624629"),
                decoder.decode(null, null, binary("28631037309456208400340102f513061713273d144418267501208948170231071f0000044300200100005f02180000667500000000000000000000080000624629")));

    }

}
