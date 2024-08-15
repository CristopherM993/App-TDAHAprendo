package com.example.tdahaprendo.PreguntasTDAH;

import java.util.ArrayList;
import java.util.List;

public class BancoPreguntas {

    private static List<ListaPreguntas> MateQuestion(){

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();
        // Creamos un objeto de QuestionList class y pasamos una pregunta , opciones y respuestas. (CURSO MATEMATICA)
        final ListaPreguntas question1 = new ListaPreguntas("¿Número de horas que tiene una semana?", "60 horas","3600 horas", "24 horas", "168 horas", "168 horas","");
        final ListaPreguntas question2 = new ListaPreguntas("¿Qué cantidad expresa el número romano V?", "Uno","Cinco", "Diez", "Cuatro", "Cinco","");
        final ListaPreguntas question3 = new ListaPreguntas("¿Quién es el padre de las matemáticas?", "Aristóteles","Issac Newton", "Pitágoras", "Euclides", "Pitágoras","");
        final ListaPreguntas question4 = new ListaPreguntas("¿Qué hora es si, tanto la manilla pequeña del reloj como la grande están en las 3?", "Las tres en punto","Las tres y cuarto", "Las tres  y media", "Las tres y tres", "Las tres y cuarto","");
        final ListaPreguntas question5 = new ListaPreguntas("¿Cuál es el resultado de multiplicar 7x9?", "58","72", "63", "48", "63","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Cómo se llama el polígono de 3 lados?", "Cubo","Triangulo", "Rectángulo", "Paralelogramo", "Triangulo","");
        final ListaPreguntas question7 = new ListaPreguntas("¿Cuál es el número anterior a 1000?", "1001","990", "999", "9999", "999","");
        final ListaPreguntas question8 = new ListaPreguntas("Si 9 x N es igual a 108 ¿Cuánto es el valor de N?", "N = 10","N = 14", "N = 13", "N = 12", "N = 12","");
        final ListaPreguntas question9 = new ListaPreguntas("¿Cómo puedes comprobar si has hecho bien una división?", "Volviéndola a hacer.","Multiplicando el cociente por el divisor y sumando el resto si lo hay.", "Sumando el cociente por el divisor y el resto.", "Dividiendo entre 0 el resultado.", "Multiplicando el cociente por el divisor y sumando el resto si lo hay.","");
        final ListaPreguntas question10 = new ListaPreguntas("Si tienes un billete de 100€, dos billetes de 20€ y cuatro monedas de 1 €, ¿cuánto dinero tienes en total?", "140 euros","144 euros", "154 euros", "139 euros", "144 euros","");


        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;
    }
    private static List<ListaPreguntas> ComunicaQuestion(){

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        // Creamos un objeto de QuestionList class y pasamos una pregunta , opciones y respuestas. (CURSO COMUNICACION)
        final ListaPreguntas question2 = new ListaPreguntas("En “Julián lee La ciudad y los perros de Vargas llosa”, el emisor es:", "La ciudad","Vargas Llosa", "Lee", "Los perros", "Vargas Llosa","");
        final ListaPreguntas question3 = new ListaPreguntas("¿Qué pronombre reemplaza a los nombres: Juan, Pedro, Carlos?", "Ella","Ellos", "Él", "Eso", "Él","");
        final ListaPreguntas question4 = new ListaPreguntas("Los adjetivos determinativos __________ acompañan al sustantivo para expresar su ubicación o distancia", "Posesivos","Numerales", "Demostrativos", "Calificativos", "Demostrativos","");
        final ListaPreguntas question5 = new ListaPreguntas("¿Cúal de las siguientes palabras es un verbo?", "Gato","Mesa", "Dormir", "Doctor", "Dormir","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Cuáles son las vocales que se encuentran en la palabra: Gato?", "e,o","i,o", "a,o", "e,o", "a,o","");
        final ListaPreguntas question7 = new ListaPreguntas("Las palabras que expresan el nombre de las cosas en tamaño pequeño se llaman:", "Aumentativos","Diminutivos", "Posesivos", "Demostrativos", "Diminutivos","");
        final ListaPreguntas question8 = new ListaPreguntas("¿Cuál es el sinónimo de la palabra “Alegre”?", "Inteligente","Triste", "Feliz", "Responsable", "Feliz","");
        final ListaPreguntas question9 = new ListaPreguntas("¿Cuántas sílabas tiene la palabra: Papelera?", "4","3", "5", "7", "4","");
        final ListaPreguntas question1 = new ListaPreguntas("Es la unión de tres vocales en una misma silaba: ", "Diptongo","Triptongo", "Hiato", "Ninguno", "Triptongo","");
        final ListaPreguntas question10 = new ListaPreguntas("¿Cuál de las alternativas no es un elemento de la comunicación?", "Canal","Emisor", "Receptor", "Dialogo", "Dialogo","");

        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;

    }
    private static List<ListaPreguntas> CienciaQuestion(){

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();
        // Creamos un objeto de QuestionList class y pasamos una pregunta , opciones y respuestas. (CURSO CIENCIA)

        final ListaPreguntas question1 = new ListaPreguntas("¿Cuál es la parte del cuerpo humano donde hay más huesos?", "En la mano","En la espalda", "En el pie", "En el brazo", "En la mano","");
        final ListaPreguntas question2 = new ListaPreguntas("¿Cómo se llama el proceso desde el que los alimentos entran en la boca hasta que salen expulsados por el ano?", "Proceso de deglución","Proceso de digestión", "Proceso de expulsión", "Proceso de salivación", "Proceso de digestión","");
        final ListaPreguntas question3 = new ListaPreguntas("¿Qué tres partes se distinguen en el cuerpo humano?", "Cabeza, piernas y brazos","Cuerpo, piernas y brazos", "Cabeza, tronco y extremidades", "N.A", "Cabeza, tronco y extremidades","");
        final ListaPreguntas question4 = new ListaPreguntas("¿Para qué sirven los sentidos?", "Para sobrevivir","Para relacionarnos con el mundo que nos rodea", "Para mejorar el rendimiento del cuerpo humano", "Para comer correctamente", "Para relacionarnos con el mundo que nos rodea","");
        final ListaPreguntas question5 = new ListaPreguntas("¿Cuál es el animal más veloz del mundo?", "El guepardo","La pantera", "El gamo", "El conejo", "El guepardo","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Qué utilizan los peces para respirar?", "Los pulmones","La cabeza", "La boca", "Las branquias", "Las branquias","");
        final ListaPreguntas question7 = new ListaPreguntas("¿Cómo se llama el proceso por el cual las plantas elaboran su alimento?", "Fotosíntesis","Relación", "Nutrición", "Alimentación", "Fotosíntesis","");
        final ListaPreguntas question8 = new ListaPreguntas("¿Para qué sirve la raíz de las plantas?", "Para absorber agua de la tierra","Para poder reproducirse", "Para hacer la fotosíntesis", "Para limpiar las hojas", "Para absorber agua de la tierra","");
        final ListaPreguntas question9 = new ListaPreguntas("¿Para qué sirven las cejas?", "Para que el rostro quede más bonito","Para que el sudor no llegue a los ojos", "Para atrapar polvo y evitar que entren en los ojos", "Para nada", "Para que el sudor no llegue a los ojos","");
        final ListaPreguntas question10 = new ListaPreguntas("¿Cuáles son las funciones vitales de los seres humanos? ", "Nutrición y reproducción","Nacer, crecer y morir", "Reproducción, relación y nutrición", "Trabjar y domir", "Nacer, crecer y morir","");

        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;

    }
    private static List<ListaPreguntas> ComputoQuestion(){

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        // Creamos un objeto de QuestionList class y pasamos una pregunta , opciones y respuestas. (CURSO COMPUTACIÓN)

        final ListaPreguntas question1 = new ListaPreguntas("No es una parte de la computadora.", "Teclado","CPU", "Monitor", "Mesa", "Mesa","");
        final ListaPreguntas question2 = new ListaPreguntas("Los programas que tiene el computador en su interioir se llaman", "Software","Hardware", "CPU", "Memoria", "Software","");
        final ListaPreguntas question3 = new ListaPreguntas("Para mover la flechita en el monitor del computador usamos:", "El teclado","El mouse", "La CPU", "Los parlantes", "El mouse","");
        final ListaPreguntas question4 = new ListaPreguntas("La herramienta que te permite eliminar un texto:", "Pegar","Editar", "Pegar texto", "Cortar", "Cortar","");
        final ListaPreguntas question5 = new ListaPreguntas("¿Qué programa de ofimática utilizamos para escribir textos extensos?", "Word","Excel", "PowerPoint", "Publisher", "Word","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Que significan las siglas CPU?", "Consejo de Poetas Unidos","Unidad Central de Procesamiento", "Unidad Central Personal", "Central Para Unir", "Unidad Central de Procesamiento","");
        final ListaPreguntas question7 = new ListaPreguntas("¿Cuál de las siguientes opciones corresponden a sistemas operativos?", "Word, Excel, Paint","Windows, Mac OS, Linux", "Internet, Servidor, Conexión", "Impresoras, parlantes, telcados", "Windows, Mac OS, Linux","");
        final ListaPreguntas question8 = new ListaPreguntas("¿Qué es Hardware?", "Es la parte física de la computadora","Son los programas", "Es el gabinete", "Es Windows", "Es la parte física de la computadora","");
        final ListaPreguntas question9 = new ListaPreguntas("¿Cómo se llama una computadora portátil?", "Módulo","RAM", "Portátiles", "CPU", "Portátiles","");
        final ListaPreguntas question10 = new ListaPreguntas("Un Sistema operativo es:", "Conjunto de archivos","Conforma el audio y video del computador", "Conjunto de instrucciones que hacen funcionar al computador", "Un ordenador", "Conjunto de instrucciones que hacen funcionar al computador","");

        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;
    }
    private static List<ListaPreguntas> PersonalQuestion(){

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas question1 = new ListaPreguntas("El primer documento de identidad que reciben las personas se llama:", "Certificado de Nacimiento","Documento Nacional de Identidad", "Partida de nacimiento", "Certificado de Solteria", "Documento Nacional de Identidad","");
        final ListaPreguntas question2 = new ListaPreguntas("¿Cuántos departamentos tiene el Perú?", "24 departamentos","22 departamentos", "23 departamentos", "21 departamentos", "24 departamentos","");
        final ListaPreguntas question3 = new ListaPreguntas("¿Cuáles son las 4 regiones narutales del Perú?", "Costa","Costa y Sierra", "Costa, Sierra, Selva y Mar peruano", "Costa, Sierra, Selva", "Costa, Sierra, Selva y Mar peruano","");
        final ListaPreguntas question4 = new ListaPreguntas("¿Qué día se celebra el Día de la Mujer?", "18 de marzo","28 de marzo", "14 de mayo", "8 de marzo", "8 de marzo","");
        final ListaPreguntas question5 = new ListaPreguntas("¿Para que cuidar el medio ambiente?", "Para garantizar su cuidado y aprovechamiento responsable.","Porque no hay otra cosa que hacer", "Porque es nuestro y no de las demás personas", "Para que sea mejor que el de nuestros vecinos", "Para garantizar su cuidado y aprovechamiento responsable","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Cómo se llama la capital de Perú?", "Bogotá","Madrid", "Lima", "Paracas", "Lima","");
        final ListaPreguntas question7 = new ListaPreguntas("Organizar un espacio significa:", "Colocar cada cosa en su lugar","Estar jugando todo el día", "Ubicar las zonas del desorden", "Entretenerse en la televisión", "Colocar cada cosa en su lugar","");
        final ListaPreguntas question8 = new ListaPreguntas("Machu Picchu se encuentra en el departamento de:", "Lima","Ayacucho", "Cuzco", "La Libertad", "Cuzco","");
        final ListaPreguntas question9 = new ListaPreguntas("¿En qué día y que año se proclamó la independencia del Perú?", "28 de Julio de 1824","28 de Julio de 1821", "29 de Julio de 1823", "28 de Julo de 1929", "28 de Julio de 1821","");
        final ListaPreguntas question10 = new ListaPreguntas("¿Cuál es el océano que se encuentra junto a la costa peruana?", "Ártico","Índico", "Pacífico", "Antártico", "Pacífico","");

        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;
    }

