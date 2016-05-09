grammar Latex;


table : BEGINTABLE arguments '\n' (rows)* ENDTABLE '\n';
arguments : LBRACK OPTIONS RBRACK;
rows :  ((|WORD) ('&' (|WORD))* '\\\\' '\n')+ ;

OPTIONS: ('l' | 'c' | 'r')*;


LBRACK : '{';
RBRACK : '}';

BEGINTABLE : '\\begin{tabular}';
ENDTABLE : '\\end{tabular}';

KEYWORDS: ('\\' | '{' |'}' | '$' | '&' | '#' | 'ˆ' | '_' | '~̃'| '%');
COMMENT : ('%'  ~('\r'|'\n')* ('\r'|'\n')) -> skip;
WORD: (('a'..'z' | 'A' .. 'Z' | '0' .. '9')+) ;


WS : [ \t]+ -> skip;