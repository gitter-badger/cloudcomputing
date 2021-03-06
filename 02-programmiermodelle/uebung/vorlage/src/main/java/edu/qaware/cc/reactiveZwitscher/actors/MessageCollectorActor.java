package edu.qaware.cc.reactiveZwitscher.actors;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import java.util.ArrayList;
import java.util.List;

public class MessageCollectorActor extends UntypedActor {
    
    private ActorRef wikipedia;
    private ActorRef feedzilla;
    
    private ActorRef caller;
    private final List<String> result = new ArrayList<String>();
    private boolean wikipediaFinished;
    private boolean feedzillaFinished;
    
    @Override
    public void preStart() throws Exception {
        wikipedia = getContext().actorOf(Props.create(WikipediaActor.class), "Wikipedia");
        feedzilla = getContext().actorOf(Props.create(FeedzillaSupervisorActor.class), "FeedzillaSupervisor");
    }
    
    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String){
            //TODO
        } else if (message instanceof List){
            //TODO
        }
        else {
            unhandled(message);
        }
    }
    
}