    private static List<ListaPreguntas> InglesQuestion(){


        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas question1 = new ListaPreguntas("¿Cómo se dice 'Papá' en inglés?","Grandfather","Mother","Father","Fader","Father","");
        final ListaPreguntas question2 = new ListaPreguntas("¿Cuál es la traducción correcta de la siguiente expresión en inglés “What’s your name?”?", "¿Cómo estás?","¿Cuántos años tienes?", "¿Cuál es tu nombre?", "¿Qué hora es?", "¿Cuál es tu nombre?","");
        final ListaPreguntas question3 = new ListaPreguntas("¿Cuál de las siguientes palabras no es un verbo?","Dog","Write","Eat","Sleep","Dog","");
        final ListaPreguntas question4 = new ListaPreguntas("¿Cómo se dice 'Sandia' en inglés?","Cherry","Pear","Watermelon","Orange","Watermelon","");
        final ListaPreguntas question5 = new ListaPreguntas("¿Qué preposición usarías para decir que algo está detrás?", "On","Under", "Behind", "In", "Behind","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Cómo se dice 'Me gusta jugar fútbol' en inglés?","I like to play soccer","I like to play basketball","I like to play baseball","I like to play volleyball","I like to play soccer","");
        final ListaPreguntas question7 = new ListaPreguntas("¿Cómo se dice 'Plátano' en inglés?", "Apple","Orange", "Watermelon", "Banana", "Banana","");
        final ListaPreguntas question8 = new ListaPreguntas("¿Cuál es el opuesto de la palabra 'Happy'?","Wet","Sad","Strong","Fast","Sad","");
        final ListaPreguntas question9 = new ListaPreguntas("¿Cómo se pregunta '¿Dónde está el parque?' en inglés?", "Where’s the park?","Why is the park?", "What is the park?", "While is the park?", "Where’s the park?","");
        final ListaPreguntas question10 = new ListaPreguntas("¿Cómo se dice 'Me gusta el color azul' en inglés?","I like color red","I like color blue","I like color green","I like color violet","I like color blue","");

        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;
    }

