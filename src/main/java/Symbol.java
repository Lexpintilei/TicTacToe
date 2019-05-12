public enum Symbol {
    SYMBOL_X{
        @Override
        public String toString(){
            return "[X]";
        }
    },
    SYMBOL_0{
        @Override
        public String toString(){
            return "[O]";
        }
    },
    SYMBOL_FREE{
        @Override
        public String toString(){
            return "[ ]";
        }
    }
}
