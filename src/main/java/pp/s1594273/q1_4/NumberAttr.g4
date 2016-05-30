grammar NumberAttr;

@members {
    private int getValue(String text, int base) {
        return Integer.parseInt(text, base);
    }
}



num returns [int val]
    :e1 = seq
    {$val = getValue($e1.val, 10);}
    |e0=prf e1=seq
    {$val = getValue($e1.val, $e0.base);}
    ;

seq returns [String val]
    :e0=dig
    {$val = $e0.val;}
    | e0= dig e1 =seq
    {$val = $e0.val + $e1.val;}
    ;

prf returns [int base]
    :e0 = 'b'
    {$base = 2;}
    | e0 = 'x'
    {$base = 16;};

dig returns [String val]
    :DIGIT
    {$val = $DIGIT.getText();};


WS : [ \t\n\r] -> skip;
DIGIT: [0-9A-F];
