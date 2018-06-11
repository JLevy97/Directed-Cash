grammar fullQ;
newq: donor | aggregator | vendor;
donor: from timestamp? (donate|find|rating) where? report?;
aggregator: from (expense|call|define) where? url?;
vendor: from bid where? url?;

//donor
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

//aggregator
expense: 'EXPENSE=' Currency Number 'TO VENDOR' Name;
call: Category Name 'VENDOR RFP' Currency Number;           //RFP???????????   //Project in as Category ???
define: 'DEFINE' Category Name 'GOAL' Currency Number;
url: 'URL=' Name;

//vendor
bid: 'BID' Currency Number 'TO' Name;

Name: ('a'..'z')+;                                          // | 'A'..'Z')+;           find way to make capital without obscuring types & cannot currently have spaces
Number: [0-9]+;
Currency: '$' | 'R';
Op: '=' | '!=';
Category: 'CATEGORY' | 'SCHEMA' | 'PROJECT';
Type: 'FOOD' | 'MONEY' | 'CLOTHES';
HowOften: 'WEEKLY' | 'MONTHLY' | 'YEARLY' | 'ONCE';
WS: [ \r\t\n]+ -> skip ;