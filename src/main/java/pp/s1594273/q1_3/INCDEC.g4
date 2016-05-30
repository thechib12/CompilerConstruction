grammar INCDEC;
expr    :  a '+' f
        | f;
f       : '-'f
        | t;
t       : t '+''+'
        | ID;

ID      : [a-z]+;

