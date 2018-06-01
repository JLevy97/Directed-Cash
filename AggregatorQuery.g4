//define grammar for an Aggregator's query
grammar AggregatorQuery;
newq: from (expense|call|define) where? url?;
from: 'FROM' Name 'ID=' Number;
expense: 'EXPENSE=' Currency Number 'TO VENDOR' Name;
call: Category Name 'VENDOR RFP' Currency Number;           //RFP???????????   //Project in as Category ???
define: 'DEFINE' Category Name 'GOAL' Currency Number;
where: 'WHERE' condition ('AND' condition)*;
condition: Category Op (Type | Number | Name);
url: 'URL=' Name;                                           //get special characters into URL somehow
Name: ('a'..'z')+;                                          // | 'A'..'Z')+;           find way to make capital without obscuring types & cannot currently have spaces
Number: [0-9]+;
Currency: '$' | 'R';
Op: '=' | '!=';
Category: 'CATEGORY' | 'SCHEMA' | 'PROJECT';
Type: 'FOOD' | 'MONEY' | 'CLOTHES';
WS: [ \r\t\n]+ -> skip ;