grammar Latex;

table : BEGINTABLE arguments NEWLINE (rows)* ENDTABLE NEWLINE;
arguments : LBRACK OPTIONS RBRACK;
rows :  rowentry ('&' rowentry)* '\\\\' NEWLINE;
rowentry : (|WORD);


LBRACK : '{';
RBRACK : '}';
OPTIONS : ('l'|'c'|'r')+;
BEGINTABLE : '\\begin{tabular}';
ENDTABLE : '\\end{tabular}';
WORD : ~('\\' | '\n' | '{' |'}' | '$' | '&' | '#' | '^' | '_' | '~'| '%')+;


KEYWORDS: ('\\' | '{' |'}' | '$' | '&' | '#' | 'ˆ' | '_' | '~' | '%');
NEWLINE : ('\r'|'\n')+;
COMMENT : ('%'  ~('\r'|'\n')* ('\r'|'\n')+) -> skip;