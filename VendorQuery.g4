//define grammar fro what is possible for a vendor to query
grammar VendorQuery;
newq: from bid where? url?;
from: 'FROM' Name 'ID=' Number;
bid: 'BID' Currency Number 'TO' Name;
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