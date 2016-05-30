lexer grammar Decimal;

fragment DIGIT: ('0' .. '9')((UNDERSCORE)* '0' .. '9' )*; // A digit can contain series of underscores, only if there a digit in front and after
fragment NUMBER : DIGIT | ((DIGIT)* DOT (DIGIT)+); // A single digit, or series of digits, or no digits,  with a dot, then series of digits.
fragment F_SUFFIX: 'f' | 'F';
fragment D_SUFFIX: 'd' | 'D';
fragment EXPONENT: ('e' | 'E')DIGIT;
fragment DOT: '.';
fragment UNDERSCORE: '_';


FLOAT: NUMBER (EXPONENT)? F_SUFFIX; // Number with a possible exponent and a manditory suffix
DOUBLE: NUMBER (EXPONENT)? (D_SUFFIX)?; // number with a possible exponent and a manditory suffix

WS    : [ \t\r\n]+ -> skip;