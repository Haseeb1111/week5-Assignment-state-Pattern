package haseeb;

    public class RcketCon implements State {

        private State racketState;
    
        public void setState(State state) {
            this.racketState=state;
        }
    
        public State getState() {
            return this.racketState;
        }
    
        @Override
        public void doAction() {
            this.racketState.doAction();
        }
    
    }