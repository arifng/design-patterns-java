## State Design Patter

**Intent**: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

#### Checklist
- Define a "context" class to present a single interface to the outside world.

- Define a State abstract base class.

- Represent the different "states" of the state machine as derived classes of the State base class.

- Define state-specific behavior in the appropriate State derived classes.

- Maintain a pointer to the current "state" in the "context" class.

To change the state of the state machine, change the current "state" pointer.

#### Example
WallFan has a pulling chain. Initially, it's off. If user pull chain, then current state `Off` change to next state.

Then, if user pull again, it's state change to next state. All states `Off`, `Low`, `Medium`, `High` changes its state 
to next one using context object `WallFanPullingChain`.


#### Test
```
WallFanPullingChain pullingChain = new WallFanPullingChain();

// initial state is Off
Assertions.assertInstanceOf(Off.class, pullingChain.getCurrentState());

// pull chain will change state to Low
pullingChain.pull();
Assertions.assertInstanceOf(Low.class, pullingChain.getCurrentState());

// pull again will change state to Medium        
pullingChain.pull();
Assertions.assertInstanceOf(Medium.class, pullingChain.getCurrentState());

// pull again will change state to High            
pullingChain.pull();
Assertions.assertInstanceOf(High.class, pullingChain.getCurrentState());
   
// pull again will change state to Off                       
pullingChain.pull();
Assertions.assertInstanceOf(Off.class, pullingChain.getCurrentState());

```