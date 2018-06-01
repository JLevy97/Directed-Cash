//define a grammer called Hello
grammar testGrammer;
r : 'Hello' ID ;
ID : [a-z]+ ;
WS: [ \t\n]+ -> skip ;