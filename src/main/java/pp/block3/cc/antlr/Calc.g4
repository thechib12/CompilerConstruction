grammar Calc;

import CalcVocab;

expr : expr TIMES expr # times
     | expr PLUS expr  # plus
     | expr MINUS expr # minus
     | MINUS expr      # minexpr
     | LPAR expr RPAR  # par
     | NUMBER          # number
     ;
