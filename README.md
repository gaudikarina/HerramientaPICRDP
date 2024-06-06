# Herramienta para la programación de microcontroladores PIC a partir de redes de Petri.

El uso de microcontroladores como dispositivo tecnológico que da respuesta a problemas en los diversos sistemas de control, es hoy en día muy frecuente. Adaptar los sistemas de control a la programación de microcontroladores es una tarea ardua y presenta complicaciones debido a la complejidad de los modelos que representan estos sistemas. Las redes de Petri pueden ser utilizadas para modelar este tipo de sistemas. De  acuerdo con la investigación realizada se encontraron herrramientas que realizan otras funcionalidades o tareas, no se encontró una herramienta que permita a través del modelado gráfico de la red de Petri del sistema de control se genere un programa en código assembler para microcontroladores PIC, que controle la CPU del autómata programable. Debido a la alta aplicabilidad de este modelado para desarrollar respuestas en los sistemas de manufactura modernos, donde el uso de los autómatas programables cada vez es más frecuente se hace necesario el desarrollo de una herramienta que partiendo de la redes de Petri se programe un  microcontrolador PIC y así brindar la facilidad al diseñador de crear la automatización a partir de este modelo. La herramienta de programación de microcontrolador PIC con redes de Petri, se basa en las redes de Petri de tiempo real, que tienen adicionalmente a las características de las redes de Petri ordinarias, la definición de atributos que permiten correlacionar las entradas del sistema con los lugares y las salidas del sistema con las transiciones. Con la información de estos atributos y de la evolución de la red la herramienta de programación evalúa la red y genera un archivo en assembler que permite programar en un microcontrolador el modelo del sistema, para su manejo y control. Esta herramienta permite, entonces, al diseñador del proceso de control manipular el microcontrolador sin necesidad del conocimiento previo del lenguaje de programación del microcontrolador PIC.

![Picture1](https://github.com/gaudikarina/HerramientaPICRDP/assets/71100137/5fb7719f-96ce-4af4-8620-a4dc529f8b6b)

*Interfaz Gráfica Panel Principal*

![rdp](https://github.com/gaudikarina/HerramientaPICRDP/assets/71100137/bd886866-8ea9-4205-bcb8-524875ed5168)

*Ejemplo de Red de Petri en la Herranienta*

![Picture2](https://github.com/gaudikarina/HerramientaPICRDP/assets/71100137/62163dab-a081-46db-992c-fbab0328cd39)

*Archivo Assembler de Salida*

