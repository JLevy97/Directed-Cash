grammar newQ;
newq: from timestamp? (donate|find|rating) where? report?;
from: 'FROM' Name 'ID=' Number;
timestamp: 'TIMESTAMP' date 'T' time;           //more exact way to measure date and time
time: Number':'Number':'Number;
date: Number'-'Number'-'Number;
rating: 'RATE' Name 'AS' Number'/'Number;
find: 'FIND' Category;
donate: 'DONATE' Currency Number HowOften date 'TO' date 'DECIDE FCFS'; //decide FCFS?????????????????
where: 'WHERE' condition ('AND' condition)*;
condition: Category Op (Type | Number | Name);
report: 'REPORT' HowOften;
Name: ('a'..'z')+;                                          // | 'A'..'Z')+;           find way to make capital without obscuring types & cannot currently have spaces
Number: [0-9]+;
Currency: '$' | 'R';
Op: '=' | '!=';
Category: 'CATEGORY' | 'SCHEMA' | 'PROJECT';
Type: 'FOOD' | 'MONEY' | 'CLOTHES';
HowOften: 'WEEKLY' | 'MONTHLY' | 'YEARLY' | 'ONCE';
WS: [ \r\t\n]+ -> skip ;