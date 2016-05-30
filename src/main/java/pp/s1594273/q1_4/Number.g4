grammar Number;


/** Number: sequence of digits optionally preceded by a base prefix */
num : prf seq   #prfnum
    | seq       #seqnum;
/** Sequence of digits */
seq : dig       #singledig
    | dig seq   #seqdig ;
/** Prefix: x stands for hexadecimal, b for boolean */
prf : 'x'       #hex
    | 'b'       #binary
    ;
/** Single digit (hexadecimal range) */
dig : DIGIT ;

/** Digit token */
DIGIT: [0-9A-F];