    private static List<ListaPreguntas> ReligionQuestion(){
        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas question1 = new ListaPreguntas("¿Qué día creó Dios al hombre y a la mujer?", "El primer día","El cuarto día", "El sexto día", "El séptimo día", "El sexto día","");
        final ListaPreguntas question2 = new ListaPreguntas("¿Qué significa la palabra Biblia?", "Alianza","Los libros", "La ley", "Libro sagrado", "Los libros","");
        final ListaPreguntas question3 = new ListaPreguntas("¿Quiénes eran Caín y Abel?", "Primos","Amigos de Jesús", "Sacerdotes", "Hijos de Adán y Eva", "Hijos de Adán y Eva","");
        final ListaPreguntas question4 = new ListaPreguntas("El libro que narra la creación es: ", "Éxodo","Marcos", "Génesis", "Deutoronomio", "Génesis","");
        final ListaPreguntas question5 = new ListaPreguntas("EL libro de la biblia se divide en:", "Nuevo testamento","Nuevo testamento y antiguo testamento", "Antiguo testamento", "300 libros", "Nuevo testamento y antiguo testamento","");
        final ListaPreguntas question6 = new ListaPreguntas("¿Qué es al antiguo testamento?", "Los libros de la biblia que se escribieron antes del nacimiento de Jesucristo.","Los libros de la biblia que se escribieron después de la resurrección de Jesucristo", "Un libro de canciones bíblicas", "Ninguna de las anteriores", "Los libros de la biblia que se escribieron antes del nacimiento de Jesucristo.","");
        final ListaPreguntas question7 = new ListaPreguntas("¿Qué día se la semana murió Jesús?", "Lunes","Viernes", "Sábado", "Jueves", "Viernes","");
        final ListaPreguntas question8 = new ListaPreguntas("¿De qué trata la parábola del Buen Samaritano?", "De un ladrón que le salvaron la vida","De un sacerdote que fue asaltado", "De un levita que fue asaltado", "De un hombre que fue asaltado por dos ladrones", "De un hombre que fue asaltado por dos ladrones","");
        final ListaPreguntas question9 = new ListaPreguntas("¿Cómo se llama el ángel que se aparece a María y le anuncia la encarnación?", "Rafael","Miguel", "Gabriel", "Juan", "Gabriel","");
        final ListaPreguntas question10 = new ListaPreguntas("¿Qué fiesta religiosa se celebra el 30 de agosto?", "San Lorenzo","Santa Rosa", "Señor de los Milagros", "Santa Catalina", "Santa Rosa","");

        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        return listaPreguntas;
    }

