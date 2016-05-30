grammar INCDEC2;
expr    : f expr1;

expr1:  '+'f expr1 |;

f       : '-'f
        | t;

t       : t '+''+'
        | ID;

ID      : [a-z]+;

