package sef.module17.sample;

import junit.framework.TestCase;

public class TesteActor extends TestCase {

	Actor actor = new Actor();
	
    public void testSetAndGetActor() {
        String testeFirst_Name = "PENELOPE";
        assertNull(actor.getFirst_Name());
        actor.setFirst_Name(testeFirst_Name);
        assertEquals(testeFirst_Name, actor.getFirst_Name());
    }
}
