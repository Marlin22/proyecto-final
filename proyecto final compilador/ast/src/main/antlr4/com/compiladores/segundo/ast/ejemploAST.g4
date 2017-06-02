grammar ejemploAST;


//PALABRAS RESERVADAS 	
COMPI: 'compi';
ESCRIBIR: 'mostrar';
CICLO:'ciclo';
CONSTANTE:'constante';
FUN:'fun';
//tipos de variables
INT:'int';
DOUBLE:'double';
STRING:'string';

// operadores aritmeticos
SUMA:'+'; 
RESTA:'-';
MULT:'*';
DIV:'/';

//operadores logicos
AND:'and'; 
OR:'or';
NOT:'!';
FALSE:'false';
TRUE:'true';

//operadores de comparacion 
MAYOR: '>';
MENOR: '<';
MAI: '>=';
MEI:'<=';
DI: '==';
NDI:'!=';

//operacion de asignacion de variables
ASIGNAR:'=';

FIN:';';
SEP:',';

// signos de puntuacion
LLA_ABRIR: '{';
LLA_CERRAR: '}';

PAR_ABRIR:'(';
PAR_CERRAR:')';

C_ABRIR:'[';
C_CERRAR:']';
//cicloS 
IF : 'if';
THEN : 'then';
FOR : 'for' ;
WHILE:'while';
MASCICLO : '++' ;
MENOSCICLO : '--' ;


ID:[a-zA-Z]*;
NUMERO:[0-9]+;
NUMERODOUBLE: '-'?[0-9]+('.'[0-9]+)?;
IDENT:  [a-zA-Z_] [a-zA-Z_0-9]*;
cadena:ID |NUMERO; // USA O UN ID O UN NUMERO CUALQUIERA DE LOS DOS

COMMENT: '//' .+? ('\n'| EOF) -> skip;
WS:[\t\n\r]+ -> skip; // LECTURA DE ESPACIOS EN BLANCO Y TABULADORES separa tokens



compi: COMPI ID LLA_ABRIR //INICIO DE ANALIZADOR SINTACTICO
	sentence* //SIGNIFICA QUE PUEDE APARECER VARIAS VECES UNA SENTENCIA
	LLA_CERRAR;
	
	sentence: int_assing |combinada|double_assing|string_assing|
	println|texto|cadena|tipo_const|retorno|const_assing|condition|
	logical_expr|condicion_if|comparacion|operador|conclusion|ciclo_if|
	iniciacion|tope| tope_op | pasos |paso_op | ciclo_for|operaciones|
	llamada|ciclo_while|tipo|repeticion|var|cantidad|assing_vector |
	rep|cant|assing_matriz|funcion; //PRODUCCIONES DE LA SENTENCIA
    
	//DECLARACION DE VARIABLES
	int_assing: INT ID ASIGNAR  NUMERO FIN;
	combinada: INT ID ASIGNAR ID SUMA NUMERO FIN; //ASIGNACION INT
	double_assing: DOUBLE ID ASIGNAR NUMERODOUBLE FIN;  //ASIGNACION DOUBLE
				
	string_assing: STRING ID ASIGNAR ID FIN; //ASIGNACION STRING
 	println: ESCRIBIR ID SUMA NUMERO MULT NUMERO FIN;
 	texto:  ESCRIBIR cadena FIN;
 	
 	
	//DECLARACION CONSTANTE
	tipo_const:int_assing|double_assing;
   const_assing:CONSTANTE tipo_const;
   

 	//CICLO IF
	retorno : ciclo_if*EOF;
	condition: logical_expr;							
 	logical_expr : logical_expr AND logical_expr | logical_expr OR logical_expr |
 	 condicion_if ;//COMPARA UNA DOBLE COMPARACION
 	condicion_if: PAR_ABRIR comparacion operador comparacion PAR_CERRAR;
 	
 	comparacion	: PAR_ABRIR NUMERO MULT NUMERO PAR_CERRAR| 
 	PAR_ABRIR NUMERO DIV NUMERO PAR_CERRAR|PAR_ABRIR NUMERO SUMA NUMERO PAR_CERRAR|
 	 PAR_ABRIR NUMERO RESTA NUMERO PAR_CERRAR;
	operador	:	MAYOR|	MENOR|	MAI|	MEI|	DI;
 	conclusion : IDENT;	
 	ciclo_if:CICLO IF  condition  THEN conclusion FIN;	//ESTRUCTURA DEL CICLO IF
 	
//CICLO FOR
iniciacion : int_assing ; //asignacion de inicializacion 
  tope : ID tope_op NUMERO FIN; 
  tope_op:DI  //COMPARA EL SIGNO QUE USA
       |MENOR
       |MAYOR 
       ; 
pasos : ID paso_op ;
paso_op:MASCICLO |MENOSCICLO; // INCREMENTA O DECREMENTA EN EL CICLO
ciclo_for: CICLO FOR PAR_ABRIR iniciacion tope pasos PAR_CERRAR;// ESTRUCTURA DE FOR


//CICLO while
operaciones: (combinada|println|double_assing|string_assing)+;// PUEDE UTILIZAR VARIAS OPERACIONES
llamada:LLA_ABRIR operaciones pasos LLA_CERRAR;
ciclo_while: CICLO WHILE PAR_ABRIR iniciacion PAR_CERRAR llamada;//ESTRUCTURA CICLO WHILE

//VECTOR
tipo:INT |STRING; // identitica tipo de variable
   repeticion:ID C_ABRIR NUMERO C_CERRAR;
   var: cadena SEP;
   cantidad:LLA_ABRIR var+ LLA_CERRAR;
   assing_vector:tipo repeticion ASIGNAR cantidad;// ESTRUCTURA DE VECTOR

//+ UNA OMAS VECES
//* CERO UNA O MAS VECES
//MATRIZ
rep:ID C_ABRIR NUMERO C_CERRAR C_ABRIR NUMERO C_CERRAR;
cant:LLA_ABRIR var+ LLA_CERRAR LLA_ABRIR var+ LLA_CERRAR;
assing_matriz:tipo rep ASIGNAR cant FIN; //declaracion de matriz

funcion: FUN LLA_ABRIR  (int_assing |combinada|double_assing|
	string_assing|println|texto|cadena|const_assing|ciclo_if|
	iniciacion|ciclo_for|operaciones|ciclo_while|assing_vector|
	assing_matriz)+ LLA_CERRAR ;

	       		
	       		       		
	       		
	       		