    private static List<ListaPreguntas> PruebaQuestion(){
        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas question1 = new ListaPreguntas("Si 9 x N es igual a 108 ¿Cuánto es el valor de N?","N = 14","N = 10","N = 13", "N = 12", "N = 12","");

        final ListaPreguntas question2 = new ListaPreguntas("¿Cómo se llama el polígono de 3 lados?","Cubo","Triangulo","Rectángulo", "Paralelogramo","Triangulo","");

        final ListaPreguntas question3 = new ListaPreguntas("¿Quién es el padre de las matemáticas?","Aristóteles","Issac Newton","Pitágoras", "Euclides","Pitágoras","");

        final ListaPreguntas question4 = new ListaPreguntas("¿Número de horas que tiene una semana?","60","3600","24", "168","168","");

        final ListaPreguntas question5 = new ListaPreguntas("El primer documento de identidad que reciben las personas se llama:","Certificado de nacimiento","Partida de nacimiento","Documento de Solteria","Documento Nacional de Identidad","Documento Nacional de Identidad","");

        final ListaPreguntas question6 = new ListaPreguntas("¿Qué día se celebra el Día de la Mujer?", "18 de marzo","28 de marzo", "14 de mayo","8 de marzo", "8 de marzo","");

        final ListaPreguntas question7 = new ListaPreguntas("Organizar un espacio significa:", "Colocar cada cosa en su lugar","Estar jugando todo el día", "Ubicar las zonas del desorden","Entretenerse en la televisión", "Colocar cada cosa en su lugar", "");

        final ListaPreguntas question8 = new ListaPreguntas("¿En qué día y que año se proclamó la independencia del Perú?", "28 de Julio de 1824","28 de Julio de 1821", "29 de Julio de 1823","28 de Julo de 1929","28 de Julio de 1821","");

        final ListaPreguntas question9 = new ListaPreguntas("¿Qué tres partes se distinguen en el cuerpo humano?", "Cabeza, piernas y brazos","Cuerpo, piernas y brazos", "Cabeza, tronco y extremidades","Ninguno","Cabeza, tronco y extremidades","");

        final ListaPreguntas question10 = new ListaPreguntas("¿Para qué sirven los sentidos?", "Para sobrevivir","Para relacionarnos con el mundo que nos rodea", "Para mejorar el rendimiento del cuerpo humano","Para comer correctamente","Para relacionarnos con el mundo que nos rodea","");

        final ListaPreguntas question11 = new ListaPreguntas("¿Qué utilizan los peces para respirar?", "Los pulmones","La cabeza", "La boca","Las branquias", "Las branquias","");

        final ListaPreguntas question12 = new ListaPreguntas("¿Para qué sirve la raíz de las plantas?", "Para absorber agua de la tierra","Para poder reproducirse", "Para hacer la fotosíntesis","Para limpiar las hojas", "Para absorber agua de la tierra","");

        final ListaPreguntas question13 = new ListaPreguntas("¿Qué pronombre reemplaza a los nombres: Juan, Pedro, Carlos?", "Ella","Ellos", "Él","Eso","Él","");

        final ListaPreguntas question14 = new ListaPreguntas("Las palabras que expresan el nombre de las cosas en tamaño pequeño se llaman:", "Aumentativos","Diminutivos", "Ambos","Ninguna","Diminutivos","");

        final ListaPreguntas question15 = new ListaPreguntas("¿Cuál es el sinónimo de la palabra “Alegre”?", "Inteligente","Triste", "Feliz","Responsable", "Feliz","");

        final ListaPreguntas question16 = new ListaPreguntas("Es la unión de tres vocales en una misma silaba:", "Diptongo","Triptongo", "Hiato","Ninguna", "Triptongo","");

        final ListaPreguntas question17 = new ListaPreguntas("¿Qué significa la palabra Biblia?", "Alianza","Los libros", "La ley","Libro sagrado", "Los libros","");

        final ListaPreguntas question18 = new ListaPreguntas("¿Qué es al antiguo testamento?", "Los libros de la biblia que se escribieron antes del nacimiento de Jesucristo", "Los libros de la biblia que se escribieron después de la resurrección de Jesucristo", "Los libros escritos por sus dicipulos", "Ninguno", "Los libros de la biblia que se escribieron antes del nacimiento de Jesucristo","");

        final ListaPreguntas question19 = new ListaPreguntas("¿Qué día se la semana murió Jesús?", "Lunes","Viernes", "Sábado","Jueves", "Viernes","");

        final ListaPreguntas question20 = new ListaPreguntas("¿Cómo se llama el ángel que se aparece a María y le anuncia la encarnación?", "Rafael","Miguel", "Juan","Gabriel","Gabriel","");

        final ListaPreguntas question21 = new ListaPreguntas("¿Cuál es la traducción correcta de la siguiente expresión en inglés “What’s your name?”?", "¿Cómo estás?","¿Cuántos años tienes?", "¿Cuál es tu nombre?","¿Qué hora es?", "¿Cuál es tu nombre?","");

        final ListaPreguntas question22 = new ListaPreguntas("¿Cómo se dice plátano en inglés?", "Apple","Orange", "Watermelon","Banana", "Banana","");

        final ListaPreguntas question23 = new ListaPreguntas("¿Cómo se pregunta en inglés, ¿Donde está el parque?", "Where’s the park?","Why is the park?", "What is the park?","While is the park?", "Where’s the park?","");

        final ListaPreguntas question24 = new ListaPreguntas("¿Qué preposición usarías para decir que algo está detrás?", "On","Under", "Behind","In", "Behind","");

        final ListaPreguntas question25 = new ListaPreguntas("La herramienta que te permite eliminar un texto:", "Pegar","Editar", "Pegar texto","Cortar", "Cortar","");

        final ListaPreguntas question26 = new ListaPreguntas("¿Qué programa de ofimática utilizamos para escribir textos extensos?", "Word","Excel", "PowerPoint","Publisher","Word","");

        final ListaPreguntas question27 = new ListaPreguntas("El teclado permite la entrada de datos al computador.", "Verdadero","Falso", "Permite la salida de datos","Ninguna", "Verdadero","");

        final ListaPreguntas question28 = new ListaPreguntas("¿Cuál de las siguientes opciones corresponden a sistemas operativos?", "Word, Excel, Paint","Windows, Mac OS, Linux", " Internet, Servidor, Conexión","Entel, Claro, Movistar","Windows, Mac OS, Linux",""
        );


        listaPreguntas.add(question1); listaPreguntas.add(question2); listaPreguntas.add(question3); listaPreguntas.add(question4); listaPreguntas.add(question5); listaPreguntas.add(question6); listaPreguntas.add(question7); listaPreguntas.add(question8); listaPreguntas.add(question9); listaPreguntas.add(question10);
        listaPreguntas.add(question11); listaPreguntas.add(question12); listaPreguntas.add(question13); listaPreguntas.add(question14); listaPreguntas.add(question15); listaPreguntas.add(question16); listaPreguntas.add(question17); listaPreguntas.add(question18); listaPreguntas.add(question19); listaPreguntas.add(question20);
        listaPreguntas.add(question21); listaPreguntas.add(question22); listaPreguntas.add(question23); listaPreguntas.add(question24); listaPreguntas.add(question25); listaPreguntas.add(question26); listaPreguntas.add(question27); listaPreguntas.add(question28);
        return listaPreguntas;
    }

    public static List<ListaPreguntas> getQuestions(String selectTopicName){
        switch (selectTopicName){
            case "Matemática": return MateQuestion();
            case "Comunicación": return ComunicaQuestion();
            case "Ciencia": return CienciaQuestion();
            case "Computación": return ComputoQuestion();
            case "Personal": return PersonalQuestion();
            case "Inglés": return InglesQuestion();
            case "Religión": return ReligionQuestion();
            default:
                return PruebaQuestion();

        }

    }




}





