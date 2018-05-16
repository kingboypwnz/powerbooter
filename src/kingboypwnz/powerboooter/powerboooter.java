/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingboypwnz.powerboooter;

import org.powerbot.script.*;
import org.powerbot.script.rt4.ClientContext;

@Script.Manifest(name="powerboooter",description="This is a very descriptive description!",properties="client=4; topic=12313141; author=kingboypwnz;")
public class powerboooter extends PollingScript<ClientContext>{
    
    @Override
public void start(){
    log.info("Hello, World!");
}


    @Override
public void poll(){
    log.info("Sspending Script");
    ctx.controller.suspend();
}

}
