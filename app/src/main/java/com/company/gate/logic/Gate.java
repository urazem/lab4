package com.company.gate.logic;

    /**
     * This file defines the Gate class.
     */
    public class Gate {
        // TODO -- Fill in your code here
        private int mSwing;
        public  static final int IN = 1;
        public final static int  OUT = -1;
        public final static int CLOSED = 0;
        public Gate(){
            mSwing = CLOSED;
        }
        public boolean setSwing(int direction){
            if(direction==IN||direction==OUT||direction==CLOSED) {
                mSwing = direction;
                return true;
            }
            else
                return false;

        }
        public boolean open(int direction){
            if(direction == IN || direction==OUT)
            {
                setSwing(direction);
                return true;

            }
            else
                return false;
        }
        public void close(){

            setSwing(CLOSED);

        }
        public int getSwingDirection(){
            return mSwing;
        }
        public int thru(int count){
            if(getSwingDirection()==IN)
                return count;
            else if (getSwingDirection()==OUT)
                return -count;
            else
                return 0;


        }
        public String toString(){
            String a;
            if(getSwingDirection()==IN){
                a="This gate is open and swings to enter the pen only";
            }
            else if(getSwingDirection()==OUT) {
                a = "This gate is open and swings to exit the pen only";
            }
            else if(getSwingDirection()==CLOSED) {
                a="This gate is closed";
            }
            else {
                a="This gate has an invalid swing direction";
            }
            return a;

        }
    }


